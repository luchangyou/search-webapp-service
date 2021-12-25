/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasPersonInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:01:40 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IBasPersonInfoDao;
import com.yiguan.search.dao.IPerWorkInfoDao;
import com.yiguan.search.domain.BasPersonInfoVo;
import com.yiguan.search.mapper.BasPersonInfoMapper;
import com.yiguan.search.model.BasPersonInfo;
import com.yiguan.search.model.BasPersonInfoExample;
import com.yiguan.search.model.PerWorkInfo;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: BasPersonInfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:01:40
 * 
 */
@Repository("basPersonInfoDaoImpl")
public class BasPersonInfoDaoImpl implements IBasPersonInfoDao {

	@Autowired
	private BasPersonInfoMapper basPersonInfoMapper;
	@Autowired
	private IPerWorkInfoDao perWorkInfoDaoImpl;

	@Override
	public List<BasPersonInfoVo> getBasPersonInfoList(String keyWord,
			Page<BasPersonInfo> page) {

		List<BasPersonInfo> list = null;
		if (Common.isEmpty(keyWord)) {
			BasPersonInfoExample example = new BasPersonInfoExample();
			example.orderByCtime("desc");
			list = basPersonInfoMapper.selectByExampleForPage(example, page);
		}

		BasPersonInfoExample example = getExample(keyWord, null);

		list = basPersonInfoMapper.selectByExampleForPage(example, page);

		List<BasPersonInfoVo> infoVoList = new ArrayList<BasPersonInfoVo>();

		if (list == null || list.isEmpty()) {
			return null;
		}

		for (BasPersonInfo basPersonInfo : list) {
			BasPersonInfoVo basPersonInfoVo = new BasPersonInfoVo();
			String uuid = basPersonInfo.getUuid();
			PerWorkInfo perWorkInfo = perWorkInfoDaoImpl.getPerWorkInfo(uuid);
			try {
				BeanUtils.copyProperties(basPersonInfoVo, basPersonInfo);

			} catch (Exception e) {
				e.printStackTrace();
			}
			if (perWorkInfo != null) {
				basPersonInfoVo.setJob(perWorkInfo.getJob());
				basPersonInfoVo.setOname(perWorkInfo.getOname());
				basPersonInfoVo.setCtime(perWorkInfo.getCtime());
			}
			infoVoList.add(basPersonInfoVo);
		}

		return infoVoList;
	}

	@Override
	public BasPersonInfo getBasPersonInfo(long id) {
		return basPersonInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int totalNumber(String keyWord) {
		if (Common.isEmpty(keyWord)) {
			BasPersonInfoExample example = new BasPersonInfoExample();
			int i = basPersonInfoMapper.countByExample(example);
			return i;
		}

		BasPersonInfoExample example = getExample(keyWord, null);
		int i = basPersonInfoMapper.countByExample(example);
		return i;
	}

	@Override
	public List<BasPersonInfoVo> getBasPersonInfoList(String keyWord,
			String personTag, Page page) {
		List<BasPersonInfo> list = null;
		if (Common.isEmpty(keyWord)) {
			BasPersonInfoExample example = new BasPersonInfoExample();
			example.createCriteria().andPtagLike("%" + personTag + "%");
			example.orderByCtime("desc");
			list = basPersonInfoMapper.selectByExampleForPage(example, page);
		}

		BasPersonInfoExample example = getExample(keyWord, personTag);

		list = basPersonInfoMapper.selectByExampleForPage(example, page);

		List<BasPersonInfoVo> infoVoList = new ArrayList<BasPersonInfoVo>();

		if (list == null || list.isEmpty()) {
			return null;
		}

		for (BasPersonInfo basPersonInfo : list) {
			BasPersonInfoVo basPersonInfoVo = new BasPersonInfoVo();
			String uuid = basPersonInfo.getUuid();
			PerWorkInfo perWorkInfo = perWorkInfoDaoImpl.getPerWorkInfo(uuid);
			try {
				BeanUtils.copyProperties(basPersonInfoVo, basPersonInfo);

			} catch (Exception e) {
				e.printStackTrace();
			}
			if (perWorkInfo != null) {
				basPersonInfoVo.setJob(perWorkInfo.getJob());
				basPersonInfoVo.setOname(perWorkInfo.getOname());
				basPersonInfoVo.setCtime(perWorkInfo.getCtime());
			}
			infoVoList.add(basPersonInfoVo);
		}

		return infoVoList;
	}

	@Override
	public int totalNumber(String keyWord, String personTag) {
		if (Common.isEmpty(keyWord)) {
			BasPersonInfoExample example = new BasPersonInfoExample();
			example.createCriteria().andPtagLike("%" + personTag + "%");
			int i = basPersonInfoMapper.countByExample(example);
			return i;
		}

		BasPersonInfoExample example = getExample(keyWord, personTag);
		int i = basPersonInfoMapper.countByExample(example);
		return i;
	}

    @Override
    public List<BasPersonInfo> getBasPersonInfoList(String uuid) {
		BasPersonInfoExample example = new BasPersonInfoExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<BasPersonInfo> list = basPersonInfoMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list;
    }

    private BasPersonInfoExample getExample(String keyWord, String personTag) {
		BasPersonInfoExample example = new BasPersonInfoExample();
		example.orderByCtime("desc");

		if (Common.isEmpty(personTag)) {
			example.or().andNameLike("%" + keyWord + "%");
			example.or().andEnnameLike("%" + keyWord + "%");
			example.or().andAliasLike("%" + keyWord + "%");
			example.or().andHometownLike("%" + keyWord + "%");
			example.or().andCountryLike("%" + keyWord + "%");
			example.or().andNationLike("%" + keyWord + "%");
			example.or().andProvinceLike("%" + keyWord + "%");
			example.or().andCityLike("%" + keyWord + "%");
			example.or().andConWayLike("%" + keyWord + "%");
			example.or().andSexLike("%" + keyWord + "%");
			example.or().andIdNumberLike("%" + keyWord + "%");
			example.or().andHouseholdRegisterLike("%" + keyWord + "%");
			example.or().andLiveplaceLike("%" + keyWord + "%");
			example.or().andDiplomaLike("%" + keyWord + "%");
			example.or().andWorkYearsLike("%" + keyWord + "%");
			example.or().andLivePhotoLike("%" + keyWord + "%");
			example.or().andOccuPhotoLike("%" + keyWord + "%");
			example.or().andArtPhotoLike("%" + keyWord + "%");
			example.or().andPtagLike("%" + keyWord + "%");
			example.or().andPDescLike("%" + keyWord + "%");
			example.or().andAdvantageLike("%" + keyWord + "%");
			example.or().andSourceLike("%" + keyWord + "%");
		} else {
			example.or().andNameLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andEnnameLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andAliasLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andHometownLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andCountryLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andNationLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andProvinceLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andCityLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andConWayLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andSexLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andIdNumberLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andHouseholdRegisterLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andLiveplaceLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andDiplomaLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andWorkYearsLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andLivePhotoLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andOccuPhotoLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andArtPhotoLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andPtagLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andPDescLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andAdvantageLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
			example.or().andSourceLike("%" + keyWord + "%")
					.andPtagLike("%" + personTag + "%");
		}

		return example;
	}

	@Override
	public BasPersonInfo getBasPersonInfoByUuid(String uuid) {
		BasPersonInfoExample example = new BasPersonInfoExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<BasPersonInfo> list = basPersonInfoMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

}

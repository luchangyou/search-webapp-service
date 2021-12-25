/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ProOtherInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午2:48:37 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IProOtherInfoDao;
import com.yiguan.search.mapper.ProOtherInfoMapper;
import com.yiguan.search.model.ProOtherInfo;
import com.yiguan.search.model.ProOtherInfoExample;

/**
 * @ClassName: ProOtherInfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午2:48:37
 * 
 */
@Repository("proOtherInfoDaoImpl")
public class ProOtherInfoDaoImpl implements IProOtherInfoDao {

	@Autowired
	private ProOtherInfoMapper proOtherInfoMapper;

	@Override
	public List<ProOtherInfo> getProGameInfoList(String keyWord,
			Page<ProOtherInfo> page) {
		if (Common.isEmpty(keyWord)) {
			ProOtherInfoExample example = new ProOtherInfoExample();
			example.orderByCtime("desc");
			List<ProOtherInfo> list = proOtherInfoMapper
					.selectByExampleForPage(example, page);
			return list;
		}

		ProOtherInfoExample example = getExample(keyWord, null);
		List<ProOtherInfo> list = proOtherInfoMapper.selectByExampleForPage(
				example, page);

		return list;
	}

	@Override
	public int totalNumber(String keyWord) {
		if (Common.isEmpty(keyWord)) {
			ProOtherInfoExample example = new ProOtherInfoExample();
			int i = proOtherInfoMapper.countByExample(example);
			return i;
		}

		ProOtherInfoExample example = getExample(keyWord, null);
		int i = proOtherInfoMapper.countByExample(example);
		return i;
	}

	@Override
	public List<ProOtherInfo> getProGameInfoList(String keyWord,
			String userShenfen, Page page) {
		if (Common.isEmpty(keyWord)) {
			ProOtherInfoExample example = new ProOtherInfoExample();
			if (!Common.isEmpty(userShenfen)) {
				example.createCriteria().andTagLike("%" + userShenfen + "%");
			}
			example.orderByCtime("desc");
			List<ProOtherInfo> list = proOtherInfoMapper
					.selectByExampleForPage(example, page);
			return list;
		}

		ProOtherInfoExample example = getExample(keyWord, userShenfen);
		List<ProOtherInfo> list = proOtherInfoMapper.selectByExampleForPage(
				example, page);

		return list;
	}

	@Override
	public int totalNumber(String keyWord, String userShenfen) {
		if (Common.isEmpty(keyWord)) {
			ProOtherInfoExample example = new ProOtherInfoExample();
			if (!Common.isEmpty(userShenfen)) {
				example.createCriteria().andTagLike("%" + userShenfen + "%");
			}
			example.createCriteria().andTagLike("%" + userShenfen + "%");
			int i = proOtherInfoMapper.countByExample(example);
			return i;

		}

		ProOtherInfoExample example = getExample(keyWord, userShenfen);
		int i = proOtherInfoMapper.countByExample(example);
		return i;
	}

	@Override
	public ProOtherInfo getProOtherInfo(long id) {
		return proOtherInfoMapper.selectByPrimaryKey(id);
	}

	private ProOtherInfoExample getExample(String keyWord, String userShenfen) {
		ProOtherInfoExample example = new ProOtherInfoExample();
		example.orderByCtime("desc");
		if (Common.isEmpty(userShenfen)) {
			example.or().andPnameLike("%" + keyWord + "%");
			example.or().andPtypeLike("%" + keyWord + "%");
			example.or().andPDescLike("%" + keyWord + "%");
			example.or().andTagLike("%" + keyWord + "%");
			example.or().andScaleLike("%" + keyWord + "%");
			example.or().andPdemandLike("%" + keyWord + "%");
			example.or().andPictureUrlLike("%" + keyWord + "%");
			example.or().andWebLike("%" + keyWord + "%");
			example.or().andSourceLike("%" + keyWord + "%");
			example.or().andUrlLike("%" + keyWord + "%");
		} else {
			example.or().andPnameLike("%" + keyWord + "%")
					.andTagLike("%" + userShenfen + "%");
			example.or().andPtypeLike("%" + keyWord + "%")
					.andTagLike("%" + userShenfen + "%");
			example.or().andPDescLike("%" + keyWord + "%")
					.andTagLike("%" + userShenfen + "%");
			example.or().andTagLike("%" + keyWord + "%")
					.andTagLike("%" + userShenfen + "%");
			example.or().andScaleLike("%" + keyWord + "%")
					.andTagLike("%" + userShenfen + "%");
			example.or().andPdemandLike("%" + keyWord + "%")
					.andTagLike("%" + userShenfen + "%");
			example.or().andPictureUrlLike("%" + keyWord + "%")
					.andTagLike("%" + userShenfen + "%");
			example.or().andWebLike("%" + keyWord + "%")
					.andTagLike("%" + userShenfen + "%");
			example.or().andSourceLike("%" + keyWord + "%")
					.andTagLike("%" + userShenfen + "%");
			example.or().andUrlLike("%" + keyWord + "%")
					.andTagLike("%" + userShenfen + "%");
		}

		return example;
	}

	@Override
	public List<ProOtherInfo> getProOtherInfoByUuid(String uuid) {
		if (Common.isEmpty(uuid)) {
			return null;
		}
		ProOtherInfoExample example = new ProOtherInfoExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<ProOtherInfo> list = proOtherInfoMapper.selectByExample(example);
		return list;
	}

}

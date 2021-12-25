/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasEventInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午5:37:26 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IBasEventInfoDao;
import com.yiguan.search.mapper.BasEventInfoMapper;
import com.yiguan.search.model.BasEventInfo;
import com.yiguan.search.model.BasEventInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: BasEventInfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午5:37:26
 * 
 */
@Repository("basEventInfoDaoImpl")
public class BasEventInfoDaoImpl implements IBasEventInfoDao {

	@Autowired
	private BasEventInfoMapper basEventInfoMapper;

	@Override
	public List<BasEventInfo> getBasEventInfoList(String keyWord, String type,
			Page<BasEventInfo> page) {

		if (Common.isEmpty(keyWord) && Common.isEmpty(type)) {
			BasEventInfoExample example = new BasEventInfoExample();
			example.orderByCtime("desc");
			List<BasEventInfo> list = basEventInfoMapper
					.selectByExampleForPage(example, page);
			return list;
		}

		if (Common.isEmpty(keyWord) && !Common.isEmpty(type)) {
			BasEventInfoExample example = new BasEventInfoExample();
			example.orderByCtime("desc");
			example.createCriteria().andTypeEqualTo(type);
			List<BasEventInfo> list = basEventInfoMapper
					.selectByExampleForPage(example, page);
			return list;
		}


		BasEventInfoExample example = getExample(keyWord, type);
		List<BasEventInfo> list = basEventInfoMapper.selectByExampleForPage(
				example, page);

		return list;
	}

	@Override
	public int totalNumber(String keyWord, String type) {
		if (Common.isEmpty(keyWord) && Common.isEmpty(type)) {
			BasEventInfoExample example = new BasEventInfoExample();
			int i = basEventInfoMapper.countByExample(example);
			return i;
		}

		if (Common.isEmpty(keyWord) && !Common.isEmpty(type)) {
			BasEventInfoExample example = new BasEventInfoExample();
			example.createCriteria().andTypeEqualTo(type);
			int i = basEventInfoMapper.countByExample(example);
			return i;
		}

		BasEventInfoExample example = getExample(keyWord, type);
		int i = basEventInfoMapper.countByExample(example);
		return i;
	}

	@Override
	public BasEventInfo getBasEventInfo(int id) {
		return basEventInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<BasEventInfo> getBasEventInfoListByOuuid(String ouuid) {

		if (Common.isEmpty(ouuid)) {
			return null;
		}
		BasEventInfoExample example = new BasEventInfoExample();
		example.createCriteria().andOuuidEqualTo(ouuid);
		List<BasEventInfo> list = basEventInfoMapper.selectByExample(example);

		return list;

	}

    @Override
    public BasEventInfo getBasEventInfoListByEuuid(String euuid) {
		if (Common.isEmpty(euuid)) {
			return null;
		}
		BasEventInfoExample example = new BasEventInfoExample();
		example.createCriteria().andEuuidEqualTo(euuid);
		List<BasEventInfo> list = basEventInfoMapper.selectByExample(example);
		if(list == null || list.size() <1){
			return null;
		}
		return list.get(0);
    }

    private BasEventInfoExample getExample(String keyWord, String type) {

		BasEventInfoExample example = new BasEventInfoExample();
		example.orderByCtime("desc");
		if (Common.isEmpty(type)) {
			example.or().andTitleLike("%" + keyWord + "%");
			example.or().andEdescLike("%" + keyWord + "%");
			example.or().andSourceLike("%" + keyWord + "%");
			example.or().andTypeLike("%" + keyWord + "%");
		}
		if (!Common.isEmpty(type)) {
			example.or().andTitleLike("%" + keyWord + "%").andTypeEqualTo(type);
			example.or().andEdescLike("%" + keyWord + "%").andTypeEqualTo(type);
			example.or().andSourceLike("%" + keyWord + "%")
					.andTypeEqualTo(type);
			example.or().andTypeLike("%" + keyWord + "%").andTypeEqualTo(type);
		}

		return example;
	}

}

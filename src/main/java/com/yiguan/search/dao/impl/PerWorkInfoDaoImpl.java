/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: PerWorkInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午12:32:41 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IPerWorkInfoDao;
import com.yiguan.search.mapper.PerWorkInfoMapper;
import com.yiguan.search.model.PerWorkInfo;
import com.yiguan.search.model.PerWorkInfoExample;

/**
 * @ClassName: PerWorkInfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午12:32:41
 * 
 */
@Repository("perWorkInfoDaoImpl")
public class PerWorkInfoDaoImpl implements IPerWorkInfoDao {

	@Autowired
	private PerWorkInfoMapper perWorkInfoMapper;

	@Override
	public PerWorkInfo getPerWorkInfo(String uuid) {
		if (Common.isEmpty(uuid)) {
			return null;
		}

		PerWorkInfoExample example = new PerWorkInfoExample();
		example.orderByEndTime("desc");
		example.createCriteria().andUuidEqualTo(uuid);
		List<PerWorkInfo> list = perWorkInfoMapper.selectByExample(example);

		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public List<PerWorkInfo> getPerWorkInfoList(String uuid) {
		if (Common.isEmpty(uuid)) {
			return null;
		}

		PerWorkInfoExample example = new PerWorkInfoExample();
		example.orderByEndTime("desc");
		example.createCriteria().andUuidEqualTo(uuid);
		List<PerWorkInfo> list = perWorkInfoMapper.selectByExample(example);

		if (list == null || list.isEmpty()) {
			return null;
		}
		return list;
	}

}

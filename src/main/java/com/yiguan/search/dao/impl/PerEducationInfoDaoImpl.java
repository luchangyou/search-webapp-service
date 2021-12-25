/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: PerEducationInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午2:17:03 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IPerEducationInfoDao;
import com.yiguan.search.mapper.PerEducationInfoMapper;
import com.yiguan.search.model.PerEducationInfo;
import com.yiguan.search.model.PerEducationInfoExample;

/**
 * @ClassName: PerEducationInfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午2:17:03
 * 
 */
@Repository("perEducationInfoDaoImpl")
public class PerEducationInfoDaoImpl implements IPerEducationInfoDao {

	@Autowired
	private PerEducationInfoMapper perEducationInfoMapper;

	@Override
	public PerEducationInfo getPerEducationInfoByUuid(String uuid) {
		if (Common.isEmpty(uuid)) {
			return null;
		}

		PerEducationInfoExample example = new PerEducationInfoExample();
		example.orderByEndDate("desc");
		example.createCriteria().andUuidEqualTo(uuid);
		List<PerEducationInfo> list = perEducationInfoMapper
				.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public List<PerEducationInfo> getPerEducationInfoList(String uuid) {
		if (Common.isEmpty(uuid)) {
			return null;
		}

		PerEducationInfoExample example = new PerEducationInfoExample();
		example.orderByEndDate("desc");
		example.createCriteria().andUuidEqualTo(uuid);
		List<PerEducationInfo> list = perEducationInfoMapper
				.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list;
	}

}

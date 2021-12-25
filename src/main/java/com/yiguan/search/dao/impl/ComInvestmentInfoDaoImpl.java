/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComInvestmentInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月11日 下午7:12:12 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IComInvestmentInfoDao;
import com.yiguan.search.mapper.ComInvestmentInfoMapper;
import com.yiguan.search.model.ComInvestmentInfo;
import com.yiguan.search.model.ComInvestmentInfoExample;

/**
 * @ClassName: ComInvestmentInfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月11日 下午7:12:12
 * 
 */
@Repository("comInvestmentInfoDaoImpl")
public class ComInvestmentInfoDaoImpl implements IComInvestmentInfoDao {

	@Autowired
	private ComInvestmentInfoMapper comInvestmentInfoMapper;

	@Override
	public List<ComInvestmentInfo> getComInvestmentInfoListByUuid(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		ComInvestmentInfoExample example = new ComInvestmentInfoExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<ComInvestmentInfo> list = comInvestmentInfoMapper
				.selectByExample(example);
		return list;
	}

}

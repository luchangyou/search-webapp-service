/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: PerOrganizeDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月28日 下午1:52:51 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IPerOrganizeDao;
import com.yiguan.search.mapper.PerOrganizeMapper;
import com.yiguan.search.model.PerOrganize;
import com.yiguan.search.model.PerOrganizeExample;

/**
 * @ClassName: PerOrganizeDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月28日 下午1:52:51
 * 
 */
@Repository("perOrganizeDaoImpl")
public class PerOrganizeDaoImpl implements IPerOrganizeDao {

	@Autowired
	private PerOrganizeMapper perOrganizeMapper;

	@Override
	public List<PerOrganize> getPerOrganizeListByPuuid(String puuid) {

		if (Common.isEmpty(puuid)) {
			return null;
		}

		PerOrganizeExample example = new PerOrganizeExample();
		example.createCriteria().andPuuidEqualTo(puuid);
		List<PerOrganize> list = perOrganizeMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<PerOrganize> getPerOrganizeListByOuuid(String ouuid) {

		if (Common.isEmpty(ouuid)) {
			return null;
		}
		PerOrganizeExample example = new PerOrganizeExample();
		example.createCriteria().andOuuidEqualTo(ouuid);
		List<PerOrganize> list = perOrganizeMapper.selectByExample(example);
		return list;
	}

}

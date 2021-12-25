/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComTminfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:51:08 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IComTminfoDao;
import com.yiguan.search.mapper.ComTminfoMapper;
import com.yiguan.search.model.ComTminfo;
import com.yiguan.search.model.ComTminfoExample;

/**
 * @ClassName: ComTminfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:51:08
 * 
 */
@Repository("comTminfoDaoImpl")
public class ComTminfoDaoImpl implements IComTminfoDao {

	@Autowired
	private ComTminfoMapper comTminfoMapper;

	@Override
	public List<ComTminfo> getComTminfoList(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}
		ComTminfoExample example = new ComTminfoExample();
		example.createCriteria().andUuidEqualTo(uuid);
		return comTminfoMapper.selectByExample(example);
	}
}

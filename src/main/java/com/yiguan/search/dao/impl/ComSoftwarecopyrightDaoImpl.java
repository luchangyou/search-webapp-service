/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComSoftwarecopyrightDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:50:57 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IComSoftwarecopyrightDao;
import com.yiguan.search.mapper.ComSoftwarecopyrightMapper;
import com.yiguan.search.model.ComSoftwarecopyright;
import com.yiguan.search.model.ComSoftwarecopyrightExample;

/**
 * @ClassName: ComSoftwarecopyrightDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:50:57
 * 
 */
@Repository("comSoftwarecopyrightDaoImpl")
public class ComSoftwarecopyrightDaoImpl implements IComSoftwarecopyrightDao {

	@Autowired
	private ComSoftwarecopyrightMapper comSoftwarecopyrightMapper;

	@Override
	public List<ComSoftwarecopyright> getComSoftwarecopyrightList(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		ComSoftwarecopyrightExample example = new ComSoftwarecopyrightExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<ComSoftwarecopyright> list = comSoftwarecopyrightMapper
				.selectByExample(example);
		return list;
	}

}

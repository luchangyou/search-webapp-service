/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComIcpDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:47:15 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IComIcpDao;
import com.yiguan.search.mapper.ComIcpMapper;
import com.yiguan.search.model.ComIcp;
import com.yiguan.search.model.ComIcpExample;

/**
 * @ClassName: ComIcpDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:47:15
 * 
 */
@Repository("comIcpDaoImpl")
public class ComIcpDaoImpl implements IComIcpDao {

	@Autowired
	private ComIcpMapper comIcpMapper;

	@Override
	public List<ComIcp> getComIcpList(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		ComIcpExample example = new ComIcpExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<ComIcp> list = comIcpMapper.selectByExample(example);
		return list;
	}

}

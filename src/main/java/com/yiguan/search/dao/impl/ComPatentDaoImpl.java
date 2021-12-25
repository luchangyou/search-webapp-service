/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComPatentDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月7日 下午3:53:05 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IComPatentDao;
import com.yiguan.search.mapper.ComPatentMapper;
import com.yiguan.search.model.ComPatent;
import com.yiguan.search.model.ComPatentExample;

/**
 * @ClassName: ComPatentDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月7日 下午3:53:05
 * 
 */
@Repository("comPatentDaoImpl")
public class ComPatentDaoImpl implements IComPatentDao {

	@Autowired
	private ComPatentMapper comPatentMapper;

	@Override
	public List<ComPatent> getComPatentList(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		ComPatentExample example = new ComPatentExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<ComPatent> list = comPatentMapper.selectByExample(example);
		return list;
	}

}

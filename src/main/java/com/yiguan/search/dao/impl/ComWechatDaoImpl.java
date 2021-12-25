/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComWechatDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:41:32 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IComWechatDao;
import com.yiguan.search.mapper.ComWechatMapper;
import com.yiguan.search.model.ComWechat;
import com.yiguan.search.model.ComWechatExample;

/**
 * @ClassName: ComWechatDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:41:32
 * 
 */
@Repository("comWechatDaoImpl")
public class ComWechatDaoImpl implements IComWechatDao {

	@Autowired
	private ComWechatMapper comWechatMapper;

	@Override
	public List<ComWechat> getComWechatList(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		ComWechatExample example = new ComWechatExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<ComWechat> list = comWechatMapper.selectByExample(example);
		return list;
	}

}

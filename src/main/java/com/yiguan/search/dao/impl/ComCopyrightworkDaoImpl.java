/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComCopyrightworkDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:51:43 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IComCopyrightworkDao;
import com.yiguan.search.mapper.ComCopyrightworkMapper;
import com.yiguan.search.model.ComCopyrightwork;
import com.yiguan.search.model.ComCopyrightworkExample;

/**
 * @ClassName: ComCopyrightworkDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:51:43
 * 
 */
@Repository("comCopyrightworkDaoImpl")
public class ComCopyrightworkDaoImpl implements IComCopyrightworkDao {

	@Autowired
	private ComCopyrightworkMapper comCopyrightworkMapper;

	@Override
	public List<ComCopyrightwork> getComCopyrightworkList(String uuid) {
		if (Common.isEmpty(uuid)) {
			return null;
		}
		ComCopyrightworkExample example = new ComCopyrightworkExample();
		example.createCriteria().andUuidEqualTo(uuid);
		return comCopyrightworkMapper.selectByExample(example);
	}
}

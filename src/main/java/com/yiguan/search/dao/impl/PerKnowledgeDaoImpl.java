/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: PerKnowledgeDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:05:44 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IPerKnowledgeDao;
import com.yiguan.search.mapper.PerKnowledgeMapper;
import com.yiguan.search.model.PerKnowledge;
import com.yiguan.search.model.PerKnowledgeExample;

/**
 * @ClassName: PerKnowledgeDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:05:44
 * 
 */
@Repository("perKnowledgeDaoImpl")
public class PerKnowledgeDaoImpl implements IPerKnowledgeDao {

	@Autowired
	private PerKnowledgeMapper perKnowledgeMapper;

	@Override
	public List<PerKnowledge> getListByPuuid(String puuid) {

		if (Common.isEmpty(puuid)) {
			return null;
		}

		PerKnowledgeExample example = new PerKnowledgeExample();
		example.createCriteria().andPuuidEqualTo(puuid);
		List<PerKnowledge> list = perKnowledgeMapper.selectByExample(example);

		return list;
	}

}

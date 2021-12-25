/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: OrgKnowledgeDaoimpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:05:00 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IOrgKnowledgeDao;
import com.yiguan.search.mapper.OrgKnowledgeMapper;
import com.yiguan.search.model.OrgKnowledge;
import com.yiguan.search.model.OrgKnowledgeExample;

/**
 * @ClassName: OrgKnowledgeDaoimpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:05:00
 * 
 */
@Repository("orgKnowledgeDaoImpl")
public class OrgKnowledgeDaoImpl implements IOrgKnowledgeDao {

	@Autowired
	private OrgKnowledgeMapper orgKnowledgeMapper;

	@Override
	public List<OrgKnowledge> getListByOUuid(String ouuid) {

		if (Common.isEmpty(ouuid)) {
			return null;
		}

		OrgKnowledgeExample example = new OrgKnowledgeExample();
		example.createCriteria().andOuuidEqualTo(ouuid);
		List<OrgKnowledge> list = orgKnowledgeMapper.selectByExample(example);

		return list;
	}

}

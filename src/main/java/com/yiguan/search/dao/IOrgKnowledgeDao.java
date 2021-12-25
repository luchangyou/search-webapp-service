/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IOrgKnowledgeDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:04:06 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.OrgKnowledge;

/**
 * @ClassName: IOrgKnowledgeDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:04:06
 * 
 */
public interface IOrgKnowledgeDao {

	public List<OrgKnowledge> getListByOUuid(String ouuid);
}

/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IPerKnowledgeDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:04:18 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.PerKnowledge;

/**
 * @ClassName: IPerKnowledgeDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:04:18
 * 
 */
public interface IPerKnowledgeDao {

	public List<PerKnowledge> getListByPuuid(String puuid);
}

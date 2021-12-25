/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IBasKnowledgeInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午10:59:51 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasKnowledgeInfo;

/**
 * @ClassName: IBasKnowledgeInfoDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午10:59:51
 * 
 */
public interface IBasKnowledgeInfoDao {
	/**
	 * @Description: 根据关键字获取列表
	 * @param
	 * @return the boolean
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年7月26日 上午11:11:37
	 *
	 */
	public List<BasKnowledgeInfo> getBasKnowledgeInfoList(String keyWord,
			Page<BasKnowledgeInfo> page);

	public BasKnowledgeInfo getBasKnowledgeInfo(long id);

	public int totalNumber(String keyWord);

	public BasKnowledgeInfo getBasKnowledgeInfo(String uuid);
}

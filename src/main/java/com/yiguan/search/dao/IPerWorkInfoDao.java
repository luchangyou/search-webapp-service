/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IPerWorkInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午12:32:16 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.PerWorkInfo;

/**
 * @ClassName: IPerWorkInfoDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午12:32:16
 * 
 */
public interface IPerWorkInfoDao {

	/**
	 * @Description: 获取最新工作经历
	 * @param
	 * @return the boolean
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年8月12日 下午12:31:42
	 *
	 */
	public PerWorkInfo getPerWorkInfo(String uuid);

	public List<PerWorkInfo> getPerWorkInfoList(String uuid);

}

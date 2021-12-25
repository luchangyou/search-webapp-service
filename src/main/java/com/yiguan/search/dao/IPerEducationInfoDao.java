/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IPerEducationInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午2:16:46 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import java.util.List;

import com.yiguan.search.model.PerEducationInfo;

/**
 * @ClassName: IPerEducationInfoDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午2:16:46
 * 
 */
public interface IPerEducationInfoDao {

	/**
	 * @Description: 获取最新学习经历
	 * @param
	 * @return the boolean
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年8月12日 下午2:23:51
	 *
	 */
	public PerEducationInfo getPerEducationInfoByUuid(String uuid);

	public List<PerEducationInfo> getPerEducationInfoList(String uuid);
}

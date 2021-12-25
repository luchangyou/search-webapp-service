/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IBasEventInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午5:37:10 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasEventInfo;

import java.util.List;

/**
 * @ClassName: IBasEventInfoDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午5:37:10
 * 
 */
public interface IBasEventInfoDao {

	/**
	 * @Description: 根据关键字获取事列表
	 * @param
	 * @return the boolean
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年8月19日 下午5:39:25
	 *
	 */
	public List<BasEventInfo> getBasEventInfoList(String keyWord, String type,
			Page<BasEventInfo> page);

	public int totalNumber(String keyWord, String type);

	public BasEventInfo getBasEventInfo(int id);

	public List<BasEventInfo> getBasEventInfoListByOuuid(String ouuid);

    BasEventInfo getBasEventInfoListByEuuid(String euuid);

}

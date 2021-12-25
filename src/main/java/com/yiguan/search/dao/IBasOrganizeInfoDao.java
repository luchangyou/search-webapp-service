/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IBasOrganizeInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:40 
 * @version V1.0   
 */
package com.yiguan.search.dao;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasOrganizeInfo;
import com.yiguan.search.model.BasOrganizeInfoExample;
import com.yiguan.search.po.OrgQryPartParam;

import java.util.List;

/**
 * @ClassName: IBasOrganizeInfoDao
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:40
 * 
 */
public interface IBasOrganizeInfoDao {
	/**
	 * @Description: 根据关键字获取列表
	 * @param
	 * @return the boolean
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年7月26日 上午11:11:37
	 *
	 */
	public List<BasOrganizeInfo> getBasOrganizeInfoList(String keyWord,
			String type, Page<BasOrganizeInfo> page);

    public List<BasOrganizeInfo> getBasOrganizeInfoList(BasOrganizeInfoExample example, Page<BasOrganizeInfo> page);

	public List<BasOrganizeInfo> findBasOrganizeInfo(OrgQryPartParam param);

	public BasOrganizeInfo getBasOrganizeInfo(long id);

	public int totalNumber(String keyWord, String type);

	public int countNumber(OrgQryPartParam param);

	public int countNumber(BasOrganizeInfoExample example);

	/**
	 * @Description: 根据uid获取数据
	 * @param
	 * @return the boolean
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年8月12日 上午10:46:07
	 *
	 */
	public List<BasOrganizeInfo> getListByUuid(String uuid);
}

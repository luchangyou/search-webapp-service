/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IBasOrganizeInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:40 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasOrganizeInfo;
import jxl.write.WritableWorkbook;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: IBasOrganizeInfoService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:40
 * 
 */
public interface IBasOrganizeInfoService {
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

	public List<BasOrganizeInfo> getBasOrganizeInfoList(String keyWord, String type, String faxing,String touzi,Page<BasOrganizeInfo> page);

    public List<BasOrganizeInfo> getBasOrganizeInfoListByKeyWord(String keyWord, String type, String faxing,String touzi,Page<BasOrganizeInfo> page);

	public BasOrganizeInfo getBasOrganizeInfo(long id);

	public int totalNumber(String keyWord, String type);

	public int totalNumber(String keyWord, String type, String faxing,String touzi);

	public int countNumber(String keyWord, String type, String faxing,String touzi);

	/**
	 * @Description: 根据uid获取数据
	 * @param
	 * @return the boolean
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年8月12日 上午10:46:07
	 *
	 */
	public List<BasOrganizeInfo> getListByUuid(String uuid);

	String createOrgExcel(String uuid, WritableWorkbook wwb);

	LinkedHashMap<String, String> getBasOrganizeInfoMap();
}

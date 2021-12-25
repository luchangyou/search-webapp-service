/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IBasBusinessInfoDao.java
 * @Package com.yiguan.search.dao
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午10:59:00 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasBusinessInfo;
import jxl.write.WritableWorkbook;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: IBasBusinessInfoService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午10:59:00
 * 
 */
public interface IBasBusinessInfoService {

	/**
	 * @Description: 根据关键字获取列表
	 * @param
	 * @return the boolean
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年7月26日 上午11:11:37
	 *
	 */
	public List<BasBusinessInfo> getBasBusinessInfoList(String keyWord,
			Page<BasBusinessInfo> page);

	public BasBusinessInfo getBasBusinessInfo(int id);

	public int totalNumber(String keyWord);

	public List<BasBusinessInfo> getListByUuid(String uuid);

	String createBusinessExcel(String uuid, WritableWorkbook wwb);

	LinkedHashMap<String, String> getBasBusinessInfoMap();
}

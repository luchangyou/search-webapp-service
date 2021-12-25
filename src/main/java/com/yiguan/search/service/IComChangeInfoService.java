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

import com.yiguan.search.model.ComChangeInfo;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IComShareholderService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月9日 下午4:07:00
 * 
 */
public interface IComChangeInfoService {

	/**
	 * @Description: 根据uuid获取列表
	 * @param
	 * @return the boolean
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年8月9日 下午4:11:44
	 *
	 */
	public List<ComChangeInfo> getListByUuid(String uuid);

    String createChangeInfoExcel(String uuid, WritableWorkbook wwb);

}

/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IPerWorkInfoService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午12:30:07 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.PerWorkInfo;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IPerWorkInfoService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午12:30:07
 * 
 */
public interface IPerWorkInfoService {

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

    String createPerWorkInfoExcel(String uuid, WritableWorkbook wwb);

}

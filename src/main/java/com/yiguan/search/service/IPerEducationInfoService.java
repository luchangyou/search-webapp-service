/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IPerEducationInfoService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午2:17:57 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.PerEducationInfo;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IPerEducationInfoService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午2:17:57
 * 
 */
public interface IPerEducationInfoService {

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

	String createPerEducationInfoExcel(String uuid, WritableWorkbook wwb);

}

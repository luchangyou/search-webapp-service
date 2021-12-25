/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IBasEventInfoService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午5:38:04 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasEventInfo;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IBasEventInfoService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午5:38:04
 * 
 */
public interface IBasEventInfoService {

	public List<BasEventInfo> getBasEventInfoList(String keyWord, String type,
			Page<BasEventInfo> page);

	public int totalNumber(String keyWord, String type);

	public BasEventInfo getBasEventInfo(int id);

	public List<BasEventInfo> getBasEventInfoListByOuuid(String ouuid);

    String createEventInfoExcel(String uuid, WritableWorkbook wwb);

    BasEventInfo getBasEventInfoListByEuuid(String euuid);

}

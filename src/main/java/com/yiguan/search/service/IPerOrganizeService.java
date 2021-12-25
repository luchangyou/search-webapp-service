/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IPerOrganizeService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月28日 下午1:57:11 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.yiguan.search.model.PerOrganize;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IPerOrganizeService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月28日 下午1:57:11
 * 
 */
public interface IPerOrganizeService {

	public List<PerOrganize> getPerOrganizeListByPuuid(String puuid);

	public List<PerOrganize> getPerOrganizeListByOuuid(String ouuid);


	String createPerOrganizeExcel(String uuid, WritableWorkbook wwb);

	String createPerOrganizeExcelByPuuid(String uuid, WritableWorkbook wwb);

}

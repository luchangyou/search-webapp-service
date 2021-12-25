/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: IOrgOrganizeService.java
 * @Package com.yiguan.search.service
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:00:13 
 * @version V1.0   
 */
package com.yiguan.search.service;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.OrgOrganize;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * @ClassName: IOrgOrganizeService
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:00:13
 * 
 */
public interface IOrgOrganizeService {

	public List<OrgOrganize> getListByROUuid(String ouuid);

    String createOrgOrganizeExcel(String uuid, WritableWorkbook wwb);

    List<OrgOrganize> getOrgOrganizeListByRouuidAndRtype(String uuid, String rtype, Page<OrgOrganize> page);

}

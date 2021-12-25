/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: OrgOrganizeServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:17:11 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.Common;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IOrgOrganizeDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.OrgOrganize;
import com.yiguan.search.service.IOrgOrganizeService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: OrgOrganizeServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:17:11
 * 
 */
@Service("orgOrganizeServiceImpl")
public class OrgOrganizeServiceImpl implements IOrgOrganizeService {

	@Autowired
	private IOrgOrganizeDao orgOrganizeDaoImpl;

	@Override
	public List<OrgOrganize> getListByROUuid(String ouuid) {
		return orgOrganizeDaoImpl.getListByROUuid(ouuid);
	}

    @Override
    public String createOrgOrganizeExcel(String uuid, WritableWorkbook wwb) {
		List<OrgOrganize> orgOrganizeList = this.getListByROUuid(uuid);

		if(orgOrganizeList != null && orgOrganizeList.size() >0){
			String orgOrganizeName = "关联组织信息";
			LinkedHashMap<String, String> orgOrganuzeMap = this.getOrgOrganuzeMap();
			try {
				ExcelUtil.listToExcel(orgOrganizeList, orgOrganuzeMap, orgOrganizeName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}

		return "1";
    }

    @Override
    public List<OrgOrganize> getOrgOrganizeListByRouuidAndRtype(String uuid, String rtype, Page<OrgOrganize> page) {
    	if(Common.isEmpty(uuid) || Common.isEmpty(rtype)){
    		return null;
		}
        return orgOrganizeDaoImpl.getOrgOrganizeListByRouuidAndRtype(uuid, rtype, page);
    }

    private LinkedHashMap<String,String> getOrgOrganuzeMap() {
		LinkedHashMap<String, String> orgOrganuzeMap = new LinkedHashMap<>();
		//orgOrganuzeMap.put("id","编号");
		orgOrganuzeMap.put("oname","组织名");
		orgOrganuzeMap.put("roname","相关组织名");
		orgOrganuzeMap.put("orgDesc","相关组织描述");
		orgOrganuzeMap.put("revent","发生的关系");
		orgOrganuzeMap.put("rtype","关系类型");
		orgOrganuzeMap.put("rgrade","关系权重");
		orgOrganuzeMap.put("rgDesc","关系权重描述");
		//orgOrganuzeMap.put("ouuid","编号");
		//orgOrganuzeMap.put("rouuid","编号");
		orgOrganuzeMap.put("source","数据来源");
		orgOrganuzeMap.put("ctime","创建时间");
		orgOrganuzeMap.put("atime","修改时间");
		return orgOrganuzeMap;
	}

}

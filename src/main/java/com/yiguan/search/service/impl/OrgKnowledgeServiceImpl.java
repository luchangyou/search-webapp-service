/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: OrgKnowledgeServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:16:55 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IOrgKnowledgeDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.OrgKnowledge;
import com.yiguan.search.service.IOrgKnowledgeService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: OrgKnowledgeServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:16:55
 * 
 */
@Service("orgKnowledgeServiceImpl")
public class OrgKnowledgeServiceImpl implements IOrgKnowledgeService {

	@Autowired
	private IOrgKnowledgeDao orgKnowledgeDaoImpl;

	@Override
	public List<OrgKnowledge> getListByOUuid(String ouuid) {
		return orgKnowledgeDaoImpl.getListByOUuid(ouuid);
	}

    @Override
    public String createOrgKnowledgeExcel(String uuid, WritableWorkbook wwb) {
		List<OrgKnowledge> orgKnowledgeList = this.getListByOUuid(uuid);

		if(orgKnowledgeList != null && orgKnowledgeList.size() >0){
			String orgKnowledgeName = "公司知识信息";
			LinkedHashMap<String, String> orgKnowledgeMap = this.getOrgKnowledgeMap();
			try {
				ExcelUtil.listToExcel(orgKnowledgeList, orgKnowledgeMap, orgKnowledgeName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}

		return "1";
    }

	private LinkedHashMap<String,String> getOrgKnowledgeMap() {
		LinkedHashMap<String, String> orgKnowledgeMap = new LinkedHashMap<>();
		//orgKnowledgeMap.put("id","编号");
		orgKnowledgeMap.put("oname","组织名");
		orgKnowledgeMap.put("title","相关知识");
		orgKnowledgeMap.put("revent","发生的关系");
		orgKnowledgeMap.put("rtype","关系类型");
		orgKnowledgeMap.put("rgrade","关系权重");
		orgKnowledgeMap.put("rgDesc","权重描述");
		//orgKnowledgeMap.put("ouuid","编号");
		//orgKnowledgeMap.put("kuuid","编号");
		orgKnowledgeMap.put("source","数据来源");
		orgKnowledgeMap.put("ctime","创建时间");
		orgKnowledgeMap.put("atime","修改时间");
		return orgKnowledgeMap;
	}

}

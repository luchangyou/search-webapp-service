/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: PerKnowledgeServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:16:33 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IPerKnowledgeDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.PerKnowledge;
import com.yiguan.search.service.IPerKnowledgeService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: PerKnowledgeServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:16:33
 * 
 */
@Service("perKnowledgeServiceImpl")
public class PerKnowledgeServiceImpl implements IPerKnowledgeService {

	@Autowired
	private IPerKnowledgeDao perKnowledgeDaoImpl;

	@Override
	public List<PerKnowledge> getListByPuuid(String puuid) {
		return perKnowledgeDaoImpl.getListByPuuid(puuid);
	}

    @Override
    public String createPerKnowledgeExcel(String uuid, WritableWorkbook wwb) {
		List<PerKnowledge> perKnowledgeList = this.getListByPuuid(uuid);

		if(perKnowledgeList != null && perKnowledgeList.size() >0){
			String sheetName = "知识信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(perKnowledgeList, fieldMap, sheetName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}

		return "1";
	}

	private LinkedHashMap<String,String> getFieldMap() {
		LinkedHashMap<String, String> fieldMap = new LinkedHashMap<>();

		//fieldMap.put("id","");
		fieldMap.put("name","人名");
		fieldMap.put("kname","产品名");
		fieldMap.put("rtype","关系类型");
		fieldMap.put("rgrade","关系权重");
		fieldMap.put("rpDesc","关系权重描述");
		//fieldMap.put("puuid","");
		//fieldMap.put("kuuid","");
		fieldMap.put("source","数据来源");
		fieldMap.put("ctime","创建时间");
		fieldMap.put("atime","修改时间");

		return fieldMap;
	}
}

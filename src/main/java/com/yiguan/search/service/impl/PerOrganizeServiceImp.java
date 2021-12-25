/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: PerOrganizeServiceImp.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月28日 下午2:01:49 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IPerOrganizeDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.PerOrganize;
import com.yiguan.search.service.IPerOrganizeService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: PerOrganizeServiceImp
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月28日 下午2:01:49
 * 
 */
@Service("perOrganizeServiceImp")
public class PerOrganizeServiceImp implements IPerOrganizeService {

	@Autowired
	private IPerOrganizeDao perOrganizeDaoImpl;

	@Override
	public List<PerOrganize> getPerOrganizeListByPuuid(String puuid) {
		return perOrganizeDaoImpl.getPerOrganizeListByPuuid(puuid);
	}

	@Override
	public List<PerOrganize> getPerOrganizeListByOuuid(String ouuid) {
		return perOrganizeDaoImpl.getPerOrganizeListByOuuid(ouuid);
	}

    @Override
    public String createPerOrganizeExcel(String uuid, WritableWorkbook wwb) {
		List<PerOrganize> perOrganizeList = this.getPerOrganizeListByOuuid(uuid);

		if(perOrganizeList != null && perOrganizeList.size() >0){
			String perOrganizeName = "关联人物信息";
			LinkedHashMap<String, String> perOrganizeMap = this.getPerOrganizeMap();
			try {
				ExcelUtil.listToExcel(perOrganizeList, perOrganizeMap, perOrganizeName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}

		return "1";
    }

	@Override
	public String createPerOrganizeExcelByPuuid(String uuid, WritableWorkbook wwb) {
		List<PerOrganize> perOrganizeList = this.getPerOrganizeListByPuuid(uuid);

		if(perOrganizeList != null && perOrganizeList.size() >0){
			String perOrganizeName = "组织信息";
			LinkedHashMap<String, String> perOrganizeMap = this.getPerOrganizeMap();
			try {
				ExcelUtil.listToExcel(perOrganizeList, perOrganizeMap, perOrganizeName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}

		return "1";
	}

	private LinkedHashMap<String,String> getPerOrganizeMap() {
		LinkedHashMap<String, String> perOrganizeMap = new LinkedHashMap<>();
		//perOrganizeMap.put("id","编号");
		perOrganizeMap.put("name","人名");
		perOrganizeMap.put("oname","组织名");
		perOrganizeMap.put("orgDesc","相关组织描述");
		perOrganizeMap.put("revent","发生的关系");
		perOrganizeMap.put("rtype","关系类型");
		perOrganizeMap.put("rgrade","关系权重");
		perOrganizeMap.put("rgDesc","关系权重描述");
		perOrganizeMap.put("job","职务");
		//perOrganizeMap.put("puuid","编号");
		//perOrganizeMap.put("ouuid","编号");
		perOrganizeMap.put("source","数据来源");
		perOrganizeMap.put("ctime","创建时间");
		perOrganizeMap.put("atime","修改时间");
		return perOrganizeMap;
	}

}

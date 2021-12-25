/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: PerWorkInfoServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午12:30:24 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IPerWorkInfoDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.PerWorkInfo;
import com.yiguan.search.service.IPerWorkInfoService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: PerWorkInfoServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午12:30:24
 * 
 */
@Service("perWorkInfoServiceImpl")
public class PerWorkInfoServiceImpl implements IPerWorkInfoService {

	@Autowired
	private IPerWorkInfoDao perWorkInfoDaoImpl;

	@Override
	public PerWorkInfo getPerWorkInfo(String uuid) {
		return perWorkInfoDaoImpl.getPerWorkInfo(uuid);
	}

	@Override
	public List<PerWorkInfo> getPerWorkInfoList(String uuid) {
		return perWorkInfoDaoImpl.getPerWorkInfoList(uuid);
	}

    @Override
    public String createPerWorkInfoExcel(String uuid, WritableWorkbook wwb) {
		List<PerWorkInfo> perWorkInfoList = this.getPerWorkInfoList(uuid);

		if(perWorkInfoList != null && perWorkInfoList.size() >0){
			String sheetName = "工作信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(perWorkInfoList, fieldMap, sheetName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}

		return "1";
	}

	private LinkedHashMap<String,String> getFieldMap() {
		LinkedHashMap<String, String> fieldMap = new LinkedHashMap<>();

		//fieldMap.put("id","");
		fieldMap.put("oname","公司");
		fieldMap.put("department","部门");
		fieldMap.put("job","职位");
		fieldMap.put("level","级别");
		fieldMap.put("jobEarly","职位");
		fieldMap.put("workTime","此公司工作时间");
		fieldMap.put("wtype","工作类型");
		fieldMap.put("companyAddr","工作地址");
		fieldMap.put("oph","办公电话");
		fieldMap.put("income","收入");
		fieldMap.put("wDesc","工作描述");
		//fieldMap.put("uuid","");
		fieldMap.put("ctime","创建时间");
		fieldMap.put("atime","修改时间");
		fieldMap.put("startTime","工作起始时间");
		fieldMap.put("endTime","工作结束时间");

		return fieldMap;
	}

}

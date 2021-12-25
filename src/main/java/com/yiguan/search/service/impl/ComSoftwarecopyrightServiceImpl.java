/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComSoftwarecopyrightServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:50:57 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IComSoftwarecopyrightDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.ComSoftwarecopyright;
import com.yiguan.search.service.IComSoftwarecopyrightService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: ComSoftwarecopyrightServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:50:57
 * 
 */
@Service("comSoftwarecopyrightServiceImpl")
public class ComSoftwarecopyrightServiceImpl implements
		IComSoftwarecopyrightService {

	@Autowired
	private IComSoftwarecopyrightDao comSoftwarecopyrightDaoImpl;

	@Override
	public List<ComSoftwarecopyright> getComSoftwarecopyrightList(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		return comSoftwarecopyrightDaoImpl.getComSoftwarecopyrightList(uuid);
	}

    @Override
    public String createExcel(String uuid, WritableWorkbook wwb) {
		List<ComSoftwarecopyright> comSoftwarecopyrightList = this.getComSoftwarecopyrightList(uuid);

		if(comSoftwarecopyrightList != null && comSoftwarecopyrightList.size() >0){
			String sheetName = "著作权信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(comSoftwarecopyrightList, fieldMap, sheetName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}

		return "1";
	}

	private LinkedHashMap<String,String> getFieldMap() {
		LinkedHashMap<String, String> fieldMap = new LinkedHashMap<>();
		//fieldMap.put("id","编号");
		//fieldMap.put("bid","编号");
		//fieldMap.put("uuid","编号");
		fieldMap.put("softwarefullname","软件全称");
		fieldMap.put("softwareshortname","软件简称");
		fieldMap.put("registrationnumber","登记号");
		fieldMap.put("classificationnumber","分类号");
		fieldMap.put("versionnumber","版本号");
		fieldMap.put("copyrightowner","著作权人(国籍)");
		fieldMap.put("firstpublicationdata","首次发表日期");
		fieldMap.put("registrationdata","登记日期");
		fieldMap.put("ctime","创建时间");
		fieldMap.put("atime","修改时间");
		return fieldMap;
	}

}

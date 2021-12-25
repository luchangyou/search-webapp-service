/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComTminfoServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:49:34 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IComTminfoDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.ComTminfo;
import com.yiguan.search.service.IComTminfoService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: ComTminfoServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:49:34
 * 
 */
@Service("comTminfoServiceImpl")
public class ComTminfoServiceImpl implements IComTminfoService {

	@Autowired
	private IComTminfoDao comTminfoDaoImpl;

	@Override
	public List<ComTminfo> getComTminfoList(String uuid) {
		return comTminfoDaoImpl.getComTminfoList(uuid);
	}

    @Override
    public String createExcel(String uuid, WritableWorkbook wwb) {
		List<ComTminfo> comTminfoList = this.getComTminfoList(uuid);
		if(comTminfoList != null && comTminfoList.size() >0){
			String sheetName = "商标信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(comTminfoList, fieldMap, sheetName, wwb);
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
		fieldMap.put("adate","申请日期");
		fieldMap.put("brandname","商标名称");
		fieldMap.put("rnumber","注册号");
		fieldMap.put("classLb","类别");
		fieldMap.put("state","状态");
		fieldMap.put("tmpic","商标图片");
		fieldMap.put("ctime","创建时间");
		fieldMap.put("atime","修改时间");
		return fieldMap;
	}
}

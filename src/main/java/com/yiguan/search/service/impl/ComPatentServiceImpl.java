/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComPatentServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月7日 下午3:52:10 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IComPatentDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.ComPatent;
import com.yiguan.search.service.IComPatentService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: ComPatentServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月7日 下午3:52:10
 * 
 */
@Service("comPatentServiceImpl")
public class ComPatentServiceImpl implements IComPatentService {

	@Autowired
	private IComPatentDao comPatentDaoImpl;

	@Override
	public List<ComPatent> getComPatentList(String uuid) {
		return comPatentDaoImpl.getComPatentList(uuid);
	}

    @Override
    public String createExcel(String uuid, WritableWorkbook wwb) {
		List<ComPatent> comPatentList = this.getComPatentList(uuid);

		if(comPatentList != null && comPatentList.size() >0){
			String sheetName = "专利信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(comPatentList, fieldMap, sheetName, wwb);
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
		fieldMap.put("imgurl","专利信息图片链接");
		fieldMap.put("apnumber","申请公布号");
		fieldMap.put("anumber","申请号");
		fieldMap.put("cnumber","分类号");
		fieldMap.put("inventionname","发明名称");
		fieldMap.put("address","地址");
		fieldMap.put("inventor","发明人");
		fieldMap.put("applicant","申请人");
		fieldMap.put("apdate","申请日");
		fieldMap.put("andate","申请公布日");
		fieldMap.put("agency","代理机构");
		fieldMap.put("agent","代理人");
		fieldMap.put("abs","摘要");
		fieldMap.put("ctime","创建时间");
		fieldMap.put("atime","修改时间");
		return fieldMap;
	}

}

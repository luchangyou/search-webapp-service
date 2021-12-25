/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComInvestmentInfoServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月11日 下午7:11:11 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IComInvestmentInfoDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.ComInvestmentInfo;
import com.yiguan.search.service.IComInvestmentInfoService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: ComInvestmentInfoServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月11日 下午7:11:11
 * 
 */
@Service("comInvestmentInfoServiceImpl")
public class ComInvestmentInfoServiceImpl implements IComInvestmentInfoService {

	@Autowired
	private IComInvestmentInfoDao comInvestmentInfoDaoImpl;

	@Override
	public List<ComInvestmentInfo> getComInvestmentInfoListByUuid(String uuid) {
		return comInvestmentInfoDaoImpl.getComInvestmentInfoListByUuid(uuid);
	}

    @Override
    public String createExcel(String uuid, WritableWorkbook wwb) {
		List<ComInvestmentInfo> comInvestmentInfoList = this.getComInvestmentInfoListByUuid(uuid);

		if(comInvestmentInfoList != null && comInvestmentInfoList.size() >0){
			String sheetName = "对外投资信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(comInvestmentInfoList, fieldMap, sheetName, wwb);
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
		fieldMap.put("oname","组织名");
		fieldMap.put("legalPersen","法定代表人");
		fieldMap.put("industry","行业");
		fieldMap.put("state","状态");
		fieldMap.put("investment","投资金额");
		fieldMap.put("proportion","投资占比");
		fieldMap.put("rcapital","注册资本");
		fieldMap.put("rtime","注册时间");
		fieldMap.put("web","网站url");
		fieldMap.put("ctime","创建时间");
		fieldMap.put("atime","修改时间");
		return fieldMap;
	}

}

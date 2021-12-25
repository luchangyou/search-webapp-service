/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComIcpServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:47:15 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IComIcpDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.ComIcp;
import com.yiguan.search.service.IComIcpService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: ComIcpServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:47:15
 * 
 */
@Service("comIcpServiceImpl")
public class ComIcpServiceImpl implements IComIcpService {

	@Autowired
	private IComIcpDao comIcpDaoImpl;

	@Override
	public List<ComIcp> getComIcpList(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		return comIcpDaoImpl.getComIcpList(uuid);
	}

    @Override
    public String createExcel(String uuid, WritableWorkbook wwb) {
		List<ComIcp> comIcpList = this.getComIcpList(uuid);

		if(comIcpList != null && comIcpList.size() >0){
			String sheetName = "ICP信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(comIcpList, fieldMap, sheetName, wwb);
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
		fieldMap.put("audittime","审核时间");
		fieldMap.put("webname","网站名称");
		fieldMap.put("home","网站首页");
		fieldMap.put("domainname","域名");
		fieldMap.put("icpnumber","备案号");
		fieldMap.put("state","状态");
		fieldMap.put("property","单位性质");
		fieldMap.put("ctime","创建时间");
		fieldMap.put("atime","修改时间");
		return fieldMap;
	}

}

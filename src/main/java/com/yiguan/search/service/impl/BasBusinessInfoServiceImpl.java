/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasBusinessInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午10:59:19 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IBasBusinessInfoDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.BasBusinessInfo;
import com.yiguan.search.service.IBasBusinessInfoService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: BasBusinessInfoServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午10:59:19
 * 
 */
@Service("basBusinessInfoServiceImpl")
public class BasBusinessInfoServiceImpl implements IBasBusinessInfoService {

	@Autowired
	private IBasBusinessInfoDao basBusinessInfoDaoImp;

	@Override
	public List<BasBusinessInfo> getBasBusinessInfoList(String keyWord,
			Page<BasBusinessInfo> page) {

		if (page == null) {
			page = new Page<BasBusinessInfo>();
			page.setLimit(-1);
		}

		return basBusinessInfoDaoImp.getBasBusinessInfoList(keyWord, page);

	}

	@Override
	public BasBusinessInfo getBasBusinessInfo(int id) {
		return basBusinessInfoDaoImp.getBasBusinessInfo(id);
	}

	@Override
	public int totalNumber(String keyWord) {

		return basBusinessInfoDaoImp.totalNumber(keyWord);
	}

	@Override
	public List<BasBusinessInfo> getListByUuid(String uuid) {
		return basBusinessInfoDaoImp.getListByUuid(uuid);
	}

	@Override
	public String createBusinessExcel(String uuid, WritableWorkbook wwb) {

		List<BasBusinessInfo> busBuessInfoList = this.getListByUuid(uuid);
		//导出工商基本信息
		if(busBuessInfoList != null && busBuessInfoList.size() >0){
			String busBuessInfoName = "工商基本信息";
			LinkedHashMap<String, String> basBusinessInfoMap = this.getBasBusinessInfoMap();
			try {
				ExcelUtil.listToExcel(busBuessInfoList, basBusinessInfoMap, busBuessInfoName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}
		return "1";
	}

	@Override
    public LinkedHashMap<String, String> getBasBusinessInfoMap() {
		LinkedHashMap<String, String> busBuessInfoMap = new LinkedHashMap<>();
		//busBuessInfoMap.put("id","编号");
		//busBuessInfoMap.put("uuid","编号");
		busBuessInfoMap.put("cname","公司名");
		busBuessInfoMap.put("cnameOld","公司曾用名");
		busBuessInfoMap.put("stockType","股票类型");
		busBuessInfoMap.put("stockCode","股票代码");
		busBuessInfoMap.put("telephone","电话");
		busBuessInfoMap.put("email","邮箱");
		busBuessInfoMap.put("web","公司网址");
		busBuessInfoMap.put("adress","公司地址");
		busBuessInfoMap.put("legalPersen","法定代表人");
		busBuessInfoMap.put("rcapital","注册资本");
		busBuessInfoMap.put("state","状态");
		busBuessInfoMap.put("etime","成立时间");
		busBuessInfoMap.put("rtime","注册时间");
		busBuessInfoMap.put("industry","行业");
		busBuessInfoMap.put("rbnumber","工商注册号");
		busBuessInfoMap.put("enterpriseType","企业类型");
		busBuessInfoMap.put("ocode","组织机构代码");
		busBuessInfoMap.put("operationPeriod","营业期限");
		busBuessInfoMap.put("rdepartment","登记");
		busBuessInfoMap.put("approvaDate","核准日期");
		busBuessInfoMap.put("ucCode","统一信用代码");
		busBuessInfoMap.put("radress","注册地址");
		busBuessInfoMap.put("bscope","经营范围");
		busBuessInfoMap.put("source","记录来源");
		busBuessInfoMap.put("url","记录来源网址");
		busBuessInfoMap.put("ctime","创建时间");
		busBuessInfoMap.put("atime","修改时间");
		busBuessInfoMap.put("lon","经度");
		busBuessInfoMap.put("lat","纬度");
		busBuessInfoMap.put("province","省");
		busBuessInfoMap.put("city","市");
		busBuessInfoMap.put("county","区县");
		return busBuessInfoMap;
    }

}

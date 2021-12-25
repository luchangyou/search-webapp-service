/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: OrgProductServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午7:12:49 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IOrgProductDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.OrgProduct;
import com.yiguan.search.service.IOrgProductService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: OrgProductServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午7:12:49
 * 
 */
@Service("orgProductServiceImpl")
public class OrgProductServiceImpl implements IOrgProductService {

	@Autowired
	private IOrgProductDao orgProductDaoImpl;

	@Override
	public List<OrgProduct> getOrgProductList(String uuid) {
		return orgProductDaoImpl.getOrgProductList(uuid);
	}

	@Override
	public OrgProduct getOrgProduct(long id) {
		return orgProductDaoImpl.getOrgProduct(id);
	}

    @Override
    public String createOrgProductExcel(String uuid, WritableWorkbook wwb) {
		List<OrgProduct> orgProductList = this.getOrgProductList(uuid);
		if(orgProductList != null && orgProductList.size() >0){
			String orgProductName = "公司产品信息";
			LinkedHashMap<String, String> orgProductMap = this.getOrgProductMap();
			try {
				ExcelUtil.listToExcel(orgProductList, orgProductMap, orgProductName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}
		return "1";
    }

	private LinkedHashMap<String,String> getOrgProductMap() {
		LinkedHashMap<String, String> orgProductMap = new LinkedHashMap<>();
		//orgProductMap.put("id","编号");
		orgProductMap.put("oname","组织名");
		orgProductMap.put("pname","产品名");
		orgProductMap.put("rtype","关系类型");
		orgProductMap.put("rgrade","关系权重");
		orgProductMap.put("rgDesc","关系权重描述");
		//orgProductMap.put("ouuid","组织ID");
		//orgProductMap.put("prUuid","产品ID");
		orgProductMap.put("source","数据来源");
		orgProductMap.put("ctime","创建时间");
		orgProductMap.put("atime","修改时间");
		return orgProductMap;
	}

}

/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComCopyrightworkServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:49:51 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IComCopyrightworkDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.ComCopyrightwork;
import com.yiguan.search.service.IComCopyrightworkService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: ComCopyrightworkServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月4日 下午6:49:51
 * 
 */
@Service("comCopyrightworkServiceImpl")
public class ComCopyrightworkServiceImpl implements IComCopyrightworkService {

	@Autowired
	private IComCopyrightworkDao comCopyrightworkDaoImpl;

	@Override
	public List<ComCopyrightwork> getComCopyrightworkList(String uuid) {
		return comCopyrightworkDaoImpl.getComCopyrightworkList(uuid);
	}

    @Override
    public String createExcel(String uuid, WritableWorkbook wwb) {
		List<ComCopyrightwork> comCopyrightworkList = this.getComCopyrightworkList(uuid);

		if(comCopyrightworkList != null && comCopyrightworkList.size() >0){
			String sheetName = "作品著作权信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(comCopyrightworkList, fieldMap, sheetName, wwb);
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
		fieldMap.put("workname","作品名称");
		fieldMap.put("rnumber","登记号");
		fieldMap.put("classLb","类别");
		fieldMap.put("completiondate","创作完成日期");
		fieldMap.put("rdate","登记日期");
		fieldMap.put("frdate","首次发布日期");
		fieldMap.put("ctime","创建时间");
		fieldMap.put("atime","修改时间");
		return fieldMap;
	}
}

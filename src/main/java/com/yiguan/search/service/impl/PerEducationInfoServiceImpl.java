/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: PerEducationInfoServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午2:18:11 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IPerEducationInfoDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.PerEducationInfo;
import com.yiguan.search.service.IPerEducationInfoService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: PerEducationInfoServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月12日 下午2:18:11
 * 
 */
@Service("perEducationInfoServiceImpl")
public class PerEducationInfoServiceImpl implements IPerEducationInfoService {

	@Autowired
	private IPerEducationInfoDao perEducationInfoDaoImpl;

	@Override
	public PerEducationInfo getPerEducationInfoByUuid(String uuid) {
		return perEducationInfoDaoImpl.getPerEducationInfoByUuid(uuid);
	}

	@Override
	public List<PerEducationInfo> getPerEducationInfoList(String uuid) {
		return perEducationInfoDaoImpl.getPerEducationInfoList(uuid);
	}

    @Override
    public String createPerEducationInfoExcel(String uuid, WritableWorkbook wwb) {
		List<PerEducationInfo> perEducationInfoList = this.getPerEducationInfoList(uuid);

		if(perEducationInfoList != null && perEducationInfoList.size() >0){
			String sheetName = "学习信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(perEducationInfoList, fieldMap, sheetName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}

		return "1";
	}

	private LinkedHashMap<String,String> getFieldMap() {
		LinkedHashMap<String, String> fieldMap = new LinkedHashMap<>();
		//fieldMap.put("id","");
		fieldMap.put("school","学校");
		fieldMap.put("major","主修专业");
		fieldMap.put("diploma","学历学位");
		fieldMap.put("startDate","入学时间");
		fieldMap.put("endDate","毕业时间");
		fieldMap.put("event","在校成就");
		//fieldMap.put("uuid","");
		//fieldMap.put("type","");
		fieldMap.put("place","地点");
		fieldMap.put("ctime","创建时间");
		fieldMap.put("atime","修改时间");
		fieldMap.put("endTime","毕业时间");
		fieldMap.put("startTime","入学时间");

		return fieldMap;
	}

}

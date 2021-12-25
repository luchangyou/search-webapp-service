/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComShareholderServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月9日 下午4:07:00 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.mapper.ComExecutiveInfoMapper;
import com.yiguan.search.model.ComExecutiveInfo;
import com.yiguan.search.model.ComExecutiveInfoExample;
import com.yiguan.search.service.IComExecutiveInfoService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: ComShareholderServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月9日 下午4:07:00
 * 
 */
@Service("comExecutiveInfoServiceImpl")
public class ComExecutiveInfoServiceImpl implements IComExecutiveInfoService {

	@Autowired
	private ComExecutiveInfoMapper comExecutiveInfoMapper;

	@Override
	public List<ComExecutiveInfo> getListByUuid(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		ComExecutiveInfoExample example = new ComExecutiveInfoExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<ComExecutiveInfo> list = comExecutiveInfoMapper
				.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}

		return list;
	}

    @Override
    public String createExecutiveInfoExcel(String uuid, WritableWorkbook wwb) {

		// 获取公司高管信息
		List<ComExecutiveInfo> comExecutiveInfoList = this.getListByUuid(uuid);
		if(comExecutiveInfoList != null && comExecutiveInfoList.size() >0){
			String shareholderName = "公司高管信息";
			LinkedHashMap<String, String> executiveInfoMap = this.getExecutiveInfoMap();
			try {
				ExcelUtil.listToExcel(comExecutiveInfoList, executiveInfoMap, shareholderName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}
        return "1";
    }

	@Override
	public LinkedHashMap<String, String> getExecutiveInfoMap() {
		LinkedHashMap<String, String> executiveInfoMap = new LinkedHashMap<>();
		//executiveInfoMap.put("id","编号");
		//executiveInfoMap.put("bid","编号");
		//executiveInfoMap.put("uuid","编号");
		executiveInfoMap.put("pname","高管姓名");
		executiveInfoMap.put("job","职位");
		executiveInfoMap.put("adress","地址");
		executiveInfoMap.put("web","高管url");
		executiveInfoMap.put("ctime","创建时间");
		executiveInfoMap.put("atime","修改时间");
		return executiveInfoMap;
	}

}

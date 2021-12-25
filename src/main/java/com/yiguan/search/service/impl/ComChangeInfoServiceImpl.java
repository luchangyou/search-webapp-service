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
import com.yiguan.search.mapper.ComChangeInfoMapper;
import com.yiguan.search.model.ComChangeInfo;
import com.yiguan.search.model.ComChangeInfoExample;
import com.yiguan.search.service.IComChangeInfoService;
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
@Service("comChangeInfoServiceImpl")
public class ComChangeInfoServiceImpl implements IComChangeInfoService {

	@Autowired
	private ComChangeInfoMapper comChangeInfoMapper;

	@Override
	public List<ComChangeInfo> getListByUuid(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		ComChangeInfoExample example = new ComChangeInfoExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<ComChangeInfo> list = comChangeInfoMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}

		return list;
	}

    @Override
    public String createChangeInfoExcel(String uuid, WritableWorkbook wwb) {

		List<ComChangeInfo> comChangeInfoList = this.getListByUuid(uuid);
		if(comChangeInfoList != null && comChangeInfoList.size() >0){
			String shareholderName = "变更记录信息";
			LinkedHashMap<String, String> comChangeInfoMap = this.comChangeInfoMap();
			try {
				ExcelUtil.listToExcel(comChangeInfoList, comChangeInfoMap, shareholderName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}
		return "1";
    }

	private LinkedHashMap<String,String> comChangeInfoMap() {
		LinkedHashMap<String, String> comChangeInfoMap = new LinkedHashMap<>();
		//comChangeInfoMap.put("id","编号");
		//comChangeInfoMap.put("bid","编号");
		//comChangeInfoMap.put("uuid","编号");
		comChangeInfoMap.put("changeTime","变更时间");
		comChangeInfoMap.put("changeItem","变更项目");
		comChangeInfoMap.put("beforeChange","变更前");
		comChangeInfoMap.put("afterChange","变更后");
		comChangeInfoMap.put("ctime","创建时间");
		comChangeInfoMap.put("atime","修改时间");
		return comChangeInfoMap;
	}

}

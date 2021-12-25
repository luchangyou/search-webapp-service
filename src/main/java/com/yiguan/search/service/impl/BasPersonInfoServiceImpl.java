/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasPersonInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:01:40 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IBasPersonInfoDao;
import com.yiguan.search.domain.BasPersonInfoVo;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.BasPersonInfo;
import com.yiguan.search.service.IBasPersonInfoService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: BasPersonInfoServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:01:40
 * 
 */
@Service("basPersonInfoServiceImpl")
public class BasPersonInfoServiceImpl implements IBasPersonInfoService {

	@Autowired
	private IBasPersonInfoDao basPersonInfoImpl;

	@Override
	public List<BasPersonInfoVo> getBasPersonInfoList(String keyWord,
			Page<BasPersonInfo> page) {

		if (page == null) {
			page = new Page<BasPersonInfo>();
			page.setLimit(-1);
		}

		return basPersonInfoImpl.getBasPersonInfoList(keyWord, page);
	}

	@Override
	public BasPersonInfo getBasPersonInfo(long id) {
		return basPersonInfoImpl.getBasPersonInfo(id);
	}

	@Override
	public int totalNumber(String keyWord) {

		return basPersonInfoImpl.totalNumber(keyWord);
	}

	@Override
	public List<BasPersonInfoVo> getBasPersonInfoList(String keyWord,
			String personTag, Page page) {
		if (page == null) {
			page = new Page<BasPersonInfo>();
			page.setLimit(-1);
		}

		return basPersonInfoImpl.getBasPersonInfoList(keyWord, personTag, page);
	}

	@Override
	public int totalNumber(String keyWord, String personTag) {
		return basPersonInfoImpl.totalNumber(keyWord, personTag);
	}

	@Override
	public List<BasPersonInfo> getBasPersonInfoList(String uuid) {
		return basPersonInfoImpl.getBasPersonInfoList(uuid);
	}

	@Override
    public String createBasPersonInfoExcel(String uuid, WritableWorkbook wwb) {
		List<BasPersonInfo> basPersonInfoList = this.getBasPersonInfoList(uuid);

		if(basPersonInfoList != null && basPersonInfoList.size() >0){
			String sheetName = "人物信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(basPersonInfoList, fieldMap, sheetName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}

		return "1";
	}

	private LinkedHashMap<String,String> getFieldMap() {
		LinkedHashMap<String, String> fieldMap = new LinkedHashMap<>();
		//fieldMap.put("id","编号");
		//fieldMap.put("uuid","编号");
		fieldMap.put("name","姓名");
		fieldMap.put("enname","英语姓名");
		fieldMap.put("age","年龄");
		fieldMap.put("alias","别名");
		fieldMap.put("hometown","籍贯");
		fieldMap.put("country","国家");
		fieldMap.put("nation","民族");
		fieldMap.put("province","省份");
		fieldMap.put("city","城市");
		fieldMap.put("conWay","联系方式");
		fieldMap.put("sex","性别");
		fieldMap.put("idNumber","身份证号");
		fieldMap.put("birthday","出生日期");
		fieldMap.put("householdRegister","户籍地");
		fieldMap.put("liveplace","居住地");
		fieldMap.put("maritalStatus","婚姻状况");
		fieldMap.put("employment","工作状况");
		fieldMap.put("diploma","学历学位");
		fieldMap.put("workYears","工龄");
		fieldMap.put("childStatus","是否有孩子");
		fieldMap.put("livePhoto","生活照");
		fieldMap.put("occuPhoto","职业照");
		fieldMap.put("artPhoto","艺术照");
		fieldMap.put("ptag","个人标签");
		fieldMap.put("pDesc","个人描述");
		fieldMap.put("advantage","个人优势");
		fieldMap.put("lastuptime","更新时间");
		fieldMap.put("source","数据来源");
		fieldMap.put("url","个人信息链接");
		fieldMap.put("ctime","创建时间");
		fieldMap.put("atime","记录修改时间");
		fieldMap.put("type","数据视角");

		return fieldMap;
	}

    @Override
	public BasPersonInfo getBasPersonInfoByUuid(String uuid) {
		return basPersonInfoImpl.getBasPersonInfoByUuid(uuid);
	}

}

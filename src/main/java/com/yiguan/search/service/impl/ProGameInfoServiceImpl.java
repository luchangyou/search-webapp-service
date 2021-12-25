/**   
 * @Title: ProGameInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:02:17 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IProGameInfoDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.ProGameInfo;
import com.yiguan.search.service.IProGameInfoService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: ProGameInfoServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:02:17
 * 
 */
@Service("proGameInfoServiceImpl")
public class ProGameInfoServiceImpl implements IProGameInfoService {

	@Autowired
	private IProGameInfoDao proGameInfoDaoImpl;

	@Override
	public List<ProGameInfo> getProGameInfoList(String keyWord,
			Page<ProGameInfo> page) {

		if (page == null) {
			page = new Page<ProGameInfo>();
			page.setLimit(-1);
		}

		return proGameInfoDaoImpl.getProGameInfoList(keyWord, page);
	}

	@Override
	public ProGameInfo getProGameInfo(long id) {
		return proGameInfoDaoImpl.getProGameInfo(id);
	}

	@Override
	public int totalNumber(String keyWord) {

		return proGameInfoDaoImpl.totalNumber(keyWord);
	}

	@Override
	public List<ProGameInfo> getProGameInfoListByUuid(String uuid) {
		return proGameInfoDaoImpl.getProGameInfoListByUuid(uuid);
	}

	@Override
	public List<ProGameInfo> getProGameInfoListByDevelopCom(String developCom) {
		return proGameInfoDaoImpl.getProGameInfoListByDevelopCom(developCom);
	}

	@Override
	public List<ProGameInfo> getProGameInfoList(String keyWord,
			String userShenfen, Page page) {
		return proGameInfoDaoImpl
				.getProGameInfoList(keyWord, userShenfen, page);
	}

	@Override
	public int totalNumber(String keyWord, String userShenfen) {
		return proGameInfoDaoImpl.totalNumber(keyWord, userShenfen);
	}

    @Override
    public String createProGameInfoExcel(String uuid, WritableWorkbook wwb) {
		List<ProGameInfo> proGameInfoList = this.getProGameInfoListByUuid(uuid);

		if(proGameInfoList != null && proGameInfoList.size() >0){
			String sheetName = "产品信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(proGameInfoList, fieldMap, sheetName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}

		return "1";
	}

	private LinkedHashMap<String,String> getFieldMap() {
		LinkedHashMap<String, String> fieldMap = new LinkedHashMap<>();
		//fieldMap.put("id", "");
		fieldMap.put("gname", "游戏名");
		fieldMap.put("gename", "游戏英语名字");
		fieldMap.put("logo", "产品logo");
		fieldMap.put("version", "游戏版本");
		fieldMap.put("language", "语言");
		fieldMap.put("networkType", "是否需要联网");
		fieldMap.put("suitableAge", "适合年龄");
		fieldMap.put("issueArea", "发行区域");
		fieldMap.put("publisher", "发行商");
		fieldMap.put("gstyle", "游戏风格");
		fieldMap.put("gtags", "标签");
		fieldMap.put("picture", "游戏截图");
		fieldMap.put("viewpoint", "游戏视角");
		fieldMap.put("engine", "游戏引擎");
		fieldMap.put("grade", "游戏品级");
		fieldMap.put("dpprogress", "研发进度");
		fieldMap.put("gtheme", "游戏题材");
		fieldMap.put("scale", "产品团队规模");
		fieldMap.put("pdemand", "产品需求");
		fieldMap.put("price", "价格");
		fieldMap.put("chargeMode", "付费方式");
		fieldMap.put("developCom", "研发公司");
		fieldMap.put("gDesc", "游戏介绍");
		fieldMap.put("ptime", "发布时间");
		fieldMap.put("betaTime", "公测时间");
		fieldMap.put("testTime", "内测时间");
		fieldMap.put("betatestTime", "封测时间");
		fieldMap.put("setTime", "立项时间");
		fieldMap.put("web", "游戏官网");
		fieldMap.put("url", "链接");
		fieldMap.put("source", "数据来源");
		//fieldMap.put("uuid", "");
		fieldMap.put("ctime", "创建时间");
		fieldMap.put("atime", "修改时间");
		fieldMap.put("gamespy", "游戏画面");
		fieldMap.put("operator", "运营商");
		fieldMap.put("filmsTime", "资料片发布时间");
		fieldMap.put("gameSize", "游戏大小");
		fieldMap.put("webUpdateTime", "网站更新时间");
		fieldMap.put("downloadLink", "下载链接");
		fieldMap.put("packagename", "包名");
		fieldMap.put("gameUpdateTime", "游戏更新日期");
		fieldMap.put("familysharing", "家人共享");
		fieldMap.put("supportwatch", "是否支持Watch");
		fieldMap.put("supportwebsite", "支持网站");

		return fieldMap;
	}

}

/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasEventInfoServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午5:38:21 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IBasEventInfoDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.BasEventInfo;
import com.yiguan.search.service.IBasEventInfoService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: BasEventInfoServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午5:38:21
 * 
 */
@Service("basEventInfoServiceImpl")
public class BasEventInfoServiceImpl implements IBasEventInfoService {

	@Autowired
	private IBasEventInfoDao basEventInfoDaoImpl;

	@Override
	public List<BasEventInfo> getBasEventInfoList(String keyWord, String type,
			Page<BasEventInfo> page) {

		if (page == null) {
			page = new Page<BasEventInfo>();
			page.setLimit(-1);
		}

		return basEventInfoDaoImpl.getBasEventInfoList(keyWord, type, page);
	}

	@Override
	public int totalNumber(String keyWord, String type) {
		return basEventInfoDaoImpl.totalNumber(keyWord, type);
	}

	@Override
	public BasEventInfo getBasEventInfo(int id) {
		return basEventInfoDaoImpl.getBasEventInfo(id);
	}

	@Override
	public List<BasEventInfo> getBasEventInfoListByOuuid(String ouuid) {
		return basEventInfoDaoImpl.getBasEventInfoListByOuuid(ouuid);
	}

    @Override
    public String createEventInfoExcel(String uuid, WritableWorkbook wwb) {
		List<BasEventInfo> basEventInfoList = this.getBasEventInfoListByOuuid(uuid);
		if(basEventInfoList != null && basEventInfoList.size() >0){
			String basEventInfoName = "公司事件信息";
			LinkedHashMap<String, String> basEventInfoMap = this.getEventInfoMap();
			try {
				ExcelUtil.listToExcel(basEventInfoList, basEventInfoMap, basEventInfoName, wwb);
			} catch (ExcelException e) {
				e.printStackTrace();
			}
		}
		return "1";
    }

    @Override
    public BasEventInfo getBasEventInfoListByEuuid(String euuid) {
        return basEventInfoDaoImpl.getBasEventInfoListByEuuid(euuid);
    }

    private LinkedHashMap<String,String> getEventInfoMap() {
		LinkedHashMap<String, String> basEventInfoMap = new LinkedHashMap<>();
		//basEventInfoMap.put("id","编号");
		basEventInfoMap.put("title","事件主题");
		basEventInfoMap.put("edesc","事件描述");
		basEventInfoMap.put("source","数据来源");
		basEventInfoMap.put("url","链接");
		//basEventInfoMap.put("ouuid","关联的组织的uuid");
		//basEventInfoMap.put("euuid","事件UUID");
		basEventInfoMap.put("ctime","抓取时间");
		basEventInfoMap.put("atime","修改时间");
		basEventInfoMap.put("type","事件类型");
		return basEventInfoMap;
	}

}

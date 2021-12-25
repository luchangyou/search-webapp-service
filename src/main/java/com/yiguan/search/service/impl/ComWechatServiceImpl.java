/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComWechatServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:41:32 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IComWechatDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.ComWechat;
import com.yiguan.search.service.IComWechatService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName: ComWechatServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:41:32
 * 
 */
@Service("comWechatServiceImpl")
public class ComWechatServiceImpl implements IComWechatService {

	@Autowired
	private IComWechatDao comWechatDaoImpl;

	@Override
	public List<ComWechat> getComWechatList(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		return comWechatDaoImpl.getComWechatList(uuid);
	}

    @Override
    public String createExcel(String uuid, WritableWorkbook wwb) {
		List<ComWechat> comWechatList = this.getComWechatList(uuid);

		if(comWechatList != null && comWechatList.size() >0){
			String sheetName = "公众号信息";
			LinkedHashMap<String, String> fieldMap = this.getFieldMap();
			try {
				ExcelUtil.listToExcel(comWechatList, fieldMap, sheetName, wwb);
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
		fieldMap.put("wechatname","公众号名称");
		fieldMap.put("wechat","微信号");
		fieldMap.put("wechatfunction","功能介绍");
		fieldMap.put("logo","logo图片链接");
		fieldMap.put("qrcode","二维码");
		fieldMap.put("ctime","创建时间");
		fieldMap.put("atime","修改时间");
		return fieldMap;
	}

}

/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasKnowledgeInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:09 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.dao.IBasKnowledgeInfoDao;
import com.yiguan.search.model.BasKnowledgeInfo;
import com.yiguan.search.service.IBasKnowledgeInfoService;

/**
 * @ClassName: BasKnowledgeInfoServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:09
 * 
 */
@Service("basKnowledgeInfoServiceImpl")
public class BasKnowledgeInfoServiceImpl implements IBasKnowledgeInfoService {

	@Autowired
	private IBasKnowledgeInfoDao basKnowledgeInfoDaoImpl;

	@Override
	public List<BasKnowledgeInfo> getBasKnowledgeInfoList(String keyWord,
			Page<BasKnowledgeInfo> page) {

		if (page == null) {
			page = new Page<BasKnowledgeInfo>();
			page.setLimit(-1);
		}

		return basKnowledgeInfoDaoImpl.getBasKnowledgeInfoList(keyWord, page);
	}

	@Override
	public BasKnowledgeInfo getBasKnowledgeInfo(long id) {
		return basKnowledgeInfoDaoImpl.getBasKnowledgeInfo(id);
	}

	@Override
	public int totalNumber(String keyWord) {

		return basKnowledgeInfoDaoImpl.totalNumber(keyWord);
	}

	@Override
	public BasKnowledgeInfo getBasKnowledgeInfo(String uuid) {
		return basKnowledgeInfoDaoImpl.getBasKnowledgeInfo(uuid);
	}

}

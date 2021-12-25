/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ProOtherInfoServiceimpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:02:15 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.dao.IProOtherInfoDao;
import com.yiguan.search.model.ProOtherInfo;
import com.yiguan.search.service.IProOtherInfoService;

/**
 * @ClassName: ProOtherInfoServiceimpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午3:02:15
 * 
 */
@Service("proOtherInfoServiceImpl")
public class ProOtherInfoServiceImpl implements IProOtherInfoService {

	@Autowired
	private IProOtherInfoDao proOtherInfoDaoImpl;

	@Override
	public List<ProOtherInfo> getProGameInfoList(String keyWord,
			Page<ProOtherInfo> page) {

		if (page == null) {
			page = new Page<ProOtherInfo>();
			page.setLimit(-1);
		}

		return proOtherInfoDaoImpl.getProGameInfoList(keyWord, page);
	}

	@Override
	public int totalNumber(String keyWord) {
		return proOtherInfoDaoImpl.totalNumber(keyWord);
	}

	@Override
	public ProOtherInfo getProOtherInfo(long id) {
		return proOtherInfoDaoImpl.getProOtherInfo(id);
	}

	@Override
	public List<ProOtherInfo> getProOtherInfoByUuid(String uuid) {
		return proOtherInfoDaoImpl.getProOtherInfoByUuid(uuid);
	}

	@Override
	public List<ProOtherInfo> getProGameInfoList(String keyWord,
			String userShenfen, Page page) {
		return proOtherInfoDaoImpl.getProGameInfoList(keyWord, userShenfen,
				page);
	}

	@Override
	public int totalNumber(String keyWord, String userShenfen) {
		return proOtherInfoDaoImpl.totalNumber(keyWord, userShenfen);
	}

}

/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasKnowledgeInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:09 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IBasKnowledgeInfoDao;
import com.yiguan.search.mapper.BasKnowledgeInfoMapper;
import com.yiguan.search.model.BasKnowledgeInfo;
import com.yiguan.search.model.BasKnowledgeInfoExample;

/**
 * @ClassName: BasKnowledgeInfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:09
 * 
 */
@Repository("basKnowledgeInfoDaoImpl")
public class BasKnowledgeInfoDaoImpl implements IBasKnowledgeInfoDao {

	@Autowired
	private BasKnowledgeInfoMapper basKnowledgeInfoMapper;

	@Override
	public List<BasKnowledgeInfo> getBasKnowledgeInfoList(String keyWord,
			Page<BasKnowledgeInfo> page) {
		if (Common.isEmpty(keyWord)) {
			BasKnowledgeInfoExample example = new BasKnowledgeInfoExample();
			example.orderByCtime("desc");
			List<BasKnowledgeInfo> list = basKnowledgeInfoMapper
					.selectByExampleForPage(example, page);
			return list;
		}

		BasKnowledgeInfoExample example = getExample(keyWord);

		List<BasKnowledgeInfo> list = basKnowledgeInfoMapper
				.selectByExampleForPage(example, page);

		return list;
	}

	@Override
	public BasKnowledgeInfo getBasKnowledgeInfo(long id) {
		return basKnowledgeInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public BasKnowledgeInfo getBasKnowledgeInfo(String uuid) {
		BasKnowledgeInfoExample example = new BasKnowledgeInfoExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<BasKnowledgeInfo> list = basKnowledgeInfoMapper
				.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);

	}

	@Override
	public int totalNumber(String keyWord) {
		if (Common.isEmpty(keyWord)) {
			BasKnowledgeInfoExample example = new BasKnowledgeInfoExample();
			int i = basKnowledgeInfoMapper.countByExample(example);
			return i;
		}

		BasKnowledgeInfoExample example = getExample(keyWord);

		int i = basKnowledgeInfoMapper.countByExample(example);
		return i;
	}

	private BasKnowledgeInfoExample getExample(String keyWord) {
		BasKnowledgeInfoExample example = new BasKnowledgeInfoExample();
		example.orderByCtime("desc");
		example.or().andAuthorLike("%" + keyWord + "%");

		example.or().andTitleLike("%" + keyWord + "%");

		example.or().andCoverLike("%" + keyWord + "%");

		example.or().andTagLike("%" + keyWord + "%");

		example.or().andMainLike("%" + keyWord + "%");

		example.or().andTypeLike("%" + keyWord + "%");

		example.or().andSourceLike("%" + keyWord + "%");
		return example;
	}

}

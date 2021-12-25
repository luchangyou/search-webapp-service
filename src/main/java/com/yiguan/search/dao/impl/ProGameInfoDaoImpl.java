/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ProGameInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:02:17 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IProGameInfoDao;
import com.yiguan.search.mapper.ProGameInfoMapper;
import com.yiguan.search.model.ProGameInfo;
import com.yiguan.search.model.ProGameInfoExample;

/**
 * @ClassName: ProGameInfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:02:17
 * 
 */
@Repository("proGameInfoDaoImpl")
public class ProGameInfoDaoImpl implements IProGameInfoDao {

	@Autowired
	private ProGameInfoMapper proGameInfoMapper;

	@Override
	public List<ProGameInfo> getProGameInfoList(String keyWord,
			Page<ProGameInfo> page) {

		if (Common.isEmpty(keyWord)) {
			ProGameInfoExample example = new ProGameInfoExample();
			example.orderByCtime("desc");
			List<ProGameInfo> list = proGameInfoMapper.selectByExampleForPage(
					example, page);
			return list;
		}

		ProGameInfoExample example = getExample(keyWord, null);

		List<ProGameInfo> list = proGameInfoMapper.selectByExampleForPage(
				example, page);

		return list;
	}

	@Override
	public ProGameInfo getProGameInfo(long id) {
		return proGameInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int totalNumber(String keyWord) {
		if (Common.isEmpty(keyWord)) {
			ProGameInfoExample example = new ProGameInfoExample();
			int i = proGameInfoMapper.countByExample(example);
			return i;
		}

		ProGameInfoExample example = getExample(keyWord, null);
		int i = proGameInfoMapper.countByExample(example);
		return i;
	}

	@Override
	public List<ProGameInfo> getProGameInfoList(String keyWord,
			String userShenfen, Page page) {
		if (Common.isEmpty(keyWord)) {
			ProGameInfoExample example = new ProGameInfoExample();
			if (!Common.isEmpty(userShenfen)) {
				example.createCriteria().andGtagsLike("%" + userShenfen + "%");
			}
			example.orderByCtime("desc");
			List<ProGameInfo> list = proGameInfoMapper.selectByExampleForPage(
					example, page);
			return list;
		}

		ProGameInfoExample example = getExample(keyWord, userShenfen);

		List<ProGameInfo> list = proGameInfoMapper.selectByExampleForPage(
				example, page);

		return list;
	}

	@Override
	public int totalNumber(String keyWord, String userShenfen) {
		if (Common.isEmpty(keyWord)) {
			ProGameInfoExample example = new ProGameInfoExample();
			if (!Common.isEmpty(userShenfen)) {
				example.createCriteria().andGtagsLike("%" + userShenfen + "%");
			}
			int i = proGameInfoMapper.countByExample(example);
			return i;
		}

		ProGameInfoExample example = getExample(keyWord, userShenfen);
		int i = proGameInfoMapper.countByExample(example);
		return i;
	}

	@Override
	public List<ProGameInfo> getProGameInfoListByUuid(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}
		ProGameInfoExample example = new ProGameInfoExample();
		example.orderBySetTime("desc");
		example.createCriteria().andUuidEqualTo(uuid);
		List<ProGameInfo> list = proGameInfoMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<ProGameInfo> getProGameInfoListByDevelopCom(String developCom) {
		if (Common.isEmpty(developCom)) {
			return null;
		}
		ProGameInfoExample example = new ProGameInfoExample();
		example.orderBySetTime("desc");
		example.createCriteria().andDevelopComEqualTo(developCom);
		List<ProGameInfo> list = proGameInfoMapper.selectByExample(example);
		return list;
	}

	private ProGameInfoExample getExample(String keyWord, String userShenfen) {
		ProGameInfoExample example = new ProGameInfoExample();
		example.orderByCtime("desc");
		if (Common.isEmpty(userShenfen)) {
			example.or().andGnameLike("%" + keyWord + "%");
			example.or().andGenameLike("%" + keyWord + "%");
			example.or().andLogoLike("%" + keyWord + "%");
			example.or().andVersionLike("%" + keyWord + "%");
			example.or().andLanguageLike("%" + keyWord + "%");
			example.or().andSuitableAgeLike("%" + keyWord + "%");
			example.or().andIssueAreaLike("%" + keyWord + "%");
			example.or().andPublisherLike("%" + keyWord + "%");
			example.or().andGstyleLike("%" + keyWord + "%");
			example.or().andGtagsLike("%" + keyWord + "%");
			example.or().andPictureLike("%" + keyWord + "%");
			example.or().andViewpointLike("%" + keyWord + "%");
			example.or().andEngineLike("%" + keyWord + "%");
			example.or().andGradeLike("%" + keyWord + "%");
			example.or().andDpprogressLike("%" + keyWord + "%");
			example.or().andGthemeLike("%" + keyWord + "%");
			example.or().andScaleLike("%" + keyWord + "%");
			example.or().andPdemandLike("%" + keyWord + "%");
			example.or().andPriceLike("%" + keyWord + "%");
			example.or().andChargeModeLike("%" + keyWord + "%");
			example.or().andDevelopComLike("%" + keyWord + "%");
			example.or().andGDescLike("%" + keyWord + "%");
			example.or().andWebLike("%" + keyWord + "%");
			example.or().andSourceLike("%" + keyWord + "%");
			example.or().andGamespyLike("%" + keyWord + "%");
			example.or().andOperatorLike("%" + keyWord + "%");
			example.or().andFilmsTimeLike("%" + keyWord + "%");
			example.or().andGameSizeLike("%" + keyWord + "%");
			example.or().andWebUpdateTimeLike("%" + keyWord + "%");
			example.or().andDownloadLinkLike("%" + keyWord + "%");
		} else {
			example.or().andGnameLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andGenameLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andLogoLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andVersionLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andLanguageLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andSuitableAgeLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andIssueAreaLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andPublisherLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andGstyleLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andGtagsLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andPictureLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andViewpointLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andEngineLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andGradeLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andDpprogressLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andGthemeLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andScaleLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andPdemandLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andPriceLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andChargeModeLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andDevelopComLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andGDescLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andWebLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andSourceLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andGamespyLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andOperatorLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andFilmsTimeLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andGameSizeLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andWebUpdateTimeLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
			example.or().andDownloadLinkLike("%" + keyWord + "%")
					.andGtagsLike("%" + userShenfen + "%");
		}

		return example;
	}

}

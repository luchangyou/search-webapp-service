/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasOrganizeInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:59 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IBasOrganizeInfoDao;
import com.yiguan.search.mapper.BasOrganizeInfoMapper;
import com.yiguan.search.model.BasOrganizeInfo;
import com.yiguan.search.model.BasOrganizeInfoExample;
import com.yiguan.search.po.OrgQryPartParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: BasOrganizeInfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:59
 * 
 */
@Repository("basOrganizeInfoDaoImpl")
public class BasOrganizeInfoDaoImpl implements IBasOrganizeInfoDao {

	@Autowired
	private BasOrganizeInfoMapper basOrganizeInfoMapper;

	@Override
	public List<BasOrganizeInfo> getBasOrganizeInfoList(String keyWord,
			String type, Page<BasOrganizeInfo> page) {
		if (Common.isEmpty(keyWord)) {
			BasOrganizeInfoExample example = new BasOrganizeInfoExample();
			if (!Common.isEmpty(type)) {
				example.createCriteria().andTagLike("%" + type + "%");
			}
			example.orderByCtime("desc");
			List<BasOrganizeInfo> list = basOrganizeInfoMapper
					.selectByExampleForPage(example, page);

			return list;
		}

		BasOrganizeInfoExample example = getExample(keyWord, type);

		List<BasOrganizeInfo> list = basOrganizeInfoMapper
				.selectByExampleForPage(example, page);

		return list;
	}

    @Override
    public List<BasOrganizeInfo> getBasOrganizeInfoList(BasOrganizeInfoExample example, Page<BasOrganizeInfo> page) {
        return basOrganizeInfoMapper.selectByExampleForPage(example, page);
    }

    @Override
	public List<BasOrganizeInfo> findBasOrganizeInfo(OrgQryPartParam param) {
		return basOrganizeInfoMapper.findBasOrganizeInfo(param);
	}

	@Override
	public BasOrganizeInfo getBasOrganizeInfo(long id) {
		return basOrganizeInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int totalNumber(String keyWord, String type) {
		if (Common.isEmpty(keyWord)) {
			if (Common.isEmpty(type)) {
				BasOrganizeInfoExample example = new BasOrganizeInfoExample();
				int i = basOrganizeInfoMapper.countByExample(example);
				return i;
			} else {
				BasOrganizeInfoExample example = new BasOrganizeInfoExample();
				example.createCriteria().andTagLike("%" + type + "%");
				int i = basOrganizeInfoMapper.countByExample(example);
				return i;
			}

		}

		BasOrganizeInfoExample example = getExample(keyWord, type);
		int i = basOrganizeInfoMapper.countByExample(example);
		return i;
	}

	@Override
	public int countNumber(OrgQryPartParam param) {
		return basOrganizeInfoMapper.countNumber(param);
	}

    @Override
    public int countNumber(BasOrganizeInfoExample example) {
        return basOrganizeInfoMapper.countByExample(example);
    }

    @Override
	public List<BasOrganizeInfo> getListByUuid(String uuid) {
		if (Common.isEmpty(uuid)) {
			return null;
		}
		BasOrganizeInfoExample example = new BasOrganizeInfoExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<BasOrganizeInfo> list = basOrganizeInfoMapper
				.selectByExample(example);

		return list;
	}

	private BasOrganizeInfoExample getExample(String keyWord, String type) {
		BasOrganizeInfoExample example = new BasOrganizeInfoExample();
		example.orderByCtime("desc");
		if (Common.isEmpty(type)) {
			example.or().andOnameLike("%" + keyWord + "%");
			example.or().andEnameLike("%" + keyWord + "%");
			example.or().andShortnameLike("%" + keyWord + "%");
			example.or().andFullnameLike("%" + keyWord + "%");
			example.or().andWebLike("%" + keyWord + "%");
			example.or().andConWayLike("%" + keyWord + "%");
			example.or().andIndustryLike("%" + keyWord + "%");
			example.or().andScaleLike("%" + keyWord + "%");
			example.or().andIntroduceLike("%" + keyWord + "%");
			example.or().andAddressLike("%" + keyWord + "%");
			example.or().andLogoLike("%" + keyWord + "%");
			example.or().andStimeLike("%" + keyWord + "%");
			example.or().andOtherLike("%" + keyWord + "%");
			example.or().andSourceLike("%" + keyWord + "%");
			example.or().andUrlLike("%" + keyWord + "%");
			example.or().andFinancingRoundLike("%" + keyWord + "%");
			example.or().andPictureLike("%" + keyWord + "%");
			example.or().andDevelopmentHistoryLike("%" + keyWord + "%");
			example.or().andFinancingStageLike("%" + keyWord + "%");
			example.or().andFinancingTotalLike("%" + keyWord + "%");
			example.or().andCompanyNatureLike("%" + keyWord + "%");
			example.or().andCorporateCultureLike("%" + keyWord + "%");
			example.or().andTagLike("%" + keyWord + "%");
			example.or().andManagementFieldLike("%" + keyWord + "%");
			example.or().andBusinessPlanLike("%" + keyWord + "%");
		}
		if (!Common.isEmpty(type)) {
			example.or().andOnameLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andEnameLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andShortnameLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andFullnameLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andWebLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andConWayLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andIndustryLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andScaleLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andIntroduceLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andAddressLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andLogoLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andStimeLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andOtherLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andSourceLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andUrlLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andFinancingRoundLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andPictureLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andDevelopmentHistoryLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andFinancingStageLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andFinancingTotalLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andCompanyNatureLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andCorporateCultureLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andTagLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andManagementFieldLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
			example.or().andBusinessPlanLike("%" + keyWord + "%")
					.andTagLike("%" + type + "%");
		}

		return example;
	}
}

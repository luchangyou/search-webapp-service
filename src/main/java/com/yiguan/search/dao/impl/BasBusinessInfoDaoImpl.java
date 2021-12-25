/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasBusinessInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午10:59:19 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IBasBusinessInfoDao;
import com.yiguan.search.mapper.BasBusinessInfoMapper;
import com.yiguan.search.model.BasBusinessInfo;
import com.yiguan.search.model.BasBusinessInfoExample;

/**
 * @ClassName: BasBusinessInfoDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午10:59:19
 * 
 */
@Repository("basBusinessInfoDaoImpl")
public class BasBusinessInfoDaoImpl implements IBasBusinessInfoDao {

	@Autowired
	private BasBusinessInfoMapper basBusinessInfoMapper;

	@Override
	public List<BasBusinessInfo> getBasBusinessInfoList(String keyWord,
			Page<BasBusinessInfo> page) {
		if (Common.isEmpty(keyWord)) {
			BasBusinessInfoExample example = new BasBusinessInfoExample();
			example.orderByCtime("desc");
			List<BasBusinessInfo> list = basBusinessInfoMapper
					.selectByExampleForPage(example, page);

			return list;
		}

		BasBusinessInfoExample example = getExample(keyWord);

		List<BasBusinessInfo> list = basBusinessInfoMapper
				.selectByExampleForPage(example, page);

		return list;
	}

	@Override
	public BasBusinessInfo getBasBusinessInfo(int id) {
		return basBusinessInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int totalNumber(String keyWord) {
		if (Common.isEmpty(keyWord)) {
			BasBusinessInfoExample example = new BasBusinessInfoExample();
			int i = basBusinessInfoMapper.countByExample(example);
			return i;
		}

		BasBusinessInfoExample example = getExample(keyWord);

		int i = basBusinessInfoMapper.countByExample(example);
		return i;
	}

	@Override
	public List<BasBusinessInfo> getListByUuid(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}
		BasBusinessInfoExample example = new BasBusinessInfoExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<BasBusinessInfo> list = basBusinessInfoMapper
				.selectByExample(example);
		return list;
	}

	private BasBusinessInfoExample getExample(String keyWord) {
		BasBusinessInfoExample example = new BasBusinessInfoExample();
		example.orderByCtime("desc");
		example.or().andCnameLike("%" + keyWord + "%");

		example.or().andCnameOldLike("%" + keyWord + "%");

		example.or().andStockTypeLike("%" + keyWord + "%");

		example.or().andStockCodeLike("%" + keyWord + "%");

		example.or().andTelephoneLike("%" + keyWord + "%");

		example.or().andEmailLike("%" + keyWord + "%");

		example.or().andWebLike("%" + keyWord + "%");

		example.or().andAdressLike("%" + keyWord + "%");

		example.or().andLegalPersenLike("%" + keyWord + "%");

		example.or().andRcapitalLike("%" + keyWord + "%");

		example.or().andStateLike("%" + keyWord + "%");

		example.or().andIndustryLike("%" + keyWord + "%");

		example.or().andRbnumberLike("%" + keyWord + "%");

		example.or().andEnterpriseTypeLike("%" + keyWord + "%");

		example.or().andOcodeLike("%" + keyWord + "%");

		example.or().andOperationPeriodLike("%" + keyWord + "%");

		example.or().andRdepartmentLike("%" + keyWord + "%");

		example.or().andUcCodeLike("%" + keyWord + "%");

		example.or().andRadressLike("%" + keyWord + "%");

		example.or().andBscopeLike("%" + keyWord + "%");

		example.or().andSourceLike("%" + keyWord + "%");

		example.or().andLonLike("%" + keyWord + "%");

		example.or().andLatLike("%" + keyWord + "%");

		example.or().andProvinceLike("%" + keyWord + "%");

		example.or().andCityLike("%" + keyWord + "%");

		example.or().andCountyLike("%" + keyWord + "%");
		return example;
	}

}

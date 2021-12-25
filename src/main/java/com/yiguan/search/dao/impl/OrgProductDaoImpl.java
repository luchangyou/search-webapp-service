/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: OrgProductDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午7:13:35 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IOrgProductDao;
import com.yiguan.search.mapper.OrgProductMapper;
import com.yiguan.search.model.OrgProduct;
import com.yiguan.search.model.OrgProductExample;

/**
 * @ClassName: OrgProductDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月2日 下午7:13:35
 * 
 */
@Repository("orgProductDaoImpl")
public class OrgProductDaoImpl implements IOrgProductDao {

	@Autowired
	private OrgProductMapper orgProductMapper;

	@Override
	public List<OrgProduct> getOrgProductList(String uuid) {
		if (Common.isEmpty(uuid)) {
			return null;
		}
		OrgProductExample example = new OrgProductExample();
		example.createCriteria().andOuuidEqualTo(uuid);
		List<OrgProduct> list = orgProductMapper.selectByExample(example);
		return list;
	}

	@Override
	public OrgProduct getOrgProduct(long id) {
		return orgProductMapper.selectByPrimaryKey(id);
	}
}

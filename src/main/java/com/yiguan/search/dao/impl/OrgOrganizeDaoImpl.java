/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: OrgOrganizeDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:04:41 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IOrgOrganizeDao;
import com.yiguan.search.mapper.OrgOrganizeMapper;
import com.yiguan.search.model.OrgOrganize;
import com.yiguan.search.model.OrgOrganizeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: OrgOrganizeDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月23日 下午2:04:41
 * 
 */
@Repository("orgOrganizeDaoImpl")
public class OrgOrganizeDaoImpl implements IOrgOrganizeDao {

	@Autowired
	private OrgOrganizeMapper orgOrganizeMapper;

	@Override
	public List<OrgOrganize> getListByROUuid(String ouuid) {

		if (Common.isEmpty(ouuid)) {
			return null;
		}

		OrgOrganizeExample example = new OrgOrganizeExample();
		//example.or().andOuuidEqualTo(ouuid);
		//example.or().andRouuidEqualTo(ouuid);
		example.createCriteria().andRouuidEqualTo(ouuid);
		List<OrgOrganize> list = orgOrganizeMapper.selectByExample(example);

		return list;
	}

	@Override
	public List<OrgOrganize> getListByRtype(String rtype) {
		OrgOrganizeExample example = new OrgOrganizeExample();
		example.createCriteria().andRtypeLike("%"+rtype+"%").andSourceEqualTo("天眼查");
		List<OrgOrganize> orgOrganizesList = orgOrganizeMapper.selectByExample(example);

		return orgOrganizesList;
	}

	@Override
	public List<OrgOrganize> getOrgOrganizeListByRouuidAndRtype(String uuid, String rtype, Page<OrgOrganize> page) {
		OrgOrganizeExample example = new OrgOrganizeExample();
		example.createCriteria().andRouuidEqualTo(uuid).andRtypeEqualTo(rtype);
		return orgOrganizeMapper.selectByExampleForPage(example, page);
	}

}

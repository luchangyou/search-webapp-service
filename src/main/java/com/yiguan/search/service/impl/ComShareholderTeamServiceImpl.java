/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: ComShareholderServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月9日 下午4:07:00 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.mapper.ComShareholderTeamMapper;
import com.yiguan.search.model.ComShareholderTeam;
import com.yiguan.search.model.ComShareholderTeamExample;
import com.yiguan.search.service.IComShareholderTeamService;

/**
 * @ClassName: ComShareholderServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月9日 下午4:07:00
 * 
 */
@Service("comShareholderTeamServiceImpl")
public class ComShareholderTeamServiceImpl implements
		IComShareholderTeamService {

	@Autowired
	private ComShareholderTeamMapper comShareholderTeamMapper;

	@Override
	public List<ComShareholderTeam> getListByUuid(String uuid) {

		if (Common.isEmpty(uuid)) {
			return null;
		}

		ComShareholderTeamExample example = new ComShareholderTeamExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<ComShareholderTeam> list = comShareholderTeamMapper
				.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}

		return list;
	}
}

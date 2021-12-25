/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: EventInvestfinaceDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:35:20 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IEventInvestfinaceDao;
import com.yiguan.search.mapper.EventInvestfinaceMapper;
import com.yiguan.search.model.EventInvestfinace;
import com.yiguan.search.model.EventInvestfinaceExample;

/**
 * @ClassName: EventInvestfinaceDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:35:20
 * 
 */
@Repository("eventInvestfinaceDaoImpl")
public class EventInvestfinaceDaoImpl implements IEventInvestfinaceDao {

	@Autowired
	private EventInvestfinaceMapper eventInvestfinaceMapper;

	@Override
	public EventInvestfinace getEventInvestfinaceByEuuid(String euuid) {

		if (Common.isEmpty(euuid)) {
			return null;
		}

		EventInvestfinaceExample example = new EventInvestfinaceExample();
		example.createCriteria().andEuuidEqualTo(euuid);
		List<EventInvestfinace> list = eventInvestfinaceMapper
				.selectByExample(example);

		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

}

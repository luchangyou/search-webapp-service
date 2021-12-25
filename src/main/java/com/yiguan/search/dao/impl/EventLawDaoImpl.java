/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: EventLawDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月22日 上午9:12:56 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IEventLawDao;
import com.yiguan.search.mapper.EventLawMapper;
import com.yiguan.search.model.EventLaw;
import com.yiguan.search.model.EventLawExample;

/**
 * @ClassName: EventLawDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月22日 上午9:12:56
 * 
 */
@Repository("eventLawDaoImpl")
public class EventLawDaoImpl implements IEventLawDao {

	@Autowired
	private EventLawMapper eventLawMapper;

	@Override
	public EventLaw getEventLawByEuuid(String euuid) {

		if (Common.isEmpty(euuid)) {
			return null;
		}

		EventLawExample example = new EventLawExample();
		example.createCriteria().andEuuidEqualTo(euuid);
		List<EventLaw> list = eventLawMapper.selectByExample(example);

		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

}

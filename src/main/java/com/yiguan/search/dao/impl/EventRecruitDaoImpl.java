/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: EventRecruitDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:36:15 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IEventRecruitDao;
import com.yiguan.search.mapper.EventRecruitMapper;
import com.yiguan.search.model.EventRecruit;
import com.yiguan.search.model.EventRecruitExample;

/**
 * @ClassName: EventRecruitDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:36:15
 * 
 */
@Repository("eventRecruitDaoImpl")
public class EventRecruitDaoImpl implements IEventRecruitDao {

	@Autowired
	private EventRecruitMapper eventRecruitMapper;

	@Override
	public EventRecruit getEventRecruitByEuuid(String euuid) {

		if (Common.isEmpty(euuid)) {
			return null;
		}

		EventRecruitExample example = new EventRecruitExample();
		example.createCriteria().andEuuidEqualTo(euuid);
		List<EventRecruit> list = eventRecruitMapper.selectByExample(example);

		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

}

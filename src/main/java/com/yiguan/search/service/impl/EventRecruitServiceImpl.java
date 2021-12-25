/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: EventRecruitServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:31:26 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiguan.search.dao.IEventRecruitDao;
import com.yiguan.search.model.EventRecruit;
import com.yiguan.search.service.IEventRecruitService;

/**
 * @ClassName: EventRecruitServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:31:26
 * 
 */
@Service("eventRecruitServiceImpl")
public class EventRecruitServiceImpl implements IEventRecruitService {

	@Autowired
	private IEventRecruitDao eventRecruitDaoImpl;

	@Override
	public EventRecruit getEventRecruitByEuuid(String euuid) {
		return eventRecruitDaoImpl.getEventRecruitByEuuid(euuid);
	}

}

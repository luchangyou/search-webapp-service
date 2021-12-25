/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: EventInvestfinaceServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:32:26 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiguan.search.dao.IEventInvestfinaceDao;
import com.yiguan.search.model.EventInvestfinace;
import com.yiguan.search.service.IEventInvestfinaceService;

/**
 * @ClassName: EventInvestfinaceServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:32:26
 * 
 */
@Service("eventInvestfinaceServiceImpl")
public class EventInvestfinaceServiceImpl implements IEventInvestfinaceService {

	@Autowired
	private IEventInvestfinaceDao eventInvestfinaceDaoImpl;

	@Override
	public EventInvestfinace getEventInvestfinaceByEuuid(String euuid) {
		return eventInvestfinaceDaoImpl.getEventInvestfinaceByEuuid(euuid);
	}

}

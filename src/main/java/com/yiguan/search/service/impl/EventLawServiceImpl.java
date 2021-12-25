/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: EventLawServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月22日 上午9:12:08 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiguan.search.dao.IEventLawDao;
import com.yiguan.search.model.EventLaw;
import com.yiguan.search.service.IEventLawService;

/**
 * @ClassName: EventLawServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月22日 上午9:12:08
 * 
 */
@Service("eventLawServiceImpl")
public class EventLawServiceImpl implements IEventLawService {

	@Autowired
	private IEventLawDao eventLawDaoImpl;

	@Override
	public EventLaw getEventLawByEuuid(String euuid) {
		return eventLawDaoImpl.getEventLawByEuuid(euuid);
	}

}

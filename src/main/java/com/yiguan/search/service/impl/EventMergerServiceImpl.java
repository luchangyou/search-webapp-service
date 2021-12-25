/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: EventMergerServiceImpl.java
 * @Package com.yiguan.search.service.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:31:49 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiguan.search.dao.IEventMergerDao;
import com.yiguan.search.model.EventMerger;
import com.yiguan.search.service.IEventMergerService;

/**
 * @ClassName: IIEventMergerServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:31:49
 * 
 */
@Service("eventMergerServiceImpl")
public class EventMergerServiceImpl implements IEventMergerService {

	@Autowired
	private IEventMergerDao eventMergerDaoImpl;

	@Override
	public EventMerger getEventMergerByEuuid(String euuid) {
		return eventMergerDaoImpl.getEventMergerByEuuid(euuid);
	}

}

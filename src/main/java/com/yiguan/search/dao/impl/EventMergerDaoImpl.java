/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: EventMergerDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:35:47 
 * @version V1.0   
 */
package com.yiguan.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IEventMergerDao;
import com.yiguan.search.mapper.EventMergerMapper;
import com.yiguan.search.model.EventMerger;
import com.yiguan.search.model.EventMergerExample;

/**
 * @ClassName: EventMergerDaoImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年8月19日 下午10:35:47
 * 
 */
@Repository("eventMergerDaoImpl")
public class EventMergerDaoImpl implements IEventMergerDao {

	@Autowired
	private EventMergerMapper eventMergerMapper;

	@Override
	public EventMerger getEventMergerByEuuid(String euuid) {

		if (Common.isEmpty(euuid)) {
			return null;
		}

		EventMergerExample example = new EventMergerExample();
		example.createCriteria().andEuuidEqualTo(euuid);
		List<EventMerger> list = eventMergerMapper.selectByExample(example);

		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

}

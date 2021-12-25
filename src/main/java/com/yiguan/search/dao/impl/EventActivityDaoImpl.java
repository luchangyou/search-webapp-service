package com.yiguan.search.dao.impl;

import com.yiguan.search.dao.IEventActivityDao;
import com.yiguan.search.mapper.EventActivityMapper;
import com.yiguan.search.model.EventActivity;
import com.yiguan.search.model.EventActivityExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/10/22.
 */
@Repository("eventActivityDaoImpl")
public class EventActivityDaoImpl implements IEventActivityDao {

    @Autowired
    private EventActivityMapper eventActivityMapper;

    @Override
    public EventActivity getEventActivityByEuuid(String euuid) {

        EventActivityExample example = new EventActivityExample();
        example.createCriteria().andEuuidEqualTo(euuid);
        List<EventActivity> eventActivities = eventActivityMapper.selectByExample(example);

        if(eventActivities == null || eventActivities.size() <1){
            return null;
        }

        return eventActivities.get(0);
    }
}

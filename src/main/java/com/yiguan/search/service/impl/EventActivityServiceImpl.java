package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IEventActivityDao;
import com.yiguan.search.model.EventActivity;
import com.yiguan.search.service.IEventActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/22.
 */
@Service("eventActivityServiceImpl")
public class EventActivityServiceImpl implements IEventActivityService {

    @Autowired
    private IEventActivityDao eventActivityDaoImpl;

    @Override
    public EventActivity getEventActivityByEuuid(String euuid) {

        if(Common.isEmpty(euuid)){
            return null;
        }

        return eventActivityDaoImpl.getEventActivityByEuuid(euuid);
    }
}

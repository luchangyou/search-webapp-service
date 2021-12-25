package com.yiguan.search.service;

import com.yiguan.search.model.EventActivity;

/**
 * Created by Administrator on 2017/10/22.
 */
public interface IEventActivityService {

    EventActivity getEventActivityByEuuid(String euuid);
}

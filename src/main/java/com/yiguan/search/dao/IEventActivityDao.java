package com.yiguan.search.dao;

import com.yiguan.search.model.EventActivity;

/**
 * Created by Administrator on 2017/10/22.
 */
public interface IEventActivityDao {

    EventActivity getEventActivityByEuuid(String euuid);

}

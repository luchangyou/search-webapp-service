package com.yiguan.search.dao;

import com.yiguan.search.model.OrgEvent;
import com.yiguan.search.po.OrgEventPo;
import com.yiguan.search.po.SqlVo;

import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
public interface IOrgEventDao {

    List<OrgEvent> getOrgEventList(String uuid);

    List<OrgEventPo> getOrgEventPoList(SqlVo sqlVo);

}

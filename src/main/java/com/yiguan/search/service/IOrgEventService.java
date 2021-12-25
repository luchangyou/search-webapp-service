package com.yiguan.search.service;

import com.yiguan.search.model.OrgEvent;
import com.yiguan.search.po.OrgEventPo;

import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
public interface IOrgEventService {

    List<OrgEvent> getOrgEventList(String uuid);

    List<OrgEventPo> getOrgEventPoList(String uuid);
}

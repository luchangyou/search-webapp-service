package com.yiguan.search.service.impl;

import com.yiguan.search.dao.IOrgEventDao;
import com.yiguan.search.model.OrgEvent;
import com.yiguan.search.po.OrgEventPo;
import com.yiguan.search.po.SqlVo;
import com.yiguan.search.service.IOrgEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
@Service("orgEventServiceImpl")
public class OrgEventServiceImpl implements IOrgEventService {

    @Autowired
    private IOrgEventDao orgEventDaoImpl;

    @Override
    public List<OrgEvent> getOrgEventList(String uuid) {
        return orgEventDaoImpl.getOrgEventList(uuid);
    }

    @Override
    public List<OrgEventPo> getOrgEventPoList(String uuid) {
        SqlVo sqlVo = new SqlVo();
        String sql = "SELECT a.*,b.industry FROM org_event a, event_investfinace b WHERE a.ouuid = '"+uuid+"' AND a.euuid = b.euuid  ";
        sqlVo.setSql(sql);
        return orgEventDaoImpl.getOrgEventPoList(sqlVo);
    }
}

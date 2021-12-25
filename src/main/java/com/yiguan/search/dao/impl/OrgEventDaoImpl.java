package com.yiguan.search.dao.impl;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IOrgEventDao;
import com.yiguan.search.mapper.OrgEventMapper;
import com.yiguan.search.model.OrgEvent;
import com.yiguan.search.model.OrgEventExample;
import com.yiguan.search.po.OrgEventPo;
import com.yiguan.search.po.SqlVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
@Repository("orgEventDaoImpl")
public class OrgEventDaoImpl implements IOrgEventDao {

    @Autowired
    private OrgEventMapper orgEventMapper;

    @Override
    public List<OrgEvent> getOrgEventList(String uuid) {

        if(Common.isEmpty(uuid)){
            return null;
        }

        OrgEventExample example = new OrgEventExample();
        example.setOrderByClause("ctime desc");
        example.createCriteria().andOuuidEqualTo(uuid);
        List<OrgEvent> orgEvents = orgEventMapper.selectByExample(example);

        if (orgEvents == null || orgEvents.size() <1){
            return null;
        }
        return orgEvents;
    }

    @Override
    public List<OrgEventPo> getOrgEventPoList(SqlVo sqlVo) {
        return orgEventMapper.getOrgEventPoList(sqlVo);
    }
}

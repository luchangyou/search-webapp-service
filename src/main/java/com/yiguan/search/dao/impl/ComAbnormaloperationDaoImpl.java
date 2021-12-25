package com.yiguan.search.dao.impl;

import com.yiguan.search.dao.IComAbnormaloperationDao;
import com.yiguan.search.mapper.ComAbnormaloperationMapper;
import com.yiguan.search.model.ComAbnormaloperation;
import com.yiguan.search.model.ComAbnormaloperationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/25.
 */

@Repository("comAbnormaloperationDaoImpl")
public class ComAbnormaloperationDaoImpl implements IComAbnormaloperationDao {

    @Autowired
    private ComAbnormaloperationMapper comAbnormaloperationMapper;

    @Override
    public List<ComAbnormaloperation> getComAbnormaloperationList(String uuid) {
        ComAbnormaloperationExample example = new ComAbnormaloperationExample();
        example.createCriteria().andUuidEqualTo(uuid);
        return comAbnormaloperationMapper.selectByExample(example);
    }
}


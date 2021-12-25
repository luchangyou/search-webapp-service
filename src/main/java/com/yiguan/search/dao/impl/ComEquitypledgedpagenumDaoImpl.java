package com.yiguan.search.dao.impl;

import com.yiguan.search.dao.IComEquitypledgedpagenumDao;
import com.yiguan.search.mapper.ComEquitypledgedpagenumMapper;
import com.yiguan.search.model.ComEquitypledgedpagenum;
import com.yiguan.search.model.ComEquitypledgedpagenumExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/25.
 */
@Repository("comEquitypledgedpagenumDaoImpl")
public class ComEquitypledgedpagenumDaoImpl implements IComEquitypledgedpagenumDao {

    @Autowired
    private ComEquitypledgedpagenumMapper comEquitypledgedpagenumMapper;

    @Override
    public List<ComEquitypledgedpagenum> getComEquitypledgedpagenumList(String uuid) {
        ComEquitypledgedpagenumExample example = new ComEquitypledgedpagenumExample();
        example.createCriteria().andUuidEqualTo(uuid);
        return comEquitypledgedpagenumMapper.selectByExample(example);
    }
}

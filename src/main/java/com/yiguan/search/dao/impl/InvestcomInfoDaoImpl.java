package com.yiguan.search.dao.impl;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.dao.IInvestcomInfoDao;
import com.yiguan.search.mapper.InvestcomInfoMapper;
import com.yiguan.search.model.InvestcomInfo;
import com.yiguan.search.model.InvestcomInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
@Repository("investcomInfoDaoImpl")
public class InvestcomInfoDaoImpl implements IInvestcomInfoDao{

    @Autowired
    private InvestcomInfoMapper investcomInfoMapper;

    @Override
    public InvestcomInfo getInvestcomInfo(String uuid) {

        if(Common.isEmpty(uuid)){
            return null;
        }

        InvestcomInfoExample exception = new InvestcomInfoExample();
        exception.createCriteria().andUuidEqualTo(uuid);
        List<InvestcomInfo> investcomInfos = investcomInfoMapper.selectByExample(exception);
        if (investcomInfos != null && investcomInfos.size() > 0){
            return investcomInfos.get(0);
        }
        return null;
    }
}

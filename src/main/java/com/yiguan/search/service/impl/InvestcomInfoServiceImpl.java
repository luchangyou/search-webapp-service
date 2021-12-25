package com.yiguan.search.service.impl;

import com.yiguan.search.dao.IInvestcomInfoDao;
import com.yiguan.search.model.InvestcomInfo;
import com.yiguan.search.service.IInvestcomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/10.
 */
@Service("investcomInfoServiceImpl")
public class InvestcomInfoServiceImpl implements IInvestcomInfoService {

    @Autowired
    private IInvestcomInfoDao investcomInfoDaoImpl;

    @Override
    public InvestcomInfo getInvestcomInfo(String uuid) {
        return investcomInfoDaoImpl.getInvestcomInfo(uuid);
    }
}

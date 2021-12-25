package com.yiguan.search.dao;

import com.yiguan.search.model.ComAbnormaloperation;

import java.util.List;

/**
 * Created by Administrator on 2017/9/25.
 */
public interface IComAbnormaloperationDao {

    List<ComAbnormaloperation> getComAbnormaloperationList(String uuid);
}

package com.yiguan.search.service;

import com.yiguan.search.model.ComAbnormaloperation;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * Created by Administrator on 2017/9/25.
 */
public interface IComAbnormaloperationService {

    List<ComAbnormaloperation> getComAbnormaloperationList(String uuid);

    String createExcel(String uuid, WritableWorkbook wwb);

}

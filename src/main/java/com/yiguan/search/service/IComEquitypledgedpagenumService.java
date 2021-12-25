package com.yiguan.search.service;

import com.yiguan.search.model.ComEquitypledgedpagenum;
import jxl.write.WritableWorkbook;

import java.util.List;

/**
 * Created by Administrator on 2017/9/25.
 */
public interface IComEquitypledgedpagenumService {

    List<ComEquitypledgedpagenum> getComEquitypledgedpagenumList(String uuid);

    String createExcel(String uuid, WritableWorkbook wwb);

}

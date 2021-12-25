package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IComEquitypledgedpagenumDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.ComEquitypledgedpagenum;
import com.yiguan.search.service.IComEquitypledgedpagenumService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/9/25.
 */

@Service("comEquitypledgedpagenumServiceImpl")
public class ComEquitypledgedpagenumServiceImpl implements IComEquitypledgedpagenumService {

    @Autowired
    private IComEquitypledgedpagenumDao comEquitypledgedpagenumDaoImpl;

    @Override
    public List<ComEquitypledgedpagenum> getComEquitypledgedpagenumList(String uuid) {

        if(Common.isEmpty(uuid)){
            return null;
        }

        return comEquitypledgedpagenumDaoImpl.getComEquitypledgedpagenumList(uuid);
    }

    @Override
    public String createExcel(String uuid, WritableWorkbook wwb) {
        List<ComEquitypledgedpagenum> comEquitypledgedpagenumList = this.getComEquitypledgedpagenumList(uuid);

        if(comEquitypledgedpagenumList != null && comEquitypledgedpagenumList.size() >0){
            String sheetName = "股权出质信息";
            LinkedHashMap<String, String> fieldMap = this.getFieldMap();
            try {
                ExcelUtil.listToExcel(comEquitypledgedpagenumList, fieldMap, sheetName, wwb);
            } catch (ExcelException e) {
                e.printStackTrace();
            }
        }

        return "1";
    }

    private LinkedHashMap<String,String> getFieldMap() {
        LinkedHashMap<String, String> fieldMap = new LinkedHashMap<>();
        //fieldMap.put("id","编号");
        //fieldMap.put("bid","编号");
        //fieldMap.put("uuid","编号");
        fieldMap.put("registrationDate","登记日");
        fieldMap.put("registrationNumber","登记编号");
        fieldMap.put("state","状态");
        fieldMap.put("amountPledgedstock","出质股权数额");
        fieldMap.put("pledgor","出质人");
        fieldMap.put("pledgorNumber","出质人证件号码");
        fieldMap.put("pledgee","质权人");
        fieldMap.put("pledgeeNumber","质权人号码");
        fieldMap.put("remarks","备注");
        fieldMap.put("ctime","创建时间");
        fieldMap.put("atime","修改时间");
        return fieldMap;
    }
}

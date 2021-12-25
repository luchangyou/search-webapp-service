package com.yiguan.search.service.impl;

import com.yiguan.search.common.util.Common;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IComAbnormaloperationDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.ComAbnormaloperation;
import com.yiguan.search.service.IComAbnormaloperationService;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/9/25.
 */

@Service("comAbnormaloperationServiceImpl")
public class ComAbnormaloperationServiceImpl implements IComAbnormaloperationService {

    @Autowired
    private IComAbnormaloperationDao comAbnormaloperationDaoImpl;

    @Override
    public List<ComAbnormaloperation> getComAbnormaloperationList(String uuid) {

        if(Common.isEmpty(uuid)){
            return null;
        }

        return comAbnormaloperationDaoImpl.getComAbnormaloperationList(uuid);
    }

    @Override
    public String createExcel(String uuid, WritableWorkbook wwb) {
        List<ComAbnormaloperation> comAbnormaloperationList = this.getComAbnormaloperationList(uuid);

        if(comAbnormaloperationList != null && comAbnormaloperationList.size() >0){
            String sheetName = "经营异常信息";
            LinkedHashMap<String, String> fieldMap = this.getFieldMap();
            try {
                ExcelUtil.listToExcel(comAbnormaloperationList, fieldMap, sheetName, wwb);
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
        fieldMap.put("inclusionDate","列入日期");
        fieldMap.put("inclusionReason","列入原因");
        fieldMap.put("decisionOrgan","决定机关");
        fieldMap.put("removeDate","移除日期");
        fieldMap.put("removeReason","移除原因");
        fieldMap.put("removeOrgan","移除机关");
        fieldMap.put("ctime","创建时间");
        fieldMap.put("atime","修改时间");
        return fieldMap;
    }
}

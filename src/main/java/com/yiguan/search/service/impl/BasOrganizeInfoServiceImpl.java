/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: BasOrganizeInfoDaoImpl.java
 * @Package com.yiguan.search.dao.impl
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:59 
 * @version V1.0   
 */
package com.yiguan.search.service.impl;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.common.util.Common;
import com.yiguan.search.common.util.ExcelUtil;
import com.yiguan.search.dao.IBasOrganizeInfoDao;
import com.yiguan.search.dao.IOrgOrganizeDao;
import com.yiguan.search.exception.ExcelException;
import com.yiguan.search.model.BasOrganizeInfo;
import com.yiguan.search.model.BasOrganizeInfoExample;
import com.yiguan.search.model.OrgOrganize;
import com.yiguan.search.po.OrgQryPartParam;
import com.yiguan.search.service.*;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ClassName: BasOrganizeInfoServiceImpl
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年7月26日 上午11:00:59
 * 
 */
@Service("basOrganizeInfoServiceImpl")
public class BasOrganizeInfoServiceImpl implements IBasOrganizeInfoService {

	@Autowired
	private IBasOrganizeInfoDao basOrganizeInfoDaoImpl;
	@Autowired
	private IOrgOrganizeDao orgOrganizeDaoImpl;


	@Override
	public List<BasOrganizeInfo> getBasOrganizeInfoList(String keyWord,
			String type, Page<BasOrganizeInfo> page) {

		if (page == null) {
			page = new Page<BasOrganizeInfo>();
			page.setLimit(-1);
		}

		return basOrganizeInfoDaoImpl.getBasOrganizeInfoList(keyWord, type,
				page);
	}

	@Override
	public List<BasOrganizeInfo> getBasOrganizeInfoList(String keyWord, String type, String faxing, String touzi, Page<BasOrganizeInfo> page) {

		if (page == null) {
			page = new Page<BasOrganizeInfo>();
			page.setLimit(-1);
		}
		List<String> uuidList = getUuids(touzi);

		OrgQryPartParam param = new OrgQryPartParam();
        param.setKeyWord("%"+keyWord+"%");
        param.setType("%"+type+"%");
        param.setFaxing("%"+faxing+"%");
		param.setPage(page);
		param.setUuids(uuidList);

		List<BasOrganizeInfo> basOrganizeInfoList = basOrganizeInfoDaoImpl.findBasOrganizeInfo(param);
		return basOrganizeInfoList;
	}

    @Override
    public List<BasOrganizeInfo> getBasOrganizeInfoListByKeyWord(String keyWord, String type, String faxing, String touzi, Page<BasOrganizeInfo> page) {

        if (page == null) {
            page = new Page<BasOrganizeInfo>();
            page.setLimit(-1);
        }
        List<String> uuidList = getUuids(touzi);

        BasOrganizeInfoExample example = getExampleByParam(keyWord, type, faxing, uuidList);

        List<BasOrganizeInfo> basOrganizeInfoList = basOrganizeInfoDaoImpl.getBasOrganizeInfoList(example, page);

        return basOrganizeInfoList;
    }

    @Override
	public BasOrganizeInfo getBasOrganizeInfo(long id) {
		return basOrganizeInfoDaoImpl.getBasOrganizeInfo(id);
	}

	@Override
	public int totalNumber(String keyWord, String type) {

		return basOrganizeInfoDaoImpl.totalNumber(keyWord, type);
	}

    @Override
    public int totalNumber(String keyWord, String type, String faxing, String touzi) {
        List<String> uuidList = getUuids(touzi);

        BasOrganizeInfoExample example = getExampleByParam(keyWord, type, faxing, uuidList);

        return basOrganizeInfoDaoImpl.countNumber(example);

    }

    @Override
	public int countNumber(String keyWord, String type, String faxing, String touzi) {
		List<String> uuidList = getUuids(touzi);
		OrgQryPartParam param = new OrgQryPartParam();
		param.setKeyWord("%"+keyWord+"%");
		param.setType("%"+type+"%");
		param.setFaxing("%"+faxing+"%");
		param.setUuids(uuidList);

		int i = basOrganizeInfoDaoImpl.countNumber(param);

		return i;
	}

	@Override
	public List<BasOrganizeInfo> getListByUuid(String uuid) {
		return basOrganizeInfoDaoImpl.getListByUuid(uuid);
	}

    @Override
    public String createOrgExcel(String uuid,WritableWorkbook wwb) {

        //获取组织详情信息
        List<BasOrganizeInfo> basOrganizeInfoList = this.getListByUuid(uuid);
        //获取组织信息对应标题
        if(basOrganizeInfoList != null && basOrganizeInfoList.size() >0){
            String basOrganizeInfoName = "基本资料";
            LinkedHashMap<String, String> basOrganizeInfoMap = this.getBasOrganizeInfoMap();
            try {
                ExcelUtil.listToExcel(basOrganizeInfoList, basOrganizeInfoMap, basOrganizeInfoName, wwb);
            } catch (ExcelException e) {
                e.printStackTrace();
            }
        }
        return "1";
    }

    @Override
    public LinkedHashMap<String, String> getBasOrganizeInfoMap() {
        LinkedHashMap<String, String> basOrganizeInfoMap = new LinkedHashMap<>();
        //basOrganizeInfoMap.put("id","编号");
        basOrganizeInfoMap.put("oname","组织名称");
        basOrganizeInfoMap.put("ename","英文名");
        basOrganizeInfoMap.put("shortname","组织简称");
        basOrganizeInfoMap.put("fullname","组织全称");
        basOrganizeInfoMap.put("web","网址");
        basOrganizeInfoMap.put("conWay","联系方式");
        basOrganizeInfoMap.put("industry","行业");
        basOrganizeInfoMap.put("scale","规模");
        basOrganizeInfoMap.put("introduce","公司介绍");
        basOrganizeInfoMap.put("address","地址");
        basOrganizeInfoMap.put("logo","公司logo");
        basOrganizeInfoMap.put("stime","成立时间");
        basOrganizeInfoMap.put("other","其他");
        //basOrganizeInfoMap.put("source","");
        //basOrganizeInfoMap.put("url","");
        //basOrganizeInfoMap.put("uuid","");
        basOrganizeInfoMap.put("ctime","创建时间");
        basOrganizeInfoMap.put("atime","修改时间");
        //basOrganizeInfoMap.put("type","");
        basOrganizeInfoMap.put("financingRound","融资轮次");
        basOrganizeInfoMap.put("picture","公司图片");
        basOrganizeInfoMap.put("developmentHistory","发展历程");
        basOrganizeInfoMap.put("financingStage","融资阶段");
        basOrganizeInfoMap.put("financingTotal","总融资额度");
        basOrganizeInfoMap.put("companyNature","公司性质");
        basOrganizeInfoMap.put("corporateCulture","企业文化");
        basOrganizeInfoMap.put("tag","标签");
        basOrganizeInfoMap.put("managementField","经营领域");
        basOrganizeInfoMap.put("businessPlan","商业计划书");
        return basOrganizeInfoMap;
    }

    private List<String> getUuids(String touzi){
		List<String> uuidList = new ArrayList<>();
		if(!Common.isEmpty(touzi)){
			List<OrgOrganize> orgOrganizeList = orgOrganizeDaoImpl.getListByRtype(touzi);
			Optional.ofNullable(orgOrganizeList).ifPresent((org)->{
				org.forEach((o)->{
					uuidList.add(o.getOuuid());
				});
			});
		}

		return uuidList;
	}

    private BasOrganizeInfoExample getExampleByParam(String keyWord, String type, String faxing, List<String> uuidList){
        BasOrganizeInfoExample example= null;

        if(uuidList == null || uuidList.isEmpty()){
            if(Common.isEmpty(keyWord) && Common.isEmpty(type) && Common.isEmpty(faxing)){
                example = new BasOrganizeInfoExample();
            }else if(!Common.isEmpty(keyWord) && Common.isEmpty(type) && Common.isEmpty(faxing)){
                example = getExample(keyWord);
            }else if(!Common.isEmpty(keyWord) && !Common.isEmpty(type) && Common.isEmpty(faxing)){
                example = getExample(keyWord,type);
            }else if(!Common.isEmpty(keyWord) && Common.isEmpty(type) && !Common.isEmpty(faxing)){
                example = getExample(keyWord,faxing);
            }else if(!Common.isEmpty(keyWord) && !Common.isEmpty(type) && !Common.isEmpty(faxing)){
                example = getExample(keyWord, type, faxing);
            }else if(Common.isEmpty(keyWord) && Common.isEmpty(type) && !Common.isEmpty(faxing)){
                example = new BasOrganizeInfoExample();
                example.createCriteria().andTagLike("%" + faxing + "%");
            }else if(Common.isEmpty(keyWord) && !Common.isEmpty(type) && Common.isEmpty(faxing)){
                example = new BasOrganizeInfoExample();
                example.createCriteria().andTagLike("%" + type + "%");
            }else if(Common.isEmpty(keyWord) && !Common.isEmpty(type) && !Common.isEmpty(faxing)){
                example = new BasOrganizeInfoExample();
                example.createCriteria().andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
            }
        }else{
            if(Common.isEmpty(keyWord) && Common.isEmpty(type) && Common.isEmpty(faxing)){
                example = new BasOrganizeInfoExample();
                example.createCriteria().andUuidIn(uuidList);
            }else if(!Common.isEmpty(keyWord) && Common.isEmpty(type) && Common.isEmpty(faxing)){
                example = getExample(keyWord,uuidList);
            }else if(!Common.isEmpty(keyWord) && !Common.isEmpty(type) && Common.isEmpty(faxing)){
                example = getExample(keyWord,type,uuidList);
            }else if(!Common.isEmpty(keyWord) && Common.isEmpty(type) && !Common.isEmpty(faxing)){
                example = getExample(keyWord,faxing,uuidList);
            }else if(!Common.isEmpty(keyWord) && !Common.isEmpty(type) && !Common.isEmpty(faxing)){
                example = getExample(keyWord, type, faxing,uuidList);
            }else if(Common.isEmpty(keyWord) && Common.isEmpty(type) && !Common.isEmpty(faxing)){
                example = new BasOrganizeInfoExample();
                example.createCriteria().andTagLike("%" + faxing + "%").andUuidIn(uuidList);
            }else if(Common.isEmpty(keyWord) && !Common.isEmpty(type) && Common.isEmpty(faxing)){
                example = new BasOrganizeInfoExample();
                example.createCriteria().andTagLike("%" + type + "%").andUuidIn(uuidList);
            }else if(Common.isEmpty(keyWord) && !Common.isEmpty(type) && !Common.isEmpty(faxing)){
                example = new BasOrganizeInfoExample();
                example.createCriteria().andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuidList);
            }
        }

        return example;
    }

	private BasOrganizeInfoExample getExample(String keyWord){
        BasOrganizeInfoExample example = new BasOrganizeInfoExample();
        example.or().andOnameLike("%" + keyWord + "%");
        example.or().andEnameLike("%" + keyWord + "%");
        example.or().andShortnameLike("%" + keyWord + "%");
        example.or().andFullnameLike("%" + keyWord + "%");
        example.or().andWebLike("%" + keyWord + "%");
        example.or().andConWayLike("%" + keyWord + "%");
        example.or().andIndustryLike("%" + keyWord + "%");
        example.or().andScaleLike("%" + keyWord + "%");
        example.or().andIntroduceLike("%" + keyWord + "%");
        example.or().andAddressLike("%" + keyWord + "%");
        example.or().andLogoLike("%" + keyWord + "%");
        example.or().andStimeLike("%" + keyWord + "%");
        example.or().andOtherLike("%" + keyWord + "%");
        example.or().andSourceLike("%" + keyWord + "%");
        example.or().andUrlLike("%" + keyWord + "%");
        example.or().andFinancingRoundLike("%" + keyWord + "%");
        example.or().andPictureLike("%" + keyWord + "%");
        example.or().andDevelopmentHistoryLike("%" + keyWord + "%");
        example.or().andFinancingStageLike("%" + keyWord + "%");
        example.or().andFinancingTotalLike("%" + keyWord + "%");
        example.or().andCompanyNatureLike("%" + keyWord + "%");
        example.or().andCorporateCultureLike("%" + keyWord + "%");
        example.or().andTagLike("%" + keyWord + "%");
        example.or().andManagementFieldLike("%" + keyWord + "%");
        example.or().andBusinessPlanLike("%" + keyWord + "%");
        return example;
    }

    private BasOrganizeInfoExample getExample(String keyWord, String type){
        BasOrganizeInfoExample example = new BasOrganizeInfoExample();
        example.or().andOnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andEnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andShortnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andFullnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andWebLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andConWayLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andIndustryLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andScaleLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andIntroduceLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andAddressLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andLogoLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andStimeLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andOtherLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andSourceLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andUrlLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andFinancingRoundLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andPictureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andDevelopmentHistoryLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andFinancingStageLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andFinancingTotalLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andCompanyNatureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andCorporateCultureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andTagLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andManagementFieldLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        example.or().andBusinessPlanLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%");
        return example;
    }

    private BasOrganizeInfoExample getExample(String keyWord, String type, String faxing){
        BasOrganizeInfoExample example = new BasOrganizeInfoExample();
        example.or().andOnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andEnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andShortnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andFullnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andWebLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andConWayLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andIndustryLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andScaleLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andIntroduceLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andAddressLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andLogoLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andStimeLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andOtherLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andSourceLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andUrlLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andFinancingRoundLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andPictureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andDevelopmentHistoryLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andFinancingStageLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andFinancingTotalLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andCompanyNatureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andCorporateCultureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andTagLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andManagementFieldLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        example.or().andBusinessPlanLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%");
        return example;
    }

    private BasOrganizeInfoExample getExample(String keyWord, List<String> uuids){
        BasOrganizeInfoExample example = new BasOrganizeInfoExample();
        example.or().andOnameLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andEnameLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andShortnameLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andFullnameLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andWebLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andConWayLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andIndustryLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andScaleLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andIntroduceLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andAddressLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andLogoLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andStimeLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andOtherLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andSourceLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andUrlLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andFinancingRoundLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andPictureLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andDevelopmentHistoryLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andFinancingStageLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andFinancingTotalLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andCompanyNatureLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andCorporateCultureLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andTagLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andManagementFieldLike("%" + keyWord + "%").andUuidIn(uuids);
        example.or().andBusinessPlanLike("%" + keyWord + "%").andUuidIn(uuids);
        return example;
    }

    private BasOrganizeInfoExample getExample(String keyWord, String type, List<String> uuids){
        BasOrganizeInfoExample example = new BasOrganizeInfoExample();
        example.or().andOnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andEnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andShortnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andFullnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andWebLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andConWayLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andIndustryLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andScaleLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andIntroduceLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andAddressLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andLogoLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andStimeLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andOtherLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andSourceLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andUrlLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andFinancingRoundLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andPictureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andDevelopmentHistoryLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andFinancingStageLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andFinancingTotalLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andCompanyNatureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andCorporateCultureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andTagLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andManagementFieldLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        example.or().andBusinessPlanLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andUuidIn(uuids);
        return example;
    }

    private BasOrganizeInfoExample getExample(String keyWord, String type, String faxing, List<String> uuids){
        BasOrganizeInfoExample example = new BasOrganizeInfoExample();
        example.or().andOnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andEnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andShortnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andFullnameLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andWebLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andConWayLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andIndustryLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andScaleLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andIntroduceLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andAddressLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andLogoLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andStimeLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andOtherLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andSourceLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andUrlLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andFinancingRoundLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andPictureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andDevelopmentHistoryLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andFinancingStageLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andFinancingTotalLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andCompanyNatureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andCorporateCultureLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andTagLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andManagementFieldLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        example.or().andBusinessPlanLike("%" + keyWord + "%")
                .andTagLike("%" + type + "%").andTagLike("%" + faxing + "%").andUuidIn(uuids);
        return example;
    }
}

package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class BasOrganizeInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String oname;

    private String ename;

    private String shortname;

    private String fullname;

    private String web;

    private String conWay;

    private String industry;

    private String scale;

    private String introduce;

    private String address;

    private String logo;

    private String stime;

    private String other;

    private String source;

    private String url;

    private String uuid;

    private Date ctime;

    private Date atime;

    private Byte type;

    private String financingRound;

    private String picture;

    private String developmentHistory;

    private String financingStage;

    private String financingTotal;

    private String companyNature;

    private String corporateCulture;

    private String tag;

    private String managementField;

    private String businessPlan;

    public Long getId() {
        return id;
    }

    public static String getIdColumnString() {
        return "id";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOname() {
        return oname;
    }

    public static String getOnameColumnString() {
        return "oname";
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getEname() {
        return ename;
    }

    public static String getEnameColumnString() {
        return "ename";
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public static String getShortnameColumnString() {
        return "shortname";
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public static String getFullnameColumnString() {
        return "fullname";
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getWeb() {
        return web;
    }

    public static String getWebColumnString() {
        return "web";
    }

    public void setWeb(String web) {
        this.web = web == null ? null : web.trim();
    }

    public String getConWay() {
        return conWay;
    }

    public static String getConWayColumnString() {
        return "conWay";
    }

    public void setConWay(String conWay) {
        this.conWay = conWay == null ? null : conWay.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public static String getIndustryColumnString() {
        return "industry";
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getScale() {
        return scale;
    }

    public static String getScaleColumnString() {
        return "scale";
    }

    public void setScale(String scale) {
        this.scale = scale == null ? null : scale.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public static String getIntroduceColumnString() {
        return "introduce";
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getAddress() {
        return address;
    }

    public static String getAddressColumnString() {
        return "address";
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLogo() {
        return logo;
    }

    public static String getLogoColumnString() {
        return "logo";
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getStime() {
        return stime;
    }

    public static String getStimeColumnString() {
        return "stime";
    }

    public void setStime(String stime) {
        this.stime = stime == null ? null : stime.trim();
    }

    public String getOther() {
        return other;
    }

    public static String getOtherColumnString() {
        return "other";
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getSource() {
        return source;
    }

    public static String getSourceColumnString() {
        return "source";
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getUrl() {
        return url;
    }

    public static String getUrlColumnString() {
        return "url";
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public static String getUuidColumnString() {
        return "uuid";
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public static String getCtimeColumnString() {
        return "ctime";
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getAtime() {
        return atime;
    }

    public static String getAtimeColumnString() {
        return "atime";
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    public Byte getType() {
        return type;
    }

    public static String getTypeColumnString() {
        return "type";
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getFinancingRound() {
        return financingRound;
    }

    public static String getFinancingRoundColumnString() {
        return "financingRound";
    }

    public void setFinancingRound(String financingRound) {
        this.financingRound = financingRound == null ? null : financingRound.trim();
    }

    public String getPicture() {
        return picture;
    }

    public static String getPictureColumnString() {
        return "picture";
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getDevelopmentHistory() {
        return developmentHistory;
    }

    public static String getDevelopmentHistoryColumnString() {
        return "developmentHistory";
    }

    public void setDevelopmentHistory(String developmentHistory) {
        this.developmentHistory = developmentHistory == null ? null : developmentHistory.trim();
    }

    public String getFinancingStage() {
        return financingStage;
    }

    public static String getFinancingStageColumnString() {
        return "financingStage";
    }

    public void setFinancingStage(String financingStage) {
        this.financingStage = financingStage == null ? null : financingStage.trim();
    }

    public String getFinancingTotal() {
        return financingTotal;
    }

    public static String getFinancingTotalColumnString() {
        return "financingTotal";
    }

    public void setFinancingTotal(String financingTotal) {
        this.financingTotal = financingTotal == null ? null : financingTotal.trim();
    }

    public String getCompanyNature() {
        return companyNature;
    }

    public static String getCompanyNatureColumnString() {
        return "companyNature";
    }

    public void setCompanyNature(String companyNature) {
        this.companyNature = companyNature == null ? null : companyNature.trim();
    }

    public String getCorporateCulture() {
        return corporateCulture;
    }

    public static String getCorporateCultureColumnString() {
        return "corporateCulture";
    }

    public void setCorporateCulture(String corporateCulture) {
        this.corporateCulture = corporateCulture == null ? null : corporateCulture.trim();
    }

    public String getTag() {
        return tag;
    }

    public static String getTagColumnString() {
        return "tag";
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getManagementField() {
        return managementField;
    }

    public static String getManagementFieldColumnString() {
        return "managementField";
    }

    public void setManagementField(String managementField) {
        this.managementField = managementField == null ? null : managementField.trim();
    }

    public String getBusinessPlan() {
        return businessPlan;
    }

    public static String getBusinessPlanColumnString() {
        return "businessPlan";
    }

    public void setBusinessPlan(String businessPlan) {
        this.businessPlan = businessPlan == null ? null : businessPlan.trim();
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getOnameColumnString()+":"+getOname();
        colStr += ", " + getEnameColumnString()+":"+getEname();
        colStr += ", " + getShortnameColumnString()+":"+getShortname();
        colStr += ", " + getFullnameColumnString()+":"+getFullname();
        colStr += ", " + getWebColumnString()+":"+getWeb();
        colStr += ", " + getConWayColumnString()+":"+getConWay();
        colStr += ", " + getIndustryColumnString()+":"+getIndustry();
        colStr += ", " + getScaleColumnString()+":"+getScale();
        colStr += ", " + getIntroduceColumnString()+":"+getIntroduce();
        colStr += ", " + getAddressColumnString()+":"+getAddress();
        colStr += ", " + getLogoColumnString()+":"+getLogo();
        colStr += ", " + getStimeColumnString()+":"+getStime();
        colStr += ", " + getOtherColumnString()+":"+getOther();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        colStr += ", " + getUrlColumnString()+":"+getUrl();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        colStr += ", " + getTypeColumnString()+":"+getType();
        colStr += ", " + getFinancingRoundColumnString()+":"+getFinancingRound();
        colStr += ", " + getPictureColumnString()+":"+getPicture();
        colStr += ", " + getDevelopmentHistoryColumnString()+":"+getDevelopmentHistory();
        colStr += ", " + getFinancingStageColumnString()+":"+getFinancingStage();
        colStr += ", " + getFinancingTotalColumnString()+":"+getFinancingTotal();
        colStr += ", " + getCompanyNatureColumnString()+":"+getCompanyNature();
        colStr += ", " + getCorporateCultureColumnString()+":"+getCorporateCulture();
        colStr += ", " + getTagColumnString()+":"+getTag();
        colStr += ", " + getManagementFieldColumnString()+":"+getManagementField();
        colStr += ", " + getBusinessPlanColumnString()+":"+getBusinessPlan();
        
        return clazzName + colStr + "]";
    }
}
package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class InvestcomInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String reasonableCapitalScale;

    private String individualProjectinvestmentScale;

    private String investmentField;

    private String investmentRound;

    private String fundManager;

    private String uuid;

    private String url;

    private Date ctime;

    private Date atime;

    public Integer getId() {
        return id;
    }

    public static String getIdColumnString() {
        return "id";
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReasonableCapitalScale() {
        return reasonableCapitalScale;
    }

    public static String getReasonableCapitalScaleColumnString() {
        return "reasonableCapitalScale";
    }

    public void setReasonableCapitalScale(String reasonableCapitalScale) {
        this.reasonableCapitalScale = reasonableCapitalScale == null ? null : reasonableCapitalScale.trim();
    }

    public String getIndividualProjectinvestmentScale() {
        return individualProjectinvestmentScale;
    }

    public static String getIndividualProjectinvestmentScaleColumnString() {
        return "individualProjectinvestmentScale";
    }

    public void setIndividualProjectinvestmentScale(String individualProjectinvestmentScale) {
        this.individualProjectinvestmentScale = individualProjectinvestmentScale == null ? null : individualProjectinvestmentScale.trim();
    }

    public String getInvestmentField() {
        return investmentField;
    }

    public static String getInvestmentFieldColumnString() {
        return "investmentField";
    }

    public void setInvestmentField(String investmentField) {
        this.investmentField = investmentField == null ? null : investmentField.trim();
    }

    public String getInvestmentRound() {
        return investmentRound;
    }

    public static String getInvestmentRoundColumnString() {
        return "investmentRound";
    }

    public void setInvestmentRound(String investmentRound) {
        this.investmentRound = investmentRound == null ? null : investmentRound.trim();
    }

    public String getFundManager() {
        return fundManager;
    }

    public static String getFundManagerColumnString() {
        return "fundManager";
    }

    public void setFundManager(String fundManager) {
        this.fundManager = fundManager == null ? null : fundManager.trim();
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

    public String getUrl() {
        return url;
    }

    public static String getUrlColumnString() {
        return "url";
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getReasonableCapitalScaleColumnString()+":"+getReasonableCapitalScale();
        colStr += ", " + getIndividualProjectinvestmentScaleColumnString()+":"+getIndividualProjectinvestmentScale();
        colStr += ", " + getInvestmentFieldColumnString()+":"+getInvestmentField();
        colStr += ", " + getInvestmentRoundColumnString()+":"+getInvestmentRound();
        colStr += ", " + getFundManagerColumnString()+":"+getFundManager();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getUrlColumnString()+":"+getUrl();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
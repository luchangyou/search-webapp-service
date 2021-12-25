package com.yiguan.search.model;

import java.io.Serializable;

public class EventInvestfinace implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String financiers;

    private String time;

    private String industry;

    private String classLb;

    private String domain;

    private String round;

    private String quota;

    private String investors;

    private String euuid;

    public Integer getId() {
        return id;
    }

    public static String getIdColumnString() {
        return "id";
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFinanciers() {
        return financiers;
    }

    public static String getFinanciersColumnString() {
        return "financiers";
    }

    public void setFinanciers(String financiers) {
        this.financiers = financiers == null ? null : financiers.trim();
    }

    public String getTime() {
        return time;
    }

    public static String getTimeColumnString() {
        return "time";
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
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

    public String getClassLb() {
        return classLb;
    }

    public static String getClassLbColumnString() {
        return "classLb";
    }

    public void setClassLb(String classLb) {
        this.classLb = classLb == null ? null : classLb.trim();
    }

    public String getDomain() {
        return domain;
    }

    public static String getDomainColumnString() {
        return "domain";
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getRound() {
        return round;
    }

    public static String getRoundColumnString() {
        return "round";
    }

    public void setRound(String round) {
        this.round = round == null ? null : round.trim();
    }

    public String getQuota() {
        return quota;
    }

    public static String getQuotaColumnString() {
        return "quota";
    }

    public void setQuota(String quota) {
        this.quota = quota == null ? null : quota.trim();
    }

    public String getInvestors() {
        return investors;
    }

    public static String getInvestorsColumnString() {
        return "investors";
    }

    public void setInvestors(String investors) {
        this.investors = investors == null ? null : investors.trim();
    }

    public String getEuuid() {
        return euuid;
    }

    public static String getEuuidColumnString() {
        return "euuid";
    }

    public void setEuuid(String euuid) {
        this.euuid = euuid == null ? null : euuid.trim();
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getFinanciersColumnString()+":"+getFinanciers();
        colStr += ", " + getTimeColumnString()+":"+getTime();
        colStr += ", " + getIndustryColumnString()+":"+getIndustry();
        colStr += ", " + getClassLbColumnString()+":"+getClassLb();
        colStr += ", " + getDomainColumnString()+":"+getDomain();
        colStr += ", " + getRoundColumnString()+":"+getRound();
        colStr += ", " + getQuotaColumnString()+":"+getQuota();
        colStr += ", " + getInvestorsColumnString()+":"+getInvestors();
        colStr += ", " + getEuuidColumnString()+":"+getEuuid();
        
        return clazzName + colStr + "]";
    }
}
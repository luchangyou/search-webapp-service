package com.yiguan.search.model;

import java.io.Serializable;

public class EventMerger implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String acquiree;

    private String time;

    private String industry;

    private String classLb;

    private String domain;

    private String equity;

    private String quota;

    private String buyers;

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

    public String getAcquiree() {
        return acquiree;
    }

    public static String getAcquireeColumnString() {
        return "acquiree";
    }

    public void setAcquiree(String acquiree) {
        this.acquiree = acquiree == null ? null : acquiree.trim();
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

    public String getEquity() {
        return equity;
    }

    public static String getEquityColumnString() {
        return "equity";
    }

    public void setEquity(String equity) {
        this.equity = equity == null ? null : equity.trim();
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

    public String getBuyers() {
        return buyers;
    }

    public static String getBuyersColumnString() {
        return "buyers";
    }

    public void setBuyers(String buyers) {
        this.buyers = buyers == null ? null : buyers.trim();
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
        colStr += ", " + getAcquireeColumnString()+":"+getAcquiree();
        colStr += ", " + getTimeColumnString()+":"+getTime();
        colStr += ", " + getIndustryColumnString()+":"+getIndustry();
        colStr += ", " + getClassLbColumnString()+":"+getClassLb();
        colStr += ", " + getDomainColumnString()+":"+getDomain();
        colStr += ", " + getEquityColumnString()+":"+getEquity();
        colStr += ", " + getQuotaColumnString()+":"+getQuota();
        colStr += ", " + getBuyersColumnString()+":"+getBuyers();
        colStr += ", " + getEuuidColumnString()+":"+getEuuid();
        
        return clazzName + colStr + "]";
    }
}
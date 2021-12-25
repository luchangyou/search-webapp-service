package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComInvestmentInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String oname;

    private String legalPersen;

    private String industry;

    private String state;

    private String investment;

    private String proportion;

    private String rcapital;

    private String rtime;

    private String web;

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

    public Integer getBid() {
        return bid;
    }

    public static String getBidColumnString() {
        return "bid";
    }

    public void setBid(Integer bid) {
        this.bid = bid;
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

    public String getOname() {
        return oname;
    }

    public static String getOnameColumnString() {
        return "oname";
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getLegalPersen() {
        return legalPersen;
    }

    public static String getLegalPersenColumnString() {
        return "legalPersen";
    }

    public void setLegalPersen(String legalPersen) {
        this.legalPersen = legalPersen == null ? null : legalPersen.trim();
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

    public String getState() {
        return state;
    }

    public static String getStateColumnString() {
        return "state";
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getInvestment() {
        return investment;
    }

    public static String getInvestmentColumnString() {
        return "investment";
    }

    public void setInvestment(String investment) {
        this.investment = investment == null ? null : investment.trim();
    }

    public String getProportion() {
        return proportion;
    }

    public static String getProportionColumnString() {
        return "proportion";
    }

    public void setProportion(String proportion) {
        this.proportion = proportion == null ? null : proportion.trim();
    }

    public String getRcapital() {
        return rcapital;
    }

    public static String getRcapitalColumnString() {
        return "rcapital";
    }

    public void setRcapital(String rcapital) {
        this.rcapital = rcapital == null ? null : rcapital.trim();
    }

    public String getRtime() {
        return rtime;
    }

    public static String getRtimeColumnString() {
        return "rtime";
    }

    public void setRtime(String rtime) {
        this.rtime = rtime == null ? null : rtime.trim();
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
        colStr += ", " + getBidColumnString()+":"+getBid();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getOnameColumnString()+":"+getOname();
        colStr += ", " + getLegalPersenColumnString()+":"+getLegalPersen();
        colStr += ", " + getIndustryColumnString()+":"+getIndustry();
        colStr += ", " + getStateColumnString()+":"+getState();
        colStr += ", " + getInvestmentColumnString()+":"+getInvestment();
        colStr += ", " + getProportionColumnString()+":"+getProportion();
        colStr += ", " + getRcapitalColumnString()+":"+getRcapital();
        colStr += ", " + getRtimeColumnString()+":"+getRtime();
        colStr += ", " + getWebColumnString()+":"+getWeb();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComPatent implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String imgurl;

    private String apnumber;

    private String anumber;

    private String cnumber;

    private String inventionname;

    private String address;

    private String inventor;

    private String applicant;

    private String apdate;

    private String andate;

    private String agency;

    private String agent;

    private String abs;

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

    public String getImgurl() {
        return imgurl;
    }

    public static String getImgurlColumnString() {
        return "imgurl";
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getApnumber() {
        return apnumber;
    }

    public static String getApnumberColumnString() {
        return "apnumber";
    }

    public void setApnumber(String apnumber) {
        this.apnumber = apnumber == null ? null : apnumber.trim();
    }

    public String getAnumber() {
        return anumber;
    }

    public static String getAnumberColumnString() {
        return "anumber";
    }

    public void setAnumber(String anumber) {
        this.anumber = anumber == null ? null : anumber.trim();
    }

    public String getCnumber() {
        return cnumber;
    }

    public static String getCnumberColumnString() {
        return "cnumber";
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber == null ? null : cnumber.trim();
    }

    public String getInventionname() {
        return inventionname;
    }

    public static String getInventionnameColumnString() {
        return "inventionname";
    }

    public void setInventionname(String inventionname) {
        this.inventionname = inventionname == null ? null : inventionname.trim();
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

    public String getInventor() {
        return inventor;
    }

    public static String getInventorColumnString() {
        return "inventor";
    }

    public void setInventor(String inventor) {
        this.inventor = inventor == null ? null : inventor.trim();
    }

    public String getApplicant() {
        return applicant;
    }

    public static String getApplicantColumnString() {
        return "applicant";
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public String getApdate() {
        return apdate;
    }

    public static String getApdateColumnString() {
        return "apdate";
    }

    public void setApdate(String apdate) {
        this.apdate = apdate == null ? null : apdate.trim();
    }

    public String getAndate() {
        return andate;
    }

    public static String getAndateColumnString() {
        return "andate";
    }

    public void setAndate(String andate) {
        this.andate = andate == null ? null : andate.trim();
    }

    public String getAgency() {
        return agency;
    }

    public static String getAgencyColumnString() {
        return "agency";
    }

    public void setAgency(String agency) {
        this.agency = agency == null ? null : agency.trim();
    }

    public String getAgent() {
        return agent;
    }

    public static String getAgentColumnString() {
        return "agent";
    }

    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
    }

    public String getAbs() {
        return abs;
    }

    public static String getAbsColumnString() {
        return "abs";
    }

    public void setAbs(String abs) {
        this.abs = abs == null ? null : abs.trim();
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
        colStr += ", " + getImgurlColumnString()+":"+getImgurl();
        colStr += ", " + getApnumberColumnString()+":"+getApnumber();
        colStr += ", " + getAnumberColumnString()+":"+getAnumber();
        colStr += ", " + getCnumberColumnString()+":"+getCnumber();
        colStr += ", " + getInventionnameColumnString()+":"+getInventionname();
        colStr += ", " + getAddressColumnString()+":"+getAddress();
        colStr += ", " + getInventorColumnString()+":"+getInventor();
        colStr += ", " + getApplicantColumnString()+":"+getApplicant();
        colStr += ", " + getApdateColumnString()+":"+getApdate();
        colStr += ", " + getAndateColumnString()+":"+getAndate();
        colStr += ", " + getAgencyColumnString()+":"+getAgency();
        colStr += ", " + getAgentColumnString()+":"+getAgent();
        colStr += ", " + getAbsColumnString()+":"+getAbs();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
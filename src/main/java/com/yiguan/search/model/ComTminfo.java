package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComTminfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String adate;

    private String brandname;

    private String rnumber;

    private String classLb;

    private String state;

    private String tmpic;

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

    public String getAdate() {
        return adate;
    }

    public static String getAdateColumnString() {
        return "adate";
    }

    public void setAdate(String adate) {
        this.adate = adate == null ? null : adate.trim();
    }

    public String getBrandname() {
        return brandname;
    }

    public static String getBrandnameColumnString() {
        return "brandname";
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getRnumber() {
        return rnumber;
    }

    public static String getRnumberColumnString() {
        return "rnumber";
    }

    public void setRnumber(String rnumber) {
        this.rnumber = rnumber == null ? null : rnumber.trim();
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

    public String getState() {
        return state;
    }

    public static String getStateColumnString() {
        return "state";
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getTmpic() {
        return tmpic;
    }

    public static String getTmpicColumnString() {
        return "tmpic";
    }

    public void setTmpic(String tmpic) {
        this.tmpic = tmpic == null ? null : tmpic.trim();
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
        colStr += ", " + getAdateColumnString()+":"+getAdate();
        colStr += ", " + getBrandnameColumnString()+":"+getBrandname();
        colStr += ", " + getRnumberColumnString()+":"+getRnumber();
        colStr += ", " + getClassLbColumnString()+":"+getClassLb();
        colStr += ", " + getStateColumnString()+":"+getState();
        colStr += ", " + getTmpicColumnString()+":"+getTmpic();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
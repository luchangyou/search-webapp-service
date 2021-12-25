package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComCopyrightwork implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String workname;

    private String rnumber;

    private String classLb;

    private String completiondate;

    private String rdate;

    private String frdate;

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

    public String getWorkname() {
        return workname;
    }

    public static String getWorknameColumnString() {
        return "workname";
    }

    public void setWorkname(String workname) {
        this.workname = workname == null ? null : workname.trim();
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

    public String getCompletiondate() {
        return completiondate;
    }

    public static String getCompletiondateColumnString() {
        return "completiondate";
    }

    public void setCompletiondate(String completiondate) {
        this.completiondate = completiondate == null ? null : completiondate.trim();
    }

    public String getRdate() {
        return rdate;
    }

    public static String getRdateColumnString() {
        return "rdate";
    }

    public void setRdate(String rdate) {
        this.rdate = rdate == null ? null : rdate.trim();
    }

    public String getFrdate() {
        return frdate;
    }

    public static String getFrdateColumnString() {
        return "frdate";
    }

    public void setFrdate(String frdate) {
        this.frdate = frdate == null ? null : frdate.trim();
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
        colStr += ", " + getWorknameColumnString()+":"+getWorkname();
        colStr += ", " + getRnumberColumnString()+":"+getRnumber();
        colStr += ", " + getClassLbColumnString()+":"+getClassLb();
        colStr += ", " + getCompletiondateColumnString()+":"+getCompletiondate();
        colStr += ", " + getRdateColumnString()+":"+getRdate();
        colStr += ", " + getFrdateColumnString()+":"+getFrdate();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
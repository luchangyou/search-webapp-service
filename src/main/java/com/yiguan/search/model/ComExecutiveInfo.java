package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComExecutiveInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String pname;

    private String job;

    private String adress;

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

    public String getPname() {
        return pname;
    }

    public static String getPnameColumnString() {
        return "pname";
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getJob() {
        return job;
    }

    public static String getJobColumnString() {
        return "job";
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getAdress() {
        return adress;
    }

    public static String getAdressColumnString() {
        return "adress";
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
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
        colStr += ", " + getPnameColumnString()+":"+getPname();
        colStr += ", " + getJobColumnString()+":"+getJob();
        colStr += ", " + getAdressColumnString()+":"+getAdress();
        colStr += ", " + getWebColumnString()+":"+getWeb();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
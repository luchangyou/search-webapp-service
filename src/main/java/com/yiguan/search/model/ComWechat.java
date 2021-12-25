package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComWechat implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String wechatname;

    private String wechat;

    private String wechatfunction;

    private String logo;

    private String qrcode;

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

    public String getWechatname() {
        return wechatname;
    }

    public static String getWechatnameColumnString() {
        return "wechatname";
    }

    public void setWechatname(String wechatname) {
        this.wechatname = wechatname == null ? null : wechatname.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public static String getWechatColumnString() {
        return "wechat";
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getWechatfunction() {
        return wechatfunction;
    }

    public static String getWechatfunctionColumnString() {
        return "wechatfunction";
    }

    public void setWechatfunction(String wechatfunction) {
        this.wechatfunction = wechatfunction == null ? null : wechatfunction.trim();
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

    public String getQrcode() {
        return qrcode;
    }

    public static String getQrcodeColumnString() {
        return "qrcode";
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
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
        colStr += ", " + getWechatnameColumnString()+":"+getWechatname();
        colStr += ", " + getWechatColumnString()+":"+getWechat();
        colStr += ", " + getWechatfunctionColumnString()+":"+getWechatfunction();
        colStr += ", " + getLogoColumnString()+":"+getLogo();
        colStr += ", " + getQrcodeColumnString()+":"+getQrcode();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
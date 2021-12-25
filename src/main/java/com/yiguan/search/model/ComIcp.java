package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComIcp implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String audittime;

    private String webname;

    private String home;

    private String domainname;

    private String icpnumber;

    private String state;

    private String property;

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

    public String getAudittime() {
        return audittime;
    }

    public static String getAudittimeColumnString() {
        return "audittime";
    }

    public void setAudittime(String audittime) {
        this.audittime = audittime == null ? null : audittime.trim();
    }

    public String getWebname() {
        return webname;
    }

    public static String getWebnameColumnString() {
        return "webname";
    }

    public void setWebname(String webname) {
        this.webname = webname == null ? null : webname.trim();
    }

    public String getHome() {
        return home;
    }

    public static String getHomeColumnString() {
        return "home";
    }

    public void setHome(String home) {
        this.home = home == null ? null : home.trim();
    }

    public String getDomainname() {
        return domainname;
    }

    public static String getDomainnameColumnString() {
        return "domainname";
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname == null ? null : domainname.trim();
    }

    public String getIcpnumber() {
        return icpnumber;
    }

    public static String getIcpnumberColumnString() {
        return "icpnumber";
    }

    public void setIcpnumber(String icpnumber) {
        this.icpnumber = icpnumber == null ? null : icpnumber.trim();
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

    public String getProperty() {
        return property;
    }

    public static String getPropertyColumnString() {
        return "property";
    }

    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
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
        colStr += ", " + getAudittimeColumnString()+":"+getAudittime();
        colStr += ", " + getWebnameColumnString()+":"+getWebname();
        colStr += ", " + getHomeColumnString()+":"+getHome();
        colStr += ", " + getDomainnameColumnString()+":"+getDomainname();
        colStr += ", " + getIcpnumberColumnString()+":"+getIcpnumber();
        colStr += ", " + getStateColumnString()+":"+getState();
        colStr += ", " + getPropertyColumnString()+":"+getProperty();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
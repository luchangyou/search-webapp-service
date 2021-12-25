package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class EventActivity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String time;

    private String url;

    private String classLb;

    private Date ctime;

    private String source;

    private String sponsor;

    private String location;

    private String city;

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

    public String getName() {
        return name;
    }

    public static String getNameColumnString() {
        return "name";
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getUrl() {
        return url;
    }

    public static String getUrlColumnString() {
        return "url";
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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

    public Date getCtime() {
        return ctime;
    }

    public static String getCtimeColumnString() {
        return "ctime";
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getSource() {
        return source;
    }

    public static String getSourceColumnString() {
        return "source";
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getSponsor() {
        return sponsor;
    }

    public static String getSponsorColumnString() {
        return "sponsor";
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor == null ? null : sponsor.trim();
    }

    public String getLocation() {
        return location;
    }

    public static String getLocationColumnString() {
        return "location";
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getCity() {
        return city;
    }

    public static String getCityColumnString() {
        return "city";
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
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
        colStr += ", " + getNameColumnString()+":"+getName();
        colStr += ", " + getTimeColumnString()+":"+getTime();
        colStr += ", " + getUrlColumnString()+":"+getUrl();
        colStr += ", " + getClassLbColumnString()+":"+getClassLb();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        colStr += ", " + getSponsorColumnString()+":"+getSponsor();
        colStr += ", " + getLocationColumnString()+":"+getLocation();
        colStr += ", " + getCityColumnString()+":"+getCity();
        colStr += ", " + getEuuidColumnString()+":"+getEuuid();
        
        return clazzName + colStr + "]";
    }
}
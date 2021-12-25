package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class BasEventInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String edesc;

    private String source;

    private String url;

    private String ouuid;

    private String euuid;

    private Date ctime;

    private Date atime;

    private String type;

    public Integer getId() {
        return id;
    }

    public static String getIdColumnString() {
        return "id";
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public static String getTitleColumnString() {
        return "title";
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getEdesc() {
        return edesc;
    }

    public static String getEdescColumnString() {
        return "edesc";
    }

    public void setEdesc(String edesc) {
        this.edesc = edesc == null ? null : edesc.trim();
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

    public String getUrl() {
        return url;
    }

    public static String getUrlColumnString() {
        return "url";
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getOuuid() {
        return ouuid;
    }

    public static String getOuuidColumnString() {
        return "ouuid";
    }

    public void setOuuid(String ouuid) {
        this.ouuid = ouuid == null ? null : ouuid.trim();
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

    public String getType() {
        return type;
    }

    public static String getTypeColumnString() {
        return "type";
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getTitleColumnString()+":"+getTitle();
        colStr += ", " + getEdescColumnString()+":"+getEdesc();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        colStr += ", " + getUrlColumnString()+":"+getUrl();
        colStr += ", " + getOuuidColumnString()+":"+getOuuid();
        colStr += ", " + getEuuidColumnString()+":"+getEuuid();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        colStr += ", " + getTypeColumnString()+":"+getType();
        
        return clazzName + colStr + "]";
    }
}
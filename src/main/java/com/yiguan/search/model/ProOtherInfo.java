package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ProOtherInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String pname;

    private String ptype;

    private String pDesc;

    private String tag;

    private Date ptime;

    private String scale;

    private String pdemand;

    private String pictureUrl;

    private String web;

    private String source;

    private String uuid;

    private String url;

    private Date ctime;

    private Date atime;

    private Byte type;

    public Long getId() {
        return id;
    }

    public static String getIdColumnString() {
        return "id";
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPtype() {
        return ptype;
    }

    public static String getPtypeColumnString() {
        return "ptype";
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

    public String getpDesc() {
        return pDesc;
    }

    public static String getpDescColumnString() {
        return "pDesc";
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc == null ? null : pDesc.trim();
    }

    public String getTag() {
        return tag;
    }

    public static String getTagColumnString() {
        return "tag";
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Date getPtime() {
        return ptime;
    }

    public static String getPtimeColumnString() {
        return "ptime";
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public String getScale() {
        return scale;
    }

    public static String getScaleColumnString() {
        return "scale";
    }

    public void setScale(String scale) {
        this.scale = scale == null ? null : scale.trim();
    }

    public String getPdemand() {
        return pdemand;
    }

    public static String getPdemandColumnString() {
        return "pdemand";
    }

    public void setPdemand(String pdemand) {
        this.pdemand = pdemand == null ? null : pdemand.trim();
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public static String getPictureUrlColumnString() {
        return "pictureUrl";
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
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

    public String getSource() {
        return source;
    }

    public static String getSourceColumnString() {
        return "source";
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
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

    public String getUrl() {
        return url;
    }

    public static String getUrlColumnString() {
        return "url";
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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

    public Byte getType() {
        return type;
    }

    public static String getTypeColumnString() {
        return "type";
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getPnameColumnString()+":"+getPname();
        colStr += ", " + getPtypeColumnString()+":"+getPtype();
        colStr += ", " + getpDescColumnString()+":"+getpDesc();
        colStr += ", " + getTagColumnString()+":"+getTag();
        colStr += ", " + getPtimeColumnString()+":"+getPtime();
        colStr += ", " + getScaleColumnString()+":"+getScale();
        colStr += ", " + getPdemandColumnString()+":"+getPdemand();
        colStr += ", " + getPictureUrlColumnString()+":"+getPictureUrl();
        colStr += ", " + getWebColumnString()+":"+getWeb();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getUrlColumnString()+":"+getUrl();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        colStr += ", " + getTypeColumnString()+":"+getType();
        
        return clazzName + colStr + "]";
    }
}
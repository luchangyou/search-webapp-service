package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class OrgKnowledge implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String oname;

    private String title;

    private String revent;

    private String rtype;

    private String rgrade;

    private String rgDesc;

    private String ouuid;

    private String kuuid;

    private String source;

    private Date ctime;

    private Date atime;

    public Long getId() {
        return id;
    }

    public static String getIdColumnString() {
        return "id";
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public static String getTitleColumnString() {
        return "title";
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getRevent() {
        return revent;
    }

    public static String getReventColumnString() {
        return "revent";
    }

    public void setRevent(String revent) {
        this.revent = revent == null ? null : revent.trim();
    }

    public String getRtype() {
        return rtype;
    }

    public static String getRtypeColumnString() {
        return "rtype";
    }

    public void setRtype(String rtype) {
        this.rtype = rtype == null ? null : rtype.trim();
    }

    public String getRgrade() {
        return rgrade;
    }

    public static String getRgradeColumnString() {
        return "rgrade";
    }

    public void setRgrade(String rgrade) {
        this.rgrade = rgrade == null ? null : rgrade.trim();
    }

    public String getRgDesc() {
        return rgDesc;
    }

    public static String getRgDescColumnString() {
        return "rgDesc";
    }

    public void setRgDesc(String rgDesc) {
        this.rgDesc = rgDesc == null ? null : rgDesc.trim();
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

    public String getKuuid() {
        return kuuid;
    }

    public static String getKuuidColumnString() {
        return "kuuid";
    }

    public void setKuuid(String kuuid) {
        this.kuuid = kuuid == null ? null : kuuid.trim();
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
        colStr += ", " + getOnameColumnString()+":"+getOname();
        colStr += ", " + getTitleColumnString()+":"+getTitle();
        colStr += ", " + getReventColumnString()+":"+getRevent();
        colStr += ", " + getRtypeColumnString()+":"+getRtype();
        colStr += ", " + getRgradeColumnString()+":"+getRgrade();
        colStr += ", " + getRgDescColumnString()+":"+getRgDesc();
        colStr += ", " + getOuuidColumnString()+":"+getOuuid();
        colStr += ", " + getKuuidColumnString()+":"+getKuuid();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
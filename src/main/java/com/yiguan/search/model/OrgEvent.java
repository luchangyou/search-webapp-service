package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class OrgEvent implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String oname;

    private String etitle;

    private String orgDesc;

    private String revent;

    private String rtype;

    private String rgrade;

    private String rgDesc;

    private String ouuid;

    private String euuid;

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

    public String getEtitle() {
        return etitle;
    }

    public static String getEtitleColumnString() {
        return "etitle";
    }

    public void setEtitle(String etitle) {
        this.etitle = etitle == null ? null : etitle.trim();
    }

    public String getOrgDesc() {
        return orgDesc;
    }

    public static String getOrgDescColumnString() {
        return "orgDesc";
    }

    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc == null ? null : orgDesc.trim();
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

    public String getEuuid() {
        return euuid;
    }

    public static String getEuuidColumnString() {
        return "euuid";
    }

    public void setEuuid(String euuid) {
        this.euuid = euuid == null ? null : euuid.trim();
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
        colStr += ", " + getEtitleColumnString()+":"+getEtitle();
        colStr += ", " + getOrgDescColumnString()+":"+getOrgDesc();
        colStr += ", " + getReventColumnString()+":"+getRevent();
        colStr += ", " + getRtypeColumnString()+":"+getRtype();
        colStr += ", " + getRgradeColumnString()+":"+getRgrade();
        colStr += ", " + getRgDescColumnString()+":"+getRgDesc();
        colStr += ", " + getOuuidColumnString()+":"+getOuuid();
        colStr += ", " + getEuuidColumnString()+":"+getEuuid();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class PerProduct implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String pname;

    private String rtype;

    private String rgrade;

    private String rpDesc;

    private String puuid;

    private String prUuid;

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

    public String getName() {
        return name;
    }

    public static String getNameColumnString() {
        return "name";
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getRpDesc() {
        return rpDesc;
    }

    public static String getRpDescColumnString() {
        return "rpDesc";
    }

    public void setRpDesc(String rpDesc) {
        this.rpDesc = rpDesc == null ? null : rpDesc.trim();
    }

    public String getPuuid() {
        return puuid;
    }

    public static String getPuuidColumnString() {
        return "puuid";
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid == null ? null : puuid.trim();
    }

    public String getPrUuid() {
        return prUuid;
    }

    public static String getPrUuidColumnString() {
        return "prUuid";
    }

    public void setPrUuid(String prUuid) {
        this.prUuid = prUuid == null ? null : prUuid.trim();
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
        colStr += ", " + getNameColumnString()+":"+getName();
        colStr += ", " + getPnameColumnString()+":"+getPname();
        colStr += ", " + getRtypeColumnString()+":"+getRtype();
        colStr += ", " + getRgradeColumnString()+":"+getRgrade();
        colStr += ", " + getRpDescColumnString()+":"+getRpDesc();
        colStr += ", " + getPuuidColumnString()+":"+getPuuid();
        colStr += ", " + getPrUuidColumnString()+":"+getPrUuid();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
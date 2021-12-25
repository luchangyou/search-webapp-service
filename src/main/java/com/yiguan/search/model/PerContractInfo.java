package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class PerContractInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String uuid;

    private String key;

    private String value;

    private String desc;

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

    public String getUuid() {
        return uuid;
    }

    public static String getUuidColumnString() {
        return "uuid";
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getKey() {
        return key;
    }

    public static String getKeyColumnString() {
        return "key";
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getValue() {
        return value;
    }

    public static String getValueColumnString() {
        return "value";
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getDesc() {
        return desc;
    }

    public static String getDescColumnString() {
        return "desc";
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
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
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getKeyColumnString()+":"+getKey();
        colStr += ", " + getValueColumnString()+":"+getValue();
        colStr += ", " + getDescColumnString()+":"+getDesc();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
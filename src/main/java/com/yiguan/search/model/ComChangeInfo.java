package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComChangeInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String changeTime;

    private String changeItem;

    private String beforeChange;

    private String afterChange;

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

    public String getChangeTime() {
        return changeTime;
    }

    public static String getChangeTimeColumnString() {
        return "changeTime";
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime == null ? null : changeTime.trim();
    }

    public String getChangeItem() {
        return changeItem;
    }

    public static String getChangeItemColumnString() {
        return "changeItem";
    }

    public void setChangeItem(String changeItem) {
        this.changeItem = changeItem == null ? null : changeItem.trim();
    }

    public String getBeforeChange() {
        return beforeChange;
    }

    public static String getBeforeChangeColumnString() {
        return "beforeChange";
    }

    public void setBeforeChange(String beforeChange) {
        this.beforeChange = beforeChange == null ? null : beforeChange.trim();
    }

    public String getAfterChange() {
        return afterChange;
    }

    public static String getAfterChangeColumnString() {
        return "afterChange";
    }

    public void setAfterChange(String afterChange) {
        this.afterChange = afterChange == null ? null : afterChange.trim();
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
        colStr += ", " + getChangeTimeColumnString()+":"+getChangeTime();
        colStr += ", " + getChangeItemColumnString()+":"+getChangeItem();
        colStr += ", " + getBeforeChangeColumnString()+":"+getBeforeChange();
        colStr += ", " + getAfterChangeColumnString()+":"+getAfterChange();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
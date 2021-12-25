package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComAbnormaloperation implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String inclusionDate;

    private String inclusionReason;

    private String decisionOrgan;

    private String removeDate;

    private String removeReason;

    private String removeOrgan;

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

    public String getInclusionDate() {
        return inclusionDate;
    }

    public static String getInclusionDateColumnString() {
        return "inclusionDate";
    }

    public void setInclusionDate(String inclusionDate) {
        this.inclusionDate = inclusionDate == null ? null : inclusionDate.trim();
    }

    public String getInclusionReason() {
        return inclusionReason;
    }

    public static String getInclusionReasonColumnString() {
        return "inclusionReason";
    }

    public void setInclusionReason(String inclusionReason) {
        this.inclusionReason = inclusionReason == null ? null : inclusionReason.trim();
    }

    public String getDecisionOrgan() {
        return decisionOrgan;
    }

    public static String getDecisionOrganColumnString() {
        return "decisionOrgan";
    }

    public void setDecisionOrgan(String decisionOrgan) {
        this.decisionOrgan = decisionOrgan == null ? null : decisionOrgan.trim();
    }

    public String getRemoveDate() {
        return removeDate;
    }

    public static String getRemoveDateColumnString() {
        return "removeDate";
    }

    public void setRemoveDate(String removeDate) {
        this.removeDate = removeDate == null ? null : removeDate.trim();
    }

    public String getRemoveReason() {
        return removeReason;
    }

    public static String getRemoveReasonColumnString() {
        return "removeReason";
    }

    public void setRemoveReason(String removeReason) {
        this.removeReason = removeReason == null ? null : removeReason.trim();
    }

    public String getRemoveOrgan() {
        return removeOrgan;
    }

    public static String getRemoveOrganColumnString() {
        return "removeOrgan";
    }

    public void setRemoveOrgan(String removeOrgan) {
        this.removeOrgan = removeOrgan == null ? null : removeOrgan.trim();
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
        colStr += ", " + getInclusionDateColumnString()+":"+getInclusionDate();
        colStr += ", " + getInclusionReasonColumnString()+":"+getInclusionReason();
        colStr += ", " + getDecisionOrganColumnString()+":"+getDecisionOrgan();
        colStr += ", " + getRemoveDateColumnString()+":"+getRemoveDate();
        colStr += ", " + getRemoveReasonColumnString()+":"+getRemoveReason();
        colStr += ", " + getRemoveOrganColumnString()+":"+getRemoveOrgan();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
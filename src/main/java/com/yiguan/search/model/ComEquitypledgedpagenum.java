package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComEquitypledgedpagenum implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String registrationDate;

    private String registrationNumber;

    private String state;

    private String amountPledgedstock;

    private String pledgor;

    private String pledgorNumber;

    private String pledgee;

    private String pledgeeNumber;

    private String remarks;

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

    public String getRegistrationDate() {
        return registrationDate;
    }

    public static String getRegistrationDateColumnString() {
        return "registrationDate";
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate == null ? null : registrationDate.trim();
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static String getRegistrationNumberColumnString() {
        return "registrationNumber";
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber == null ? null : registrationNumber.trim();
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

    public String getAmountPledgedstock() {
        return amountPledgedstock;
    }

    public static String getAmountPledgedstockColumnString() {
        return "amountPledgedstock";
    }

    public void setAmountPledgedstock(String amountPledgedstock) {
        this.amountPledgedstock = amountPledgedstock == null ? null : amountPledgedstock.trim();
    }

    public String getPledgor() {
        return pledgor;
    }

    public static String getPledgorColumnString() {
        return "pledgor";
    }

    public void setPledgor(String pledgor) {
        this.pledgor = pledgor == null ? null : pledgor.trim();
    }

    public String getPledgorNumber() {
        return pledgorNumber;
    }

    public static String getPledgorNumberColumnString() {
        return "pledgorNumber";
    }

    public void setPledgorNumber(String pledgorNumber) {
        this.pledgorNumber = pledgorNumber == null ? null : pledgorNumber.trim();
    }

    public String getPledgee() {
        return pledgee;
    }

    public static String getPledgeeColumnString() {
        return "pledgee";
    }

    public void setPledgee(String pledgee) {
        this.pledgee = pledgee == null ? null : pledgee.trim();
    }

    public String getPledgeeNumber() {
        return pledgeeNumber;
    }

    public static String getPledgeeNumberColumnString() {
        return "pledgeeNumber";
    }

    public void setPledgeeNumber(String pledgeeNumber) {
        this.pledgeeNumber = pledgeeNumber == null ? null : pledgeeNumber.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public static String getRemarksColumnString() {
        return "remarks";
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
        colStr += ", " + getRegistrationDateColumnString()+":"+getRegistrationDate();
        colStr += ", " + getRegistrationNumberColumnString()+":"+getRegistrationNumber();
        colStr += ", " + getStateColumnString()+":"+getState();
        colStr += ", " + getAmountPledgedstockColumnString()+":"+getAmountPledgedstock();
        colStr += ", " + getPledgorColumnString()+":"+getPledgor();
        colStr += ", " + getPledgorNumberColumnString()+":"+getPledgorNumber();
        colStr += ", " + getPledgeeColumnString()+":"+getPledgee();
        colStr += ", " + getPledgeeNumberColumnString()+":"+getPledgeeNumber();
        colStr += ", " + getRemarksColumnString()+":"+getRemarks();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
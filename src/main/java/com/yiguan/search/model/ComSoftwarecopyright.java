package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComSoftwarecopyright implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String softwarefullname;

    private String softwareshortname;

    private String registrationnumber;

    private String classificationnumber;

    private String versionnumber;

    private String copyrightowner;

    private String firstpublicationdata;

    private String registrationdata;

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

    public String getSoftwarefullname() {
        return softwarefullname;
    }

    public static String getSoftwarefullnameColumnString() {
        return "softwarefullname";
    }

    public void setSoftwarefullname(String softwarefullname) {
        this.softwarefullname = softwarefullname == null ? null : softwarefullname.trim();
    }

    public String getSoftwareshortname() {
        return softwareshortname;
    }

    public static String getSoftwareshortnameColumnString() {
        return "softwareshortname";
    }

    public void setSoftwareshortname(String softwareshortname) {
        this.softwareshortname = softwareshortname == null ? null : softwareshortname.trim();
    }

    public String getRegistrationnumber() {
        return registrationnumber;
    }

    public static String getRegistrationnumberColumnString() {
        return "registrationnumber";
    }

    public void setRegistrationnumber(String registrationnumber) {
        this.registrationnumber = registrationnumber == null ? null : registrationnumber.trim();
    }

    public String getClassificationnumber() {
        return classificationnumber;
    }

    public static String getClassificationnumberColumnString() {
        return "classificationnumber";
    }

    public void setClassificationnumber(String classificationnumber) {
        this.classificationnumber = classificationnumber == null ? null : classificationnumber.trim();
    }

    public String getVersionnumber() {
        return versionnumber;
    }

    public static String getVersionnumberColumnString() {
        return "versionnumber";
    }

    public void setVersionnumber(String versionnumber) {
        this.versionnumber = versionnumber == null ? null : versionnumber.trim();
    }

    public String getCopyrightowner() {
        return copyrightowner;
    }

    public static String getCopyrightownerColumnString() {
        return "copyrightowner";
    }

    public void setCopyrightowner(String copyrightowner) {
        this.copyrightowner = copyrightowner == null ? null : copyrightowner.trim();
    }

    public String getFirstpublicationdata() {
        return firstpublicationdata;
    }

    public static String getFirstpublicationdataColumnString() {
        return "firstpublicationdata";
    }

    public void setFirstpublicationdata(String firstpublicationdata) {
        this.firstpublicationdata = firstpublicationdata == null ? null : firstpublicationdata.trim();
    }

    public String getRegistrationdata() {
        return registrationdata;
    }

    public static String getRegistrationdataColumnString() {
        return "registrationdata";
    }

    public void setRegistrationdata(String registrationdata) {
        this.registrationdata = registrationdata == null ? null : registrationdata.trim();
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
        colStr += ", " + getSoftwarefullnameColumnString()+":"+getSoftwarefullname();
        colStr += ", " + getSoftwareshortnameColumnString()+":"+getSoftwareshortname();
        colStr += ", " + getRegistrationnumberColumnString()+":"+getRegistrationnumber();
        colStr += ", " + getClassificationnumberColumnString()+":"+getClassificationnumber();
        colStr += ", " + getVersionnumberColumnString()+":"+getVersionnumber();
        colStr += ", " + getCopyrightownerColumnString()+":"+getCopyrightowner();
        colStr += ", " + getFirstpublicationdataColumnString()+":"+getFirstpublicationdata();
        colStr += ", " + getRegistrationdataColumnString()+":"+getRegistrationdata();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}
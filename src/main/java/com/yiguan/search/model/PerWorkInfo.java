package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class PerWorkInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String oname;

    private String department;

    private String job;

    private String level;

    private String jobEarly;

    private String workTime;

    private String wtype;

    private String companyAddr;

    private String oph;

    private String income;

    private String wDesc;

    private String uuid;

    private Date ctime;

    private Date atime;

    private String startTime;

    private String endTime;

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

    public String getDepartment() {
        return department;
    }

    public static String getDepartmentColumnString() {
        return "department";
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getJob() {
        return job;
    }

    public static String getJobColumnString() {
        return "job";
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getLevel() {
        return level;
    }

    public static String getLevelColumnString() {
        return "level";
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getJobEarly() {
        return jobEarly;
    }

    public static String getJobEarlyColumnString() {
        return "jobEarly";
    }

    public void setJobEarly(String jobEarly) {
        this.jobEarly = jobEarly == null ? null : jobEarly.trim();
    }

    public String getWorkTime() {
        return workTime;
    }

    public static String getWorkTimeColumnString() {
        return "workTime";
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
    }

    public String getWtype() {
        return wtype;
    }

    public static String getWtypeColumnString() {
        return "wtype";
    }

    public void setWtype(String wtype) {
        this.wtype = wtype == null ? null : wtype.trim();
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public static String getCompanyAddrColumnString() {
        return "companyAddr";
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr == null ? null : companyAddr.trim();
    }

    public String getOph() {
        return oph;
    }

    public static String getOphColumnString() {
        return "oph";
    }

    public void setOph(String oph) {
        this.oph = oph == null ? null : oph.trim();
    }

    public String getIncome() {
        return income;
    }

    public static String getIncomeColumnString() {
        return "income";
    }

    public void setIncome(String income) {
        this.income = income == null ? null : income.trim();
    }

    public String getwDesc() {
        return wDesc;
    }

    public static String getwDescColumnString() {
        return "wDesc";
    }

    public void setwDesc(String wDesc) {
        this.wDesc = wDesc == null ? null : wDesc.trim();
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

    public String getStartTime() {
        return startTime;
    }

    public static String getStartTimeColumnString() {
        return "startTime";
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public static String getEndTimeColumnString() {
        return "endTime";
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getOnameColumnString()+":"+getOname();
        colStr += ", " + getDepartmentColumnString()+":"+getDepartment();
        colStr += ", " + getJobColumnString()+":"+getJob();
        colStr += ", " + getLevelColumnString()+":"+getLevel();
        colStr += ", " + getJobEarlyColumnString()+":"+getJobEarly();
        colStr += ", " + getWorkTimeColumnString()+":"+getWorkTime();
        colStr += ", " + getWtypeColumnString()+":"+getWtype();
        colStr += ", " + getCompanyAddrColumnString()+":"+getCompanyAddr();
        colStr += ", " + getOphColumnString()+":"+getOph();
        colStr += ", " + getIncomeColumnString()+":"+getIncome();
        colStr += ", " + getwDescColumnString()+":"+getwDesc();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        colStr += ", " + getStartTimeColumnString()+":"+getStartTime();
        colStr += ", " + getEndTimeColumnString()+":"+getEndTime();
        
        return clazzName + colStr + "]";
    }
}
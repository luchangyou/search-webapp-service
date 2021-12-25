package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class PerEducationInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String school;

    private String major;

    private String diploma;

    private String startDate;

    private String endDate;

    private String event;

    private String uuid;

    private Byte type;

    private String place;

    private Date ctime;

    private Date atime;

    private String endTime;

    private String startTime;

    public Long getId() {
        return id;
    }

    public static String getIdColumnString() {
        return "id";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public static String getSchoolColumnString() {
        return "school";
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMajor() {
        return major;
    }

    public static String getMajorColumnString() {
        return "major";
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getDiploma() {
        return diploma;
    }

    public static String getDiplomaColumnString() {
        return "diploma";
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma == null ? null : diploma.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public static String getStartDateColumnString() {
        return "startDate";
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public static String getEndDateColumnString() {
        return "endDate";
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getEvent() {
        return event;
    }

    public static String getEventColumnString() {
        return "event";
    }

    public void setEvent(String event) {
        this.event = event == null ? null : event.trim();
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

    public Byte getType() {
        return type;
    }

    public static String getTypeColumnString() {
        return "type";
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public static String getPlaceColumnString() {
        return "place";
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
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

    public String getEndTime() {
        return endTime;
    }

    public static String getEndTimeColumnString() {
        return "endTime";
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
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

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getSchoolColumnString()+":"+getSchool();
        colStr += ", " + getMajorColumnString()+":"+getMajor();
        colStr += ", " + getDiplomaColumnString()+":"+getDiploma();
        colStr += ", " + getStartDateColumnString()+":"+getStartDate();
        colStr += ", " + getEndDateColumnString()+":"+getEndDate();
        colStr += ", " + getEventColumnString()+":"+getEvent();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getTypeColumnString()+":"+getType();
        colStr += ", " + getPlaceColumnString()+":"+getPlace();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        colStr += ", " + getEndTimeColumnString()+":"+getEndTime();
        colStr += ", " + getStartTimeColumnString()+":"+getStartTime();
        
        return clazzName + colStr + "]";
    }
}
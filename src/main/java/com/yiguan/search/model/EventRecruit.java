package com.yiguan.search.model;

import java.io.Serializable;

public class EventRecruit implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String euuid;

    private String name;

    private String title;

    private String salary;

    private String domain;

    private String education;

    private String workexp;

    private String source;

    private String abs;

    public Integer getId() {
        return id;
    }

    public static String getIdColumnString() {
        return "id";
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public static String getNameColumnString() {
        return "name";
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getSalary() {
        return salary;
    }

    public static String getSalaryColumnString() {
        return "salary";
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public String getDomain() {
        return domain;
    }

    public static String getDomainColumnString() {
        return "domain";
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getEducation() {
        return education;
    }

    public static String getEducationColumnString() {
        return "education";
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getWorkexp() {
        return workexp;
    }

    public static String getWorkexpColumnString() {
        return "workexp";
    }

    public void setWorkexp(String workexp) {
        this.workexp = workexp == null ? null : workexp.trim();
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

    public String getAbs() {
        return abs;
    }

    public static String getAbsColumnString() {
        return "abs";
    }

    public void setAbs(String abs) {
        this.abs = abs == null ? null : abs.trim();
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getEuuidColumnString()+":"+getEuuid();
        colStr += ", " + getNameColumnString()+":"+getName();
        colStr += ", " + getTitleColumnString()+":"+getTitle();
        colStr += ", " + getSalaryColumnString()+":"+getSalary();
        colStr += ", " + getDomainColumnString()+":"+getDomain();
        colStr += ", " + getEducationColumnString()+":"+getEducation();
        colStr += ", " + getWorkexpColumnString()+":"+getWorkexp();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        colStr += ", " + getAbsColumnString()+":"+getAbs();
        
        return clazzName + colStr + "]";
    }
}
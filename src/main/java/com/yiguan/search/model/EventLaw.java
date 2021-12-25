package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class EventLaw implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String euuid;

    private String urllaw;

    private String title;

    private String court;

    private String type;

    private String caseid;

    private String related;

    private String urlwenshu;

    private String pulishtime;

    private String content;

    private Date ctime;

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

    public String getUrllaw() {
        return urllaw;
    }

    public static String getUrllawColumnString() {
        return "urllaw";
    }

    public void setUrllaw(String urllaw) {
        this.urllaw = urllaw == null ? null : urllaw.trim();
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

    public String getCourt() {
        return court;
    }

    public static String getCourtColumnString() {
        return "court";
    }

    public void setCourt(String court) {
        this.court = court == null ? null : court.trim();
    }

    public String getType() {
        return type;
    }

    public static String getTypeColumnString() {
        return "type";
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCaseid() {
        return caseid;
    }

    public static String getCaseidColumnString() {
        return "caseid";
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid == null ? null : caseid.trim();
    }

    public String getRelated() {
        return related;
    }

    public static String getRelatedColumnString() {
        return "related";
    }

    public void setRelated(String related) {
        this.related = related == null ? null : related.trim();
    }

    public String getUrlwenshu() {
        return urlwenshu;
    }

    public static String getUrlwenshuColumnString() {
        return "urlwenshu";
    }

    public void setUrlwenshu(String urlwenshu) {
        this.urlwenshu = urlwenshu == null ? null : urlwenshu.trim();
    }

    public String getPulishtime() {
        return pulishtime;
    }

    public static String getPulishtimeColumnString() {
        return "pulishtime";
    }

    public void setPulishtime(String pulishtime) {
        this.pulishtime = pulishtime == null ? null : pulishtime.trim();
    }

    public String getContent() {
        return content;
    }

    public static String getContentColumnString() {
        return "content";
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getEuuidColumnString()+":"+getEuuid();
        colStr += ", " + getUrllawColumnString()+":"+getUrllaw();
        colStr += ", " + getTitleColumnString()+":"+getTitle();
        colStr += ", " + getCourtColumnString()+":"+getCourt();
        colStr += ", " + getTypeColumnString()+":"+getType();
        colStr += ", " + getCaseidColumnString()+":"+getCaseid();
        colStr += ", " + getRelatedColumnString()+":"+getRelated();
        colStr += ", " + getUrlwenshuColumnString()+":"+getUrlwenshu();
        colStr += ", " + getPulishtimeColumnString()+":"+getPulishtime();
        colStr += ", " + getContentColumnString()+":"+getContent();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        
        return clazzName + colStr + "]";
    }
}
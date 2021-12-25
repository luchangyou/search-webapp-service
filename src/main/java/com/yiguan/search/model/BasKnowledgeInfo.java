package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class BasKnowledgeInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String uuid;

    private String author;

    private String title;

    private String cover;

    private String tag;

    private String main;

    private Date ptime;

    private String type;

    private Date ctime;

    private Date atime;

    private String url;

    private String source;

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

    public String getAuthor() {
        return author;
    }

    public static String getAuthorColumnString() {
        return "author";
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
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

    public String getCover() {
        return cover;
    }

    public static String getCoverColumnString() {
        return "cover";
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getTag() {
        return tag;
    }

    public static String getTagColumnString() {
        return "tag";
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getMain() {
        return main;
    }

    public static String getMainColumnString() {
        return "main";
    }

    public void setMain(String main) {
        this.main = main == null ? null : main.trim();
    }

    public Date getPtime() {
        return ptime;
    }

    public static String getPtimeColumnString() {
        return "ptime";
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
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

    public String getUrl() {
        return url;
    }

    public static String getUrlColumnString() {
        return "url";
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getAuthorColumnString()+":"+getAuthor();
        colStr += ", " + getTitleColumnString()+":"+getTitle();
        colStr += ", " + getCoverColumnString()+":"+getCover();
        colStr += ", " + getTagColumnString()+":"+getTag();
        colStr += ", " + getMainColumnString()+":"+getMain();
        colStr += ", " + getPtimeColumnString()+":"+getPtime();
        colStr += ", " + getTypeColumnString()+":"+getType();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        colStr += ", " + getUrlColumnString()+":"+getUrl();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        
        return clazzName + colStr + "]";
    }
}
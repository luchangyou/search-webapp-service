package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ProGameInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String gname;

    private String gename;

    private String logo;

    private String version;

    private String language;

    private Byte networkType;

    private String suitableAge;

    private String issueArea;

    private String publisher;

    private String gstyle;

    private String gtags;

    private String picture;

    private String viewpoint;

    private String engine;

    private String grade;

    private String dpprogress;

    private String gtheme;

    private String scale;

    private String pdemand;

    private String price;

    private String chargeMode;

    private String developCom;

    private String gDesc;

    private Date ptime;

    private Date betaTime;

    private Date testTime;

    private Date betatestTime;

    private Date setTime;

    private String web;

    private String url;

    private String source;

    private String uuid;

    private Date ctime;

    private Date atime;

    private String gamespy;

    private String operator;

    private String filmsTime;

    private String gameSize;

    private String webUpdateTime;

    private String downloadLink;

    private String packagename;

    private String gameUpdateTime;

    private String familysharing;

    private String supportwatch;

    private String supportwebsite;

    public Long getId() {
        return id;
    }

    public static String getIdColumnString() {
        return "id";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public static String getGnameColumnString() {
        return "gname";
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGename() {
        return gename;
    }

    public static String getGenameColumnString() {
        return "gename";
    }

    public void setGename(String gename) {
        this.gename = gename == null ? null : gename.trim();
    }

    public String getLogo() {
        return logo;
    }

    public static String getLogoColumnString() {
        return "logo";
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getVersion() {
        return version;
    }

    public static String getVersionColumnString() {
        return "version";
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getLanguage() {
        return language;
    }

    public static String getLanguageColumnString() {
        return "language";
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Byte getNetworkType() {
        return networkType;
    }

    public static String getNetworkTypeColumnString() {
        return "networkType";
    }

    public void setNetworkType(Byte networkType) {
        this.networkType = networkType;
    }

    public String getSuitableAge() {
        return suitableAge;
    }

    public static String getSuitableAgeColumnString() {
        return "suitableAge";
    }

    public void setSuitableAge(String suitableAge) {
        this.suitableAge = suitableAge == null ? null : suitableAge.trim();
    }

    public String getIssueArea() {
        return issueArea;
    }

    public static String getIssueAreaColumnString() {
        return "issueArea";
    }

    public void setIssueArea(String issueArea) {
        this.issueArea = issueArea == null ? null : issueArea.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public static String getPublisherColumnString() {
        return "publisher";
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getGstyle() {
        return gstyle;
    }

    public static String getGstyleColumnString() {
        return "gstyle";
    }

    public void setGstyle(String gstyle) {
        this.gstyle = gstyle == null ? null : gstyle.trim();
    }

    public String getGtags() {
        return gtags;
    }

    public static String getGtagsColumnString() {
        return "gtags";
    }

    public void setGtags(String gtags) {
        this.gtags = gtags == null ? null : gtags.trim();
    }

    public String getPicture() {
        return picture;
    }

    public static String getPictureColumnString() {
        return "picture";
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getViewpoint() {
        return viewpoint;
    }

    public static String getViewpointColumnString() {
        return "viewpoint";
    }

    public void setViewpoint(String viewpoint) {
        this.viewpoint = viewpoint == null ? null : viewpoint.trim();
    }

    public String getEngine() {
        return engine;
    }

    public static String getEngineColumnString() {
        return "engine";
    }

    public void setEngine(String engine) {
        this.engine = engine == null ? null : engine.trim();
    }

    public String getGrade() {
        return grade;
    }

    public static String getGradeColumnString() {
        return "grade";
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getDpprogress() {
        return dpprogress;
    }

    public static String getDpprogressColumnString() {
        return "dpprogress";
    }

    public void setDpprogress(String dpprogress) {
        this.dpprogress = dpprogress == null ? null : dpprogress.trim();
    }

    public String getGtheme() {
        return gtheme;
    }

    public static String getGthemeColumnString() {
        return "gtheme";
    }

    public void setGtheme(String gtheme) {
        this.gtheme = gtheme == null ? null : gtheme.trim();
    }

    public String getScale() {
        return scale;
    }

    public static String getScaleColumnString() {
        return "scale";
    }

    public void setScale(String scale) {
        this.scale = scale == null ? null : scale.trim();
    }

    public String getPdemand() {
        return pdemand;
    }

    public static String getPdemandColumnString() {
        return "pdemand";
    }

    public void setPdemand(String pdemand) {
        this.pdemand = pdemand == null ? null : pdemand.trim();
    }

    public String getPrice() {
        return price;
    }

    public static String getPriceColumnString() {
        return "price";
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getChargeMode() {
        return chargeMode;
    }

    public static String getChargeModeColumnString() {
        return "chargeMode";
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode == null ? null : chargeMode.trim();
    }

    public String getDevelopCom() {
        return developCom;
    }

    public static String getDevelopComColumnString() {
        return "developCom";
    }

    public void setDevelopCom(String developCom) {
        this.developCom = developCom == null ? null : developCom.trim();
    }

    public String getgDesc() {
        return gDesc;
    }

    public static String getgDescColumnString() {
        return "gDesc";
    }

    public void setgDesc(String gDesc) {
        this.gDesc = gDesc == null ? null : gDesc.trim();
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

    public Date getBetaTime() {
        return betaTime;
    }

    public static String getBetaTimeColumnString() {
        return "betaTime";
    }

    public void setBetaTime(Date betaTime) {
        this.betaTime = betaTime;
    }

    public Date getTestTime() {
        return testTime;
    }

    public static String getTestTimeColumnString() {
        return "testTime";
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    public Date getBetatestTime() {
        return betatestTime;
    }

    public static String getBetatestTimeColumnString() {
        return "betatestTime";
    }

    public void setBetatestTime(Date betatestTime) {
        this.betatestTime = betatestTime;
    }

    public Date getSetTime() {
        return setTime;
    }

    public static String getSetTimeColumnString() {
        return "setTime";
    }

    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    public String getWeb() {
        return web;
    }

    public static String getWebColumnString() {
        return "web";
    }

    public void setWeb(String web) {
        this.web = web == null ? null : web.trim();
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

    public String getGamespy() {
        return gamespy;
    }

    public static String getGamespyColumnString() {
        return "gamespy";
    }

    public void setGamespy(String gamespy) {
        this.gamespy = gamespy == null ? null : gamespy.trim();
    }

    public String getOperator() {
        return operator;
    }

    public static String getOperatorColumnString() {
        return "operator";
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getFilmsTime() {
        return filmsTime;
    }

    public static String getFilmsTimeColumnString() {
        return "filmsTime";
    }

    public void setFilmsTime(String filmsTime) {
        this.filmsTime = filmsTime == null ? null : filmsTime.trim();
    }

    public String getGameSize() {
        return gameSize;
    }

    public static String getGameSizeColumnString() {
        return "gameSize";
    }

    public void setGameSize(String gameSize) {
        this.gameSize = gameSize == null ? null : gameSize.trim();
    }

    public String getWebUpdateTime() {
        return webUpdateTime;
    }

    public static String getWebUpdateTimeColumnString() {
        return "webUpdateTime";
    }

    public void setWebUpdateTime(String webUpdateTime) {
        this.webUpdateTime = webUpdateTime == null ? null : webUpdateTime.trim();
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public static String getDownloadLinkColumnString() {
        return "downloadLink";
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink == null ? null : downloadLink.trim();
    }

    public String getPackagename() {
        return packagename;
    }

    public static String getPackagenameColumnString() {
        return "packagename";
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename == null ? null : packagename.trim();
    }

    public String getGameUpdateTime() {
        return gameUpdateTime;
    }

    public static String getGameUpdateTimeColumnString() {
        return "gameUpdateTime";
    }

    public void setGameUpdateTime(String gameUpdateTime) {
        this.gameUpdateTime = gameUpdateTime == null ? null : gameUpdateTime.trim();
    }

    public String getFamilysharing() {
        return familysharing;
    }

    public static String getFamilysharingColumnString() {
        return "familysharing";
    }

    public void setFamilysharing(String familysharing) {
        this.familysharing = familysharing == null ? null : familysharing.trim();
    }

    public String getSupportwatch() {
        return supportwatch;
    }

    public static String getSupportwatchColumnString() {
        return "supportwatch";
    }

    public void setSupportwatch(String supportwatch) {
        this.supportwatch = supportwatch == null ? null : supportwatch.trim();
    }

    public String getSupportwebsite() {
        return supportwebsite;
    }

    public static String getSupportwebsiteColumnString() {
        return "supportwebsite";
    }

    public void setSupportwebsite(String supportwebsite) {
        this.supportwebsite = supportwebsite == null ? null : supportwebsite.trim();
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getGnameColumnString()+":"+getGname();
        colStr += ", " + getGenameColumnString()+":"+getGename();
        colStr += ", " + getLogoColumnString()+":"+getLogo();
        colStr += ", " + getVersionColumnString()+":"+getVersion();
        colStr += ", " + getLanguageColumnString()+":"+getLanguage();
        colStr += ", " + getNetworkTypeColumnString()+":"+getNetworkType();
        colStr += ", " + getSuitableAgeColumnString()+":"+getSuitableAge();
        colStr += ", " + getIssueAreaColumnString()+":"+getIssueArea();
        colStr += ", " + getPublisherColumnString()+":"+getPublisher();
        colStr += ", " + getGstyleColumnString()+":"+getGstyle();
        colStr += ", " + getGtagsColumnString()+":"+getGtags();
        colStr += ", " + getPictureColumnString()+":"+getPicture();
        colStr += ", " + getViewpointColumnString()+":"+getViewpoint();
        colStr += ", " + getEngineColumnString()+":"+getEngine();
        colStr += ", " + getGradeColumnString()+":"+getGrade();
        colStr += ", " + getDpprogressColumnString()+":"+getDpprogress();
        colStr += ", " + getGthemeColumnString()+":"+getGtheme();
        colStr += ", " + getScaleColumnString()+":"+getScale();
        colStr += ", " + getPdemandColumnString()+":"+getPdemand();
        colStr += ", " + getPriceColumnString()+":"+getPrice();
        colStr += ", " + getChargeModeColumnString()+":"+getChargeMode();
        colStr += ", " + getDevelopComColumnString()+":"+getDevelopCom();
        colStr += ", " + getgDescColumnString()+":"+getgDesc();
        colStr += ", " + getPtimeColumnString()+":"+getPtime();
        colStr += ", " + getBetaTimeColumnString()+":"+getBetaTime();
        colStr += ", " + getTestTimeColumnString()+":"+getTestTime();
        colStr += ", " + getBetatestTimeColumnString()+":"+getBetatestTime();
        colStr += ", " + getSetTimeColumnString()+":"+getSetTime();
        colStr += ", " + getWebColumnString()+":"+getWeb();
        colStr += ", " + getUrlColumnString()+":"+getUrl();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        colStr += ", " + getGamespyColumnString()+":"+getGamespy();
        colStr += ", " + getOperatorColumnString()+":"+getOperator();
        colStr += ", " + getFilmsTimeColumnString()+":"+getFilmsTime();
        colStr += ", " + getGameSizeColumnString()+":"+getGameSize();
        colStr += ", " + getWebUpdateTimeColumnString()+":"+getWebUpdateTime();
        colStr += ", " + getDownloadLinkColumnString()+":"+getDownloadLink();
        colStr += ", " + getPackagenameColumnString()+":"+getPackagename();
        colStr += ", " + getGameUpdateTimeColumnString()+":"+getGameUpdateTime();
        colStr += ", " + getFamilysharingColumnString()+":"+getFamilysharing();
        colStr += ", " + getSupportwatchColumnString()+":"+getSupportwatch();
        colStr += ", " + getSupportwebsiteColumnString()+":"+getSupportwebsite();
        
        return clazzName + colStr + "]";
    }
}
package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class BasBusinessInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String cname;

    private String cnameOld;

    private String stockType;

    private String stockCode;

    private String telephone;

    private String email;

    private String web;

    private String adress;

    private String legalPersen;

    private String rcapital;

    private String state;

    private Date etime;

    private Date rtime;

    private String industry;

    private String rbnumber;

    private String enterpriseType;

    private String ocode;

    private String operationPeriod;

    private String rdepartment;

    private Date approvaDate;

    private String ucCode;

    private String radress;

    private String bscope;

    private String source;

    private String url;

    private Date ctime;

    private Date atime;

    private String lon;

    private String lat;

    private String province;

    private String city;

    private String county;

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

    public String getCname() {
        return cname;
    }

    public static String getCnameColumnString() {
        return "cname";
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCnameOld() {
        return cnameOld;
    }

    public static String getCnameOldColumnString() {
        return "cnameOld";
    }

    public void setCnameOld(String cnameOld) {
        this.cnameOld = cnameOld == null ? null : cnameOld.trim();
    }

    public String getStockType() {
        return stockType;
    }

    public static String getStockTypeColumnString() {
        return "stockType";
    }

    public void setStockType(String stockType) {
        this.stockType = stockType == null ? null : stockType.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public static String getStockCodeColumnString() {
        return "stockCode";
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public static String getTelephoneColumnString() {
        return "telephone";
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public static String getEmailColumnString() {
        return "email";
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    public String getAdress() {
        return adress;
    }

    public static String getAdressColumnString() {
        return "adress";
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getLegalPersen() {
        return legalPersen;
    }

    public static String getLegalPersenColumnString() {
        return "legalPersen";
    }

    public void setLegalPersen(String legalPersen) {
        this.legalPersen = legalPersen == null ? null : legalPersen.trim();
    }

    public String getRcapital() {
        return rcapital;
    }

    public static String getRcapitalColumnString() {
        return "rcapital";
    }

    public void setRcapital(String rcapital) {
        this.rcapital = rcapital == null ? null : rcapital.trim();
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

    public Date getEtime() {
        return etime;
    }

    public static String getEtimeColumnString() {
        return "etime";
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Date getRtime() {
        return rtime;
    }

    public static String getRtimeColumnString() {
        return "rtime";
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    public String getIndustry() {
        return industry;
    }

    public static String getIndustryColumnString() {
        return "industry";
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getRbnumber() {
        return rbnumber;
    }

    public static String getRbnumberColumnString() {
        return "rbnumber";
    }

    public void setRbnumber(String rbnumber) {
        this.rbnumber = rbnumber == null ? null : rbnumber.trim();
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public static String getEnterpriseTypeColumnString() {
        return "enterpriseType";
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType == null ? null : enterpriseType.trim();
    }

    public String getOcode() {
        return ocode;
    }

    public static String getOcodeColumnString() {
        return "ocode";
    }

    public void setOcode(String ocode) {
        this.ocode = ocode == null ? null : ocode.trim();
    }

    public String getOperationPeriod() {
        return operationPeriod;
    }

    public static String getOperationPeriodColumnString() {
        return "operationPeriod";
    }

    public void setOperationPeriod(String operationPeriod) {
        this.operationPeriod = operationPeriod == null ? null : operationPeriod.trim();
    }

    public String getRdepartment() {
        return rdepartment;
    }

    public static String getRdepartmentColumnString() {
        return "rdepartment";
    }

    public void setRdepartment(String rdepartment) {
        this.rdepartment = rdepartment == null ? null : rdepartment.trim();
    }

    public Date getApprovaDate() {
        return approvaDate;
    }

    public static String getApprovaDateColumnString() {
        return "approvaDate";
    }

    public void setApprovaDate(Date approvaDate) {
        this.approvaDate = approvaDate;
    }

    public String getUcCode() {
        return ucCode;
    }

    public static String getUcCodeColumnString() {
        return "ucCode";
    }

    public void setUcCode(String ucCode) {
        this.ucCode = ucCode == null ? null : ucCode.trim();
    }

    public String getRadress() {
        return radress;
    }

    public static String getRadressColumnString() {
        return "radress";
    }

    public void setRadress(String radress) {
        this.radress = radress == null ? null : radress.trim();
    }

    public String getBscope() {
        return bscope;
    }

    public static String getBscopeColumnString() {
        return "bscope";
    }

    public void setBscope(String bscope) {
        this.bscope = bscope == null ? null : bscope.trim();
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

    public String getUrl() {
        return url;
    }

    public static String getUrlColumnString() {
        return "url";
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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

    public String getLon() {
        return lon;
    }

    public static String getLonColumnString() {
        return "lon";
    }

    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    public String getLat() {
        return lat;
    }

    public static String getLatColumnString() {
        return "lat";
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getProvince() {
        return province;
    }

    public static String getProvinceColumnString() {
        return "province";
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public static String getCityColumnString() {
        return "city";
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public static String getCountyColumnString() {
        return "county";
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getBidColumnString()+":"+getBid();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getCnameColumnString()+":"+getCname();
        colStr += ", " + getCnameOldColumnString()+":"+getCnameOld();
        colStr += ", " + getStockTypeColumnString()+":"+getStockType();
        colStr += ", " + getStockCodeColumnString()+":"+getStockCode();
        colStr += ", " + getTelephoneColumnString()+":"+getTelephone();
        colStr += ", " + getEmailColumnString()+":"+getEmail();
        colStr += ", " + getWebColumnString()+":"+getWeb();
        colStr += ", " + getAdressColumnString()+":"+getAdress();
        colStr += ", " + getLegalPersenColumnString()+":"+getLegalPersen();
        colStr += ", " + getRcapitalColumnString()+":"+getRcapital();
        colStr += ", " + getStateColumnString()+":"+getState();
        colStr += ", " + getEtimeColumnString()+":"+getEtime();
        colStr += ", " + getRtimeColumnString()+":"+getRtime();
        colStr += ", " + getIndustryColumnString()+":"+getIndustry();
        colStr += ", " + getRbnumberColumnString()+":"+getRbnumber();
        colStr += ", " + getEnterpriseTypeColumnString()+":"+getEnterpriseType();
        colStr += ", " + getOcodeColumnString()+":"+getOcode();
        colStr += ", " + getOperationPeriodColumnString()+":"+getOperationPeriod();
        colStr += ", " + getRdepartmentColumnString()+":"+getRdepartment();
        colStr += ", " + getApprovaDateColumnString()+":"+getApprovaDate();
        colStr += ", " + getUcCodeColumnString()+":"+getUcCode();
        colStr += ", " + getRadressColumnString()+":"+getRadress();
        colStr += ", " + getBscopeColumnString()+":"+getBscope();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        colStr += ", " + getUrlColumnString()+":"+getUrl();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        colStr += ", " + getLonColumnString()+":"+getLon();
        colStr += ", " + getLatColumnString()+":"+getLat();
        colStr += ", " + getProvinceColumnString()+":"+getProvince();
        colStr += ", " + getCityColumnString()+":"+getCity();
        colStr += ", " + getCountyColumnString()+":"+getCounty();
        
        return clazzName + colStr + "]";
    }
}
package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class BasPersonInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String uuid;

    private String name;

    private String enname;

    private Short age;

    private String alias;

    private String hometown;

    private String country;

    private String nation;

    private String province;

    private String city;

    private String conWay;

    private String sex;

    private String idNumber;

    private Date birthday;

    private String householdRegister;

    private String liveplace;

    private Boolean maritalStatus;

    private Boolean employment;

    private String diploma;

    private String workYears;

    private Boolean childStatus;

    private String livePhoto;

    private String occuPhoto;

    private String artPhoto;

    private String ptag;

    private String pDesc;

    private String advantage;

    private Date lastuptime;

    private String source;

    private String url;

    private Date ctime;

    private Date atime;

    private Byte type;

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

    public String getName() {
        return name;
    }

    public static String getNameColumnString() {
        return "name";
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnname() {
        return enname;
    }

    public static String getEnnameColumnString() {
        return "enname";
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public Short getAge() {
        return age;
    }

    public static String getAgeColumnString() {
        return "age";
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getAlias() {
        return alias;
    }

    public static String getAliasColumnString() {
        return "alias";
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getHometown() {
        return hometown;
    }

    public static String getHometownColumnString() {
        return "hometown";
    }

    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }

    public String getCountry() {
        return country;
    }

    public static String getCountryColumnString() {
        return "country";
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getNation() {
        return nation;
    }

    public static String getNationColumnString() {
        return "nation";
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
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

    public String getConWay() {
        return conWay;
    }

    public static String getConWayColumnString() {
        return "conWay";
    }

    public void setConWay(String conWay) {
        this.conWay = conWay == null ? null : conWay.trim();
    }

    public String getSex() {
        return sex;
    }

    public static String getSexColumnString() {
        return "sex";
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public static String getIdNumberColumnString() {
        return "idNumber";
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public static String getBirthdayColumnString() {
        return "birthday";
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHouseholdRegister() {
        return householdRegister;
    }

    public static String getHouseholdRegisterColumnString() {
        return "householdRegister";
    }

    public void setHouseholdRegister(String householdRegister) {
        this.householdRegister = householdRegister == null ? null : householdRegister.trim();
    }

    public String getLiveplace() {
        return liveplace;
    }

    public static String getLiveplaceColumnString() {
        return "liveplace";
    }

    public void setLiveplace(String liveplace) {
        this.liveplace = liveplace == null ? null : liveplace.trim();
    }

    public Boolean getMaritalStatus() {
        return maritalStatus;
    }

    public static String getMaritalStatusColumnString() {
        return "maritalStatus";
    }

    public void setMaritalStatus(Boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Boolean getEmployment() {
        return employment;
    }

    public static String getEmploymentColumnString() {
        return "employment";
    }

    public void setEmployment(Boolean employment) {
        this.employment = employment;
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

    public String getWorkYears() {
        return workYears;
    }

    public static String getWorkYearsColumnString() {
        return "workYears";
    }

    public void setWorkYears(String workYears) {
        this.workYears = workYears == null ? null : workYears.trim();
    }

    public Boolean getChildStatus() {
        return childStatus;
    }

    public static String getChildStatusColumnString() {
        return "childStatus";
    }

    public void setChildStatus(Boolean childStatus) {
        this.childStatus = childStatus;
    }

    public String getLivePhoto() {
        return livePhoto;
    }

    public static String getLivePhotoColumnString() {
        return "livePhoto";
    }

    public void setLivePhoto(String livePhoto) {
        this.livePhoto = livePhoto == null ? null : livePhoto.trim();
    }

    public String getOccuPhoto() {
        return occuPhoto;
    }

    public static String getOccuPhotoColumnString() {
        return "occuPhoto";
    }

    public void setOccuPhoto(String occuPhoto) {
        this.occuPhoto = occuPhoto == null ? null : occuPhoto.trim();
    }

    public String getArtPhoto() {
        return artPhoto;
    }

    public static String getArtPhotoColumnString() {
        return "artPhoto";
    }

    public void setArtPhoto(String artPhoto) {
        this.artPhoto = artPhoto == null ? null : artPhoto.trim();
    }

    public String getPtag() {
        return ptag;
    }

    public static String getPtagColumnString() {
        return "ptag";
    }

    public void setPtag(String ptag) {
        this.ptag = ptag == null ? null : ptag.trim();
    }

    public String getpDesc() {
        return pDesc;
    }

    public static String getpDescColumnString() {
        return "pDesc";
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc == null ? null : pDesc.trim();
    }

    public String getAdvantage() {
        return advantage;
    }

    public static String getAdvantageColumnString() {
        return "advantage";
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage == null ? null : advantage.trim();
    }

    public Date getLastuptime() {
        return lastuptime;
    }

    public static String getLastuptimeColumnString() {
        return "lastuptime";
    }

    public void setLastuptime(Date lastuptime) {
        this.lastuptime = lastuptime;
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

    public Byte getType() {
        return type;
    }

    public static String getTypeColumnString() {
        return "type";
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getNameColumnString()+":"+getName();
        colStr += ", " + getEnnameColumnString()+":"+getEnname();
        colStr += ", " + getAgeColumnString()+":"+getAge();
        colStr += ", " + getAliasColumnString()+":"+getAlias();
        colStr += ", " + getHometownColumnString()+":"+getHometown();
        colStr += ", " + getCountryColumnString()+":"+getCountry();
        colStr += ", " + getNationColumnString()+":"+getNation();
        colStr += ", " + getProvinceColumnString()+":"+getProvince();
        colStr += ", " + getCityColumnString()+":"+getCity();
        colStr += ", " + getConWayColumnString()+":"+getConWay();
        colStr += ", " + getSexColumnString()+":"+getSex();
        colStr += ", " + getIdNumberColumnString()+":"+getIdNumber();
        colStr += ", " + getBirthdayColumnString()+":"+getBirthday();
        colStr += ", " + getHouseholdRegisterColumnString()+":"+getHouseholdRegister();
        colStr += ", " + getLiveplaceColumnString()+":"+getLiveplace();
        colStr += ", " + getMaritalStatusColumnString()+":"+getMaritalStatus();
        colStr += ", " + getEmploymentColumnString()+":"+getEmployment();
        colStr += ", " + getDiplomaColumnString()+":"+getDiploma();
        colStr += ", " + getWorkYearsColumnString()+":"+getWorkYears();
        colStr += ", " + getChildStatusColumnString()+":"+getChildStatus();
        colStr += ", " + getLivePhotoColumnString()+":"+getLivePhoto();
        colStr += ", " + getOccuPhotoColumnString()+":"+getOccuPhoto();
        colStr += ", " + getArtPhotoColumnString()+":"+getArtPhoto();
        colStr += ", " + getPtagColumnString()+":"+getPtag();
        colStr += ", " + getpDescColumnString()+":"+getpDesc();
        colStr += ", " + getAdvantageColumnString()+":"+getAdvantage();
        colStr += ", " + getLastuptimeColumnString()+":"+getLastuptime();
        colStr += ", " + getSourceColumnString()+":"+getSource();
        colStr += ", " + getUrlColumnString()+":"+getUrl();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        colStr += ", " + getTypeColumnString()+":"+getType();
        
        return clazzName + colStr + "]";
    }
}
package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComShareholder implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String name;

    private String investment;

    private String adress;

    private String web;

    private Date ctime;

    private Date atime;

    private String investmentRate;

    private String subscriptionAmount;

    private String subscribedCapitalContribution;

    private String paidinAmount;

    private String subscriptionTime;

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

    public String getName() {
        return name;
    }

    public static String getNameColumnString() {
        return "name";
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getInvestment() {
        return investment;
    }

    public static String getInvestmentColumnString() {
        return "investment";
    }

    public void setInvestment(String investment) {
        this.investment = investment == null ? null : investment.trim();
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

    public String getWeb() {
        return web;
    }

    public static String getWebColumnString() {
        return "web";
    }

    public void setWeb(String web) {
        this.web = web == null ? null : web.trim();
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

    public String getInvestmentRate() {
        return investmentRate;
    }

    public static String getInvestmentRateColumnString() {
        return "investmentRate";
    }

    public void setInvestmentRate(String investmentRate) {
        this.investmentRate = investmentRate == null ? null : investmentRate.trim();
    }

    public String getSubscriptionAmount() {
        return subscriptionAmount;
    }

    public static String getSubscriptionAmountColumnString() {
        return "subscriptionAmount";
    }

    public void setSubscriptionAmount(String subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount == null ? null : subscriptionAmount.trim();
    }

    public String getSubscribedCapitalContribution() {
        return subscribedCapitalContribution;
    }

    public static String getSubscribedCapitalContributionColumnString() {
        return "subscribedCapitalContribution";
    }

    public void setSubscribedCapitalContribution(String subscribedCapitalContribution) {
        this.subscribedCapitalContribution = subscribedCapitalContribution == null ? null : subscribedCapitalContribution.trim();
    }

    public String getPaidinAmount() {
        return paidinAmount;
    }

    public static String getPaidinAmountColumnString() {
        return "paidinAmount";
    }

    public void setPaidinAmount(String paidinAmount) {
        this.paidinAmount = paidinAmount == null ? null : paidinAmount.trim();
    }

    public String getSubscriptionTime() {
        return subscriptionTime;
    }

    public static String getSubscriptionTimeColumnString() {
        return "subscriptionTime";
    }

    public void setSubscriptionTime(String subscriptionTime) {
        this.subscriptionTime = subscriptionTime == null ? null : subscriptionTime.trim();
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getBidColumnString()+":"+getBid();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getNameColumnString()+":"+getName();
        colStr += ", " + getInvestmentColumnString()+":"+getInvestment();
        colStr += ", " + getAdressColumnString()+":"+getAdress();
        colStr += ", " + getWebColumnString()+":"+getWeb();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        colStr += ", " + getInvestmentRateColumnString()+":"+getInvestmentRate();
        colStr += ", " + getSubscriptionAmountColumnString()+":"+getSubscriptionAmount();
        colStr += ", " + getSubscribedCapitalContributionColumnString()+":"+getSubscribedCapitalContribution();
        colStr += ", " + getPaidinAmountColumnString()+":"+getPaidinAmount();
        colStr += ", " + getSubscriptionTimeColumnString()+":"+getSubscriptionTime();
        
        return clazzName + colStr + "]";
    }
}
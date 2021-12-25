package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class ComShareholderTeam implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bid;

    private String uuid;

    private String oname;

    private String legalPersen;

    private String industry;

    private String state;

    private String investment;

    private String web;

    private Date ctime;

    private Date atime;

    private String investmentRate;

    private String subscriptionTime;

    private String initiatorType;

    private String identificationNumber;

    private String documentType;

    private String subscriptionAmount;

    private String subscribedCapitalContribution;

    private String paidinAmount;

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

    public String getOname() {
        return oname;
    }

    public static String getOnameColumnString() {
        return "oname";
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
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

    public String getIndustry() {
        return industry;
    }

    public static String getIndustryColumnString() {
        return "industry";
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
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

    public String getInvestment() {
        return investment;
    }

    public static String getInvestmentColumnString() {
        return "investment";
    }

    public void setInvestment(String investment) {
        this.investment = investment == null ? null : investment.trim();
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

    public String getSubscriptionTime() {
        return subscriptionTime;
    }

    public static String getSubscriptionTimeColumnString() {
        return "subscriptionTime";
    }

    public void setSubscriptionTime(String subscriptionTime) {
        this.subscriptionTime = subscriptionTime == null ? null : subscriptionTime.trim();
    }

    public String getInitiatorType() {
        return initiatorType;
    }

    public static String getInitiatorTypeColumnString() {
        return "initiatorType";
    }

    public void setInitiatorType(String initiatorType) {
        this.initiatorType = initiatorType == null ? null : initiatorType.trim();
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public static String getIdentificationNumberColumnString() {
        return "identificationNumber";
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber == null ? null : identificationNumber.trim();
    }

    public String getDocumentType() {
        return documentType;
    }

    public static String getDocumentTypeColumnString() {
        return "documentType";
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType == null ? null : documentType.trim();
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

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getBidColumnString()+":"+getBid();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getOnameColumnString()+":"+getOname();
        colStr += ", " + getLegalPersenColumnString()+":"+getLegalPersen();
        colStr += ", " + getIndustryColumnString()+":"+getIndustry();
        colStr += ", " + getStateColumnString()+":"+getState();
        colStr += ", " + getInvestmentColumnString()+":"+getInvestment();
        colStr += ", " + getWebColumnString()+":"+getWeb();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        colStr += ", " + getInvestmentRateColumnString()+":"+getInvestmentRate();
        colStr += ", " + getSubscriptionTimeColumnString()+":"+getSubscriptionTime();
        colStr += ", " + getInitiatorTypeColumnString()+":"+getInitiatorType();
        colStr += ", " + getIdentificationNumberColumnString()+":"+getIdentificationNumber();
        colStr += ", " + getDocumentTypeColumnString()+":"+getDocumentType();
        colStr += ", " + getSubscriptionAmountColumnString()+":"+getSubscriptionAmount();
        colStr += ", " + getSubscribedCapitalContributionColumnString()+":"+getSubscribedCapitalContribution();
        colStr += ", " + getPaidinAmountColumnString()+":"+getPaidinAmount();
        
        return clazzName + colStr + "]";
    }
}
package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComShareholderTeamExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public ComShareholderTeamExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setGroupByClause(String groupByClause) {
        this.groupByClause = groupByClause;
    }

    public String getGroupByClause() {
        return groupByClause;
    }

    public List<String> getGroupConcatList() {
        return groupConcatList;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<String> getColumnFilterList() {
        return columnFilterList;
    }

    public void setColumnFilterList(List<String> columnFilterList) {
        this.columnFilterList = columnFilterList;
    }

    public ComShareholderTeamExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public ComShareholderTeamExample needBid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("bid");
        
        return this;
    }

    public ComShareholderTeamExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public ComShareholderTeamExample needOname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("oname");
        
        return this;
    }

    public ComShareholderTeamExample needLegalPersen() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("legal_persen");
        
        return this;
    }

    public ComShareholderTeamExample needIndustry() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("industry");
        
        return this;
    }

    public ComShareholderTeamExample needState() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("state");
        
        return this;
    }

    public ComShareholderTeamExample needInvestment() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("investment");
        
        return this;
    }

    public ComShareholderTeamExample needWeb() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("web");
        
        return this;
    }

    public ComShareholderTeamExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public ComShareholderTeamExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public ComShareholderTeamExample needInvestmentRate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("investment_rate");
        
        return this;
    }

    public ComShareholderTeamExample needSubscriptionTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("subscription_time");
        
        return this;
    }

    public ComShareholderTeamExample needInitiatorType() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("initiator_type");
        
        return this;
    }

    public ComShareholderTeamExample needIdentificationNumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("identification_number");
        
        return this;
    }

    public ComShareholderTeamExample needDocumentType() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("document_type");
        
        return this;
    }

    public ComShareholderTeamExample needSubscriptionAmount() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("subscription_amount");
        
        return this;
    }

    public ComShareholderTeamExample needSubscribedCapitalContribution() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("subscribed_capital_contribution");
        
        return this;
    }

    public ComShareholderTeamExample needPaidinAmount() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("paidin_amount");
        
        return this;
    }

    public ComShareholderTeamExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByBid(String type) {
        if(orderByClause == null){
            orderByClause = "bid " + type;
        }
        else{
            orderByClause += " ,bid " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByOname(String type) {
        if(orderByClause == null){
            orderByClause = "oname " + type;
        }
        else{
            orderByClause += " ,oname " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByLegalPersen(String type) {
        if(orderByClause == null){
            orderByClause = "legal_persen " + type;
        }
        else{
            orderByClause += " ,legal_persen " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByIndustry(String type) {
        if(orderByClause == null){
            orderByClause = "industry " + type;
        }
        else{
            orderByClause += " ,industry " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByState(String type) {
        if(orderByClause == null){
            orderByClause = "state " + type;
        }
        else{
            orderByClause += " ,state " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByInvestment(String type) {
        if(orderByClause == null){
            orderByClause = "investment " + type;
        }
        else{
            orderByClause += " ,investment " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByWeb(String type) {
        if(orderByClause == null){
            orderByClause = "web " + type;
        }
        else{
            orderByClause += " ,web " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByInvestmentRate(String type) {
        if(orderByClause == null){
            orderByClause = "investment_rate " + type;
        }
        else{
            orderByClause += " ,investment_rate " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderBySubscriptionTime(String type) {
        if(orderByClause == null){
            orderByClause = "subscription_time " + type;
        }
        else{
            orderByClause += " ,subscription_time " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByInitiatorType(String type) {
        if(orderByClause == null){
            orderByClause = "initiator_type " + type;
        }
        else{
            orderByClause += " ,initiator_type " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByIdentificationNumber(String type) {
        if(orderByClause == null){
            orderByClause = "identification_number " + type;
        }
        else{
            orderByClause += " ,identification_number " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByDocumentType(String type) {
        if(orderByClause == null){
            orderByClause = "document_type " + type;
        }
        else{
            orderByClause += " ,document_type " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderBySubscriptionAmount(String type) {
        if(orderByClause == null){
            orderByClause = "subscription_amount " + type;
        }
        else{
            orderByClause += " ,subscription_amount " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderBySubscribedCapitalContribution(String type) {
        if(orderByClause == null){
            orderByClause = "subscribed_capital_contribution " + type;
        }
        else{
            orderByClause += " ,subscribed_capital_contribution " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample orderByPaidinAmount(String type) {
        if(orderByClause == null){
            orderByClause = "paidin_amount " + type;
        }
        else{
            orderByClause += " ,paidin_amount " + type;
        }
        
        return this;
    }

    public ComShareholderTeamExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByBid() {
        if(groupByClause == null){
            groupByClause = "bid ";
        }
        else{
            groupByClause += " ,bid ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByOname() {
        if(groupByClause == null){
            groupByClause = "oname ";
        }
        else{
            groupByClause += " ,oname ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByLegalPersen() {
        if(groupByClause == null){
            groupByClause = "legal_persen ";
        }
        else{
            groupByClause += " ,legal_persen ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByIndustry() {
        if(groupByClause == null){
            groupByClause = "industry ";
        }
        else{
            groupByClause += " ,industry ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByState() {
        if(groupByClause == null){
            groupByClause = "state ";
        }
        else{
            groupByClause += " ,state ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByInvestment() {
        if(groupByClause == null){
            groupByClause = "investment ";
        }
        else{
            groupByClause += " ,investment ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByWeb() {
        if(groupByClause == null){
            groupByClause = "web ";
        }
        else{
            groupByClause += " ,web ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByInvestmentRate() {
        if(groupByClause == null){
            groupByClause = "investment_rate ";
        }
        else{
            groupByClause += " ,investment_rate ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupBySubscriptionTime() {
        if(groupByClause == null){
            groupByClause = "subscription_time ";
        }
        else{
            groupByClause += " ,subscription_time ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByInitiatorType() {
        if(groupByClause == null){
            groupByClause = "initiator_type ";
        }
        else{
            groupByClause += " ,initiator_type ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByIdentificationNumber() {
        if(groupByClause == null){
            groupByClause = "identification_number ";
        }
        else{
            groupByClause += " ,identification_number ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByDocumentType() {
        if(groupByClause == null){
            groupByClause = "document_type ";
        }
        else{
            groupByClause += " ,document_type ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupBySubscriptionAmount() {
        if(groupByClause == null){
            groupByClause = "subscription_amount ";
        }
        else{
            groupByClause += " ,subscription_amount ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupBySubscribedCapitalContribution() {
        if(groupByClause == null){
            groupByClause = "subscribed_capital_contribution ";
        }
        else{
            groupByClause += " ,subscribed_capital_contribution ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupByPaidinAmount() {
        if(groupByClause == null){
            groupByClause = "paidin_amount ";
        }
        else{
            groupByClause += " ,paidin_amount ";
        }
        
        return this;
    }

    public ComShareholderTeamExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public ComShareholderTeamExample groupConcatBid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(bid SEPARATOR \'|\') as bid");
        return this;
    }

    public ComShareholderTeamExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public ComShareholderTeamExample groupConcatOname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(oname SEPARATOR \'|\') as oname");
        return this;
    }

    public ComShareholderTeamExample groupConcatLegalPersen() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(legal_persen SEPARATOR \'|\') as legal_persen");
        return this;
    }

    public ComShareholderTeamExample groupConcatIndustry() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(industry SEPARATOR \'|\') as industry");
        return this;
    }

    public ComShareholderTeamExample groupConcatState() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(state SEPARATOR \'|\') as state");
        return this;
    }

    public ComShareholderTeamExample groupConcatInvestment() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(investment SEPARATOR \'|\') as investment");
        return this;
    }

    public ComShareholderTeamExample groupConcatWeb() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(web SEPARATOR \'|\') as web");
        return this;
    }

    public ComShareholderTeamExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public ComShareholderTeamExample groupConcatAtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(atime SEPARATOR \'|\') as atime");
        return this;
    }

    public ComShareholderTeamExample groupConcatInvestmentRate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(investment_rate SEPARATOR \'|\') as investment_rate");
        return this;
    }

    public ComShareholderTeamExample groupConcatSubscriptionTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(subscription_time SEPARATOR \'|\') as subscription_time");
        return this;
    }

    public ComShareholderTeamExample groupConcatInitiatorType() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(initiator_type SEPARATOR \'|\') as initiator_type");
        return this;
    }

    public ComShareholderTeamExample groupConcatIdentificationNumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(identification_number SEPARATOR \'|\') as identification_number");
        return this;
    }

    public ComShareholderTeamExample groupConcatDocumentType() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(document_type SEPARATOR \'|\') as document_type");
        return this;
    }

    public ComShareholderTeamExample groupConcatSubscriptionAmount() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(subscription_amount SEPARATOR \'|\') as subscription_amount");
        return this;
    }

    public ComShareholderTeamExample groupConcatSubscribedCapitalContribution() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(subscribed_capital_contribution SEPARATOR \'|\') as subscribed_capital_contribution");
        return this;
    }

    public ComShareholderTeamExample groupConcatPaidinAmount() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(paidin_amount SEPARATOR \'|\') as paidin_amount");
        return this;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andOnameIsNull() {
            addCriterion("oname is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oname is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oname =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oname <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oname >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oname >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oname <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oname <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oname like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oname not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oname in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oname not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oname between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oname not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andLegalPersenIsNull() {
            addCriterion("legal_persen is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersenIsNotNull() {
            addCriterion("legal_persen is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersenEqualTo(String value) {
            addCriterion("legal_persen =", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenNotEqualTo(String value) {
            addCriterion("legal_persen <>", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenGreaterThan(String value) {
            addCriterion("legal_persen >", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenGreaterThanOrEqualTo(String value) {
            addCriterion("legal_persen >=", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenLessThan(String value) {
            addCriterion("legal_persen <", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenLessThanOrEqualTo(String value) {
            addCriterion("legal_persen <=", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenLike(String value) {
            addCriterion("legal_persen like", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenNotLike(String value) {
            addCriterion("legal_persen not like", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenIn(List<String> values) {
            addCriterion("legal_persen in", values, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenNotIn(List<String> values) {
            addCriterion("legal_persen not in", values, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenBetween(String value1, String value2) {
            addCriterion("legal_persen between", value1, value2, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenNotBetween(String value1, String value2) {
            addCriterion("legal_persen not between", value1, value2, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andInvestmentIsNull() {
            addCriterion("investment is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentIsNotNull() {
            addCriterion("investment is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentEqualTo(String value) {
            addCriterion("investment =", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotEqualTo(String value) {
            addCriterion("investment <>", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentGreaterThan(String value) {
            addCriterion("investment >", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentGreaterThanOrEqualTo(String value) {
            addCriterion("investment >=", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentLessThan(String value) {
            addCriterion("investment <", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentLessThanOrEqualTo(String value) {
            addCriterion("investment <=", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentLike(String value) {
            addCriterion("investment like", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotLike(String value) {
            addCriterion("investment not like", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentIn(List<String> values) {
            addCriterion("investment in", values, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotIn(List<String> values) {
            addCriterion("investment not in", values, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentBetween(String value1, String value2) {
            addCriterion("investment between", value1, value2, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotBetween(String value1, String value2) {
            addCriterion("investment not between", value1, value2, "investment");
            return (Criteria) this;
        }

        public Criteria andWebIsNull() {
            addCriterion("web is null");
            return (Criteria) this;
        }

        public Criteria andWebIsNotNull() {
            addCriterion("web is not null");
            return (Criteria) this;
        }

        public Criteria andWebEqualTo(String value) {
            addCriterion("web =", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotEqualTo(String value) {
            addCriterion("web <>", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThan(String value) {
            addCriterion("web >", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThanOrEqualTo(String value) {
            addCriterion("web >=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThan(String value) {
            addCriterion("web <", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThanOrEqualTo(String value) {
            addCriterion("web <=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLike(String value) {
            addCriterion("web like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotLike(String value) {
            addCriterion("web not like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebIn(List<String> values) {
            addCriterion("web in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotIn(List<String> values) {
            addCriterion("web not in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebBetween(String value1, String value2) {
            addCriterion("web between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotBetween(String value1, String value2) {
            addCriterion("web not between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNull() {
            addCriterion("atime is null");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNotNull() {
            addCriterion("atime is not null");
            return (Criteria) this;
        }

        public Criteria andAtimeEqualTo(Date value) {
            addCriterion("atime =", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotEqualTo(Date value) {
            addCriterion("atime <>", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThan(Date value) {
            addCriterion("atime >", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("atime >=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThan(Date value) {
            addCriterion("atime <", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThanOrEqualTo(Date value) {
            addCriterion("atime <=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeIn(List<Date> values) {
            addCriterion("atime in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotIn(List<Date> values) {
            addCriterion("atime not in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeBetween(Date value1, Date value2) {
            addCriterion("atime between", value1, value2, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotBetween(Date value1, Date value2) {
            addCriterion("atime not between", value1, value2, "atime");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateIsNull() {
            addCriterion("investment_rate is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateIsNotNull() {
            addCriterion("investment_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateEqualTo(String value) {
            addCriterion("investment_rate =", value, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateNotEqualTo(String value) {
            addCriterion("investment_rate <>", value, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateGreaterThan(String value) {
            addCriterion("investment_rate >", value, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateGreaterThanOrEqualTo(String value) {
            addCriterion("investment_rate >=", value, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateLessThan(String value) {
            addCriterion("investment_rate <", value, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateLessThanOrEqualTo(String value) {
            addCriterion("investment_rate <=", value, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateLike(String value) {
            addCriterion("investment_rate like", value, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateNotLike(String value) {
            addCriterion("investment_rate not like", value, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateIn(List<String> values) {
            addCriterion("investment_rate in", values, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateNotIn(List<String> values) {
            addCriterion("investment_rate not in", values, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateBetween(String value1, String value2) {
            addCriterion("investment_rate between", value1, value2, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentRateNotBetween(String value1, String value2) {
            addCriterion("investment_rate not between", value1, value2, "investmentRate");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeIsNull() {
            addCriterion("subscription_time is null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeIsNotNull() {
            addCriterion("subscription_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeEqualTo(String value) {
            addCriterion("subscription_time =", value, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeNotEqualTo(String value) {
            addCriterion("subscription_time <>", value, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeGreaterThan(String value) {
            addCriterion("subscription_time >", value, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("subscription_time >=", value, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeLessThan(String value) {
            addCriterion("subscription_time <", value, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeLessThanOrEqualTo(String value) {
            addCriterion("subscription_time <=", value, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeLike(String value) {
            addCriterion("subscription_time like", value, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeNotLike(String value) {
            addCriterion("subscription_time not like", value, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeIn(List<String> values) {
            addCriterion("subscription_time in", values, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeNotIn(List<String> values) {
            addCriterion("subscription_time not in", values, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeBetween(String value1, String value2) {
            addCriterion("subscription_time between", value1, value2, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTimeNotBetween(String value1, String value2) {
            addCriterion("subscription_time not between", value1, value2, "subscriptionTime");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeIsNull() {
            addCriterion("initiator_type is null");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeIsNotNull() {
            addCriterion("initiator_type is not null");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeEqualTo(String value) {
            addCriterion("initiator_type =", value, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeNotEqualTo(String value) {
            addCriterion("initiator_type <>", value, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeGreaterThan(String value) {
            addCriterion("initiator_type >", value, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("initiator_type >=", value, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeLessThan(String value) {
            addCriterion("initiator_type <", value, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeLessThanOrEqualTo(String value) {
            addCriterion("initiator_type <=", value, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeLike(String value) {
            addCriterion("initiator_type like", value, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeNotLike(String value) {
            addCriterion("initiator_type not like", value, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeIn(List<String> values) {
            addCriterion("initiator_type in", values, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeNotIn(List<String> values) {
            addCriterion("initiator_type not in", values, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeBetween(String value1, String value2) {
            addCriterion("initiator_type between", value1, value2, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andInitiatorTypeNotBetween(String value1, String value2) {
            addCriterion("initiator_type not between", value1, value2, "initiatorType");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberIsNull() {
            addCriterion("identification_number is null");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberIsNotNull() {
            addCriterion("identification_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberEqualTo(String value) {
            addCriterion("identification_number =", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberNotEqualTo(String value) {
            addCriterion("identification_number <>", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberGreaterThan(String value) {
            addCriterion("identification_number >", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("identification_number >=", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberLessThan(String value) {
            addCriterion("identification_number <", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberLessThanOrEqualTo(String value) {
            addCriterion("identification_number <=", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberLike(String value) {
            addCriterion("identification_number like", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberNotLike(String value) {
            addCriterion("identification_number not like", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberIn(List<String> values) {
            addCriterion("identification_number in", values, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberNotIn(List<String> values) {
            addCriterion("identification_number not in", values, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberBetween(String value1, String value2) {
            addCriterion("identification_number between", value1, value2, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberNotBetween(String value1, String value2) {
            addCriterion("identification_number not between", value1, value2, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNull() {
            addCriterion("document_type is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNotNull() {
            addCriterion("document_type is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeEqualTo(String value) {
            addCriterion("document_type =", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotEqualTo(String value) {
            addCriterion("document_type <>", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThan(String value) {
            addCriterion("document_type >", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("document_type >=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThan(String value) {
            addCriterion("document_type <", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThanOrEqualTo(String value) {
            addCriterion("document_type <=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLike(String value) {
            addCriterion("document_type like", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotLike(String value) {
            addCriterion("document_type not like", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIn(List<String> values) {
            addCriterion("document_type in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotIn(List<String> values) {
            addCriterion("document_type not in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeBetween(String value1, String value2) {
            addCriterion("document_type between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotBetween(String value1, String value2) {
            addCriterion("document_type not between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountIsNull() {
            addCriterion("subscription_amount is null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountIsNotNull() {
            addCriterion("subscription_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountEqualTo(String value) {
            addCriterion("subscription_amount =", value, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountNotEqualTo(String value) {
            addCriterion("subscription_amount <>", value, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountGreaterThan(String value) {
            addCriterion("subscription_amount >", value, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountGreaterThanOrEqualTo(String value) {
            addCriterion("subscription_amount >=", value, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountLessThan(String value) {
            addCriterion("subscription_amount <", value, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountLessThanOrEqualTo(String value) {
            addCriterion("subscription_amount <=", value, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountLike(String value) {
            addCriterion("subscription_amount like", value, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountNotLike(String value) {
            addCriterion("subscription_amount not like", value, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountIn(List<String> values) {
            addCriterion("subscription_amount in", values, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountNotIn(List<String> values) {
            addCriterion("subscription_amount not in", values, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountBetween(String value1, String value2) {
            addCriterion("subscription_amount between", value1, value2, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscriptionAmountNotBetween(String value1, String value2) {
            addCriterion("subscription_amount not between", value1, value2, "subscriptionAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionIsNull() {
            addCriterion("subscribed_capital_contribution is null");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionIsNotNull() {
            addCriterion("subscribed_capital_contribution is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionEqualTo(String value) {
            addCriterion("subscribed_capital_contribution =", value, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionNotEqualTo(String value) {
            addCriterion("subscribed_capital_contribution <>", value, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionGreaterThan(String value) {
            addCriterion("subscribed_capital_contribution >", value, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionGreaterThanOrEqualTo(String value) {
            addCriterion("subscribed_capital_contribution >=", value, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionLessThan(String value) {
            addCriterion("subscribed_capital_contribution <", value, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionLessThanOrEqualTo(String value) {
            addCriterion("subscribed_capital_contribution <=", value, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionLike(String value) {
            addCriterion("subscribed_capital_contribution like", value, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionNotLike(String value) {
            addCriterion("subscribed_capital_contribution not like", value, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionIn(List<String> values) {
            addCriterion("subscribed_capital_contribution in", values, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionNotIn(List<String> values) {
            addCriterion("subscribed_capital_contribution not in", values, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionBetween(String value1, String value2) {
            addCriterion("subscribed_capital_contribution between", value1, value2, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andSubscribedCapitalContributionNotBetween(String value1, String value2) {
            addCriterion("subscribed_capital_contribution not between", value1, value2, "subscribedCapitalContribution");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountIsNull() {
            addCriterion("paidin_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountIsNotNull() {
            addCriterion("paidin_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountEqualTo(String value) {
            addCriterion("paidin_amount =", value, "paidinAmount");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountNotEqualTo(String value) {
            addCriterion("paidin_amount <>", value, "paidinAmount");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountGreaterThan(String value) {
            addCriterion("paidin_amount >", value, "paidinAmount");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountGreaterThanOrEqualTo(String value) {
            addCriterion("paidin_amount >=", value, "paidinAmount");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountLessThan(String value) {
            addCriterion("paidin_amount <", value, "paidinAmount");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountLessThanOrEqualTo(String value) {
            addCriterion("paidin_amount <=", value, "paidinAmount");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountLike(String value) {
            addCriterion("paidin_amount like", value, "paidinAmount");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountNotLike(String value) {
            addCriterion("paidin_amount not like", value, "paidinAmount");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountIn(List<String> values) {
            addCriterion("paidin_amount in", values, "paidinAmount");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountNotIn(List<String> values) {
            addCriterion("paidin_amount not in", values, "paidinAmount");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountBetween(String value1, String value2) {
            addCriterion("paidin_amount between", value1, value2, "paidinAmount");
            return (Criteria) this;
        }

        public Criteria andPaidinAmountNotBetween(String value1, String value2) {
            addCriterion("paidin_amount not between", value1, value2, "paidinAmount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
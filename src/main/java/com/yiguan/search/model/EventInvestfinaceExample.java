package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.List;

public class EventInvestfinaceExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public EventInvestfinaceExample() {
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

    public EventInvestfinaceExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public EventInvestfinaceExample needFinanciers() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("financiers");
        
        return this;
    }

    public EventInvestfinaceExample needTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("time");
        
        return this;
    }

    public EventInvestfinaceExample needIndustry() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("industry");
        
        return this;
    }

    public EventInvestfinaceExample needClassLb() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("class_lb");
        
        return this;
    }

    public EventInvestfinaceExample needDomain() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("domain");
        
        return this;
    }

    public EventInvestfinaceExample needRound() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("round");
        
        return this;
    }

    public EventInvestfinaceExample needQuota() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("quota");
        
        return this;
    }

    public EventInvestfinaceExample needInvestors() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("investors");
        
        return this;
    }

    public EventInvestfinaceExample needEuuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("euuid");
        
        return this;
    }

    public EventInvestfinaceExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public EventInvestfinaceExample orderByFinanciers(String type) {
        if(orderByClause == null){
            orderByClause = "financiers " + type;
        }
        else{
            orderByClause += " ,financiers " + type;
        }
        
        return this;
    }

    public EventInvestfinaceExample orderByTime(String type) {
        if(orderByClause == null){
            orderByClause = "time " + type;
        }
        else{
            orderByClause += " ,time " + type;
        }
        
        return this;
    }

    public EventInvestfinaceExample orderByIndustry(String type) {
        if(orderByClause == null){
            orderByClause = "industry " + type;
        }
        else{
            orderByClause += " ,industry " + type;
        }
        
        return this;
    }

    public EventInvestfinaceExample orderByClassLb(String type) {
        if(orderByClause == null){
            orderByClause = "class_lb " + type;
        }
        else{
            orderByClause += " ,class_lb " + type;
        }
        
        return this;
    }

    public EventInvestfinaceExample orderByDomain(String type) {
        if(orderByClause == null){
            orderByClause = "domain " + type;
        }
        else{
            orderByClause += " ,domain " + type;
        }
        
        return this;
    }

    public EventInvestfinaceExample orderByRound(String type) {
        if(orderByClause == null){
            orderByClause = "round " + type;
        }
        else{
            orderByClause += " ,round " + type;
        }
        
        return this;
    }

    public EventInvestfinaceExample orderByQuota(String type) {
        if(orderByClause == null){
            orderByClause = "quota " + type;
        }
        else{
            orderByClause += " ,quota " + type;
        }
        
        return this;
    }

    public EventInvestfinaceExample orderByInvestors(String type) {
        if(orderByClause == null){
            orderByClause = "investors " + type;
        }
        else{
            orderByClause += " ,investors " + type;
        }
        
        return this;
    }

    public EventInvestfinaceExample orderByEuuid(String type) {
        if(orderByClause == null){
            orderByClause = "euuid " + type;
        }
        else{
            orderByClause += " ,euuid " + type;
        }
        
        return this;
    }

    public EventInvestfinaceExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public EventInvestfinaceExample groupByFinanciers() {
        if(groupByClause == null){
            groupByClause = "financiers ";
        }
        else{
            groupByClause += " ,financiers ";
        }
        
        return this;
    }

    public EventInvestfinaceExample groupByTime() {
        if(groupByClause == null){
            groupByClause = "time ";
        }
        else{
            groupByClause += " ,time ";
        }
        
        return this;
    }

    public EventInvestfinaceExample groupByIndustry() {
        if(groupByClause == null){
            groupByClause = "industry ";
        }
        else{
            groupByClause += " ,industry ";
        }
        
        return this;
    }

    public EventInvestfinaceExample groupByClassLb() {
        if(groupByClause == null){
            groupByClause = "class_lb ";
        }
        else{
            groupByClause += " ,class_lb ";
        }
        
        return this;
    }

    public EventInvestfinaceExample groupByDomain() {
        if(groupByClause == null){
            groupByClause = "domain ";
        }
        else{
            groupByClause += " ,domain ";
        }
        
        return this;
    }

    public EventInvestfinaceExample groupByRound() {
        if(groupByClause == null){
            groupByClause = "round ";
        }
        else{
            groupByClause += " ,round ";
        }
        
        return this;
    }

    public EventInvestfinaceExample groupByQuota() {
        if(groupByClause == null){
            groupByClause = "quota ";
        }
        else{
            groupByClause += " ,quota ";
        }
        
        return this;
    }

    public EventInvestfinaceExample groupByInvestors() {
        if(groupByClause == null){
            groupByClause = "investors ";
        }
        else{
            groupByClause += " ,investors ";
        }
        
        return this;
    }

    public EventInvestfinaceExample groupByEuuid() {
        if(groupByClause == null){
            groupByClause = "euuid ";
        }
        else{
            groupByClause += " ,euuid ";
        }
        
        return this;
    }

    public EventInvestfinaceExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public EventInvestfinaceExample groupConcatFinanciers() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(financiers SEPARATOR \'|\') as financiers");
        return this;
    }

    public EventInvestfinaceExample groupConcatTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(time SEPARATOR \'|\') as time");
        return this;
    }

    public EventInvestfinaceExample groupConcatIndustry() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(industry SEPARATOR \'|\') as industry");
        return this;
    }

    public EventInvestfinaceExample groupConcatClassLb() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(class_lb SEPARATOR \'|\') as class_lb");
        return this;
    }

    public EventInvestfinaceExample groupConcatDomain() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(domain SEPARATOR \'|\') as domain");
        return this;
    }

    public EventInvestfinaceExample groupConcatRound() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(round SEPARATOR \'|\') as round");
        return this;
    }

    public EventInvestfinaceExample groupConcatQuota() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(quota SEPARATOR \'|\') as quota");
        return this;
    }

    public EventInvestfinaceExample groupConcatInvestors() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(investors SEPARATOR \'|\') as investors");
        return this;
    }

    public EventInvestfinaceExample groupConcatEuuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(euuid SEPARATOR \'|\') as euuid");
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

        public Criteria andFinanciersIsNull() {
            addCriterion("financiers is null");
            return (Criteria) this;
        }

        public Criteria andFinanciersIsNotNull() {
            addCriterion("financiers is not null");
            return (Criteria) this;
        }

        public Criteria andFinanciersEqualTo(String value) {
            addCriterion("financiers =", value, "financiers");
            return (Criteria) this;
        }

        public Criteria andFinanciersNotEqualTo(String value) {
            addCriterion("financiers <>", value, "financiers");
            return (Criteria) this;
        }

        public Criteria andFinanciersGreaterThan(String value) {
            addCriterion("financiers >", value, "financiers");
            return (Criteria) this;
        }

        public Criteria andFinanciersGreaterThanOrEqualTo(String value) {
            addCriterion("financiers >=", value, "financiers");
            return (Criteria) this;
        }

        public Criteria andFinanciersLessThan(String value) {
            addCriterion("financiers <", value, "financiers");
            return (Criteria) this;
        }

        public Criteria andFinanciersLessThanOrEqualTo(String value) {
            addCriterion("financiers <=", value, "financiers");
            return (Criteria) this;
        }

        public Criteria andFinanciersLike(String value) {
            addCriterion("financiers like", value, "financiers");
            return (Criteria) this;
        }

        public Criteria andFinanciersNotLike(String value) {
            addCriterion("financiers not like", value, "financiers");
            return (Criteria) this;
        }

        public Criteria andFinanciersIn(List<String> values) {
            addCriterion("financiers in", values, "financiers");
            return (Criteria) this;
        }

        public Criteria andFinanciersNotIn(List<String> values) {
            addCriterion("financiers not in", values, "financiers");
            return (Criteria) this;
        }

        public Criteria andFinanciersBetween(String value1, String value2) {
            addCriterion("financiers between", value1, value2, "financiers");
            return (Criteria) this;
        }

        public Criteria andFinanciersNotBetween(String value1, String value2) {
            addCriterion("financiers not between", value1, value2, "financiers");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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

        public Criteria andClassLbIsNull() {
            addCriterion("class_lb is null");
            return (Criteria) this;
        }

        public Criteria andClassLbIsNotNull() {
            addCriterion("class_lb is not null");
            return (Criteria) this;
        }

        public Criteria andClassLbEqualTo(String value) {
            addCriterion("class_lb =", value, "classLb");
            return (Criteria) this;
        }

        public Criteria andClassLbNotEqualTo(String value) {
            addCriterion("class_lb <>", value, "classLb");
            return (Criteria) this;
        }

        public Criteria andClassLbGreaterThan(String value) {
            addCriterion("class_lb >", value, "classLb");
            return (Criteria) this;
        }

        public Criteria andClassLbGreaterThanOrEqualTo(String value) {
            addCriterion("class_lb >=", value, "classLb");
            return (Criteria) this;
        }

        public Criteria andClassLbLessThan(String value) {
            addCriterion("class_lb <", value, "classLb");
            return (Criteria) this;
        }

        public Criteria andClassLbLessThanOrEqualTo(String value) {
            addCriterion("class_lb <=", value, "classLb");
            return (Criteria) this;
        }

        public Criteria andClassLbLike(String value) {
            addCriterion("class_lb like", value, "classLb");
            return (Criteria) this;
        }

        public Criteria andClassLbNotLike(String value) {
            addCriterion("class_lb not like", value, "classLb");
            return (Criteria) this;
        }

        public Criteria andClassLbIn(List<String> values) {
            addCriterion("class_lb in", values, "classLb");
            return (Criteria) this;
        }

        public Criteria andClassLbNotIn(List<String> values) {
            addCriterion("class_lb not in", values, "classLb");
            return (Criteria) this;
        }

        public Criteria andClassLbBetween(String value1, String value2) {
            addCriterion("class_lb between", value1, value2, "classLb");
            return (Criteria) this;
        }

        public Criteria andClassLbNotBetween(String value1, String value2) {
            addCriterion("class_lb not between", value1, value2, "classLb");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("domain not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andRoundIsNull() {
            addCriterion("round is null");
            return (Criteria) this;
        }

        public Criteria andRoundIsNotNull() {
            addCriterion("round is not null");
            return (Criteria) this;
        }

        public Criteria andRoundEqualTo(String value) {
            addCriterion("round =", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotEqualTo(String value) {
            addCriterion("round <>", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThan(String value) {
            addCriterion("round >", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThanOrEqualTo(String value) {
            addCriterion("round >=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThan(String value) {
            addCriterion("round <", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThanOrEqualTo(String value) {
            addCriterion("round <=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLike(String value) {
            addCriterion("round like", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotLike(String value) {
            addCriterion("round not like", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundIn(List<String> values) {
            addCriterion("round in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotIn(List<String> values) {
            addCriterion("round not in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundBetween(String value1, String value2) {
            addCriterion("round between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotBetween(String value1, String value2) {
            addCriterion("round not between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNull() {
            addCriterion("quota is null");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNotNull() {
            addCriterion("quota is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaEqualTo(String value) {
            addCriterion("quota =", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotEqualTo(String value) {
            addCriterion("quota <>", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThan(String value) {
            addCriterion("quota >", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThanOrEqualTo(String value) {
            addCriterion("quota >=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThan(String value) {
            addCriterion("quota <", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThanOrEqualTo(String value) {
            addCriterion("quota <=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLike(String value) {
            addCriterion("quota like", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotLike(String value) {
            addCriterion("quota not like", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaIn(List<String> values) {
            addCriterion("quota in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotIn(List<String> values) {
            addCriterion("quota not in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaBetween(String value1, String value2) {
            addCriterion("quota between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotBetween(String value1, String value2) {
            addCriterion("quota not between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andInvestorsIsNull() {
            addCriterion("investors is null");
            return (Criteria) this;
        }

        public Criteria andInvestorsIsNotNull() {
            addCriterion("investors is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorsEqualTo(String value) {
            addCriterion("investors =", value, "investors");
            return (Criteria) this;
        }

        public Criteria andInvestorsNotEqualTo(String value) {
            addCriterion("investors <>", value, "investors");
            return (Criteria) this;
        }

        public Criteria andInvestorsGreaterThan(String value) {
            addCriterion("investors >", value, "investors");
            return (Criteria) this;
        }

        public Criteria andInvestorsGreaterThanOrEqualTo(String value) {
            addCriterion("investors >=", value, "investors");
            return (Criteria) this;
        }

        public Criteria andInvestorsLessThan(String value) {
            addCriterion("investors <", value, "investors");
            return (Criteria) this;
        }

        public Criteria andInvestorsLessThanOrEqualTo(String value) {
            addCriterion("investors <=", value, "investors");
            return (Criteria) this;
        }

        public Criteria andInvestorsLike(String value) {
            addCriterion("investors like", value, "investors");
            return (Criteria) this;
        }

        public Criteria andInvestorsNotLike(String value) {
            addCriterion("investors not like", value, "investors");
            return (Criteria) this;
        }

        public Criteria andInvestorsIn(List<String> values) {
            addCriterion("investors in", values, "investors");
            return (Criteria) this;
        }

        public Criteria andInvestorsNotIn(List<String> values) {
            addCriterion("investors not in", values, "investors");
            return (Criteria) this;
        }

        public Criteria andInvestorsBetween(String value1, String value2) {
            addCriterion("investors between", value1, value2, "investors");
            return (Criteria) this;
        }

        public Criteria andInvestorsNotBetween(String value1, String value2) {
            addCriterion("investors not between", value1, value2, "investors");
            return (Criteria) this;
        }

        public Criteria andEuuidIsNull() {
            addCriterion("euuid is null");
            return (Criteria) this;
        }

        public Criteria andEuuidIsNotNull() {
            addCriterion("euuid is not null");
            return (Criteria) this;
        }

        public Criteria andEuuidEqualTo(String value) {
            addCriterion("euuid =", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidNotEqualTo(String value) {
            addCriterion("euuid <>", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidGreaterThan(String value) {
            addCriterion("euuid >", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidGreaterThanOrEqualTo(String value) {
            addCriterion("euuid >=", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidLessThan(String value) {
            addCriterion("euuid <", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidLessThanOrEqualTo(String value) {
            addCriterion("euuid <=", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidLike(String value) {
            addCriterion("euuid like", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidNotLike(String value) {
            addCriterion("euuid not like", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidIn(List<String> values) {
            addCriterion("euuid in", values, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidNotIn(List<String> values) {
            addCriterion("euuid not in", values, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidBetween(String value1, String value2) {
            addCriterion("euuid between", value1, value2, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidNotBetween(String value1, String value2) {
            addCriterion("euuid not between", value1, value2, "euuid");
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
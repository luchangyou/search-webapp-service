package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.List;

public class EventMergerExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public EventMergerExample() {
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

    public EventMergerExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public EventMergerExample needAcquiree() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("acquiree");
        
        return this;
    }

    public EventMergerExample needTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("time");
        
        return this;
    }

    public EventMergerExample needIndustry() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("industry");
        
        return this;
    }

    public EventMergerExample needClassLb() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("class_lb");
        
        return this;
    }

    public EventMergerExample needDomain() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("domain");
        
        return this;
    }

    public EventMergerExample needEquity() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("equity");
        
        return this;
    }

    public EventMergerExample needQuota() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("quota");
        
        return this;
    }

    public EventMergerExample needBuyers() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("buyers");
        
        return this;
    }

    public EventMergerExample needEuuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("euuid");
        
        return this;
    }

    public EventMergerExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public EventMergerExample orderByAcquiree(String type) {
        if(orderByClause == null){
            orderByClause = "acquiree " + type;
        }
        else{
            orderByClause += " ,acquiree " + type;
        }
        
        return this;
    }

    public EventMergerExample orderByTime(String type) {
        if(orderByClause == null){
            orderByClause = "time " + type;
        }
        else{
            orderByClause += " ,time " + type;
        }
        
        return this;
    }

    public EventMergerExample orderByIndustry(String type) {
        if(orderByClause == null){
            orderByClause = "industry " + type;
        }
        else{
            orderByClause += " ,industry " + type;
        }
        
        return this;
    }

    public EventMergerExample orderByClassLb(String type) {
        if(orderByClause == null){
            orderByClause = "class_lb " + type;
        }
        else{
            orderByClause += " ,class_lb " + type;
        }
        
        return this;
    }

    public EventMergerExample orderByDomain(String type) {
        if(orderByClause == null){
            orderByClause = "domain " + type;
        }
        else{
            orderByClause += " ,domain " + type;
        }
        
        return this;
    }

    public EventMergerExample orderByEquity(String type) {
        if(orderByClause == null){
            orderByClause = "equity " + type;
        }
        else{
            orderByClause += " ,equity " + type;
        }
        
        return this;
    }

    public EventMergerExample orderByQuota(String type) {
        if(orderByClause == null){
            orderByClause = "quota " + type;
        }
        else{
            orderByClause += " ,quota " + type;
        }
        
        return this;
    }

    public EventMergerExample orderByBuyers(String type) {
        if(orderByClause == null){
            orderByClause = "buyers " + type;
        }
        else{
            orderByClause += " ,buyers " + type;
        }
        
        return this;
    }

    public EventMergerExample orderByEuuid(String type) {
        if(orderByClause == null){
            orderByClause = "euuid " + type;
        }
        else{
            orderByClause += " ,euuid " + type;
        }
        
        return this;
    }

    public EventMergerExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public EventMergerExample groupByAcquiree() {
        if(groupByClause == null){
            groupByClause = "acquiree ";
        }
        else{
            groupByClause += " ,acquiree ";
        }
        
        return this;
    }

    public EventMergerExample groupByTime() {
        if(groupByClause == null){
            groupByClause = "time ";
        }
        else{
            groupByClause += " ,time ";
        }
        
        return this;
    }

    public EventMergerExample groupByIndustry() {
        if(groupByClause == null){
            groupByClause = "industry ";
        }
        else{
            groupByClause += " ,industry ";
        }
        
        return this;
    }

    public EventMergerExample groupByClassLb() {
        if(groupByClause == null){
            groupByClause = "class_lb ";
        }
        else{
            groupByClause += " ,class_lb ";
        }
        
        return this;
    }

    public EventMergerExample groupByDomain() {
        if(groupByClause == null){
            groupByClause = "domain ";
        }
        else{
            groupByClause += " ,domain ";
        }
        
        return this;
    }

    public EventMergerExample groupByEquity() {
        if(groupByClause == null){
            groupByClause = "equity ";
        }
        else{
            groupByClause += " ,equity ";
        }
        
        return this;
    }

    public EventMergerExample groupByQuota() {
        if(groupByClause == null){
            groupByClause = "quota ";
        }
        else{
            groupByClause += " ,quota ";
        }
        
        return this;
    }

    public EventMergerExample groupByBuyers() {
        if(groupByClause == null){
            groupByClause = "buyers ";
        }
        else{
            groupByClause += " ,buyers ";
        }
        
        return this;
    }

    public EventMergerExample groupByEuuid() {
        if(groupByClause == null){
            groupByClause = "euuid ";
        }
        else{
            groupByClause += " ,euuid ";
        }
        
        return this;
    }

    public EventMergerExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public EventMergerExample groupConcatAcquiree() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(acquiree SEPARATOR \'|\') as acquiree");
        return this;
    }

    public EventMergerExample groupConcatTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(time SEPARATOR \'|\') as time");
        return this;
    }

    public EventMergerExample groupConcatIndustry() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(industry SEPARATOR \'|\') as industry");
        return this;
    }

    public EventMergerExample groupConcatClassLb() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(class_lb SEPARATOR \'|\') as class_lb");
        return this;
    }

    public EventMergerExample groupConcatDomain() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(domain SEPARATOR \'|\') as domain");
        return this;
    }

    public EventMergerExample groupConcatEquity() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(equity SEPARATOR \'|\') as equity");
        return this;
    }

    public EventMergerExample groupConcatQuota() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(quota SEPARATOR \'|\') as quota");
        return this;
    }

    public EventMergerExample groupConcatBuyers() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(buyers SEPARATOR \'|\') as buyers");
        return this;
    }

    public EventMergerExample groupConcatEuuid() {
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

        public Criteria andAcquireeIsNull() {
            addCriterion("acquiree is null");
            return (Criteria) this;
        }

        public Criteria andAcquireeIsNotNull() {
            addCriterion("acquiree is not null");
            return (Criteria) this;
        }

        public Criteria andAcquireeEqualTo(String value) {
            addCriterion("acquiree =", value, "acquiree");
            return (Criteria) this;
        }

        public Criteria andAcquireeNotEqualTo(String value) {
            addCriterion("acquiree <>", value, "acquiree");
            return (Criteria) this;
        }

        public Criteria andAcquireeGreaterThan(String value) {
            addCriterion("acquiree >", value, "acquiree");
            return (Criteria) this;
        }

        public Criteria andAcquireeGreaterThanOrEqualTo(String value) {
            addCriterion("acquiree >=", value, "acquiree");
            return (Criteria) this;
        }

        public Criteria andAcquireeLessThan(String value) {
            addCriterion("acquiree <", value, "acquiree");
            return (Criteria) this;
        }

        public Criteria andAcquireeLessThanOrEqualTo(String value) {
            addCriterion("acquiree <=", value, "acquiree");
            return (Criteria) this;
        }

        public Criteria andAcquireeLike(String value) {
            addCriterion("acquiree like", value, "acquiree");
            return (Criteria) this;
        }

        public Criteria andAcquireeNotLike(String value) {
            addCriterion("acquiree not like", value, "acquiree");
            return (Criteria) this;
        }

        public Criteria andAcquireeIn(List<String> values) {
            addCriterion("acquiree in", values, "acquiree");
            return (Criteria) this;
        }

        public Criteria andAcquireeNotIn(List<String> values) {
            addCriterion("acquiree not in", values, "acquiree");
            return (Criteria) this;
        }

        public Criteria andAcquireeBetween(String value1, String value2) {
            addCriterion("acquiree between", value1, value2, "acquiree");
            return (Criteria) this;
        }

        public Criteria andAcquireeNotBetween(String value1, String value2) {
            addCriterion("acquiree not between", value1, value2, "acquiree");
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

        public Criteria andEquityIsNull() {
            addCriterion("equity is null");
            return (Criteria) this;
        }

        public Criteria andEquityIsNotNull() {
            addCriterion("equity is not null");
            return (Criteria) this;
        }

        public Criteria andEquityEqualTo(String value) {
            addCriterion("equity =", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityNotEqualTo(String value) {
            addCriterion("equity <>", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityGreaterThan(String value) {
            addCriterion("equity >", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityGreaterThanOrEqualTo(String value) {
            addCriterion("equity >=", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityLessThan(String value) {
            addCriterion("equity <", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityLessThanOrEqualTo(String value) {
            addCriterion("equity <=", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityLike(String value) {
            addCriterion("equity like", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityNotLike(String value) {
            addCriterion("equity not like", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityIn(List<String> values) {
            addCriterion("equity in", values, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityNotIn(List<String> values) {
            addCriterion("equity not in", values, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityBetween(String value1, String value2) {
            addCriterion("equity between", value1, value2, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityNotBetween(String value1, String value2) {
            addCriterion("equity not between", value1, value2, "equity");
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

        public Criteria andBuyersIsNull() {
            addCriterion("buyers is null");
            return (Criteria) this;
        }

        public Criteria andBuyersIsNotNull() {
            addCriterion("buyers is not null");
            return (Criteria) this;
        }

        public Criteria andBuyersEqualTo(String value) {
            addCriterion("buyers =", value, "buyers");
            return (Criteria) this;
        }

        public Criteria andBuyersNotEqualTo(String value) {
            addCriterion("buyers <>", value, "buyers");
            return (Criteria) this;
        }

        public Criteria andBuyersGreaterThan(String value) {
            addCriterion("buyers >", value, "buyers");
            return (Criteria) this;
        }

        public Criteria andBuyersGreaterThanOrEqualTo(String value) {
            addCriterion("buyers >=", value, "buyers");
            return (Criteria) this;
        }

        public Criteria andBuyersLessThan(String value) {
            addCriterion("buyers <", value, "buyers");
            return (Criteria) this;
        }

        public Criteria andBuyersLessThanOrEqualTo(String value) {
            addCriterion("buyers <=", value, "buyers");
            return (Criteria) this;
        }

        public Criteria andBuyersLike(String value) {
            addCriterion("buyers like", value, "buyers");
            return (Criteria) this;
        }

        public Criteria andBuyersNotLike(String value) {
            addCriterion("buyers not like", value, "buyers");
            return (Criteria) this;
        }

        public Criteria andBuyersIn(List<String> values) {
            addCriterion("buyers in", values, "buyers");
            return (Criteria) this;
        }

        public Criteria andBuyersNotIn(List<String> values) {
            addCriterion("buyers not in", values, "buyers");
            return (Criteria) this;
        }

        public Criteria andBuyersBetween(String value1, String value2) {
            addCriterion("buyers between", value1, value2, "buyers");
            return (Criteria) this;
        }

        public Criteria andBuyersNotBetween(String value1, String value2) {
            addCriterion("buyers not between", value1, value2, "buyers");
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
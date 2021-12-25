package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComEquitypledgedpagenumExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public ComEquitypledgedpagenumExample() {
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

    public ComEquitypledgedpagenumExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needBid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("bid");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needRegistrationDate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("registration_date");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needRegistrationNumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("registration_number");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needState() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("state");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needAmountPledgedstock() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("amount_pledgedstock");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needPledgor() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("pledgor");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needPledgorNumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("pledgor_number");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needPledgee() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("pledgee");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needPledgeeNumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("pledgee_number");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needRemarks() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("remarks");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public ComEquitypledgedpagenumExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByBid(String type) {
        if(orderByClause == null){
            orderByClause = "bid " + type;
        }
        else{
            orderByClause += " ,bid " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByRegistrationDate(String type) {
        if(orderByClause == null){
            orderByClause = "registration_date " + type;
        }
        else{
            orderByClause += " ,registration_date " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByRegistrationNumber(String type) {
        if(orderByClause == null){
            orderByClause = "registration_number " + type;
        }
        else{
            orderByClause += " ,registration_number " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByState(String type) {
        if(orderByClause == null){
            orderByClause = "state " + type;
        }
        else{
            orderByClause += " ,state " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByAmountPledgedstock(String type) {
        if(orderByClause == null){
            orderByClause = "amount_pledgedstock " + type;
        }
        else{
            orderByClause += " ,amount_pledgedstock " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByPledgor(String type) {
        if(orderByClause == null){
            orderByClause = "pledgor " + type;
        }
        else{
            orderByClause += " ,pledgor " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByPledgorNumber(String type) {
        if(orderByClause == null){
            orderByClause = "pledgor_number " + type;
        }
        else{
            orderByClause += " ,pledgor_number " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByPledgee(String type) {
        if(orderByClause == null){
            orderByClause = "pledgee " + type;
        }
        else{
            orderByClause += " ,pledgee " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByPledgeeNumber(String type) {
        if(orderByClause == null){
            orderByClause = "pledgee_number " + type;
        }
        else{
            orderByClause += " ,pledgee_number " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByRemarks(String type) {
        if(orderByClause == null){
            orderByClause = "remarks " + type;
        }
        else{
            orderByClause += " ,remarks " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByBid() {
        if(groupByClause == null){
            groupByClause = "bid ";
        }
        else{
            groupByClause += " ,bid ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByRegistrationDate() {
        if(groupByClause == null){
            groupByClause = "registration_date ";
        }
        else{
            groupByClause += " ,registration_date ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByRegistrationNumber() {
        if(groupByClause == null){
            groupByClause = "registration_number ";
        }
        else{
            groupByClause += " ,registration_number ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByState() {
        if(groupByClause == null){
            groupByClause = "state ";
        }
        else{
            groupByClause += " ,state ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByAmountPledgedstock() {
        if(groupByClause == null){
            groupByClause = "amount_pledgedstock ";
        }
        else{
            groupByClause += " ,amount_pledgedstock ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByPledgor() {
        if(groupByClause == null){
            groupByClause = "pledgor ";
        }
        else{
            groupByClause += " ,pledgor ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByPledgorNumber() {
        if(groupByClause == null){
            groupByClause = "pledgor_number ";
        }
        else{
            groupByClause += " ,pledgor_number ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByPledgee() {
        if(groupByClause == null){
            groupByClause = "pledgee ";
        }
        else{
            groupByClause += " ,pledgee ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByPledgeeNumber() {
        if(groupByClause == null){
            groupByClause = "pledgee_number ";
        }
        else{
            groupByClause += " ,pledgee_number ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByRemarks() {
        if(groupByClause == null){
            groupByClause = "remarks ";
        }
        else{
            groupByClause += " ,remarks ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatBid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(bid SEPARATOR \'|\') as bid");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatRegistrationDate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(registration_date SEPARATOR \'|\') as registration_date");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatRegistrationNumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(registration_number SEPARATOR \'|\') as registration_number");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatState() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(state SEPARATOR \'|\') as state");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatAmountPledgedstock() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(amount_pledgedstock SEPARATOR \'|\') as amount_pledgedstock");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatPledgor() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(pledgor SEPARATOR \'|\') as pledgor");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatPledgorNumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(pledgor_number SEPARATOR \'|\') as pledgor_number");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatPledgee() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(pledgee SEPARATOR \'|\') as pledgee");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatPledgeeNumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(pledgee_number SEPARATOR \'|\') as pledgee_number");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatRemarks() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(remarks SEPARATOR \'|\') as remarks");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public ComEquitypledgedpagenumExample groupConcatAtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(atime SEPARATOR \'|\') as atime");
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

        public Criteria andRegistrationDateIsNull() {
            addCriterion("registration_date is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNotNull() {
            addCriterion("registration_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateEqualTo(String value) {
            addCriterion("registration_date =", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotEqualTo(String value) {
            addCriterion("registration_date <>", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThan(String value) {
            addCriterion("registration_date >", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThanOrEqualTo(String value) {
            addCriterion("registration_date >=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThan(String value) {
            addCriterion("registration_date <", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThanOrEqualTo(String value) {
            addCriterion("registration_date <=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLike(String value) {
            addCriterion("registration_date like", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotLike(String value) {
            addCriterion("registration_date not like", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIn(List<String> values) {
            addCriterion("registration_date in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotIn(List<String> values) {
            addCriterion("registration_date not in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateBetween(String value1, String value2) {
            addCriterion("registration_date between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotBetween(String value1, String value2) {
            addCriterion("registration_date not between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberIsNull() {
            addCriterion("registration_number is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberIsNotNull() {
            addCriterion("registration_number is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberEqualTo(String value) {
            addCriterion("registration_number =", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotEqualTo(String value) {
            addCriterion("registration_number <>", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberGreaterThan(String value) {
            addCriterion("registration_number >", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("registration_number >=", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberLessThan(String value) {
            addCriterion("registration_number <", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberLessThanOrEqualTo(String value) {
            addCriterion("registration_number <=", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberLike(String value) {
            addCriterion("registration_number like", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotLike(String value) {
            addCriterion("registration_number not like", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberIn(List<String> values) {
            addCriterion("registration_number in", values, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotIn(List<String> values) {
            addCriterion("registration_number not in", values, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberBetween(String value1, String value2) {
            addCriterion("registration_number between", value1, value2, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotBetween(String value1, String value2) {
            addCriterion("registration_number not between", value1, value2, "registrationNumber");
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

        public Criteria andAmountPledgedstockIsNull() {
            addCriterion("amount_pledgedstock is null");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockIsNotNull() {
            addCriterion("amount_pledgedstock is not null");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockEqualTo(String value) {
            addCriterion("amount_pledgedstock =", value, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockNotEqualTo(String value) {
            addCriterion("amount_pledgedstock <>", value, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockGreaterThan(String value) {
            addCriterion("amount_pledgedstock >", value, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockGreaterThanOrEqualTo(String value) {
            addCriterion("amount_pledgedstock >=", value, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockLessThan(String value) {
            addCriterion("amount_pledgedstock <", value, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockLessThanOrEqualTo(String value) {
            addCriterion("amount_pledgedstock <=", value, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockLike(String value) {
            addCriterion("amount_pledgedstock like", value, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockNotLike(String value) {
            addCriterion("amount_pledgedstock not like", value, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockIn(List<String> values) {
            addCriterion("amount_pledgedstock in", values, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockNotIn(List<String> values) {
            addCriterion("amount_pledgedstock not in", values, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockBetween(String value1, String value2) {
            addCriterion("amount_pledgedstock between", value1, value2, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andAmountPledgedstockNotBetween(String value1, String value2) {
            addCriterion("amount_pledgedstock not between", value1, value2, "amountPledgedstock");
            return (Criteria) this;
        }

        public Criteria andPledgorIsNull() {
            addCriterion("pledgor is null");
            return (Criteria) this;
        }

        public Criteria andPledgorIsNotNull() {
            addCriterion("pledgor is not null");
            return (Criteria) this;
        }

        public Criteria andPledgorEqualTo(String value) {
            addCriterion("pledgor =", value, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorNotEqualTo(String value) {
            addCriterion("pledgor <>", value, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorGreaterThan(String value) {
            addCriterion("pledgor >", value, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorGreaterThanOrEqualTo(String value) {
            addCriterion("pledgor >=", value, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorLessThan(String value) {
            addCriterion("pledgor <", value, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorLessThanOrEqualTo(String value) {
            addCriterion("pledgor <=", value, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorLike(String value) {
            addCriterion("pledgor like", value, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorNotLike(String value) {
            addCriterion("pledgor not like", value, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorIn(List<String> values) {
            addCriterion("pledgor in", values, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorNotIn(List<String> values) {
            addCriterion("pledgor not in", values, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorBetween(String value1, String value2) {
            addCriterion("pledgor between", value1, value2, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorNotBetween(String value1, String value2) {
            addCriterion("pledgor not between", value1, value2, "pledgor");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberIsNull() {
            addCriterion("pledgor_number is null");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberIsNotNull() {
            addCriterion("pledgor_number is not null");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberEqualTo(String value) {
            addCriterion("pledgor_number =", value, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberNotEqualTo(String value) {
            addCriterion("pledgor_number <>", value, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberGreaterThan(String value) {
            addCriterion("pledgor_number >", value, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pledgor_number >=", value, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberLessThan(String value) {
            addCriterion("pledgor_number <", value, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberLessThanOrEqualTo(String value) {
            addCriterion("pledgor_number <=", value, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberLike(String value) {
            addCriterion("pledgor_number like", value, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberNotLike(String value) {
            addCriterion("pledgor_number not like", value, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberIn(List<String> values) {
            addCriterion("pledgor_number in", values, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberNotIn(List<String> values) {
            addCriterion("pledgor_number not in", values, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberBetween(String value1, String value2) {
            addCriterion("pledgor_number between", value1, value2, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgorNumberNotBetween(String value1, String value2) {
            addCriterion("pledgor_number not between", value1, value2, "pledgorNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeIsNull() {
            addCriterion("pledgee is null");
            return (Criteria) this;
        }

        public Criteria andPledgeeIsNotNull() {
            addCriterion("pledgee is not null");
            return (Criteria) this;
        }

        public Criteria andPledgeeEqualTo(String value) {
            addCriterion("pledgee =", value, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeNotEqualTo(String value) {
            addCriterion("pledgee <>", value, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeGreaterThan(String value) {
            addCriterion("pledgee >", value, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeGreaterThanOrEqualTo(String value) {
            addCriterion("pledgee >=", value, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeLessThan(String value) {
            addCriterion("pledgee <", value, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeLessThanOrEqualTo(String value) {
            addCriterion("pledgee <=", value, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeLike(String value) {
            addCriterion("pledgee like", value, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeNotLike(String value) {
            addCriterion("pledgee not like", value, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeIn(List<String> values) {
            addCriterion("pledgee in", values, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeNotIn(List<String> values) {
            addCriterion("pledgee not in", values, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeBetween(String value1, String value2) {
            addCriterion("pledgee between", value1, value2, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeNotBetween(String value1, String value2) {
            addCriterion("pledgee not between", value1, value2, "pledgee");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberIsNull() {
            addCriterion("pledgee_number is null");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberIsNotNull() {
            addCriterion("pledgee_number is not null");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberEqualTo(String value) {
            addCriterion("pledgee_number =", value, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberNotEqualTo(String value) {
            addCriterion("pledgee_number <>", value, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberGreaterThan(String value) {
            addCriterion("pledgee_number >", value, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pledgee_number >=", value, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberLessThan(String value) {
            addCriterion("pledgee_number <", value, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberLessThanOrEqualTo(String value) {
            addCriterion("pledgee_number <=", value, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberLike(String value) {
            addCriterion("pledgee_number like", value, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberNotLike(String value) {
            addCriterion("pledgee_number not like", value, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberIn(List<String> values) {
            addCriterion("pledgee_number in", values, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberNotIn(List<String> values) {
            addCriterion("pledgee_number not in", values, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberBetween(String value1, String value2) {
            addCriterion("pledgee_number between", value1, value2, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andPledgeeNumberNotBetween(String value1, String value2) {
            addCriterion("pledgee_number not between", value1, value2, "pledgeeNumber");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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
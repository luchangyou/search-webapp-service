package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComPatentExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public ComPatentExample() {
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

    public ComPatentExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public ComPatentExample needBid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("bid");
        
        return this;
    }

    public ComPatentExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public ComPatentExample needImgurl() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("imgurl");
        
        return this;
    }

    public ComPatentExample needApnumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("apnumber");
        
        return this;
    }

    public ComPatentExample needAnumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("anumber");
        
        return this;
    }

    public ComPatentExample needCnumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("cnumber");
        
        return this;
    }

    public ComPatentExample needInventionname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("inventionname");
        
        return this;
    }

    public ComPatentExample needAddress() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("address");
        
        return this;
    }

    public ComPatentExample needInventor() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("inventor");
        
        return this;
    }

    public ComPatentExample needApplicant() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("applicant");
        
        return this;
    }

    public ComPatentExample needApdate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("apdate");
        
        return this;
    }

    public ComPatentExample needAndate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("andate");
        
        return this;
    }

    public ComPatentExample needAgency() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("agency");
        
        return this;
    }

    public ComPatentExample needAgent() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("agent");
        
        return this;
    }

    public ComPatentExample needAbs() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("abs");
        
        return this;
    }

    public ComPatentExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public ComPatentExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public ComPatentExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByBid(String type) {
        if(orderByClause == null){
            orderByClause = "bid " + type;
        }
        else{
            orderByClause += " ,bid " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByImgurl(String type) {
        if(orderByClause == null){
            orderByClause = "imgurl " + type;
        }
        else{
            orderByClause += " ,imgurl " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByApnumber(String type) {
        if(orderByClause == null){
            orderByClause = "apnumber " + type;
        }
        else{
            orderByClause += " ,apnumber " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByAnumber(String type) {
        if(orderByClause == null){
            orderByClause = "anumber " + type;
        }
        else{
            orderByClause += " ,anumber " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByCnumber(String type) {
        if(orderByClause == null){
            orderByClause = "cnumber " + type;
        }
        else{
            orderByClause += " ,cnumber " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByInventionname(String type) {
        if(orderByClause == null){
            orderByClause = "inventionname " + type;
        }
        else{
            orderByClause += " ,inventionname " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByAddress(String type) {
        if(orderByClause == null){
            orderByClause = "address " + type;
        }
        else{
            orderByClause += " ,address " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByInventor(String type) {
        if(orderByClause == null){
            orderByClause = "inventor " + type;
        }
        else{
            orderByClause += " ,inventor " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByApplicant(String type) {
        if(orderByClause == null){
            orderByClause = "applicant " + type;
        }
        else{
            orderByClause += " ,applicant " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByApdate(String type) {
        if(orderByClause == null){
            orderByClause = "apdate " + type;
        }
        else{
            orderByClause += " ,apdate " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByAndate(String type) {
        if(orderByClause == null){
            orderByClause = "andate " + type;
        }
        else{
            orderByClause += " ,andate " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByAgency(String type) {
        if(orderByClause == null){
            orderByClause = "agency " + type;
        }
        else{
            orderByClause += " ,agency " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByAgent(String type) {
        if(orderByClause == null){
            orderByClause = "agent " + type;
        }
        else{
            orderByClause += " ,agent " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByAbs(String type) {
        if(orderByClause == null){
            orderByClause = "abs " + type;
        }
        else{
            orderByClause += " ,abs " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public ComPatentExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public ComPatentExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public ComPatentExample groupByBid() {
        if(groupByClause == null){
            groupByClause = "bid ";
        }
        else{
            groupByClause += " ,bid ";
        }
        
        return this;
    }

    public ComPatentExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public ComPatentExample groupByImgurl() {
        if(groupByClause == null){
            groupByClause = "imgurl ";
        }
        else{
            groupByClause += " ,imgurl ";
        }
        
        return this;
    }

    public ComPatentExample groupByApnumber() {
        if(groupByClause == null){
            groupByClause = "apnumber ";
        }
        else{
            groupByClause += " ,apnumber ";
        }
        
        return this;
    }

    public ComPatentExample groupByAnumber() {
        if(groupByClause == null){
            groupByClause = "anumber ";
        }
        else{
            groupByClause += " ,anumber ";
        }
        
        return this;
    }

    public ComPatentExample groupByCnumber() {
        if(groupByClause == null){
            groupByClause = "cnumber ";
        }
        else{
            groupByClause += " ,cnumber ";
        }
        
        return this;
    }

    public ComPatentExample groupByInventionname() {
        if(groupByClause == null){
            groupByClause = "inventionname ";
        }
        else{
            groupByClause += " ,inventionname ";
        }
        
        return this;
    }

    public ComPatentExample groupByAddress() {
        if(groupByClause == null){
            groupByClause = "address ";
        }
        else{
            groupByClause += " ,address ";
        }
        
        return this;
    }

    public ComPatentExample groupByInventor() {
        if(groupByClause == null){
            groupByClause = "inventor ";
        }
        else{
            groupByClause += " ,inventor ";
        }
        
        return this;
    }

    public ComPatentExample groupByApplicant() {
        if(groupByClause == null){
            groupByClause = "applicant ";
        }
        else{
            groupByClause += " ,applicant ";
        }
        
        return this;
    }

    public ComPatentExample groupByApdate() {
        if(groupByClause == null){
            groupByClause = "apdate ";
        }
        else{
            groupByClause += " ,apdate ";
        }
        
        return this;
    }

    public ComPatentExample groupByAndate() {
        if(groupByClause == null){
            groupByClause = "andate ";
        }
        else{
            groupByClause += " ,andate ";
        }
        
        return this;
    }

    public ComPatentExample groupByAgency() {
        if(groupByClause == null){
            groupByClause = "agency ";
        }
        else{
            groupByClause += " ,agency ";
        }
        
        return this;
    }

    public ComPatentExample groupByAgent() {
        if(groupByClause == null){
            groupByClause = "agent ";
        }
        else{
            groupByClause += " ,agent ";
        }
        
        return this;
    }

    public ComPatentExample groupByAbs() {
        if(groupByClause == null){
            groupByClause = "abs ";
        }
        else{
            groupByClause += " ,abs ";
        }
        
        return this;
    }

    public ComPatentExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public ComPatentExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public ComPatentExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public ComPatentExample groupConcatBid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(bid SEPARATOR \'|\') as bid");
        return this;
    }

    public ComPatentExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public ComPatentExample groupConcatImgurl() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(imgurl SEPARATOR \'|\') as imgurl");
        return this;
    }

    public ComPatentExample groupConcatApnumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(apnumber SEPARATOR \'|\') as apnumber");
        return this;
    }

    public ComPatentExample groupConcatAnumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(anumber SEPARATOR \'|\') as anumber");
        return this;
    }

    public ComPatentExample groupConcatCnumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(cnumber SEPARATOR \'|\') as cnumber");
        return this;
    }

    public ComPatentExample groupConcatInventionname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(inventionname SEPARATOR \'|\') as inventionname");
        return this;
    }

    public ComPatentExample groupConcatAddress() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(address SEPARATOR \'|\') as address");
        return this;
    }

    public ComPatentExample groupConcatInventor() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(inventor SEPARATOR \'|\') as inventor");
        return this;
    }

    public ComPatentExample groupConcatApplicant() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(applicant SEPARATOR \'|\') as applicant");
        return this;
    }

    public ComPatentExample groupConcatApdate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(apdate SEPARATOR \'|\') as apdate");
        return this;
    }

    public ComPatentExample groupConcatAndate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(andate SEPARATOR \'|\') as andate");
        return this;
    }

    public ComPatentExample groupConcatAgency() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(agency SEPARATOR \'|\') as agency");
        return this;
    }

    public ComPatentExample groupConcatAgent() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(agent SEPARATOR \'|\') as agent");
        return this;
    }

    public ComPatentExample groupConcatAbs() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(abs SEPARATOR \'|\') as abs");
        return this;
    }

    public ComPatentExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public ComPatentExample groupConcatAtime() {
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

        public Criteria andImgurlIsNull() {
            addCriterion("imgurl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgurl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgurl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgurl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgurl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgurl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgurl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgurl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgurl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgurl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgurl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgurl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgurl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andApnumberIsNull() {
            addCriterion("apnumber is null");
            return (Criteria) this;
        }

        public Criteria andApnumberIsNotNull() {
            addCriterion("apnumber is not null");
            return (Criteria) this;
        }

        public Criteria andApnumberEqualTo(String value) {
            addCriterion("apnumber =", value, "apnumber");
            return (Criteria) this;
        }

        public Criteria andApnumberNotEqualTo(String value) {
            addCriterion("apnumber <>", value, "apnumber");
            return (Criteria) this;
        }

        public Criteria andApnumberGreaterThan(String value) {
            addCriterion("apnumber >", value, "apnumber");
            return (Criteria) this;
        }

        public Criteria andApnumberGreaterThanOrEqualTo(String value) {
            addCriterion("apnumber >=", value, "apnumber");
            return (Criteria) this;
        }

        public Criteria andApnumberLessThan(String value) {
            addCriterion("apnumber <", value, "apnumber");
            return (Criteria) this;
        }

        public Criteria andApnumberLessThanOrEqualTo(String value) {
            addCriterion("apnumber <=", value, "apnumber");
            return (Criteria) this;
        }

        public Criteria andApnumberLike(String value) {
            addCriterion("apnumber like", value, "apnumber");
            return (Criteria) this;
        }

        public Criteria andApnumberNotLike(String value) {
            addCriterion("apnumber not like", value, "apnumber");
            return (Criteria) this;
        }

        public Criteria andApnumberIn(List<String> values) {
            addCriterion("apnumber in", values, "apnumber");
            return (Criteria) this;
        }

        public Criteria andApnumberNotIn(List<String> values) {
            addCriterion("apnumber not in", values, "apnumber");
            return (Criteria) this;
        }

        public Criteria andApnumberBetween(String value1, String value2) {
            addCriterion("apnumber between", value1, value2, "apnumber");
            return (Criteria) this;
        }

        public Criteria andApnumberNotBetween(String value1, String value2) {
            addCriterion("apnumber not between", value1, value2, "apnumber");
            return (Criteria) this;
        }

        public Criteria andAnumberIsNull() {
            addCriterion("anumber is null");
            return (Criteria) this;
        }

        public Criteria andAnumberIsNotNull() {
            addCriterion("anumber is not null");
            return (Criteria) this;
        }

        public Criteria andAnumberEqualTo(String value) {
            addCriterion("anumber =", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberNotEqualTo(String value) {
            addCriterion("anumber <>", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberGreaterThan(String value) {
            addCriterion("anumber >", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberGreaterThanOrEqualTo(String value) {
            addCriterion("anumber >=", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberLessThan(String value) {
            addCriterion("anumber <", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberLessThanOrEqualTo(String value) {
            addCriterion("anumber <=", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberLike(String value) {
            addCriterion("anumber like", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberNotLike(String value) {
            addCriterion("anumber not like", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberIn(List<String> values) {
            addCriterion("anumber in", values, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberNotIn(List<String> values) {
            addCriterion("anumber not in", values, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberBetween(String value1, String value2) {
            addCriterion("anumber between", value1, value2, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberNotBetween(String value1, String value2) {
            addCriterion("anumber not between", value1, value2, "anumber");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNull() {
            addCriterion("cnumber is null");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNotNull() {
            addCriterion("cnumber is not null");
            return (Criteria) this;
        }

        public Criteria andCnumberEqualTo(String value) {
            addCriterion("cnumber =", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotEqualTo(String value) {
            addCriterion("cnumber <>", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThan(String value) {
            addCriterion("cnumber >", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThanOrEqualTo(String value) {
            addCriterion("cnumber >=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThan(String value) {
            addCriterion("cnumber <", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThanOrEqualTo(String value) {
            addCriterion("cnumber <=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLike(String value) {
            addCriterion("cnumber like", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotLike(String value) {
            addCriterion("cnumber not like", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberIn(List<String> values) {
            addCriterion("cnumber in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotIn(List<String> values) {
            addCriterion("cnumber not in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberBetween(String value1, String value2) {
            addCriterion("cnumber between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotBetween(String value1, String value2) {
            addCriterion("cnumber not between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andInventionnameIsNull() {
            addCriterion("inventionname is null");
            return (Criteria) this;
        }

        public Criteria andInventionnameIsNotNull() {
            addCriterion("inventionname is not null");
            return (Criteria) this;
        }

        public Criteria andInventionnameEqualTo(String value) {
            addCriterion("inventionname =", value, "inventionname");
            return (Criteria) this;
        }

        public Criteria andInventionnameNotEqualTo(String value) {
            addCriterion("inventionname <>", value, "inventionname");
            return (Criteria) this;
        }

        public Criteria andInventionnameGreaterThan(String value) {
            addCriterion("inventionname >", value, "inventionname");
            return (Criteria) this;
        }

        public Criteria andInventionnameGreaterThanOrEqualTo(String value) {
            addCriterion("inventionname >=", value, "inventionname");
            return (Criteria) this;
        }

        public Criteria andInventionnameLessThan(String value) {
            addCriterion("inventionname <", value, "inventionname");
            return (Criteria) this;
        }

        public Criteria andInventionnameLessThanOrEqualTo(String value) {
            addCriterion("inventionname <=", value, "inventionname");
            return (Criteria) this;
        }

        public Criteria andInventionnameLike(String value) {
            addCriterion("inventionname like", value, "inventionname");
            return (Criteria) this;
        }

        public Criteria andInventionnameNotLike(String value) {
            addCriterion("inventionname not like", value, "inventionname");
            return (Criteria) this;
        }

        public Criteria andInventionnameIn(List<String> values) {
            addCriterion("inventionname in", values, "inventionname");
            return (Criteria) this;
        }

        public Criteria andInventionnameNotIn(List<String> values) {
            addCriterion("inventionname not in", values, "inventionname");
            return (Criteria) this;
        }

        public Criteria andInventionnameBetween(String value1, String value2) {
            addCriterion("inventionname between", value1, value2, "inventionname");
            return (Criteria) this;
        }

        public Criteria andInventionnameNotBetween(String value1, String value2) {
            addCriterion("inventionname not between", value1, value2, "inventionname");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andInventorIsNull() {
            addCriterion("inventor is null");
            return (Criteria) this;
        }

        public Criteria andInventorIsNotNull() {
            addCriterion("inventor is not null");
            return (Criteria) this;
        }

        public Criteria andInventorEqualTo(String value) {
            addCriterion("inventor =", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotEqualTo(String value) {
            addCriterion("inventor <>", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorGreaterThan(String value) {
            addCriterion("inventor >", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorGreaterThanOrEqualTo(String value) {
            addCriterion("inventor >=", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLessThan(String value) {
            addCriterion("inventor <", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLessThanOrEqualTo(String value) {
            addCriterion("inventor <=", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLike(String value) {
            addCriterion("inventor like", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotLike(String value) {
            addCriterion("inventor not like", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorIn(List<String> values) {
            addCriterion("inventor in", values, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotIn(List<String> values) {
            addCriterion("inventor not in", values, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorBetween(String value1, String value2) {
            addCriterion("inventor between", value1, value2, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotBetween(String value1, String value2) {
            addCriterion("inventor not between", value1, value2, "inventor");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApdateIsNull() {
            addCriterion("apdate is null");
            return (Criteria) this;
        }

        public Criteria andApdateIsNotNull() {
            addCriterion("apdate is not null");
            return (Criteria) this;
        }

        public Criteria andApdateEqualTo(String value) {
            addCriterion("apdate =", value, "apdate");
            return (Criteria) this;
        }

        public Criteria andApdateNotEqualTo(String value) {
            addCriterion("apdate <>", value, "apdate");
            return (Criteria) this;
        }

        public Criteria andApdateGreaterThan(String value) {
            addCriterion("apdate >", value, "apdate");
            return (Criteria) this;
        }

        public Criteria andApdateGreaterThanOrEqualTo(String value) {
            addCriterion("apdate >=", value, "apdate");
            return (Criteria) this;
        }

        public Criteria andApdateLessThan(String value) {
            addCriterion("apdate <", value, "apdate");
            return (Criteria) this;
        }

        public Criteria andApdateLessThanOrEqualTo(String value) {
            addCriterion("apdate <=", value, "apdate");
            return (Criteria) this;
        }

        public Criteria andApdateLike(String value) {
            addCriterion("apdate like", value, "apdate");
            return (Criteria) this;
        }

        public Criteria andApdateNotLike(String value) {
            addCriterion("apdate not like", value, "apdate");
            return (Criteria) this;
        }

        public Criteria andApdateIn(List<String> values) {
            addCriterion("apdate in", values, "apdate");
            return (Criteria) this;
        }

        public Criteria andApdateNotIn(List<String> values) {
            addCriterion("apdate not in", values, "apdate");
            return (Criteria) this;
        }

        public Criteria andApdateBetween(String value1, String value2) {
            addCriterion("apdate between", value1, value2, "apdate");
            return (Criteria) this;
        }

        public Criteria andApdateNotBetween(String value1, String value2) {
            addCriterion("apdate not between", value1, value2, "apdate");
            return (Criteria) this;
        }

        public Criteria andAndateIsNull() {
            addCriterion("andate is null");
            return (Criteria) this;
        }

        public Criteria andAndateIsNotNull() {
            addCriterion("andate is not null");
            return (Criteria) this;
        }

        public Criteria andAndateEqualTo(String value) {
            addCriterion("andate =", value, "andate");
            return (Criteria) this;
        }

        public Criteria andAndateNotEqualTo(String value) {
            addCriterion("andate <>", value, "andate");
            return (Criteria) this;
        }

        public Criteria andAndateGreaterThan(String value) {
            addCriterion("andate >", value, "andate");
            return (Criteria) this;
        }

        public Criteria andAndateGreaterThanOrEqualTo(String value) {
            addCriterion("andate >=", value, "andate");
            return (Criteria) this;
        }

        public Criteria andAndateLessThan(String value) {
            addCriterion("andate <", value, "andate");
            return (Criteria) this;
        }

        public Criteria andAndateLessThanOrEqualTo(String value) {
            addCriterion("andate <=", value, "andate");
            return (Criteria) this;
        }

        public Criteria andAndateLike(String value) {
            addCriterion("andate like", value, "andate");
            return (Criteria) this;
        }

        public Criteria andAndateNotLike(String value) {
            addCriterion("andate not like", value, "andate");
            return (Criteria) this;
        }

        public Criteria andAndateIn(List<String> values) {
            addCriterion("andate in", values, "andate");
            return (Criteria) this;
        }

        public Criteria andAndateNotIn(List<String> values) {
            addCriterion("andate not in", values, "andate");
            return (Criteria) this;
        }

        public Criteria andAndateBetween(String value1, String value2) {
            addCriterion("andate between", value1, value2, "andate");
            return (Criteria) this;
        }

        public Criteria andAndateNotBetween(String value1, String value2) {
            addCriterion("andate not between", value1, value2, "andate");
            return (Criteria) this;
        }

        public Criteria andAgencyIsNull() {
            addCriterion("agency is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIsNotNull() {
            addCriterion("agency is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyEqualTo(String value) {
            addCriterion("agency =", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotEqualTo(String value) {
            addCriterion("agency <>", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyGreaterThan(String value) {
            addCriterion("agency >", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("agency >=", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLessThan(String value) {
            addCriterion("agency <", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLessThanOrEqualTo(String value) {
            addCriterion("agency <=", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLike(String value) {
            addCriterion("agency like", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotLike(String value) {
            addCriterion("agency not like", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyIn(List<String> values) {
            addCriterion("agency in", values, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotIn(List<String> values) {
            addCriterion("agency not in", values, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyBetween(String value1, String value2) {
            addCriterion("agency between", value1, value2, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotBetween(String value1, String value2) {
            addCriterion("agency not between", value1, value2, "agency");
            return (Criteria) this;
        }

        public Criteria andAgentIsNull() {
            addCriterion("agent is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("agent is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(String value) {
            addCriterion("agent =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(String value) {
            addCriterion("agent <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(String value) {
            addCriterion("agent >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(String value) {
            addCriterion("agent >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(String value) {
            addCriterion("agent <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(String value) {
            addCriterion("agent <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLike(String value) {
            addCriterion("agent like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotLike(String value) {
            addCriterion("agent not like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<String> values) {
            addCriterion("agent in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<String> values) {
            addCriterion("agent not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(String value1, String value2) {
            addCriterion("agent between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(String value1, String value2) {
            addCriterion("agent not between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAbsIsNull() {
            addCriterion("abs is null");
            return (Criteria) this;
        }

        public Criteria andAbsIsNotNull() {
            addCriterion("abs is not null");
            return (Criteria) this;
        }

        public Criteria andAbsEqualTo(String value) {
            addCriterion("abs =", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsNotEqualTo(String value) {
            addCriterion("abs <>", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsGreaterThan(String value) {
            addCriterion("abs >", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsGreaterThanOrEqualTo(String value) {
            addCriterion("abs >=", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsLessThan(String value) {
            addCriterion("abs <", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsLessThanOrEqualTo(String value) {
            addCriterion("abs <=", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsLike(String value) {
            addCriterion("abs like", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsNotLike(String value) {
            addCriterion("abs not like", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsIn(List<String> values) {
            addCriterion("abs in", values, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsNotIn(List<String> values) {
            addCriterion("abs not in", values, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsBetween(String value1, String value2) {
            addCriterion("abs between", value1, value2, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsNotBetween(String value1, String value2) {
            addCriterion("abs not between", value1, value2, "abs");
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
package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComCopyrightworkExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public ComCopyrightworkExample() {
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

    public ComCopyrightworkExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public ComCopyrightworkExample needBid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("bid");
        
        return this;
    }

    public ComCopyrightworkExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public ComCopyrightworkExample needWorkname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("workname");
        
        return this;
    }

    public ComCopyrightworkExample needRnumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rnumber");
        
        return this;
    }

    public ComCopyrightworkExample needClassLb() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("class_lb");
        
        return this;
    }

    public ComCopyrightworkExample needCompletiondate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("completiondate");
        
        return this;
    }

    public ComCopyrightworkExample needRdate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rdate");
        
        return this;
    }

    public ComCopyrightworkExample needFrdate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("frdate");
        
        return this;
    }

    public ComCopyrightworkExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public ComCopyrightworkExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public ComCopyrightworkExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public ComCopyrightworkExample orderByBid(String type) {
        if(orderByClause == null){
            orderByClause = "bid " + type;
        }
        else{
            orderByClause += " ,bid " + type;
        }
        
        return this;
    }

    public ComCopyrightworkExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public ComCopyrightworkExample orderByWorkname(String type) {
        if(orderByClause == null){
            orderByClause = "workname " + type;
        }
        else{
            orderByClause += " ,workname " + type;
        }
        
        return this;
    }

    public ComCopyrightworkExample orderByRnumber(String type) {
        if(orderByClause == null){
            orderByClause = "rnumber " + type;
        }
        else{
            orderByClause += " ,rnumber " + type;
        }
        
        return this;
    }

    public ComCopyrightworkExample orderByClassLb(String type) {
        if(orderByClause == null){
            orderByClause = "class_lb " + type;
        }
        else{
            orderByClause += " ,class_lb " + type;
        }
        
        return this;
    }

    public ComCopyrightworkExample orderByCompletiondate(String type) {
        if(orderByClause == null){
            orderByClause = "completiondate " + type;
        }
        else{
            orderByClause += " ,completiondate " + type;
        }
        
        return this;
    }

    public ComCopyrightworkExample orderByRdate(String type) {
        if(orderByClause == null){
            orderByClause = "rdate " + type;
        }
        else{
            orderByClause += " ,rdate " + type;
        }
        
        return this;
    }

    public ComCopyrightworkExample orderByFrdate(String type) {
        if(orderByClause == null){
            orderByClause = "frdate " + type;
        }
        else{
            orderByClause += " ,frdate " + type;
        }
        
        return this;
    }

    public ComCopyrightworkExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public ComCopyrightworkExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public ComCopyrightworkExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public ComCopyrightworkExample groupByBid() {
        if(groupByClause == null){
            groupByClause = "bid ";
        }
        else{
            groupByClause += " ,bid ";
        }
        
        return this;
    }

    public ComCopyrightworkExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public ComCopyrightworkExample groupByWorkname() {
        if(groupByClause == null){
            groupByClause = "workname ";
        }
        else{
            groupByClause += " ,workname ";
        }
        
        return this;
    }

    public ComCopyrightworkExample groupByRnumber() {
        if(groupByClause == null){
            groupByClause = "rnumber ";
        }
        else{
            groupByClause += " ,rnumber ";
        }
        
        return this;
    }

    public ComCopyrightworkExample groupByClassLb() {
        if(groupByClause == null){
            groupByClause = "class_lb ";
        }
        else{
            groupByClause += " ,class_lb ";
        }
        
        return this;
    }

    public ComCopyrightworkExample groupByCompletiondate() {
        if(groupByClause == null){
            groupByClause = "completiondate ";
        }
        else{
            groupByClause += " ,completiondate ";
        }
        
        return this;
    }

    public ComCopyrightworkExample groupByRdate() {
        if(groupByClause == null){
            groupByClause = "rdate ";
        }
        else{
            groupByClause += " ,rdate ";
        }
        
        return this;
    }

    public ComCopyrightworkExample groupByFrdate() {
        if(groupByClause == null){
            groupByClause = "frdate ";
        }
        else{
            groupByClause += " ,frdate ";
        }
        
        return this;
    }

    public ComCopyrightworkExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public ComCopyrightworkExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public ComCopyrightworkExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public ComCopyrightworkExample groupConcatBid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(bid SEPARATOR \'|\') as bid");
        return this;
    }

    public ComCopyrightworkExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public ComCopyrightworkExample groupConcatWorkname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(workname SEPARATOR \'|\') as workname");
        return this;
    }

    public ComCopyrightworkExample groupConcatRnumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rnumber SEPARATOR \'|\') as rnumber");
        return this;
    }

    public ComCopyrightworkExample groupConcatClassLb() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(class_lb SEPARATOR \'|\') as class_lb");
        return this;
    }

    public ComCopyrightworkExample groupConcatCompletiondate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(completiondate SEPARATOR \'|\') as completiondate");
        return this;
    }

    public ComCopyrightworkExample groupConcatRdate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rdate SEPARATOR \'|\') as rdate");
        return this;
    }

    public ComCopyrightworkExample groupConcatFrdate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(frdate SEPARATOR \'|\') as frdate");
        return this;
    }

    public ComCopyrightworkExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public ComCopyrightworkExample groupConcatAtime() {
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

        public Criteria andWorknameIsNull() {
            addCriterion("workname is null");
            return (Criteria) this;
        }

        public Criteria andWorknameIsNotNull() {
            addCriterion("workname is not null");
            return (Criteria) this;
        }

        public Criteria andWorknameEqualTo(String value) {
            addCriterion("workname =", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotEqualTo(String value) {
            addCriterion("workname <>", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThan(String value) {
            addCriterion("workname >", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThanOrEqualTo(String value) {
            addCriterion("workname >=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThan(String value) {
            addCriterion("workname <", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThanOrEqualTo(String value) {
            addCriterion("workname <=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLike(String value) {
            addCriterion("workname like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotLike(String value) {
            addCriterion("workname not like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameIn(List<String> values) {
            addCriterion("workname in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotIn(List<String> values) {
            addCriterion("workname not in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameBetween(String value1, String value2) {
            addCriterion("workname between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotBetween(String value1, String value2) {
            addCriterion("workname not between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andRnumberIsNull() {
            addCriterion("rnumber is null");
            return (Criteria) this;
        }

        public Criteria andRnumberIsNotNull() {
            addCriterion("rnumber is not null");
            return (Criteria) this;
        }

        public Criteria andRnumberEqualTo(String value) {
            addCriterion("rnumber =", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberNotEqualTo(String value) {
            addCriterion("rnumber <>", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberGreaterThan(String value) {
            addCriterion("rnumber >", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberGreaterThanOrEqualTo(String value) {
            addCriterion("rnumber >=", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberLessThan(String value) {
            addCriterion("rnumber <", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberLessThanOrEqualTo(String value) {
            addCriterion("rnumber <=", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberLike(String value) {
            addCriterion("rnumber like", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberNotLike(String value) {
            addCriterion("rnumber not like", value, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberIn(List<String> values) {
            addCriterion("rnumber in", values, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberNotIn(List<String> values) {
            addCriterion("rnumber not in", values, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberBetween(String value1, String value2) {
            addCriterion("rnumber between", value1, value2, "rnumber");
            return (Criteria) this;
        }

        public Criteria andRnumberNotBetween(String value1, String value2) {
            addCriterion("rnumber not between", value1, value2, "rnumber");
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

        public Criteria andCompletiondateIsNull() {
            addCriterion("completiondate is null");
            return (Criteria) this;
        }

        public Criteria andCompletiondateIsNotNull() {
            addCriterion("completiondate is not null");
            return (Criteria) this;
        }

        public Criteria andCompletiondateEqualTo(String value) {
            addCriterion("completiondate =", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateNotEqualTo(String value) {
            addCriterion("completiondate <>", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateGreaterThan(String value) {
            addCriterion("completiondate >", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateGreaterThanOrEqualTo(String value) {
            addCriterion("completiondate >=", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateLessThan(String value) {
            addCriterion("completiondate <", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateLessThanOrEqualTo(String value) {
            addCriterion("completiondate <=", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateLike(String value) {
            addCriterion("completiondate like", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateNotLike(String value) {
            addCriterion("completiondate not like", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateIn(List<String> values) {
            addCriterion("completiondate in", values, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateNotIn(List<String> values) {
            addCriterion("completiondate not in", values, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateBetween(String value1, String value2) {
            addCriterion("completiondate between", value1, value2, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateNotBetween(String value1, String value2) {
            addCriterion("completiondate not between", value1, value2, "completiondate");
            return (Criteria) this;
        }

        public Criteria andRdateIsNull() {
            addCriterion("rdate is null");
            return (Criteria) this;
        }

        public Criteria andRdateIsNotNull() {
            addCriterion("rdate is not null");
            return (Criteria) this;
        }

        public Criteria andRdateEqualTo(String value) {
            addCriterion("rdate =", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotEqualTo(String value) {
            addCriterion("rdate <>", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThan(String value) {
            addCriterion("rdate >", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThanOrEqualTo(String value) {
            addCriterion("rdate >=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThan(String value) {
            addCriterion("rdate <", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThanOrEqualTo(String value) {
            addCriterion("rdate <=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLike(String value) {
            addCriterion("rdate like", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotLike(String value) {
            addCriterion("rdate not like", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateIn(List<String> values) {
            addCriterion("rdate in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotIn(List<String> values) {
            addCriterion("rdate not in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateBetween(String value1, String value2) {
            addCriterion("rdate between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotBetween(String value1, String value2) {
            addCriterion("rdate not between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andFrdateIsNull() {
            addCriterion("frdate is null");
            return (Criteria) this;
        }

        public Criteria andFrdateIsNotNull() {
            addCriterion("frdate is not null");
            return (Criteria) this;
        }

        public Criteria andFrdateEqualTo(String value) {
            addCriterion("frdate =", value, "frdate");
            return (Criteria) this;
        }

        public Criteria andFrdateNotEqualTo(String value) {
            addCriterion("frdate <>", value, "frdate");
            return (Criteria) this;
        }

        public Criteria andFrdateGreaterThan(String value) {
            addCriterion("frdate >", value, "frdate");
            return (Criteria) this;
        }

        public Criteria andFrdateGreaterThanOrEqualTo(String value) {
            addCriterion("frdate >=", value, "frdate");
            return (Criteria) this;
        }

        public Criteria andFrdateLessThan(String value) {
            addCriterion("frdate <", value, "frdate");
            return (Criteria) this;
        }

        public Criteria andFrdateLessThanOrEqualTo(String value) {
            addCriterion("frdate <=", value, "frdate");
            return (Criteria) this;
        }

        public Criteria andFrdateLike(String value) {
            addCriterion("frdate like", value, "frdate");
            return (Criteria) this;
        }

        public Criteria andFrdateNotLike(String value) {
            addCriterion("frdate not like", value, "frdate");
            return (Criteria) this;
        }

        public Criteria andFrdateIn(List<String> values) {
            addCriterion("frdate in", values, "frdate");
            return (Criteria) this;
        }

        public Criteria andFrdateNotIn(List<String> values) {
            addCriterion("frdate not in", values, "frdate");
            return (Criteria) this;
        }

        public Criteria andFrdateBetween(String value1, String value2) {
            addCriterion("frdate between", value1, value2, "frdate");
            return (Criteria) this;
        }

        public Criteria andFrdateNotBetween(String value1, String value2) {
            addCriterion("frdate not between", value1, value2, "frdate");
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
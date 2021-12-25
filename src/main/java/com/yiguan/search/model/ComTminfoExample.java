package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComTminfoExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public ComTminfoExample() {
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

    public ComTminfoExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public ComTminfoExample needBid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("bid");
        
        return this;
    }

    public ComTminfoExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public ComTminfoExample needAdate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("adate");
        
        return this;
    }

    public ComTminfoExample needBrandname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("brandname");
        
        return this;
    }

    public ComTminfoExample needRnumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rnumber");
        
        return this;
    }

    public ComTminfoExample needClassLb() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("class_lb");
        
        return this;
    }

    public ComTminfoExample needState() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("state");
        
        return this;
    }

    public ComTminfoExample needTmpic() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("tmpic");
        
        return this;
    }

    public ComTminfoExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public ComTminfoExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public ComTminfoExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public ComTminfoExample orderByBid(String type) {
        if(orderByClause == null){
            orderByClause = "bid " + type;
        }
        else{
            orderByClause += " ,bid " + type;
        }
        
        return this;
    }

    public ComTminfoExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public ComTminfoExample orderByAdate(String type) {
        if(orderByClause == null){
            orderByClause = "adate " + type;
        }
        else{
            orderByClause += " ,adate " + type;
        }
        
        return this;
    }

    public ComTminfoExample orderByBrandname(String type) {
        if(orderByClause == null){
            orderByClause = "brandname " + type;
        }
        else{
            orderByClause += " ,brandname " + type;
        }
        
        return this;
    }

    public ComTminfoExample orderByRnumber(String type) {
        if(orderByClause == null){
            orderByClause = "rnumber " + type;
        }
        else{
            orderByClause += " ,rnumber " + type;
        }
        
        return this;
    }

    public ComTminfoExample orderByClassLb(String type) {
        if(orderByClause == null){
            orderByClause = "class_lb " + type;
        }
        else{
            orderByClause += " ,class_lb " + type;
        }
        
        return this;
    }

    public ComTminfoExample orderByState(String type) {
        if(orderByClause == null){
            orderByClause = "state " + type;
        }
        else{
            orderByClause += " ,state " + type;
        }
        
        return this;
    }

    public ComTminfoExample orderByTmpic(String type) {
        if(orderByClause == null){
            orderByClause = "tmpic " + type;
        }
        else{
            orderByClause += " ,tmpic " + type;
        }
        
        return this;
    }

    public ComTminfoExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public ComTminfoExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public ComTminfoExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public ComTminfoExample groupByBid() {
        if(groupByClause == null){
            groupByClause = "bid ";
        }
        else{
            groupByClause += " ,bid ";
        }
        
        return this;
    }

    public ComTminfoExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public ComTminfoExample groupByAdate() {
        if(groupByClause == null){
            groupByClause = "adate ";
        }
        else{
            groupByClause += " ,adate ";
        }
        
        return this;
    }

    public ComTminfoExample groupByBrandname() {
        if(groupByClause == null){
            groupByClause = "brandname ";
        }
        else{
            groupByClause += " ,brandname ";
        }
        
        return this;
    }

    public ComTminfoExample groupByRnumber() {
        if(groupByClause == null){
            groupByClause = "rnumber ";
        }
        else{
            groupByClause += " ,rnumber ";
        }
        
        return this;
    }

    public ComTminfoExample groupByClassLb() {
        if(groupByClause == null){
            groupByClause = "class_lb ";
        }
        else{
            groupByClause += " ,class_lb ";
        }
        
        return this;
    }

    public ComTminfoExample groupByState() {
        if(groupByClause == null){
            groupByClause = "state ";
        }
        else{
            groupByClause += " ,state ";
        }
        
        return this;
    }

    public ComTminfoExample groupByTmpic() {
        if(groupByClause == null){
            groupByClause = "tmpic ";
        }
        else{
            groupByClause += " ,tmpic ";
        }
        
        return this;
    }

    public ComTminfoExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public ComTminfoExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public ComTminfoExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public ComTminfoExample groupConcatBid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(bid SEPARATOR \'|\') as bid");
        return this;
    }

    public ComTminfoExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public ComTminfoExample groupConcatAdate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(adate SEPARATOR \'|\') as adate");
        return this;
    }

    public ComTminfoExample groupConcatBrandname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(brandname SEPARATOR \'|\') as brandname");
        return this;
    }

    public ComTminfoExample groupConcatRnumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rnumber SEPARATOR \'|\') as rnumber");
        return this;
    }

    public ComTminfoExample groupConcatClassLb() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(class_lb SEPARATOR \'|\') as class_lb");
        return this;
    }

    public ComTminfoExample groupConcatState() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(state SEPARATOR \'|\') as state");
        return this;
    }

    public ComTminfoExample groupConcatTmpic() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(tmpic SEPARATOR \'|\') as tmpic");
        return this;
    }

    public ComTminfoExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public ComTminfoExample groupConcatAtime() {
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

        public Criteria andAdateIsNull() {
            addCriterion("adate is null");
            return (Criteria) this;
        }

        public Criteria andAdateIsNotNull() {
            addCriterion("adate is not null");
            return (Criteria) this;
        }

        public Criteria andAdateEqualTo(String value) {
            addCriterion("adate =", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotEqualTo(String value) {
            addCriterion("adate <>", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThan(String value) {
            addCriterion("adate >", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThanOrEqualTo(String value) {
            addCriterion("adate >=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThan(String value) {
            addCriterion("adate <", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThanOrEqualTo(String value) {
            addCriterion("adate <=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLike(String value) {
            addCriterion("adate like", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotLike(String value) {
            addCriterion("adate not like", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateIn(List<String> values) {
            addCriterion("adate in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotIn(List<String> values) {
            addCriterion("adate not in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateBetween(String value1, String value2) {
            addCriterion("adate between", value1, value2, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotBetween(String value1, String value2) {
            addCriterion("adate not between", value1, value2, "adate");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNull() {
            addCriterion("brandname is null");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNotNull() {
            addCriterion("brandname is not null");
            return (Criteria) this;
        }

        public Criteria andBrandnameEqualTo(String value) {
            addCriterion("brandname =", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotEqualTo(String value) {
            addCriterion("brandname <>", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThan(String value) {
            addCriterion("brandname >", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("brandname >=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThan(String value) {
            addCriterion("brandname <", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThanOrEqualTo(String value) {
            addCriterion("brandname <=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLike(String value) {
            addCriterion("brandname like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotLike(String value) {
            addCriterion("brandname not like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameIn(List<String> values) {
            addCriterion("brandname in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotIn(List<String> values) {
            addCriterion("brandname not in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameBetween(String value1, String value2) {
            addCriterion("brandname between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotBetween(String value1, String value2) {
            addCriterion("brandname not between", value1, value2, "brandname");
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

        public Criteria andTmpicIsNull() {
            addCriterion("tmpic is null");
            return (Criteria) this;
        }

        public Criteria andTmpicIsNotNull() {
            addCriterion("tmpic is not null");
            return (Criteria) this;
        }

        public Criteria andTmpicEqualTo(String value) {
            addCriterion("tmpic =", value, "tmpic");
            return (Criteria) this;
        }

        public Criteria andTmpicNotEqualTo(String value) {
            addCriterion("tmpic <>", value, "tmpic");
            return (Criteria) this;
        }

        public Criteria andTmpicGreaterThan(String value) {
            addCriterion("tmpic >", value, "tmpic");
            return (Criteria) this;
        }

        public Criteria andTmpicGreaterThanOrEqualTo(String value) {
            addCriterion("tmpic >=", value, "tmpic");
            return (Criteria) this;
        }

        public Criteria andTmpicLessThan(String value) {
            addCriterion("tmpic <", value, "tmpic");
            return (Criteria) this;
        }

        public Criteria andTmpicLessThanOrEqualTo(String value) {
            addCriterion("tmpic <=", value, "tmpic");
            return (Criteria) this;
        }

        public Criteria andTmpicLike(String value) {
            addCriterion("tmpic like", value, "tmpic");
            return (Criteria) this;
        }

        public Criteria andTmpicNotLike(String value) {
            addCriterion("tmpic not like", value, "tmpic");
            return (Criteria) this;
        }

        public Criteria andTmpicIn(List<String> values) {
            addCriterion("tmpic in", values, "tmpic");
            return (Criteria) this;
        }

        public Criteria andTmpicNotIn(List<String> values) {
            addCriterion("tmpic not in", values, "tmpic");
            return (Criteria) this;
        }

        public Criteria andTmpicBetween(String value1, String value2) {
            addCriterion("tmpic between", value1, value2, "tmpic");
            return (Criteria) this;
        }

        public Criteria andTmpicNotBetween(String value1, String value2) {
            addCriterion("tmpic not between", value1, value2, "tmpic");
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
package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComChangeInfoExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public ComChangeInfoExample() {
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

    public ComChangeInfoExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public ComChangeInfoExample needBid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("bid");
        
        return this;
    }

    public ComChangeInfoExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public ComChangeInfoExample needChangeTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("change_time");
        
        return this;
    }

    public ComChangeInfoExample needChangeItem() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("change_item");
        
        return this;
    }

    public ComChangeInfoExample needBeforeChange() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("before_change");
        
        return this;
    }

    public ComChangeInfoExample needAfterChange() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("after_change");
        
        return this;
    }

    public ComChangeInfoExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public ComChangeInfoExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public ComChangeInfoExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public ComChangeInfoExample orderByBid(String type) {
        if(orderByClause == null){
            orderByClause = "bid " + type;
        }
        else{
            orderByClause += " ,bid " + type;
        }
        
        return this;
    }

    public ComChangeInfoExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public ComChangeInfoExample orderByChangeTime(String type) {
        if(orderByClause == null){
            orderByClause = "change_time " + type;
        }
        else{
            orderByClause += " ,change_time " + type;
        }
        
        return this;
    }

    public ComChangeInfoExample orderByChangeItem(String type) {
        if(orderByClause == null){
            orderByClause = "change_item " + type;
        }
        else{
            orderByClause += " ,change_item " + type;
        }
        
        return this;
    }

    public ComChangeInfoExample orderByBeforeChange(String type) {
        if(orderByClause == null){
            orderByClause = "before_change " + type;
        }
        else{
            orderByClause += " ,before_change " + type;
        }
        
        return this;
    }

    public ComChangeInfoExample orderByAfterChange(String type) {
        if(orderByClause == null){
            orderByClause = "after_change " + type;
        }
        else{
            orderByClause += " ,after_change " + type;
        }
        
        return this;
    }

    public ComChangeInfoExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public ComChangeInfoExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public ComChangeInfoExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public ComChangeInfoExample groupByBid() {
        if(groupByClause == null){
            groupByClause = "bid ";
        }
        else{
            groupByClause += " ,bid ";
        }
        
        return this;
    }

    public ComChangeInfoExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public ComChangeInfoExample groupByChangeTime() {
        if(groupByClause == null){
            groupByClause = "change_time ";
        }
        else{
            groupByClause += " ,change_time ";
        }
        
        return this;
    }

    public ComChangeInfoExample groupByChangeItem() {
        if(groupByClause == null){
            groupByClause = "change_item ";
        }
        else{
            groupByClause += " ,change_item ";
        }
        
        return this;
    }

    public ComChangeInfoExample groupByBeforeChange() {
        if(groupByClause == null){
            groupByClause = "before_change ";
        }
        else{
            groupByClause += " ,before_change ";
        }
        
        return this;
    }

    public ComChangeInfoExample groupByAfterChange() {
        if(groupByClause == null){
            groupByClause = "after_change ";
        }
        else{
            groupByClause += " ,after_change ";
        }
        
        return this;
    }

    public ComChangeInfoExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public ComChangeInfoExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public ComChangeInfoExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public ComChangeInfoExample groupConcatBid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(bid SEPARATOR \'|\') as bid");
        return this;
    }

    public ComChangeInfoExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public ComChangeInfoExample groupConcatChangeTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(change_time SEPARATOR \'|\') as change_time");
        return this;
    }

    public ComChangeInfoExample groupConcatChangeItem() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(change_item SEPARATOR \'|\') as change_item");
        return this;
    }

    public ComChangeInfoExample groupConcatBeforeChange() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(before_change SEPARATOR \'|\') as before_change");
        return this;
    }

    public ComChangeInfoExample groupConcatAfterChange() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(after_change SEPARATOR \'|\') as after_change");
        return this;
    }

    public ComChangeInfoExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public ComChangeInfoExample groupConcatAtime() {
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

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(String value) {
            addCriterion("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(String value) {
            addCriterion("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(String value) {
            addCriterion("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(String value) {
            addCriterion("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(String value) {
            addCriterion("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLike(String value) {
            addCriterion("change_time like", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotLike(String value) {
            addCriterion("change_time not like", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<String> values) {
            addCriterion("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<String> values) {
            addCriterion("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(String value1, String value2) {
            addCriterion("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(String value1, String value2) {
            addCriterion("change_time not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeItemIsNull() {
            addCriterion("change_item is null");
            return (Criteria) this;
        }

        public Criteria andChangeItemIsNotNull() {
            addCriterion("change_item is not null");
            return (Criteria) this;
        }

        public Criteria andChangeItemEqualTo(String value) {
            addCriterion("change_item =", value, "changeItem");
            return (Criteria) this;
        }

        public Criteria andChangeItemNotEqualTo(String value) {
            addCriterion("change_item <>", value, "changeItem");
            return (Criteria) this;
        }

        public Criteria andChangeItemGreaterThan(String value) {
            addCriterion("change_item >", value, "changeItem");
            return (Criteria) this;
        }

        public Criteria andChangeItemGreaterThanOrEqualTo(String value) {
            addCriterion("change_item >=", value, "changeItem");
            return (Criteria) this;
        }

        public Criteria andChangeItemLessThan(String value) {
            addCriterion("change_item <", value, "changeItem");
            return (Criteria) this;
        }

        public Criteria andChangeItemLessThanOrEqualTo(String value) {
            addCriterion("change_item <=", value, "changeItem");
            return (Criteria) this;
        }

        public Criteria andChangeItemLike(String value) {
            addCriterion("change_item like", value, "changeItem");
            return (Criteria) this;
        }

        public Criteria andChangeItemNotLike(String value) {
            addCriterion("change_item not like", value, "changeItem");
            return (Criteria) this;
        }

        public Criteria andChangeItemIn(List<String> values) {
            addCriterion("change_item in", values, "changeItem");
            return (Criteria) this;
        }

        public Criteria andChangeItemNotIn(List<String> values) {
            addCriterion("change_item not in", values, "changeItem");
            return (Criteria) this;
        }

        public Criteria andChangeItemBetween(String value1, String value2) {
            addCriterion("change_item between", value1, value2, "changeItem");
            return (Criteria) this;
        }

        public Criteria andChangeItemNotBetween(String value1, String value2) {
            addCriterion("change_item not between", value1, value2, "changeItem");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeIsNull() {
            addCriterion("before_change is null");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeIsNotNull() {
            addCriterion("before_change is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeEqualTo(String value) {
            addCriterion("before_change =", value, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeNotEqualTo(String value) {
            addCriterion("before_change <>", value, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeGreaterThan(String value) {
            addCriterion("before_change >", value, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("before_change >=", value, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeLessThan(String value) {
            addCriterion("before_change <", value, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeLessThanOrEqualTo(String value) {
            addCriterion("before_change <=", value, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeLike(String value) {
            addCriterion("before_change like", value, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeNotLike(String value) {
            addCriterion("before_change not like", value, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeIn(List<String> values) {
            addCriterion("before_change in", values, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeNotIn(List<String> values) {
            addCriterion("before_change not in", values, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeBetween(String value1, String value2) {
            addCriterion("before_change between", value1, value2, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andBeforeChangeNotBetween(String value1, String value2) {
            addCriterion("before_change not between", value1, value2, "beforeChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeIsNull() {
            addCriterion("after_change is null");
            return (Criteria) this;
        }

        public Criteria andAfterChangeIsNotNull() {
            addCriterion("after_change is not null");
            return (Criteria) this;
        }

        public Criteria andAfterChangeEqualTo(String value) {
            addCriterion("after_change =", value, "afterChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeNotEqualTo(String value) {
            addCriterion("after_change <>", value, "afterChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeGreaterThan(String value) {
            addCriterion("after_change >", value, "afterChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeGreaterThanOrEqualTo(String value) {
            addCriterion("after_change >=", value, "afterChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeLessThan(String value) {
            addCriterion("after_change <", value, "afterChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeLessThanOrEqualTo(String value) {
            addCriterion("after_change <=", value, "afterChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeLike(String value) {
            addCriterion("after_change like", value, "afterChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeNotLike(String value) {
            addCriterion("after_change not like", value, "afterChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeIn(List<String> values) {
            addCriterion("after_change in", values, "afterChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeNotIn(List<String> values) {
            addCriterion("after_change not in", values, "afterChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeBetween(String value1, String value2) {
            addCriterion("after_change between", value1, value2, "afterChange");
            return (Criteria) this;
        }

        public Criteria andAfterChangeNotBetween(String value1, String value2) {
            addCriterion("after_change not between", value1, value2, "afterChange");
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
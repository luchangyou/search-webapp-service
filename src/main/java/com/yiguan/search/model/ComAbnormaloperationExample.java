package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComAbnormaloperationExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public ComAbnormaloperationExample() {
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

    public ComAbnormaloperationExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public ComAbnormaloperationExample needBid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("bid");
        
        return this;
    }

    public ComAbnormaloperationExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public ComAbnormaloperationExample needInclusionDate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("inclusion_date");
        
        return this;
    }

    public ComAbnormaloperationExample needInclusionReason() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("inclusion_reason");
        
        return this;
    }

    public ComAbnormaloperationExample needDecisionOrgan() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("decision_organ");
        
        return this;
    }

    public ComAbnormaloperationExample needRemoveDate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("remove_date");
        
        return this;
    }

    public ComAbnormaloperationExample needRemoveReason() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("remove_reason");
        
        return this;
    }

    public ComAbnormaloperationExample needRemoveOrgan() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("remove_organ");
        
        return this;
    }

    public ComAbnormaloperationExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public ComAbnormaloperationExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public ComAbnormaloperationExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public ComAbnormaloperationExample orderByBid(String type) {
        if(orderByClause == null){
            orderByClause = "bid " + type;
        }
        else{
            orderByClause += " ,bid " + type;
        }
        
        return this;
    }

    public ComAbnormaloperationExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public ComAbnormaloperationExample orderByInclusionDate(String type) {
        if(orderByClause == null){
            orderByClause = "inclusion_date " + type;
        }
        else{
            orderByClause += " ,inclusion_date " + type;
        }
        
        return this;
    }

    public ComAbnormaloperationExample orderByInclusionReason(String type) {
        if(orderByClause == null){
            orderByClause = "inclusion_reason " + type;
        }
        else{
            orderByClause += " ,inclusion_reason " + type;
        }
        
        return this;
    }

    public ComAbnormaloperationExample orderByDecisionOrgan(String type) {
        if(orderByClause == null){
            orderByClause = "decision_organ " + type;
        }
        else{
            orderByClause += " ,decision_organ " + type;
        }
        
        return this;
    }

    public ComAbnormaloperationExample orderByRemoveDate(String type) {
        if(orderByClause == null){
            orderByClause = "remove_date " + type;
        }
        else{
            orderByClause += " ,remove_date " + type;
        }
        
        return this;
    }

    public ComAbnormaloperationExample orderByRemoveReason(String type) {
        if(orderByClause == null){
            orderByClause = "remove_reason " + type;
        }
        else{
            orderByClause += " ,remove_reason " + type;
        }
        
        return this;
    }

    public ComAbnormaloperationExample orderByRemoveOrgan(String type) {
        if(orderByClause == null){
            orderByClause = "remove_organ " + type;
        }
        else{
            orderByClause += " ,remove_organ " + type;
        }
        
        return this;
    }

    public ComAbnormaloperationExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public ComAbnormaloperationExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupByBid() {
        if(groupByClause == null){
            groupByClause = "bid ";
        }
        else{
            groupByClause += " ,bid ";
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupByInclusionDate() {
        if(groupByClause == null){
            groupByClause = "inclusion_date ";
        }
        else{
            groupByClause += " ,inclusion_date ";
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupByInclusionReason() {
        if(groupByClause == null){
            groupByClause = "inclusion_reason ";
        }
        else{
            groupByClause += " ,inclusion_reason ";
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupByDecisionOrgan() {
        if(groupByClause == null){
            groupByClause = "decision_organ ";
        }
        else{
            groupByClause += " ,decision_organ ";
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupByRemoveDate() {
        if(groupByClause == null){
            groupByClause = "remove_date ";
        }
        else{
            groupByClause += " ,remove_date ";
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupByRemoveReason() {
        if(groupByClause == null){
            groupByClause = "remove_reason ";
        }
        else{
            groupByClause += " ,remove_reason ";
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupByRemoveOrgan() {
        if(groupByClause == null){
            groupByClause = "remove_organ ";
        }
        else{
            groupByClause += " ,remove_organ ";
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public ComAbnormaloperationExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public ComAbnormaloperationExample groupConcatBid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(bid SEPARATOR \'|\') as bid");
        return this;
    }

    public ComAbnormaloperationExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public ComAbnormaloperationExample groupConcatInclusionDate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(inclusion_date SEPARATOR \'|\') as inclusion_date");
        return this;
    }

    public ComAbnormaloperationExample groupConcatInclusionReason() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(inclusion_reason SEPARATOR \'|\') as inclusion_reason");
        return this;
    }

    public ComAbnormaloperationExample groupConcatDecisionOrgan() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(decision_organ SEPARATOR \'|\') as decision_organ");
        return this;
    }

    public ComAbnormaloperationExample groupConcatRemoveDate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(remove_date SEPARATOR \'|\') as remove_date");
        return this;
    }

    public ComAbnormaloperationExample groupConcatRemoveReason() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(remove_reason SEPARATOR \'|\') as remove_reason");
        return this;
    }

    public ComAbnormaloperationExample groupConcatRemoveOrgan() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(remove_organ SEPARATOR \'|\') as remove_organ");
        return this;
    }

    public ComAbnormaloperationExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public ComAbnormaloperationExample groupConcatAtime() {
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

        public Criteria andInclusionDateIsNull() {
            addCriterion("inclusion_date is null");
            return (Criteria) this;
        }

        public Criteria andInclusionDateIsNotNull() {
            addCriterion("inclusion_date is not null");
            return (Criteria) this;
        }

        public Criteria andInclusionDateEqualTo(String value) {
            addCriterion("inclusion_date =", value, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionDateNotEqualTo(String value) {
            addCriterion("inclusion_date <>", value, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionDateGreaterThan(String value) {
            addCriterion("inclusion_date >", value, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionDateGreaterThanOrEqualTo(String value) {
            addCriterion("inclusion_date >=", value, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionDateLessThan(String value) {
            addCriterion("inclusion_date <", value, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionDateLessThanOrEqualTo(String value) {
            addCriterion("inclusion_date <=", value, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionDateLike(String value) {
            addCriterion("inclusion_date like", value, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionDateNotLike(String value) {
            addCriterion("inclusion_date not like", value, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionDateIn(List<String> values) {
            addCriterion("inclusion_date in", values, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionDateNotIn(List<String> values) {
            addCriterion("inclusion_date not in", values, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionDateBetween(String value1, String value2) {
            addCriterion("inclusion_date between", value1, value2, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionDateNotBetween(String value1, String value2) {
            addCriterion("inclusion_date not between", value1, value2, "inclusionDate");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonIsNull() {
            addCriterion("inclusion_reason is null");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonIsNotNull() {
            addCriterion("inclusion_reason is not null");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonEqualTo(String value) {
            addCriterion("inclusion_reason =", value, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonNotEqualTo(String value) {
            addCriterion("inclusion_reason <>", value, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonGreaterThan(String value) {
            addCriterion("inclusion_reason >", value, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonGreaterThanOrEqualTo(String value) {
            addCriterion("inclusion_reason >=", value, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonLessThan(String value) {
            addCriterion("inclusion_reason <", value, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonLessThanOrEqualTo(String value) {
            addCriterion("inclusion_reason <=", value, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonLike(String value) {
            addCriterion("inclusion_reason like", value, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonNotLike(String value) {
            addCriterion("inclusion_reason not like", value, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonIn(List<String> values) {
            addCriterion("inclusion_reason in", values, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonNotIn(List<String> values) {
            addCriterion("inclusion_reason not in", values, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonBetween(String value1, String value2) {
            addCriterion("inclusion_reason between", value1, value2, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andInclusionReasonNotBetween(String value1, String value2) {
            addCriterion("inclusion_reason not between", value1, value2, "inclusionReason");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganIsNull() {
            addCriterion("decision_organ is null");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganIsNotNull() {
            addCriterion("decision_organ is not null");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganEqualTo(String value) {
            addCriterion("decision_organ =", value, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganNotEqualTo(String value) {
            addCriterion("decision_organ <>", value, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganGreaterThan(String value) {
            addCriterion("decision_organ >", value, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganGreaterThanOrEqualTo(String value) {
            addCriterion("decision_organ >=", value, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganLessThan(String value) {
            addCriterion("decision_organ <", value, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganLessThanOrEqualTo(String value) {
            addCriterion("decision_organ <=", value, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganLike(String value) {
            addCriterion("decision_organ like", value, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganNotLike(String value) {
            addCriterion("decision_organ not like", value, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganIn(List<String> values) {
            addCriterion("decision_organ in", values, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganNotIn(List<String> values) {
            addCriterion("decision_organ not in", values, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganBetween(String value1, String value2) {
            addCriterion("decision_organ between", value1, value2, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andDecisionOrganNotBetween(String value1, String value2) {
            addCriterion("decision_organ not between", value1, value2, "decisionOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveDateIsNull() {
            addCriterion("remove_date is null");
            return (Criteria) this;
        }

        public Criteria andRemoveDateIsNotNull() {
            addCriterion("remove_date is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveDateEqualTo(String value) {
            addCriterion("remove_date =", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateNotEqualTo(String value) {
            addCriterion("remove_date <>", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateGreaterThan(String value) {
            addCriterion("remove_date >", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateGreaterThanOrEqualTo(String value) {
            addCriterion("remove_date >=", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateLessThan(String value) {
            addCriterion("remove_date <", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateLessThanOrEqualTo(String value) {
            addCriterion("remove_date <=", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateLike(String value) {
            addCriterion("remove_date like", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateNotLike(String value) {
            addCriterion("remove_date not like", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateIn(List<String> values) {
            addCriterion("remove_date in", values, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateNotIn(List<String> values) {
            addCriterion("remove_date not in", values, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateBetween(String value1, String value2) {
            addCriterion("remove_date between", value1, value2, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateNotBetween(String value1, String value2) {
            addCriterion("remove_date not between", value1, value2, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonIsNull() {
            addCriterion("remove_reason is null");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonIsNotNull() {
            addCriterion("remove_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonEqualTo(String value) {
            addCriterion("remove_reason =", value, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonNotEqualTo(String value) {
            addCriterion("remove_reason <>", value, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonGreaterThan(String value) {
            addCriterion("remove_reason >", value, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonGreaterThanOrEqualTo(String value) {
            addCriterion("remove_reason >=", value, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonLessThan(String value) {
            addCriterion("remove_reason <", value, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonLessThanOrEqualTo(String value) {
            addCriterion("remove_reason <=", value, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonLike(String value) {
            addCriterion("remove_reason like", value, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonNotLike(String value) {
            addCriterion("remove_reason not like", value, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonIn(List<String> values) {
            addCriterion("remove_reason in", values, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonNotIn(List<String> values) {
            addCriterion("remove_reason not in", values, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonBetween(String value1, String value2) {
            addCriterion("remove_reason between", value1, value2, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveReasonNotBetween(String value1, String value2) {
            addCriterion("remove_reason not between", value1, value2, "removeReason");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganIsNull() {
            addCriterion("remove_organ is null");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganIsNotNull() {
            addCriterion("remove_organ is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganEqualTo(String value) {
            addCriterion("remove_organ =", value, "removeOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganNotEqualTo(String value) {
            addCriterion("remove_organ <>", value, "removeOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganGreaterThan(String value) {
            addCriterion("remove_organ >", value, "removeOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganGreaterThanOrEqualTo(String value) {
            addCriterion("remove_organ >=", value, "removeOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganLessThan(String value) {
            addCriterion("remove_organ <", value, "removeOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganLessThanOrEqualTo(String value) {
            addCriterion("remove_organ <=", value, "removeOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganLike(String value) {
            addCriterion("remove_organ like", value, "removeOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganNotLike(String value) {
            addCriterion("remove_organ not like", value, "removeOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganIn(List<String> values) {
            addCriterion("remove_organ in", values, "removeOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganNotIn(List<String> values) {
            addCriterion("remove_organ not in", values, "removeOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganBetween(String value1, String value2) {
            addCriterion("remove_organ between", value1, value2, "removeOrgan");
            return (Criteria) this;
        }

        public Criteria andRemoveOrganNotBetween(String value1, String value2) {
            addCriterion("remove_organ not between", value1, value2, "removeOrgan");
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
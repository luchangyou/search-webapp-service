package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PerEducationInfoExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public PerEducationInfoExample() {
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

    public PerEducationInfoExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public PerEducationInfoExample needSchool() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("school");
        
        return this;
    }

    public PerEducationInfoExample needMajor() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("major");
        
        return this;
    }

    public PerEducationInfoExample needDiploma() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("diploma");
        
        return this;
    }

    public PerEducationInfoExample needStartDate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("start_date");
        
        return this;
    }

    public PerEducationInfoExample needEndDate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("end_date");
        
        return this;
    }

    public PerEducationInfoExample needEvent() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("event");
        
        return this;
    }

    public PerEducationInfoExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public PerEducationInfoExample needType() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("type");
        
        return this;
    }

    public PerEducationInfoExample needPlace() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("place");
        
        return this;
    }

    public PerEducationInfoExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public PerEducationInfoExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public PerEducationInfoExample needEndTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("end_time");
        
        return this;
    }

    public PerEducationInfoExample needStartTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("start_time");
        
        return this;
    }

    public PerEducationInfoExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderBySchool(String type) {
        if(orderByClause == null){
            orderByClause = "school " + type;
        }
        else{
            orderByClause += " ,school " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByMajor(String type) {
        if(orderByClause == null){
            orderByClause = "major " + type;
        }
        else{
            orderByClause += " ,major " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByDiploma(String type) {
        if(orderByClause == null){
            orderByClause = "diploma " + type;
        }
        else{
            orderByClause += " ,diploma " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByStartDate(String type) {
        if(orderByClause == null){
            orderByClause = "start_date " + type;
        }
        else{
            orderByClause += " ,start_date " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByEndDate(String type) {
        if(orderByClause == null){
            orderByClause = "end_date " + type;
        }
        else{
            orderByClause += " ,end_date " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByEvent(String type) {
        if(orderByClause == null){
            orderByClause = "event " + type;
        }
        else{
            orderByClause += " ,event " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByType(String type) {
        if(orderByClause == null){
            orderByClause = "type " + type;
        }
        else{
            orderByClause += " ,type " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByPlace(String type) {
        if(orderByClause == null){
            orderByClause = "place " + type;
        }
        else{
            orderByClause += " ,place " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByEndTime(String type) {
        if(orderByClause == null){
            orderByClause = "end_time " + type;
        }
        else{
            orderByClause += " ,end_time " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample orderByStartTime(String type) {
        if(orderByClause == null){
            orderByClause = "start_time " + type;
        }
        else{
            orderByClause += " ,start_time " + type;
        }
        
        return this;
    }

    public PerEducationInfoExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupBySchool() {
        if(groupByClause == null){
            groupByClause = "school ";
        }
        else{
            groupByClause += " ,school ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByMajor() {
        if(groupByClause == null){
            groupByClause = "major ";
        }
        else{
            groupByClause += " ,major ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByDiploma() {
        if(groupByClause == null){
            groupByClause = "diploma ";
        }
        else{
            groupByClause += " ,diploma ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByStartDate() {
        if(groupByClause == null){
            groupByClause = "start_date ";
        }
        else{
            groupByClause += " ,start_date ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByEndDate() {
        if(groupByClause == null){
            groupByClause = "end_date ";
        }
        else{
            groupByClause += " ,end_date ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByEvent() {
        if(groupByClause == null){
            groupByClause = "event ";
        }
        else{
            groupByClause += " ,event ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByType() {
        if(groupByClause == null){
            groupByClause = "type ";
        }
        else{
            groupByClause += " ,type ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByPlace() {
        if(groupByClause == null){
            groupByClause = "place ";
        }
        else{
            groupByClause += " ,place ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByEndTime() {
        if(groupByClause == null){
            groupByClause = "end_time ";
        }
        else{
            groupByClause += " ,end_time ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupByStartTime() {
        if(groupByClause == null){
            groupByClause = "start_time ";
        }
        else{
            groupByClause += " ,start_time ";
        }
        
        return this;
    }

    public PerEducationInfoExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public PerEducationInfoExample groupConcatSchool() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(school SEPARATOR \'|\') as school");
        return this;
    }

    public PerEducationInfoExample groupConcatMajor() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(major SEPARATOR \'|\') as major");
        return this;
    }

    public PerEducationInfoExample groupConcatDiploma() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(diploma SEPARATOR \'|\') as diploma");
        return this;
    }

    public PerEducationInfoExample groupConcatStartDate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(start_date SEPARATOR \'|\') as start_date");
        return this;
    }

    public PerEducationInfoExample groupConcatEndDate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(end_date SEPARATOR \'|\') as end_date");
        return this;
    }

    public PerEducationInfoExample groupConcatEvent() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(event SEPARATOR \'|\') as event");
        return this;
    }

    public PerEducationInfoExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public PerEducationInfoExample groupConcatType() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(type SEPARATOR \'|\') as type");
        return this;
    }

    public PerEducationInfoExample groupConcatPlace() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(place SEPARATOR \'|\') as place");
        return this;
    }

    public PerEducationInfoExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public PerEducationInfoExample groupConcatAtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(atime SEPARATOR \'|\') as atime");
        return this;
    }

    public PerEducationInfoExample groupConcatEndTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(end_time SEPARATOR \'|\') as end_time");
        return this;
    }

    public PerEducationInfoExample groupConcatStartTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(start_time SEPARATOR \'|\') as start_time");
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNull() {
            addCriterion("diploma is null");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNotNull() {
            addCriterion("diploma is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomaEqualTo(String value) {
            addCriterion("diploma =", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotEqualTo(String value) {
            addCriterion("diploma <>", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThan(String value) {
            addCriterion("diploma >", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThanOrEqualTo(String value) {
            addCriterion("diploma >=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThan(String value) {
            addCriterion("diploma <", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThanOrEqualTo(String value) {
            addCriterion("diploma <=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLike(String value) {
            addCriterion("diploma like", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotLike(String value) {
            addCriterion("diploma not like", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaIn(List<String> values) {
            addCriterion("diploma in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotIn(List<String> values) {
            addCriterion("diploma not in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaBetween(String value1, String value2) {
            addCriterion("diploma between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotBetween(String value1, String value2) {
            addCriterion("diploma not between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("start_date like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("start_date not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("end_date like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("end_date not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEventIsNull() {
            addCriterion("event is null");
            return (Criteria) this;
        }

        public Criteria andEventIsNotNull() {
            addCriterion("event is not null");
            return (Criteria) this;
        }

        public Criteria andEventEqualTo(String value) {
            addCriterion("event =", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotEqualTo(String value) {
            addCriterion("event <>", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThan(String value) {
            addCriterion("event >", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThanOrEqualTo(String value) {
            addCriterion("event >=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThan(String value) {
            addCriterion("event <", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThanOrEqualTo(String value) {
            addCriterion("event <=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLike(String value) {
            addCriterion("event like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotLike(String value) {
            addCriterion("event not like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventIn(List<String> values) {
            addCriterion("event in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotIn(List<String> values) {
            addCriterion("event not in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventBetween(String value1, String value2) {
            addCriterion("event between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotBetween(String value1, String value2) {
            addCriterion("event not between", value1, value2, "event");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
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

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
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
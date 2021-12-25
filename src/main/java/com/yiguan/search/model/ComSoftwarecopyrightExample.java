package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComSoftwarecopyrightExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public ComSoftwarecopyrightExample() {
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

    public ComSoftwarecopyrightExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public ComSoftwarecopyrightExample needBid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("bid");
        
        return this;
    }

    public ComSoftwarecopyrightExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public ComSoftwarecopyrightExample needSoftwarefullname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("softwarefullname");
        
        return this;
    }

    public ComSoftwarecopyrightExample needSoftwareshortname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("softwareshortname");
        
        return this;
    }

    public ComSoftwarecopyrightExample needRegistrationnumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("registrationnumber");
        
        return this;
    }

    public ComSoftwarecopyrightExample needClassificationnumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("classificationnumber");
        
        return this;
    }

    public ComSoftwarecopyrightExample needVersionnumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("versionnumber");
        
        return this;
    }

    public ComSoftwarecopyrightExample needCopyrightowner() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("copyrightowner");
        
        return this;
    }

    public ComSoftwarecopyrightExample needFirstpublicationdata() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("firstpublicationdata");
        
        return this;
    }

    public ComSoftwarecopyrightExample needRegistrationdata() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("registrationdata");
        
        return this;
    }

    public ComSoftwarecopyrightExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public ComSoftwarecopyrightExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public ComSoftwarecopyrightExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderByBid(String type) {
        if(orderByClause == null){
            orderByClause = "bid " + type;
        }
        else{
            orderByClause += " ,bid " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderBySoftwarefullname(String type) {
        if(orderByClause == null){
            orderByClause = "softwarefullname " + type;
        }
        else{
            orderByClause += " ,softwarefullname " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderBySoftwareshortname(String type) {
        if(orderByClause == null){
            orderByClause = "softwareshortname " + type;
        }
        else{
            orderByClause += " ,softwareshortname " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderByRegistrationnumber(String type) {
        if(orderByClause == null){
            orderByClause = "registrationnumber " + type;
        }
        else{
            orderByClause += " ,registrationnumber " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderByClassificationnumber(String type) {
        if(orderByClause == null){
            orderByClause = "classificationnumber " + type;
        }
        else{
            orderByClause += " ,classificationnumber " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderByVersionnumber(String type) {
        if(orderByClause == null){
            orderByClause = "versionnumber " + type;
        }
        else{
            orderByClause += " ,versionnumber " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderByCopyrightowner(String type) {
        if(orderByClause == null){
            orderByClause = "copyrightowner " + type;
        }
        else{
            orderByClause += " ,copyrightowner " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderByFirstpublicationdata(String type) {
        if(orderByClause == null){
            orderByClause = "firstpublicationdata " + type;
        }
        else{
            orderByClause += " ,firstpublicationdata " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderByRegistrationdata(String type) {
        if(orderByClause == null){
            orderByClause = "registrationdata " + type;
        }
        else{
            orderByClause += " ,registrationdata " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupByBid() {
        if(groupByClause == null){
            groupByClause = "bid ";
        }
        else{
            groupByClause += " ,bid ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupBySoftwarefullname() {
        if(groupByClause == null){
            groupByClause = "softwarefullname ";
        }
        else{
            groupByClause += " ,softwarefullname ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupBySoftwareshortname() {
        if(groupByClause == null){
            groupByClause = "softwareshortname ";
        }
        else{
            groupByClause += " ,softwareshortname ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupByRegistrationnumber() {
        if(groupByClause == null){
            groupByClause = "registrationnumber ";
        }
        else{
            groupByClause += " ,registrationnumber ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupByClassificationnumber() {
        if(groupByClause == null){
            groupByClause = "classificationnumber ";
        }
        else{
            groupByClause += " ,classificationnumber ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupByVersionnumber() {
        if(groupByClause == null){
            groupByClause = "versionnumber ";
        }
        else{
            groupByClause += " ,versionnumber ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupByCopyrightowner() {
        if(groupByClause == null){
            groupByClause = "copyrightowner ";
        }
        else{
            groupByClause += " ,copyrightowner ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupByFirstpublicationdata() {
        if(groupByClause == null){
            groupByClause = "firstpublicationdata ";
        }
        else{
            groupByClause += " ,firstpublicationdata ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupByRegistrationdata() {
        if(groupByClause == null){
            groupByClause = "registrationdata ";
        }
        else{
            groupByClause += " ,registrationdata ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatBid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(bid SEPARATOR \'|\') as bid");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatSoftwarefullname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(softwarefullname SEPARATOR \'|\') as softwarefullname");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatSoftwareshortname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(softwareshortname SEPARATOR \'|\') as softwareshortname");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatRegistrationnumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(registrationnumber SEPARATOR \'|\') as registrationnumber");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatClassificationnumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(classificationnumber SEPARATOR \'|\') as classificationnumber");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatVersionnumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(versionnumber SEPARATOR \'|\') as versionnumber");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatCopyrightowner() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(copyrightowner SEPARATOR \'|\') as copyrightowner");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatFirstpublicationdata() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(firstpublicationdata SEPARATOR \'|\') as firstpublicationdata");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatRegistrationdata() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(registrationdata SEPARATOR \'|\') as registrationdata");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public ComSoftwarecopyrightExample groupConcatAtime() {
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

        public Criteria andSoftwarefullnameIsNull() {
            addCriterion("softwarefullname is null");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameIsNotNull() {
            addCriterion("softwarefullname is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameEqualTo(String value) {
            addCriterion("softwarefullname =", value, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameNotEqualTo(String value) {
            addCriterion("softwarefullname <>", value, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameGreaterThan(String value) {
            addCriterion("softwarefullname >", value, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameGreaterThanOrEqualTo(String value) {
            addCriterion("softwarefullname >=", value, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameLessThan(String value) {
            addCriterion("softwarefullname <", value, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameLessThanOrEqualTo(String value) {
            addCriterion("softwarefullname <=", value, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameLike(String value) {
            addCriterion("softwarefullname like", value, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameNotLike(String value) {
            addCriterion("softwarefullname not like", value, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameIn(List<String> values) {
            addCriterion("softwarefullname in", values, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameNotIn(List<String> values) {
            addCriterion("softwarefullname not in", values, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameBetween(String value1, String value2) {
            addCriterion("softwarefullname between", value1, value2, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwarefullnameNotBetween(String value1, String value2) {
            addCriterion("softwarefullname not between", value1, value2, "softwarefullname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameIsNull() {
            addCriterion("softwareshortname is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameIsNotNull() {
            addCriterion("softwareshortname is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameEqualTo(String value) {
            addCriterion("softwareshortname =", value, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameNotEqualTo(String value) {
            addCriterion("softwareshortname <>", value, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameGreaterThan(String value) {
            addCriterion("softwareshortname >", value, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("softwareshortname >=", value, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameLessThan(String value) {
            addCriterion("softwareshortname <", value, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameLessThanOrEqualTo(String value) {
            addCriterion("softwareshortname <=", value, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameLike(String value) {
            addCriterion("softwareshortname like", value, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameNotLike(String value) {
            addCriterion("softwareshortname not like", value, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameIn(List<String> values) {
            addCriterion("softwareshortname in", values, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameNotIn(List<String> values) {
            addCriterion("softwareshortname not in", values, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameBetween(String value1, String value2) {
            addCriterion("softwareshortname between", value1, value2, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andSoftwareshortnameNotBetween(String value1, String value2) {
            addCriterion("softwareshortname not between", value1, value2, "softwareshortname");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberIsNull() {
            addCriterion("registrationnumber is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberIsNotNull() {
            addCriterion("registrationnumber is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberEqualTo(String value) {
            addCriterion("registrationnumber =", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberNotEqualTo(String value) {
            addCriterion("registrationnumber <>", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberGreaterThan(String value) {
            addCriterion("registrationnumber >", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberGreaterThanOrEqualTo(String value) {
            addCriterion("registrationnumber >=", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberLessThan(String value) {
            addCriterion("registrationnumber <", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberLessThanOrEqualTo(String value) {
            addCriterion("registrationnumber <=", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberLike(String value) {
            addCriterion("registrationnumber like", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberNotLike(String value) {
            addCriterion("registrationnumber not like", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberIn(List<String> values) {
            addCriterion("registrationnumber in", values, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberNotIn(List<String> values) {
            addCriterion("registrationnumber not in", values, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberBetween(String value1, String value2) {
            addCriterion("registrationnumber between", value1, value2, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberNotBetween(String value1, String value2) {
            addCriterion("registrationnumber not between", value1, value2, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberIsNull() {
            addCriterion("classificationnumber is null");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberIsNotNull() {
            addCriterion("classificationnumber is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberEqualTo(String value) {
            addCriterion("classificationnumber =", value, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberNotEqualTo(String value) {
            addCriterion("classificationnumber <>", value, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberGreaterThan(String value) {
            addCriterion("classificationnumber >", value, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberGreaterThanOrEqualTo(String value) {
            addCriterion("classificationnumber >=", value, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberLessThan(String value) {
            addCriterion("classificationnumber <", value, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberLessThanOrEqualTo(String value) {
            addCriterion("classificationnumber <=", value, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberLike(String value) {
            addCriterion("classificationnumber like", value, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberNotLike(String value) {
            addCriterion("classificationnumber not like", value, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberIn(List<String> values) {
            addCriterion("classificationnumber in", values, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberNotIn(List<String> values) {
            addCriterion("classificationnumber not in", values, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberBetween(String value1, String value2) {
            addCriterion("classificationnumber between", value1, value2, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andClassificationnumberNotBetween(String value1, String value2) {
            addCriterion("classificationnumber not between", value1, value2, "classificationnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberIsNull() {
            addCriterion("versionnumber is null");
            return (Criteria) this;
        }

        public Criteria andVersionnumberIsNotNull() {
            addCriterion("versionnumber is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnumberEqualTo(String value) {
            addCriterion("versionnumber =", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberNotEqualTo(String value) {
            addCriterion("versionnumber <>", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberGreaterThan(String value) {
            addCriterion("versionnumber >", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberGreaterThanOrEqualTo(String value) {
            addCriterion("versionnumber >=", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberLessThan(String value) {
            addCriterion("versionnumber <", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberLessThanOrEqualTo(String value) {
            addCriterion("versionnumber <=", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberLike(String value) {
            addCriterion("versionnumber like", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberNotLike(String value) {
            addCriterion("versionnumber not like", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberIn(List<String> values) {
            addCriterion("versionnumber in", values, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberNotIn(List<String> values) {
            addCriterion("versionnumber not in", values, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberBetween(String value1, String value2) {
            addCriterion("versionnumber between", value1, value2, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberNotBetween(String value1, String value2) {
            addCriterion("versionnumber not between", value1, value2, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerIsNull() {
            addCriterion("copyrightowner is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerIsNotNull() {
            addCriterion("copyrightowner is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerEqualTo(String value) {
            addCriterion("copyrightowner =", value, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerNotEqualTo(String value) {
            addCriterion("copyrightowner <>", value, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerGreaterThan(String value) {
            addCriterion("copyrightowner >", value, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerGreaterThanOrEqualTo(String value) {
            addCriterion("copyrightowner >=", value, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerLessThan(String value) {
            addCriterion("copyrightowner <", value, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerLessThanOrEqualTo(String value) {
            addCriterion("copyrightowner <=", value, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerLike(String value) {
            addCriterion("copyrightowner like", value, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerNotLike(String value) {
            addCriterion("copyrightowner not like", value, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerIn(List<String> values) {
            addCriterion("copyrightowner in", values, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerNotIn(List<String> values) {
            addCriterion("copyrightowner not in", values, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerBetween(String value1, String value2) {
            addCriterion("copyrightowner between", value1, value2, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andCopyrightownerNotBetween(String value1, String value2) {
            addCriterion("copyrightowner not between", value1, value2, "copyrightowner");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataIsNull() {
            addCriterion("firstpublicationdata is null");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataIsNotNull() {
            addCriterion("firstpublicationdata is not null");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataEqualTo(String value) {
            addCriterion("firstpublicationdata =", value, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataNotEqualTo(String value) {
            addCriterion("firstpublicationdata <>", value, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataGreaterThan(String value) {
            addCriterion("firstpublicationdata >", value, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataGreaterThanOrEqualTo(String value) {
            addCriterion("firstpublicationdata >=", value, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataLessThan(String value) {
            addCriterion("firstpublicationdata <", value, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataLessThanOrEqualTo(String value) {
            addCriterion("firstpublicationdata <=", value, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataLike(String value) {
            addCriterion("firstpublicationdata like", value, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataNotLike(String value) {
            addCriterion("firstpublicationdata not like", value, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataIn(List<String> values) {
            addCriterion("firstpublicationdata in", values, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataNotIn(List<String> values) {
            addCriterion("firstpublicationdata not in", values, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataBetween(String value1, String value2) {
            addCriterion("firstpublicationdata between", value1, value2, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andFirstpublicationdataNotBetween(String value1, String value2) {
            addCriterion("firstpublicationdata not between", value1, value2, "firstpublicationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataIsNull() {
            addCriterion("registrationdata is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataIsNotNull() {
            addCriterion("registrationdata is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataEqualTo(String value) {
            addCriterion("registrationdata =", value, "registrationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataNotEqualTo(String value) {
            addCriterion("registrationdata <>", value, "registrationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataGreaterThan(String value) {
            addCriterion("registrationdata >", value, "registrationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataGreaterThanOrEqualTo(String value) {
            addCriterion("registrationdata >=", value, "registrationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataLessThan(String value) {
            addCriterion("registrationdata <", value, "registrationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataLessThanOrEqualTo(String value) {
            addCriterion("registrationdata <=", value, "registrationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataLike(String value) {
            addCriterion("registrationdata like", value, "registrationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataNotLike(String value) {
            addCriterion("registrationdata not like", value, "registrationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataIn(List<String> values) {
            addCriterion("registrationdata in", values, "registrationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataNotIn(List<String> values) {
            addCriterion("registrationdata not in", values, "registrationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataBetween(String value1, String value2) {
            addCriterion("registrationdata between", value1, value2, "registrationdata");
            return (Criteria) this;
        }

        public Criteria andRegistrationdataNotBetween(String value1, String value2) {
            addCriterion("registrationdata not between", value1, value2, "registrationdata");
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
package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PerKnowledgeExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public PerKnowledgeExample() {
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

    public PerKnowledgeExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public PerKnowledgeExample needName() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("name");
        
        return this;
    }

    public PerKnowledgeExample needKname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("kname");
        
        return this;
    }

    public PerKnowledgeExample needRtype() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rtype");
        
        return this;
    }

    public PerKnowledgeExample needRgrade() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rgrade");
        
        return this;
    }

    public PerKnowledgeExample needRpDesc() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rp_desc");
        
        return this;
    }

    public PerKnowledgeExample needPuuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("puuid");
        
        return this;
    }

    public PerKnowledgeExample needKuuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("kuuid");
        
        return this;
    }

    public PerKnowledgeExample needSource() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("source");
        
        return this;
    }

    public PerKnowledgeExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public PerKnowledgeExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public PerKnowledgeExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public PerKnowledgeExample orderByName(String type) {
        if(orderByClause == null){
            orderByClause = "name " + type;
        }
        else{
            orderByClause += " ,name " + type;
        }
        
        return this;
    }

    public PerKnowledgeExample orderByKname(String type) {
        if(orderByClause == null){
            orderByClause = "kname " + type;
        }
        else{
            orderByClause += " ,kname " + type;
        }
        
        return this;
    }

    public PerKnowledgeExample orderByRtype(String type) {
        if(orderByClause == null){
            orderByClause = "rtype " + type;
        }
        else{
            orderByClause += " ,rtype " + type;
        }
        
        return this;
    }

    public PerKnowledgeExample orderByRgrade(String type) {
        if(orderByClause == null){
            orderByClause = "rgrade " + type;
        }
        else{
            orderByClause += " ,rgrade " + type;
        }
        
        return this;
    }

    public PerKnowledgeExample orderByRpDesc(String type) {
        if(orderByClause == null){
            orderByClause = "rp_desc " + type;
        }
        else{
            orderByClause += " ,rp_desc " + type;
        }
        
        return this;
    }

    public PerKnowledgeExample orderByPuuid(String type) {
        if(orderByClause == null){
            orderByClause = "puuid " + type;
        }
        else{
            orderByClause += " ,puuid " + type;
        }
        
        return this;
    }

    public PerKnowledgeExample orderByKuuid(String type) {
        if(orderByClause == null){
            orderByClause = "kuuid " + type;
        }
        else{
            orderByClause += " ,kuuid " + type;
        }
        
        return this;
    }

    public PerKnowledgeExample orderBySource(String type) {
        if(orderByClause == null){
            orderByClause = "source " + type;
        }
        else{
            orderByClause += " ,source " + type;
        }
        
        return this;
    }

    public PerKnowledgeExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public PerKnowledgeExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public PerKnowledgeExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public PerKnowledgeExample groupByName() {
        if(groupByClause == null){
            groupByClause = "name ";
        }
        else{
            groupByClause += " ,name ";
        }
        
        return this;
    }

    public PerKnowledgeExample groupByKname() {
        if(groupByClause == null){
            groupByClause = "kname ";
        }
        else{
            groupByClause += " ,kname ";
        }
        
        return this;
    }

    public PerKnowledgeExample groupByRtype() {
        if(groupByClause == null){
            groupByClause = "rtype ";
        }
        else{
            groupByClause += " ,rtype ";
        }
        
        return this;
    }

    public PerKnowledgeExample groupByRgrade() {
        if(groupByClause == null){
            groupByClause = "rgrade ";
        }
        else{
            groupByClause += " ,rgrade ";
        }
        
        return this;
    }

    public PerKnowledgeExample groupByRpDesc() {
        if(groupByClause == null){
            groupByClause = "rp_desc ";
        }
        else{
            groupByClause += " ,rp_desc ";
        }
        
        return this;
    }

    public PerKnowledgeExample groupByPuuid() {
        if(groupByClause == null){
            groupByClause = "puuid ";
        }
        else{
            groupByClause += " ,puuid ";
        }
        
        return this;
    }

    public PerKnowledgeExample groupByKuuid() {
        if(groupByClause == null){
            groupByClause = "kuuid ";
        }
        else{
            groupByClause += " ,kuuid ";
        }
        
        return this;
    }

    public PerKnowledgeExample groupBySource() {
        if(groupByClause == null){
            groupByClause = "source ";
        }
        else{
            groupByClause += " ,source ";
        }
        
        return this;
    }

    public PerKnowledgeExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public PerKnowledgeExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public PerKnowledgeExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public PerKnowledgeExample groupConcatName() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(name SEPARATOR \'|\') as name");
        return this;
    }

    public PerKnowledgeExample groupConcatKname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(kname SEPARATOR \'|\') as kname");
        return this;
    }

    public PerKnowledgeExample groupConcatRtype() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rtype SEPARATOR \'|\') as rtype");
        return this;
    }

    public PerKnowledgeExample groupConcatRgrade() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rgrade SEPARATOR \'|\') as rgrade");
        return this;
    }

    public PerKnowledgeExample groupConcatRpDesc() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rp_desc SEPARATOR \'|\') as rp_desc");
        return this;
    }

    public PerKnowledgeExample groupConcatPuuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(puuid SEPARATOR \'|\') as puuid");
        return this;
    }

    public PerKnowledgeExample groupConcatKuuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(kuuid SEPARATOR \'|\') as kuuid");
        return this;
    }

    public PerKnowledgeExample groupConcatSource() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(source SEPARATOR \'|\') as source");
        return this;
    }

    public PerKnowledgeExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public PerKnowledgeExample groupConcatAtime() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andKnameIsNull() {
            addCriterion("kname is null");
            return (Criteria) this;
        }

        public Criteria andKnameIsNotNull() {
            addCriterion("kname is not null");
            return (Criteria) this;
        }

        public Criteria andKnameEqualTo(String value) {
            addCriterion("kname =", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotEqualTo(String value) {
            addCriterion("kname <>", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameGreaterThan(String value) {
            addCriterion("kname >", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameGreaterThanOrEqualTo(String value) {
            addCriterion("kname >=", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameLessThan(String value) {
            addCriterion("kname <", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameLessThanOrEqualTo(String value) {
            addCriterion("kname <=", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameLike(String value) {
            addCriterion("kname like", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotLike(String value) {
            addCriterion("kname not like", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameIn(List<String> values) {
            addCriterion("kname in", values, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotIn(List<String> values) {
            addCriterion("kname not in", values, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameBetween(String value1, String value2) {
            addCriterion("kname between", value1, value2, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotBetween(String value1, String value2) {
            addCriterion("kname not between", value1, value2, "kname");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNull() {
            addCriterion("rtype is null");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNotNull() {
            addCriterion("rtype is not null");
            return (Criteria) this;
        }

        public Criteria andRtypeEqualTo(String value) {
            addCriterion("rtype =", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotEqualTo(String value) {
            addCriterion("rtype <>", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThan(String value) {
            addCriterion("rtype >", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThanOrEqualTo(String value) {
            addCriterion("rtype >=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThan(String value) {
            addCriterion("rtype <", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThanOrEqualTo(String value) {
            addCriterion("rtype <=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLike(String value) {
            addCriterion("rtype like", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotLike(String value) {
            addCriterion("rtype not like", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeIn(List<String> values) {
            addCriterion("rtype in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotIn(List<String> values) {
            addCriterion("rtype not in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeBetween(String value1, String value2) {
            addCriterion("rtype between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotBetween(String value1, String value2) {
            addCriterion("rtype not between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRgradeIsNull() {
            addCriterion("rgrade is null");
            return (Criteria) this;
        }

        public Criteria andRgradeIsNotNull() {
            addCriterion("rgrade is not null");
            return (Criteria) this;
        }

        public Criteria andRgradeEqualTo(String value) {
            addCriterion("rgrade =", value, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRgradeNotEqualTo(String value) {
            addCriterion("rgrade <>", value, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRgradeGreaterThan(String value) {
            addCriterion("rgrade >", value, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRgradeGreaterThanOrEqualTo(String value) {
            addCriterion("rgrade >=", value, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRgradeLessThan(String value) {
            addCriterion("rgrade <", value, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRgradeLessThanOrEqualTo(String value) {
            addCriterion("rgrade <=", value, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRgradeLike(String value) {
            addCriterion("rgrade like", value, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRgradeNotLike(String value) {
            addCriterion("rgrade not like", value, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRgradeIn(List<String> values) {
            addCriterion("rgrade in", values, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRgradeNotIn(List<String> values) {
            addCriterion("rgrade not in", values, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRgradeBetween(String value1, String value2) {
            addCriterion("rgrade between", value1, value2, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRgradeNotBetween(String value1, String value2) {
            addCriterion("rgrade not between", value1, value2, "rgrade");
            return (Criteria) this;
        }

        public Criteria andRpDescIsNull() {
            addCriterion("rp_desc is null");
            return (Criteria) this;
        }

        public Criteria andRpDescIsNotNull() {
            addCriterion("rp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRpDescEqualTo(String value) {
            addCriterion("rp_desc =", value, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andRpDescNotEqualTo(String value) {
            addCriterion("rp_desc <>", value, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andRpDescGreaterThan(String value) {
            addCriterion("rp_desc >", value, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andRpDescGreaterThanOrEqualTo(String value) {
            addCriterion("rp_desc >=", value, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andRpDescLessThan(String value) {
            addCriterion("rp_desc <", value, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andRpDescLessThanOrEqualTo(String value) {
            addCriterion("rp_desc <=", value, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andRpDescLike(String value) {
            addCriterion("rp_desc like", value, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andRpDescNotLike(String value) {
            addCriterion("rp_desc not like", value, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andRpDescIn(List<String> values) {
            addCriterion("rp_desc in", values, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andRpDescNotIn(List<String> values) {
            addCriterion("rp_desc not in", values, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andRpDescBetween(String value1, String value2) {
            addCriterion("rp_desc between", value1, value2, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andRpDescNotBetween(String value1, String value2) {
            addCriterion("rp_desc not between", value1, value2, "rpDesc");
            return (Criteria) this;
        }

        public Criteria andPuuidIsNull() {
            addCriterion("puuid is null");
            return (Criteria) this;
        }

        public Criteria andPuuidIsNotNull() {
            addCriterion("puuid is not null");
            return (Criteria) this;
        }

        public Criteria andPuuidEqualTo(String value) {
            addCriterion("puuid =", value, "puuid");
            return (Criteria) this;
        }

        public Criteria andPuuidNotEqualTo(String value) {
            addCriterion("puuid <>", value, "puuid");
            return (Criteria) this;
        }

        public Criteria andPuuidGreaterThan(String value) {
            addCriterion("puuid >", value, "puuid");
            return (Criteria) this;
        }

        public Criteria andPuuidGreaterThanOrEqualTo(String value) {
            addCriterion("puuid >=", value, "puuid");
            return (Criteria) this;
        }

        public Criteria andPuuidLessThan(String value) {
            addCriterion("puuid <", value, "puuid");
            return (Criteria) this;
        }

        public Criteria andPuuidLessThanOrEqualTo(String value) {
            addCriterion("puuid <=", value, "puuid");
            return (Criteria) this;
        }

        public Criteria andPuuidLike(String value) {
            addCriterion("puuid like", value, "puuid");
            return (Criteria) this;
        }

        public Criteria andPuuidNotLike(String value) {
            addCriterion("puuid not like", value, "puuid");
            return (Criteria) this;
        }

        public Criteria andPuuidIn(List<String> values) {
            addCriterion("puuid in", values, "puuid");
            return (Criteria) this;
        }

        public Criteria andPuuidNotIn(List<String> values) {
            addCriterion("puuid not in", values, "puuid");
            return (Criteria) this;
        }

        public Criteria andPuuidBetween(String value1, String value2) {
            addCriterion("puuid between", value1, value2, "puuid");
            return (Criteria) this;
        }

        public Criteria andPuuidNotBetween(String value1, String value2) {
            addCriterion("puuid not between", value1, value2, "puuid");
            return (Criteria) this;
        }

        public Criteria andKuuidIsNull() {
            addCriterion("kuuid is null");
            return (Criteria) this;
        }

        public Criteria andKuuidIsNotNull() {
            addCriterion("kuuid is not null");
            return (Criteria) this;
        }

        public Criteria andKuuidEqualTo(String value) {
            addCriterion("kuuid =", value, "kuuid");
            return (Criteria) this;
        }

        public Criteria andKuuidNotEqualTo(String value) {
            addCriterion("kuuid <>", value, "kuuid");
            return (Criteria) this;
        }

        public Criteria andKuuidGreaterThan(String value) {
            addCriterion("kuuid >", value, "kuuid");
            return (Criteria) this;
        }

        public Criteria andKuuidGreaterThanOrEqualTo(String value) {
            addCriterion("kuuid >=", value, "kuuid");
            return (Criteria) this;
        }

        public Criteria andKuuidLessThan(String value) {
            addCriterion("kuuid <", value, "kuuid");
            return (Criteria) this;
        }

        public Criteria andKuuidLessThanOrEqualTo(String value) {
            addCriterion("kuuid <=", value, "kuuid");
            return (Criteria) this;
        }

        public Criteria andKuuidLike(String value) {
            addCriterion("kuuid like", value, "kuuid");
            return (Criteria) this;
        }

        public Criteria andKuuidNotLike(String value) {
            addCriterion("kuuid not like", value, "kuuid");
            return (Criteria) this;
        }

        public Criteria andKuuidIn(List<String> values) {
            addCriterion("kuuid in", values, "kuuid");
            return (Criteria) this;
        }

        public Criteria andKuuidNotIn(List<String> values) {
            addCriterion("kuuid not in", values, "kuuid");
            return (Criteria) this;
        }

        public Criteria andKuuidBetween(String value1, String value2) {
            addCriterion("kuuid between", value1, value2, "kuuid");
            return (Criteria) this;
        }

        public Criteria andKuuidNotBetween(String value1, String value2) {
            addCriterion("kuuid not between", value1, value2, "kuuid");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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
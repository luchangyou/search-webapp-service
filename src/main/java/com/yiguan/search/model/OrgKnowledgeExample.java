package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrgKnowledgeExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public OrgKnowledgeExample() {
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

    public OrgKnowledgeExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public OrgKnowledgeExample needOname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("oname");
        
        return this;
    }

    public OrgKnowledgeExample needTitle() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("title");
        
        return this;
    }

    public OrgKnowledgeExample needRevent() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("revent");
        
        return this;
    }

    public OrgKnowledgeExample needRtype() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rtype");
        
        return this;
    }

    public OrgKnowledgeExample needRgrade() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rgrade");
        
        return this;
    }

    public OrgKnowledgeExample needRgDesc() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rg_desc");
        
        return this;
    }

    public OrgKnowledgeExample needOuuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ouuid");
        
        return this;
    }

    public OrgKnowledgeExample needKuuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("kuuid");
        
        return this;
    }

    public OrgKnowledgeExample needSource() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("source");
        
        return this;
    }

    public OrgKnowledgeExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public OrgKnowledgeExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public OrgKnowledgeExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample orderByOname(String type) {
        if(orderByClause == null){
            orderByClause = "oname " + type;
        }
        else{
            orderByClause += " ,oname " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample orderByTitle(String type) {
        if(orderByClause == null){
            orderByClause = "title " + type;
        }
        else{
            orderByClause += " ,title " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample orderByRevent(String type) {
        if(orderByClause == null){
            orderByClause = "revent " + type;
        }
        else{
            orderByClause += " ,revent " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample orderByRtype(String type) {
        if(orderByClause == null){
            orderByClause = "rtype " + type;
        }
        else{
            orderByClause += " ,rtype " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample orderByRgrade(String type) {
        if(orderByClause == null){
            orderByClause = "rgrade " + type;
        }
        else{
            orderByClause += " ,rgrade " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample orderByRgDesc(String type) {
        if(orderByClause == null){
            orderByClause = "rg_desc " + type;
        }
        else{
            orderByClause += " ,rg_desc " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample orderByOuuid(String type) {
        if(orderByClause == null){
            orderByClause = "ouuid " + type;
        }
        else{
            orderByClause += " ,ouuid " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample orderByKuuid(String type) {
        if(orderByClause == null){
            orderByClause = "kuuid " + type;
        }
        else{
            orderByClause += " ,kuuid " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample orderBySource(String type) {
        if(orderByClause == null){
            orderByClause = "source " + type;
        }
        else{
            orderByClause += " ,source " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public OrgKnowledgeExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupByOname() {
        if(groupByClause == null){
            groupByClause = "oname ";
        }
        else{
            groupByClause += " ,oname ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupByTitle() {
        if(groupByClause == null){
            groupByClause = "title ";
        }
        else{
            groupByClause += " ,title ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupByRevent() {
        if(groupByClause == null){
            groupByClause = "revent ";
        }
        else{
            groupByClause += " ,revent ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupByRtype() {
        if(groupByClause == null){
            groupByClause = "rtype ";
        }
        else{
            groupByClause += " ,rtype ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupByRgrade() {
        if(groupByClause == null){
            groupByClause = "rgrade ";
        }
        else{
            groupByClause += " ,rgrade ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupByRgDesc() {
        if(groupByClause == null){
            groupByClause = "rg_desc ";
        }
        else{
            groupByClause += " ,rg_desc ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupByOuuid() {
        if(groupByClause == null){
            groupByClause = "ouuid ";
        }
        else{
            groupByClause += " ,ouuid ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupByKuuid() {
        if(groupByClause == null){
            groupByClause = "kuuid ";
        }
        else{
            groupByClause += " ,kuuid ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupBySource() {
        if(groupByClause == null){
            groupByClause = "source ";
        }
        else{
            groupByClause += " ,source ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public OrgKnowledgeExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public OrgKnowledgeExample groupConcatOname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(oname SEPARATOR \'|\') as oname");
        return this;
    }

    public OrgKnowledgeExample groupConcatTitle() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(title SEPARATOR \'|\') as title");
        return this;
    }

    public OrgKnowledgeExample groupConcatRevent() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(revent SEPARATOR \'|\') as revent");
        return this;
    }

    public OrgKnowledgeExample groupConcatRtype() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rtype SEPARATOR \'|\') as rtype");
        return this;
    }

    public OrgKnowledgeExample groupConcatRgrade() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rgrade SEPARATOR \'|\') as rgrade");
        return this;
    }

    public OrgKnowledgeExample groupConcatRgDesc() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rg_desc SEPARATOR \'|\') as rg_desc");
        return this;
    }

    public OrgKnowledgeExample groupConcatOuuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ouuid SEPARATOR \'|\') as ouuid");
        return this;
    }

    public OrgKnowledgeExample groupConcatKuuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(kuuid SEPARATOR \'|\') as kuuid");
        return this;
    }

    public OrgKnowledgeExample groupConcatSource() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(source SEPARATOR \'|\') as source");
        return this;
    }

    public OrgKnowledgeExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public OrgKnowledgeExample groupConcatAtime() {
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

        public Criteria andOnameIsNull() {
            addCriterion("oname is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oname is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oname =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oname <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oname >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oname >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oname <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oname <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oname like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oname not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oname in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oname not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oname between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oname not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andReventIsNull() {
            addCriterion("revent is null");
            return (Criteria) this;
        }

        public Criteria andReventIsNotNull() {
            addCriterion("revent is not null");
            return (Criteria) this;
        }

        public Criteria andReventEqualTo(String value) {
            addCriterion("revent =", value, "revent");
            return (Criteria) this;
        }

        public Criteria andReventNotEqualTo(String value) {
            addCriterion("revent <>", value, "revent");
            return (Criteria) this;
        }

        public Criteria andReventGreaterThan(String value) {
            addCriterion("revent >", value, "revent");
            return (Criteria) this;
        }

        public Criteria andReventGreaterThanOrEqualTo(String value) {
            addCriterion("revent >=", value, "revent");
            return (Criteria) this;
        }

        public Criteria andReventLessThan(String value) {
            addCriterion("revent <", value, "revent");
            return (Criteria) this;
        }

        public Criteria andReventLessThanOrEqualTo(String value) {
            addCriterion("revent <=", value, "revent");
            return (Criteria) this;
        }

        public Criteria andReventLike(String value) {
            addCriterion("revent like", value, "revent");
            return (Criteria) this;
        }

        public Criteria andReventNotLike(String value) {
            addCriterion("revent not like", value, "revent");
            return (Criteria) this;
        }

        public Criteria andReventIn(List<String> values) {
            addCriterion("revent in", values, "revent");
            return (Criteria) this;
        }

        public Criteria andReventNotIn(List<String> values) {
            addCriterion("revent not in", values, "revent");
            return (Criteria) this;
        }

        public Criteria andReventBetween(String value1, String value2) {
            addCriterion("revent between", value1, value2, "revent");
            return (Criteria) this;
        }

        public Criteria andReventNotBetween(String value1, String value2) {
            addCriterion("revent not between", value1, value2, "revent");
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

        public Criteria andRgDescIsNull() {
            addCriterion("rg_desc is null");
            return (Criteria) this;
        }

        public Criteria andRgDescIsNotNull() {
            addCriterion("rg_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRgDescEqualTo(String value) {
            addCriterion("rg_desc =", value, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andRgDescNotEqualTo(String value) {
            addCriterion("rg_desc <>", value, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andRgDescGreaterThan(String value) {
            addCriterion("rg_desc >", value, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andRgDescGreaterThanOrEqualTo(String value) {
            addCriterion("rg_desc >=", value, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andRgDescLessThan(String value) {
            addCriterion("rg_desc <", value, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andRgDescLessThanOrEqualTo(String value) {
            addCriterion("rg_desc <=", value, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andRgDescLike(String value) {
            addCriterion("rg_desc like", value, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andRgDescNotLike(String value) {
            addCriterion("rg_desc not like", value, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andRgDescIn(List<String> values) {
            addCriterion("rg_desc in", values, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andRgDescNotIn(List<String> values) {
            addCriterion("rg_desc not in", values, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andRgDescBetween(String value1, String value2) {
            addCriterion("rg_desc between", value1, value2, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andRgDescNotBetween(String value1, String value2) {
            addCriterion("rg_desc not between", value1, value2, "rgDesc");
            return (Criteria) this;
        }

        public Criteria andOuuidIsNull() {
            addCriterion("ouuid is null");
            return (Criteria) this;
        }

        public Criteria andOuuidIsNotNull() {
            addCriterion("ouuid is not null");
            return (Criteria) this;
        }

        public Criteria andOuuidEqualTo(String value) {
            addCriterion("ouuid =", value, "ouuid");
            return (Criteria) this;
        }

        public Criteria andOuuidNotEqualTo(String value) {
            addCriterion("ouuid <>", value, "ouuid");
            return (Criteria) this;
        }

        public Criteria andOuuidGreaterThan(String value) {
            addCriterion("ouuid >", value, "ouuid");
            return (Criteria) this;
        }

        public Criteria andOuuidGreaterThanOrEqualTo(String value) {
            addCriterion("ouuid >=", value, "ouuid");
            return (Criteria) this;
        }

        public Criteria andOuuidLessThan(String value) {
            addCriterion("ouuid <", value, "ouuid");
            return (Criteria) this;
        }

        public Criteria andOuuidLessThanOrEqualTo(String value) {
            addCriterion("ouuid <=", value, "ouuid");
            return (Criteria) this;
        }

        public Criteria andOuuidLike(String value) {
            addCriterion("ouuid like", value, "ouuid");
            return (Criteria) this;
        }

        public Criteria andOuuidNotLike(String value) {
            addCriterion("ouuid not like", value, "ouuid");
            return (Criteria) this;
        }

        public Criteria andOuuidIn(List<String> values) {
            addCriterion("ouuid in", values, "ouuid");
            return (Criteria) this;
        }

        public Criteria andOuuidNotIn(List<String> values) {
            addCriterion("ouuid not in", values, "ouuid");
            return (Criteria) this;
        }

        public Criteria andOuuidBetween(String value1, String value2) {
            addCriterion("ouuid between", value1, value2, "ouuid");
            return (Criteria) this;
        }

        public Criteria andOuuidNotBetween(String value1, String value2) {
            addCriterion("ouuid not between", value1, value2, "ouuid");
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
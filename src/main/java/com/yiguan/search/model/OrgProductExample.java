package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrgProductExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public OrgProductExample() {
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

    public OrgProductExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public OrgProductExample needOname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("oname");
        
        return this;
    }

    public OrgProductExample needPname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("pname");
        
        return this;
    }

    public OrgProductExample needRtype() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rtype");
        
        return this;
    }

    public OrgProductExample needRgrade() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rgrade");
        
        return this;
    }

    public OrgProductExample needRgDesc() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rg_desc");
        
        return this;
    }

    public OrgProductExample needOuuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ouuid");
        
        return this;
    }

    public OrgProductExample needPrUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("pr_uuid");
        
        return this;
    }

    public OrgProductExample needSource() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("source");
        
        return this;
    }

    public OrgProductExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public OrgProductExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public OrgProductExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public OrgProductExample orderByOname(String type) {
        if(orderByClause == null){
            orderByClause = "oname " + type;
        }
        else{
            orderByClause += " ,oname " + type;
        }
        
        return this;
    }

    public OrgProductExample orderByPname(String type) {
        if(orderByClause == null){
            orderByClause = "pname " + type;
        }
        else{
            orderByClause += " ,pname " + type;
        }
        
        return this;
    }

    public OrgProductExample orderByRtype(String type) {
        if(orderByClause == null){
            orderByClause = "rtype " + type;
        }
        else{
            orderByClause += " ,rtype " + type;
        }
        
        return this;
    }

    public OrgProductExample orderByRgrade(String type) {
        if(orderByClause == null){
            orderByClause = "rgrade " + type;
        }
        else{
            orderByClause += " ,rgrade " + type;
        }
        
        return this;
    }

    public OrgProductExample orderByRgDesc(String type) {
        if(orderByClause == null){
            orderByClause = "rg_desc " + type;
        }
        else{
            orderByClause += " ,rg_desc " + type;
        }
        
        return this;
    }

    public OrgProductExample orderByOuuid(String type) {
        if(orderByClause == null){
            orderByClause = "ouuid " + type;
        }
        else{
            orderByClause += " ,ouuid " + type;
        }
        
        return this;
    }

    public OrgProductExample orderByPrUuid(String type) {
        if(orderByClause == null){
            orderByClause = "pr_uuid " + type;
        }
        else{
            orderByClause += " ,pr_uuid " + type;
        }
        
        return this;
    }

    public OrgProductExample orderBySource(String type) {
        if(orderByClause == null){
            orderByClause = "source " + type;
        }
        else{
            orderByClause += " ,source " + type;
        }
        
        return this;
    }

    public OrgProductExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public OrgProductExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public OrgProductExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public OrgProductExample groupByOname() {
        if(groupByClause == null){
            groupByClause = "oname ";
        }
        else{
            groupByClause += " ,oname ";
        }
        
        return this;
    }

    public OrgProductExample groupByPname() {
        if(groupByClause == null){
            groupByClause = "pname ";
        }
        else{
            groupByClause += " ,pname ";
        }
        
        return this;
    }

    public OrgProductExample groupByRtype() {
        if(groupByClause == null){
            groupByClause = "rtype ";
        }
        else{
            groupByClause += " ,rtype ";
        }
        
        return this;
    }

    public OrgProductExample groupByRgrade() {
        if(groupByClause == null){
            groupByClause = "rgrade ";
        }
        else{
            groupByClause += " ,rgrade ";
        }
        
        return this;
    }

    public OrgProductExample groupByRgDesc() {
        if(groupByClause == null){
            groupByClause = "rg_desc ";
        }
        else{
            groupByClause += " ,rg_desc ";
        }
        
        return this;
    }

    public OrgProductExample groupByOuuid() {
        if(groupByClause == null){
            groupByClause = "ouuid ";
        }
        else{
            groupByClause += " ,ouuid ";
        }
        
        return this;
    }

    public OrgProductExample groupByPrUuid() {
        if(groupByClause == null){
            groupByClause = "pr_uuid ";
        }
        else{
            groupByClause += " ,pr_uuid ";
        }
        
        return this;
    }

    public OrgProductExample groupBySource() {
        if(groupByClause == null){
            groupByClause = "source ";
        }
        else{
            groupByClause += " ,source ";
        }
        
        return this;
    }

    public OrgProductExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public OrgProductExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public OrgProductExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public OrgProductExample groupConcatOname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(oname SEPARATOR \'|\') as oname");
        return this;
    }

    public OrgProductExample groupConcatPname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(pname SEPARATOR \'|\') as pname");
        return this;
    }

    public OrgProductExample groupConcatRtype() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rtype SEPARATOR \'|\') as rtype");
        return this;
    }

    public OrgProductExample groupConcatRgrade() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rgrade SEPARATOR \'|\') as rgrade");
        return this;
    }

    public OrgProductExample groupConcatRgDesc() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rg_desc SEPARATOR \'|\') as rg_desc");
        return this;
    }

    public OrgProductExample groupConcatOuuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ouuid SEPARATOR \'|\') as ouuid");
        return this;
    }

    public OrgProductExample groupConcatPrUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(pr_uuid SEPARATOR \'|\') as pr_uuid");
        return this;
    }

    public OrgProductExample groupConcatSource() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(source SEPARATOR \'|\') as source");
        return this;
    }

    public OrgProductExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public OrgProductExample groupConcatAtime() {
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

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
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

        public Criteria andPrUuidIsNull() {
            addCriterion("pr_uuid is null");
            return (Criteria) this;
        }

        public Criteria andPrUuidIsNotNull() {
            addCriterion("pr_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andPrUuidEqualTo(String value) {
            addCriterion("pr_uuid =", value, "prUuid");
            return (Criteria) this;
        }

        public Criteria andPrUuidNotEqualTo(String value) {
            addCriterion("pr_uuid <>", value, "prUuid");
            return (Criteria) this;
        }

        public Criteria andPrUuidGreaterThan(String value) {
            addCriterion("pr_uuid >", value, "prUuid");
            return (Criteria) this;
        }

        public Criteria andPrUuidGreaterThanOrEqualTo(String value) {
            addCriterion("pr_uuid >=", value, "prUuid");
            return (Criteria) this;
        }

        public Criteria andPrUuidLessThan(String value) {
            addCriterion("pr_uuid <", value, "prUuid");
            return (Criteria) this;
        }

        public Criteria andPrUuidLessThanOrEqualTo(String value) {
            addCriterion("pr_uuid <=", value, "prUuid");
            return (Criteria) this;
        }

        public Criteria andPrUuidLike(String value) {
            addCriterion("pr_uuid like", value, "prUuid");
            return (Criteria) this;
        }

        public Criteria andPrUuidNotLike(String value) {
            addCriterion("pr_uuid not like", value, "prUuid");
            return (Criteria) this;
        }

        public Criteria andPrUuidIn(List<String> values) {
            addCriterion("pr_uuid in", values, "prUuid");
            return (Criteria) this;
        }

        public Criteria andPrUuidNotIn(List<String> values) {
            addCriterion("pr_uuid not in", values, "prUuid");
            return (Criteria) this;
        }

        public Criteria andPrUuidBetween(String value1, String value2) {
            addCriterion("pr_uuid between", value1, value2, "prUuid");
            return (Criteria) this;
        }

        public Criteria andPrUuidNotBetween(String value1, String value2) {
            addCriterion("pr_uuid not between", value1, value2, "prUuid");
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
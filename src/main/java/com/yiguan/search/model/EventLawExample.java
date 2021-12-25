package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventLawExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public EventLawExample() {
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

    public EventLawExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public EventLawExample needEuuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("euuid");
        
        return this;
    }

    public EventLawExample needUrllaw() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("urllaw");
        
        return this;
    }

    public EventLawExample needTitle() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("title");
        
        return this;
    }

    public EventLawExample needCourt() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("court");
        
        return this;
    }

    public EventLawExample needType() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("type");
        
        return this;
    }

    public EventLawExample needCaseid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("caseid");
        
        return this;
    }

    public EventLawExample needRelated() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("related");
        
        return this;
    }

    public EventLawExample needUrlwenshu() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("urlwenshu");
        
        return this;
    }

    public EventLawExample needPulishtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("pulishtime");
        
        return this;
    }

    public EventLawExample needContent() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("content");
        
        return this;
    }

    public EventLawExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public EventLawExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public EventLawExample orderByEuuid(String type) {
        if(orderByClause == null){
            orderByClause = "euuid " + type;
        }
        else{
            orderByClause += " ,euuid " + type;
        }
        
        return this;
    }

    public EventLawExample orderByUrllaw(String type) {
        if(orderByClause == null){
            orderByClause = "urllaw " + type;
        }
        else{
            orderByClause += " ,urllaw " + type;
        }
        
        return this;
    }

    public EventLawExample orderByTitle(String type) {
        if(orderByClause == null){
            orderByClause = "title " + type;
        }
        else{
            orderByClause += " ,title " + type;
        }
        
        return this;
    }

    public EventLawExample orderByCourt(String type) {
        if(orderByClause == null){
            orderByClause = "court " + type;
        }
        else{
            orderByClause += " ,court " + type;
        }
        
        return this;
    }

    public EventLawExample orderByType(String type) {
        if(orderByClause == null){
            orderByClause = "type " + type;
        }
        else{
            orderByClause += " ,type " + type;
        }
        
        return this;
    }

    public EventLawExample orderByCaseid(String type) {
        if(orderByClause == null){
            orderByClause = "caseid " + type;
        }
        else{
            orderByClause += " ,caseid " + type;
        }
        
        return this;
    }

    public EventLawExample orderByRelated(String type) {
        if(orderByClause == null){
            orderByClause = "related " + type;
        }
        else{
            orderByClause += " ,related " + type;
        }
        
        return this;
    }

    public EventLawExample orderByUrlwenshu(String type) {
        if(orderByClause == null){
            orderByClause = "urlwenshu " + type;
        }
        else{
            orderByClause += " ,urlwenshu " + type;
        }
        
        return this;
    }

    public EventLawExample orderByPulishtime(String type) {
        if(orderByClause == null){
            orderByClause = "pulishtime " + type;
        }
        else{
            orderByClause += " ,pulishtime " + type;
        }
        
        return this;
    }

    public EventLawExample orderByContent(String type) {
        if(orderByClause == null){
            orderByClause = "content " + type;
        }
        else{
            orderByClause += " ,content " + type;
        }
        
        return this;
    }

    public EventLawExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public EventLawExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public EventLawExample groupByEuuid() {
        if(groupByClause == null){
            groupByClause = "euuid ";
        }
        else{
            groupByClause += " ,euuid ";
        }
        
        return this;
    }

    public EventLawExample groupByUrllaw() {
        if(groupByClause == null){
            groupByClause = "urllaw ";
        }
        else{
            groupByClause += " ,urllaw ";
        }
        
        return this;
    }

    public EventLawExample groupByTitle() {
        if(groupByClause == null){
            groupByClause = "title ";
        }
        else{
            groupByClause += " ,title ";
        }
        
        return this;
    }

    public EventLawExample groupByCourt() {
        if(groupByClause == null){
            groupByClause = "court ";
        }
        else{
            groupByClause += " ,court ";
        }
        
        return this;
    }

    public EventLawExample groupByType() {
        if(groupByClause == null){
            groupByClause = "type ";
        }
        else{
            groupByClause += " ,type ";
        }
        
        return this;
    }

    public EventLawExample groupByCaseid() {
        if(groupByClause == null){
            groupByClause = "caseid ";
        }
        else{
            groupByClause += " ,caseid ";
        }
        
        return this;
    }

    public EventLawExample groupByRelated() {
        if(groupByClause == null){
            groupByClause = "related ";
        }
        else{
            groupByClause += " ,related ";
        }
        
        return this;
    }

    public EventLawExample groupByUrlwenshu() {
        if(groupByClause == null){
            groupByClause = "urlwenshu ";
        }
        else{
            groupByClause += " ,urlwenshu ";
        }
        
        return this;
    }

    public EventLawExample groupByPulishtime() {
        if(groupByClause == null){
            groupByClause = "pulishtime ";
        }
        else{
            groupByClause += " ,pulishtime ";
        }
        
        return this;
    }

    public EventLawExample groupByContent() {
        if(groupByClause == null){
            groupByClause = "content ";
        }
        else{
            groupByClause += " ,content ";
        }
        
        return this;
    }

    public EventLawExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public EventLawExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public EventLawExample groupConcatEuuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(euuid SEPARATOR \'|\') as euuid");
        return this;
    }

    public EventLawExample groupConcatUrllaw() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(urllaw SEPARATOR \'|\') as urllaw");
        return this;
    }

    public EventLawExample groupConcatTitle() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(title SEPARATOR \'|\') as title");
        return this;
    }

    public EventLawExample groupConcatCourt() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(court SEPARATOR \'|\') as court");
        return this;
    }

    public EventLawExample groupConcatType() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(type SEPARATOR \'|\') as type");
        return this;
    }

    public EventLawExample groupConcatCaseid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(caseid SEPARATOR \'|\') as caseid");
        return this;
    }

    public EventLawExample groupConcatRelated() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(related SEPARATOR \'|\') as related");
        return this;
    }

    public EventLawExample groupConcatUrlwenshu() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(urlwenshu SEPARATOR \'|\') as urlwenshu");
        return this;
    }

    public EventLawExample groupConcatPulishtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(pulishtime SEPARATOR \'|\') as pulishtime");
        return this;
    }

    public EventLawExample groupConcatContent() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(content SEPARATOR \'|\') as content");
        return this;
    }

    public EventLawExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
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

        public Criteria andEuuidIsNull() {
            addCriterion("euuid is null");
            return (Criteria) this;
        }

        public Criteria andEuuidIsNotNull() {
            addCriterion("euuid is not null");
            return (Criteria) this;
        }

        public Criteria andEuuidEqualTo(String value) {
            addCriterion("euuid =", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidNotEqualTo(String value) {
            addCriterion("euuid <>", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidGreaterThan(String value) {
            addCriterion("euuid >", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidGreaterThanOrEqualTo(String value) {
            addCriterion("euuid >=", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidLessThan(String value) {
            addCriterion("euuid <", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidLessThanOrEqualTo(String value) {
            addCriterion("euuid <=", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidLike(String value) {
            addCriterion("euuid like", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidNotLike(String value) {
            addCriterion("euuid not like", value, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidIn(List<String> values) {
            addCriterion("euuid in", values, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidNotIn(List<String> values) {
            addCriterion("euuid not in", values, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidBetween(String value1, String value2) {
            addCriterion("euuid between", value1, value2, "euuid");
            return (Criteria) this;
        }

        public Criteria andEuuidNotBetween(String value1, String value2) {
            addCriterion("euuid not between", value1, value2, "euuid");
            return (Criteria) this;
        }

        public Criteria andUrllawIsNull() {
            addCriterion("urllaw is null");
            return (Criteria) this;
        }

        public Criteria andUrllawIsNotNull() {
            addCriterion("urllaw is not null");
            return (Criteria) this;
        }

        public Criteria andUrllawEqualTo(String value) {
            addCriterion("urllaw =", value, "urllaw");
            return (Criteria) this;
        }

        public Criteria andUrllawNotEqualTo(String value) {
            addCriterion("urllaw <>", value, "urllaw");
            return (Criteria) this;
        }

        public Criteria andUrllawGreaterThan(String value) {
            addCriterion("urllaw >", value, "urllaw");
            return (Criteria) this;
        }

        public Criteria andUrllawGreaterThanOrEqualTo(String value) {
            addCriterion("urllaw >=", value, "urllaw");
            return (Criteria) this;
        }

        public Criteria andUrllawLessThan(String value) {
            addCriterion("urllaw <", value, "urllaw");
            return (Criteria) this;
        }

        public Criteria andUrllawLessThanOrEqualTo(String value) {
            addCriterion("urllaw <=", value, "urllaw");
            return (Criteria) this;
        }

        public Criteria andUrllawLike(String value) {
            addCriterion("urllaw like", value, "urllaw");
            return (Criteria) this;
        }

        public Criteria andUrllawNotLike(String value) {
            addCriterion("urllaw not like", value, "urllaw");
            return (Criteria) this;
        }

        public Criteria andUrllawIn(List<String> values) {
            addCriterion("urllaw in", values, "urllaw");
            return (Criteria) this;
        }

        public Criteria andUrllawNotIn(List<String> values) {
            addCriterion("urllaw not in", values, "urllaw");
            return (Criteria) this;
        }

        public Criteria andUrllawBetween(String value1, String value2) {
            addCriterion("urllaw between", value1, value2, "urllaw");
            return (Criteria) this;
        }

        public Criteria andUrllawNotBetween(String value1, String value2) {
            addCriterion("urllaw not between", value1, value2, "urllaw");
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

        public Criteria andCourtIsNull() {
            addCriterion("court is null");
            return (Criteria) this;
        }

        public Criteria andCourtIsNotNull() {
            addCriterion("court is not null");
            return (Criteria) this;
        }

        public Criteria andCourtEqualTo(String value) {
            addCriterion("court =", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotEqualTo(String value) {
            addCriterion("court <>", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtGreaterThan(String value) {
            addCriterion("court >", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtGreaterThanOrEqualTo(String value) {
            addCriterion("court >=", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLessThan(String value) {
            addCriterion("court <", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLessThanOrEqualTo(String value) {
            addCriterion("court <=", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLike(String value) {
            addCriterion("court like", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotLike(String value) {
            addCriterion("court not like", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtIn(List<String> values) {
            addCriterion("court in", values, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotIn(List<String> values) {
            addCriterion("court not in", values, "court");
            return (Criteria) this;
        }

        public Criteria andCourtBetween(String value1, String value2) {
            addCriterion("court between", value1, value2, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotBetween(String value1, String value2) {
            addCriterion("court not between", value1, value2, "court");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCaseidIsNull() {
            addCriterion("caseid is null");
            return (Criteria) this;
        }

        public Criteria andCaseidIsNotNull() {
            addCriterion("caseid is not null");
            return (Criteria) this;
        }

        public Criteria andCaseidEqualTo(String value) {
            addCriterion("caseid =", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotEqualTo(String value) {
            addCriterion("caseid <>", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThan(String value) {
            addCriterion("caseid >", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThanOrEqualTo(String value) {
            addCriterion("caseid >=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThan(String value) {
            addCriterion("caseid <", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThanOrEqualTo(String value) {
            addCriterion("caseid <=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLike(String value) {
            addCriterion("caseid like", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotLike(String value) {
            addCriterion("caseid not like", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidIn(List<String> values) {
            addCriterion("caseid in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotIn(List<String> values) {
            addCriterion("caseid not in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidBetween(String value1, String value2) {
            addCriterion("caseid between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotBetween(String value1, String value2) {
            addCriterion("caseid not between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andRelatedIsNull() {
            addCriterion("related is null");
            return (Criteria) this;
        }

        public Criteria andRelatedIsNotNull() {
            addCriterion("related is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedEqualTo(String value) {
            addCriterion("related =", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedNotEqualTo(String value) {
            addCriterion("related <>", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedGreaterThan(String value) {
            addCriterion("related >", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedGreaterThanOrEqualTo(String value) {
            addCriterion("related >=", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedLessThan(String value) {
            addCriterion("related <", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedLessThanOrEqualTo(String value) {
            addCriterion("related <=", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedLike(String value) {
            addCriterion("related like", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedNotLike(String value) {
            addCriterion("related not like", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedIn(List<String> values) {
            addCriterion("related in", values, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedNotIn(List<String> values) {
            addCriterion("related not in", values, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedBetween(String value1, String value2) {
            addCriterion("related between", value1, value2, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedNotBetween(String value1, String value2) {
            addCriterion("related not between", value1, value2, "related");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuIsNull() {
            addCriterion("urlwenshu is null");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuIsNotNull() {
            addCriterion("urlwenshu is not null");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuEqualTo(String value) {
            addCriterion("urlwenshu =", value, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuNotEqualTo(String value) {
            addCriterion("urlwenshu <>", value, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuGreaterThan(String value) {
            addCriterion("urlwenshu >", value, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuGreaterThanOrEqualTo(String value) {
            addCriterion("urlwenshu >=", value, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuLessThan(String value) {
            addCriterion("urlwenshu <", value, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuLessThanOrEqualTo(String value) {
            addCriterion("urlwenshu <=", value, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuLike(String value) {
            addCriterion("urlwenshu like", value, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuNotLike(String value) {
            addCriterion("urlwenshu not like", value, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuIn(List<String> values) {
            addCriterion("urlwenshu in", values, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuNotIn(List<String> values) {
            addCriterion("urlwenshu not in", values, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuBetween(String value1, String value2) {
            addCriterion("urlwenshu between", value1, value2, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andUrlwenshuNotBetween(String value1, String value2) {
            addCriterion("urlwenshu not between", value1, value2, "urlwenshu");
            return (Criteria) this;
        }

        public Criteria andPulishtimeIsNull() {
            addCriterion("pulishtime is null");
            return (Criteria) this;
        }

        public Criteria andPulishtimeIsNotNull() {
            addCriterion("pulishtime is not null");
            return (Criteria) this;
        }

        public Criteria andPulishtimeEqualTo(String value) {
            addCriterion("pulishtime =", value, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andPulishtimeNotEqualTo(String value) {
            addCriterion("pulishtime <>", value, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andPulishtimeGreaterThan(String value) {
            addCriterion("pulishtime >", value, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andPulishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("pulishtime >=", value, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andPulishtimeLessThan(String value) {
            addCriterion("pulishtime <", value, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andPulishtimeLessThanOrEqualTo(String value) {
            addCriterion("pulishtime <=", value, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andPulishtimeLike(String value) {
            addCriterion("pulishtime like", value, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andPulishtimeNotLike(String value) {
            addCriterion("pulishtime not like", value, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andPulishtimeIn(List<String> values) {
            addCriterion("pulishtime in", values, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andPulishtimeNotIn(List<String> values) {
            addCriterion("pulishtime not in", values, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andPulishtimeBetween(String value1, String value2) {
            addCriterion("pulishtime between", value1, value2, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andPulishtimeNotBetween(String value1, String value2) {
            addCriterion("pulishtime not between", value1, value2, "pulishtime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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
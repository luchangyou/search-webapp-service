package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasEventInfoExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public BasEventInfoExample() {
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

    public BasEventInfoExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public BasEventInfoExample needTitle() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("title");
        
        return this;
    }

    public BasEventInfoExample needEdesc() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("edesc");
        
        return this;
    }

    public BasEventInfoExample needSource() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("source");
        
        return this;
    }

    public BasEventInfoExample needUrl() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("url");
        
        return this;
    }

    public BasEventInfoExample needOuuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ouuid");
        
        return this;
    }

    public BasEventInfoExample needEuuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("euuid");
        
        return this;
    }

    public BasEventInfoExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public BasEventInfoExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public BasEventInfoExample needType() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("type");
        
        return this;
    }

    public BasEventInfoExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public BasEventInfoExample orderByTitle(String type) {
        if(orderByClause == null){
            orderByClause = "title " + type;
        }
        else{
            orderByClause += " ,title " + type;
        }
        
        return this;
    }

    public BasEventInfoExample orderByEdesc(String type) {
        if(orderByClause == null){
            orderByClause = "edesc " + type;
        }
        else{
            orderByClause += " ,edesc " + type;
        }
        
        return this;
    }

    public BasEventInfoExample orderBySource(String type) {
        if(orderByClause == null){
            orderByClause = "source " + type;
        }
        else{
            orderByClause += " ,source " + type;
        }
        
        return this;
    }

    public BasEventInfoExample orderByUrl(String type) {
        if(orderByClause == null){
            orderByClause = "url " + type;
        }
        else{
            orderByClause += " ,url " + type;
        }
        
        return this;
    }

    public BasEventInfoExample orderByOuuid(String type) {
        if(orderByClause == null){
            orderByClause = "ouuid " + type;
        }
        else{
            orderByClause += " ,ouuid " + type;
        }
        
        return this;
    }

    public BasEventInfoExample orderByEuuid(String type) {
        if(orderByClause == null){
            orderByClause = "euuid " + type;
        }
        else{
            orderByClause += " ,euuid " + type;
        }
        
        return this;
    }

    public BasEventInfoExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public BasEventInfoExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public BasEventInfoExample orderByType(String type) {
        if(orderByClause == null){
            orderByClause = "type " + type;
        }
        else{
            orderByClause += " ,type " + type;
        }
        
        return this;
    }

    public BasEventInfoExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public BasEventInfoExample groupByTitle() {
        if(groupByClause == null){
            groupByClause = "title ";
        }
        else{
            groupByClause += " ,title ";
        }
        
        return this;
    }

    public BasEventInfoExample groupByEdesc() {
        if(groupByClause == null){
            groupByClause = "edesc ";
        }
        else{
            groupByClause += " ,edesc ";
        }
        
        return this;
    }

    public BasEventInfoExample groupBySource() {
        if(groupByClause == null){
            groupByClause = "source ";
        }
        else{
            groupByClause += " ,source ";
        }
        
        return this;
    }

    public BasEventInfoExample groupByUrl() {
        if(groupByClause == null){
            groupByClause = "url ";
        }
        else{
            groupByClause += " ,url ";
        }
        
        return this;
    }

    public BasEventInfoExample groupByOuuid() {
        if(groupByClause == null){
            groupByClause = "ouuid ";
        }
        else{
            groupByClause += " ,ouuid ";
        }
        
        return this;
    }

    public BasEventInfoExample groupByEuuid() {
        if(groupByClause == null){
            groupByClause = "euuid ";
        }
        else{
            groupByClause += " ,euuid ";
        }
        
        return this;
    }

    public BasEventInfoExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public BasEventInfoExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public BasEventInfoExample groupByType() {
        if(groupByClause == null){
            groupByClause = "type ";
        }
        else{
            groupByClause += " ,type ";
        }
        
        return this;
    }

    public BasEventInfoExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public BasEventInfoExample groupConcatTitle() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(title SEPARATOR \'|\') as title");
        return this;
    }

    public BasEventInfoExample groupConcatEdesc() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(edesc SEPARATOR \'|\') as edesc");
        return this;
    }

    public BasEventInfoExample groupConcatSource() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(source SEPARATOR \'|\') as source");
        return this;
    }

    public BasEventInfoExample groupConcatUrl() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(url SEPARATOR \'|\') as url");
        return this;
    }

    public BasEventInfoExample groupConcatOuuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ouuid SEPARATOR \'|\') as ouuid");
        return this;
    }

    public BasEventInfoExample groupConcatEuuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(euuid SEPARATOR \'|\') as euuid");
        return this;
    }

    public BasEventInfoExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public BasEventInfoExample groupConcatAtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(atime SEPARATOR \'|\') as atime");
        return this;
    }

    public BasEventInfoExample groupConcatType() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(type SEPARATOR \'|\') as type");
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

        public Criteria andEdescIsNull() {
            addCriterion("edesc is null");
            return (Criteria) this;
        }

        public Criteria andEdescIsNotNull() {
            addCriterion("edesc is not null");
            return (Criteria) this;
        }

        public Criteria andEdescEqualTo(String value) {
            addCriterion("edesc =", value, "edesc");
            return (Criteria) this;
        }

        public Criteria andEdescNotEqualTo(String value) {
            addCriterion("edesc <>", value, "edesc");
            return (Criteria) this;
        }

        public Criteria andEdescGreaterThan(String value) {
            addCriterion("edesc >", value, "edesc");
            return (Criteria) this;
        }

        public Criteria andEdescGreaterThanOrEqualTo(String value) {
            addCriterion("edesc >=", value, "edesc");
            return (Criteria) this;
        }

        public Criteria andEdescLessThan(String value) {
            addCriterion("edesc <", value, "edesc");
            return (Criteria) this;
        }

        public Criteria andEdescLessThanOrEqualTo(String value) {
            addCriterion("edesc <=", value, "edesc");
            return (Criteria) this;
        }

        public Criteria andEdescLike(String value) {
            addCriterion("edesc like", value, "edesc");
            return (Criteria) this;
        }

        public Criteria andEdescNotLike(String value) {
            addCriterion("edesc not like", value, "edesc");
            return (Criteria) this;
        }

        public Criteria andEdescIn(List<String> values) {
            addCriterion("edesc in", values, "edesc");
            return (Criteria) this;
        }

        public Criteria andEdescNotIn(List<String> values) {
            addCriterion("edesc not in", values, "edesc");
            return (Criteria) this;
        }

        public Criteria andEdescBetween(String value1, String value2) {
            addCriterion("edesc between", value1, value2, "edesc");
            return (Criteria) this;
        }

        public Criteria andEdescNotBetween(String value1, String value2) {
            addCriterion("edesc not between", value1, value2, "edesc");
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

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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
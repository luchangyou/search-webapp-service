package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PerGameInfoExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public PerGameInfoExample() {
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

    public PerGameInfoExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public PerGameInfoExample needGname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("gname");
        
        return this;
    }

    public PerGameInfoExample needArea() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("area");
        
        return this;
    }

    public PerGameInfoExample needRolename() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rolename");
        
        return this;
    }

    public PerGameInfoExample needAchievement() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("achievement");
        
        return this;
    }

    public PerGameInfoExample needLvl() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("lvl");
        
        return this;
    }

    public PerGameInfoExample needGang() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("gang");
        
        return this;
    }

    public PerGameInfoExample needSpeech() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("speech");
        
        return this;
    }

    public PerGameInfoExample needStartTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("start_time");
        
        return this;
    }

    public PerGameInfoExample needConsume() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("consume");
        
        return this;
    }

    public PerGameInfoExample needGameExp() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("game_exp");
        
        return this;
    }

    public PerGameInfoExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public PerGameInfoExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public PerGameInfoExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public PerGameInfoExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByGname(String type) {
        if(orderByClause == null){
            orderByClause = "gname " + type;
        }
        else{
            orderByClause += " ,gname " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByArea(String type) {
        if(orderByClause == null){
            orderByClause = "area " + type;
        }
        else{
            orderByClause += " ,area " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByRolename(String type) {
        if(orderByClause == null){
            orderByClause = "rolename " + type;
        }
        else{
            orderByClause += " ,rolename " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByAchievement(String type) {
        if(orderByClause == null){
            orderByClause = "achievement " + type;
        }
        else{
            orderByClause += " ,achievement " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByLvl(String type) {
        if(orderByClause == null){
            orderByClause = "lvl " + type;
        }
        else{
            orderByClause += " ,lvl " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByGang(String type) {
        if(orderByClause == null){
            orderByClause = "gang " + type;
        }
        else{
            orderByClause += " ,gang " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderBySpeech(String type) {
        if(orderByClause == null){
            orderByClause = "speech " + type;
        }
        else{
            orderByClause += " ,speech " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByStartTime(String type) {
        if(orderByClause == null){
            orderByClause = "start_time " + type;
        }
        else{
            orderByClause += " ,start_time " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByConsume(String type) {
        if(orderByClause == null){
            orderByClause = "consume " + type;
        }
        else{
            orderByClause += " ,consume " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByGameExp(String type) {
        if(orderByClause == null){
            orderByClause = "game_exp " + type;
        }
        else{
            orderByClause += " ,game_exp " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public PerGameInfoExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public PerGameInfoExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByGname() {
        if(groupByClause == null){
            groupByClause = "gname ";
        }
        else{
            groupByClause += " ,gname ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByArea() {
        if(groupByClause == null){
            groupByClause = "area ";
        }
        else{
            groupByClause += " ,area ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByRolename() {
        if(groupByClause == null){
            groupByClause = "rolename ";
        }
        else{
            groupByClause += " ,rolename ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByAchievement() {
        if(groupByClause == null){
            groupByClause = "achievement ";
        }
        else{
            groupByClause += " ,achievement ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByLvl() {
        if(groupByClause == null){
            groupByClause = "lvl ";
        }
        else{
            groupByClause += " ,lvl ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByGang() {
        if(groupByClause == null){
            groupByClause = "gang ";
        }
        else{
            groupByClause += " ,gang ";
        }
        
        return this;
    }

    public PerGameInfoExample groupBySpeech() {
        if(groupByClause == null){
            groupByClause = "speech ";
        }
        else{
            groupByClause += " ,speech ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByStartTime() {
        if(groupByClause == null){
            groupByClause = "start_time ";
        }
        else{
            groupByClause += " ,start_time ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByConsume() {
        if(groupByClause == null){
            groupByClause = "consume ";
        }
        else{
            groupByClause += " ,consume ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByGameExp() {
        if(groupByClause == null){
            groupByClause = "game_exp ";
        }
        else{
            groupByClause += " ,game_exp ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public PerGameInfoExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public PerGameInfoExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public PerGameInfoExample groupConcatGname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(gname SEPARATOR \'|\') as gname");
        return this;
    }

    public PerGameInfoExample groupConcatArea() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(area SEPARATOR \'|\') as area");
        return this;
    }

    public PerGameInfoExample groupConcatRolename() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rolename SEPARATOR \'|\') as rolename");
        return this;
    }

    public PerGameInfoExample groupConcatAchievement() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(achievement SEPARATOR \'|\') as achievement");
        return this;
    }

    public PerGameInfoExample groupConcatLvl() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(lvl SEPARATOR \'|\') as lvl");
        return this;
    }

    public PerGameInfoExample groupConcatGang() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(gang SEPARATOR \'|\') as gang");
        return this;
    }

    public PerGameInfoExample groupConcatSpeech() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(speech SEPARATOR \'|\') as speech");
        return this;
    }

    public PerGameInfoExample groupConcatStartTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(start_time SEPARATOR \'|\') as start_time");
        return this;
    }

    public PerGameInfoExample groupConcatConsume() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(consume SEPARATOR \'|\') as consume");
        return this;
    }

    public PerGameInfoExample groupConcatGameExp() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(game_exp SEPARATOR \'|\') as game_exp");
        return this;
    }

    public PerGameInfoExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public PerGameInfoExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public PerGameInfoExample groupConcatAtime() {
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

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNull() {
            addCriterion("rolename is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("rolename is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("rolename =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("rolename <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("rolename >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("rolename >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("rolename <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("rolename <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("rolename like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("rolename not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("rolename in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("rolename not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("rolename between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("rolename not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andAchievementIsNull() {
            addCriterion("achievement is null");
            return (Criteria) this;
        }

        public Criteria andAchievementIsNotNull() {
            addCriterion("achievement is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementEqualTo(String value) {
            addCriterion("achievement =", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotEqualTo(String value) {
            addCriterion("achievement <>", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementGreaterThan(String value) {
            addCriterion("achievement >", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementGreaterThanOrEqualTo(String value) {
            addCriterion("achievement >=", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLessThan(String value) {
            addCriterion("achievement <", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLessThanOrEqualTo(String value) {
            addCriterion("achievement <=", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLike(String value) {
            addCriterion("achievement like", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotLike(String value) {
            addCriterion("achievement not like", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementIn(List<String> values) {
            addCriterion("achievement in", values, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotIn(List<String> values) {
            addCriterion("achievement not in", values, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementBetween(String value1, String value2) {
            addCriterion("achievement between", value1, value2, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotBetween(String value1, String value2) {
            addCriterion("achievement not between", value1, value2, "achievement");
            return (Criteria) this;
        }

        public Criteria andLvlIsNull() {
            addCriterion("lvl is null");
            return (Criteria) this;
        }

        public Criteria andLvlIsNotNull() {
            addCriterion("lvl is not null");
            return (Criteria) this;
        }

        public Criteria andLvlEqualTo(String value) {
            addCriterion("lvl =", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlNotEqualTo(String value) {
            addCriterion("lvl <>", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlGreaterThan(String value) {
            addCriterion("lvl >", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlGreaterThanOrEqualTo(String value) {
            addCriterion("lvl >=", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlLessThan(String value) {
            addCriterion("lvl <", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlLessThanOrEqualTo(String value) {
            addCriterion("lvl <=", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlLike(String value) {
            addCriterion("lvl like", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlNotLike(String value) {
            addCriterion("lvl not like", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlIn(List<String> values) {
            addCriterion("lvl in", values, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlNotIn(List<String> values) {
            addCriterion("lvl not in", values, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlBetween(String value1, String value2) {
            addCriterion("lvl between", value1, value2, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlNotBetween(String value1, String value2) {
            addCriterion("lvl not between", value1, value2, "lvl");
            return (Criteria) this;
        }

        public Criteria andGangIsNull() {
            addCriterion("gang is null");
            return (Criteria) this;
        }

        public Criteria andGangIsNotNull() {
            addCriterion("gang is not null");
            return (Criteria) this;
        }

        public Criteria andGangEqualTo(String value) {
            addCriterion("gang =", value, "gang");
            return (Criteria) this;
        }

        public Criteria andGangNotEqualTo(String value) {
            addCriterion("gang <>", value, "gang");
            return (Criteria) this;
        }

        public Criteria andGangGreaterThan(String value) {
            addCriterion("gang >", value, "gang");
            return (Criteria) this;
        }

        public Criteria andGangGreaterThanOrEqualTo(String value) {
            addCriterion("gang >=", value, "gang");
            return (Criteria) this;
        }

        public Criteria andGangLessThan(String value) {
            addCriterion("gang <", value, "gang");
            return (Criteria) this;
        }

        public Criteria andGangLessThanOrEqualTo(String value) {
            addCriterion("gang <=", value, "gang");
            return (Criteria) this;
        }

        public Criteria andGangLike(String value) {
            addCriterion("gang like", value, "gang");
            return (Criteria) this;
        }

        public Criteria andGangNotLike(String value) {
            addCriterion("gang not like", value, "gang");
            return (Criteria) this;
        }

        public Criteria andGangIn(List<String> values) {
            addCriterion("gang in", values, "gang");
            return (Criteria) this;
        }

        public Criteria andGangNotIn(List<String> values) {
            addCriterion("gang not in", values, "gang");
            return (Criteria) this;
        }

        public Criteria andGangBetween(String value1, String value2) {
            addCriterion("gang between", value1, value2, "gang");
            return (Criteria) this;
        }

        public Criteria andGangNotBetween(String value1, String value2) {
            addCriterion("gang not between", value1, value2, "gang");
            return (Criteria) this;
        }

        public Criteria andSpeechIsNull() {
            addCriterion("speech is null");
            return (Criteria) this;
        }

        public Criteria andSpeechIsNotNull() {
            addCriterion("speech is not null");
            return (Criteria) this;
        }

        public Criteria andSpeechEqualTo(String value) {
            addCriterion("speech =", value, "speech");
            return (Criteria) this;
        }

        public Criteria andSpeechNotEqualTo(String value) {
            addCriterion("speech <>", value, "speech");
            return (Criteria) this;
        }

        public Criteria andSpeechGreaterThan(String value) {
            addCriterion("speech >", value, "speech");
            return (Criteria) this;
        }

        public Criteria andSpeechGreaterThanOrEqualTo(String value) {
            addCriterion("speech >=", value, "speech");
            return (Criteria) this;
        }

        public Criteria andSpeechLessThan(String value) {
            addCriterion("speech <", value, "speech");
            return (Criteria) this;
        }

        public Criteria andSpeechLessThanOrEqualTo(String value) {
            addCriterion("speech <=", value, "speech");
            return (Criteria) this;
        }

        public Criteria andSpeechLike(String value) {
            addCriterion("speech like", value, "speech");
            return (Criteria) this;
        }

        public Criteria andSpeechNotLike(String value) {
            addCriterion("speech not like", value, "speech");
            return (Criteria) this;
        }

        public Criteria andSpeechIn(List<String> values) {
            addCriterion("speech in", values, "speech");
            return (Criteria) this;
        }

        public Criteria andSpeechNotIn(List<String> values) {
            addCriterion("speech not in", values, "speech");
            return (Criteria) this;
        }

        public Criteria andSpeechBetween(String value1, String value2) {
            addCriterion("speech between", value1, value2, "speech");
            return (Criteria) this;
        }

        public Criteria andSpeechNotBetween(String value1, String value2) {
            addCriterion("speech not between", value1, value2, "speech");
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

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andConsumeIsNull() {
            addCriterion("consume is null");
            return (Criteria) this;
        }

        public Criteria andConsumeIsNotNull() {
            addCriterion("consume is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeEqualTo(String value) {
            addCriterion("consume =", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotEqualTo(String value) {
            addCriterion("consume <>", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThan(String value) {
            addCriterion("consume >", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThanOrEqualTo(String value) {
            addCriterion("consume >=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThan(String value) {
            addCriterion("consume <", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThanOrEqualTo(String value) {
            addCriterion("consume <=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLike(String value) {
            addCriterion("consume like", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotLike(String value) {
            addCriterion("consume not like", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeIn(List<String> values) {
            addCriterion("consume in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotIn(List<String> values) {
            addCriterion("consume not in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeBetween(String value1, String value2) {
            addCriterion("consume between", value1, value2, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotBetween(String value1, String value2) {
            addCriterion("consume not between", value1, value2, "consume");
            return (Criteria) this;
        }

        public Criteria andGameExpIsNull() {
            addCriterion("game_exp is null");
            return (Criteria) this;
        }

        public Criteria andGameExpIsNotNull() {
            addCriterion("game_exp is not null");
            return (Criteria) this;
        }

        public Criteria andGameExpEqualTo(String value) {
            addCriterion("game_exp =", value, "gameExp");
            return (Criteria) this;
        }

        public Criteria andGameExpNotEqualTo(String value) {
            addCriterion("game_exp <>", value, "gameExp");
            return (Criteria) this;
        }

        public Criteria andGameExpGreaterThan(String value) {
            addCriterion("game_exp >", value, "gameExp");
            return (Criteria) this;
        }

        public Criteria andGameExpGreaterThanOrEqualTo(String value) {
            addCriterion("game_exp >=", value, "gameExp");
            return (Criteria) this;
        }

        public Criteria andGameExpLessThan(String value) {
            addCriterion("game_exp <", value, "gameExp");
            return (Criteria) this;
        }

        public Criteria andGameExpLessThanOrEqualTo(String value) {
            addCriterion("game_exp <=", value, "gameExp");
            return (Criteria) this;
        }

        public Criteria andGameExpLike(String value) {
            addCriterion("game_exp like", value, "gameExp");
            return (Criteria) this;
        }

        public Criteria andGameExpNotLike(String value) {
            addCriterion("game_exp not like", value, "gameExp");
            return (Criteria) this;
        }

        public Criteria andGameExpIn(List<String> values) {
            addCriterion("game_exp in", values, "gameExp");
            return (Criteria) this;
        }

        public Criteria andGameExpNotIn(List<String> values) {
            addCriterion("game_exp not in", values, "gameExp");
            return (Criteria) this;
        }

        public Criteria andGameExpBetween(String value1, String value2) {
            addCriterion("game_exp between", value1, value2, "gameExp");
            return (Criteria) this;
        }

        public Criteria andGameExpNotBetween(String value1, String value2) {
            addCriterion("game_exp not between", value1, value2, "gameExp");
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
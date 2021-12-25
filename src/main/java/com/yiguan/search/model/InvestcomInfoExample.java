package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvestcomInfoExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public InvestcomInfoExample() {
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

    public InvestcomInfoExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public InvestcomInfoExample needReasonableCapitalScale() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("reasonable_capital_scale");
        
        return this;
    }

    public InvestcomInfoExample needIndividualProjectinvestmentScale() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("individual_projectinvestment_scale");
        
        return this;
    }

    public InvestcomInfoExample needInvestmentField() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("investment_field");
        
        return this;
    }

    public InvestcomInfoExample needInvestmentRound() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("investment_round");
        
        return this;
    }

    public InvestcomInfoExample needFundManager() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("fund_manager");
        
        return this;
    }

    public InvestcomInfoExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public InvestcomInfoExample needUrl() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("url");
        
        return this;
    }

    public InvestcomInfoExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public InvestcomInfoExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public InvestcomInfoExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public InvestcomInfoExample orderByReasonableCapitalScale(String type) {
        if(orderByClause == null){
            orderByClause = "reasonable_capital_scale " + type;
        }
        else{
            orderByClause += " ,reasonable_capital_scale " + type;
        }
        
        return this;
    }

    public InvestcomInfoExample orderByIndividualProjectinvestmentScale(String type) {
        if(orderByClause == null){
            orderByClause = "individual_projectinvestment_scale " + type;
        }
        else{
            orderByClause += " ,individual_projectinvestment_scale " + type;
        }
        
        return this;
    }

    public InvestcomInfoExample orderByInvestmentField(String type) {
        if(orderByClause == null){
            orderByClause = "investment_field " + type;
        }
        else{
            orderByClause += " ,investment_field " + type;
        }
        
        return this;
    }

    public InvestcomInfoExample orderByInvestmentRound(String type) {
        if(orderByClause == null){
            orderByClause = "investment_round " + type;
        }
        else{
            orderByClause += " ,investment_round " + type;
        }
        
        return this;
    }

    public InvestcomInfoExample orderByFundManager(String type) {
        if(orderByClause == null){
            orderByClause = "fund_manager " + type;
        }
        else{
            orderByClause += " ,fund_manager " + type;
        }
        
        return this;
    }

    public InvestcomInfoExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public InvestcomInfoExample orderByUrl(String type) {
        if(orderByClause == null){
            orderByClause = "url " + type;
        }
        else{
            orderByClause += " ,url " + type;
        }
        
        return this;
    }

    public InvestcomInfoExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public InvestcomInfoExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public InvestcomInfoExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public InvestcomInfoExample groupByReasonableCapitalScale() {
        if(groupByClause == null){
            groupByClause = "reasonable_capital_scale ";
        }
        else{
            groupByClause += " ,reasonable_capital_scale ";
        }
        
        return this;
    }

    public InvestcomInfoExample groupByIndividualProjectinvestmentScale() {
        if(groupByClause == null){
            groupByClause = "individual_projectinvestment_scale ";
        }
        else{
            groupByClause += " ,individual_projectinvestment_scale ";
        }
        
        return this;
    }

    public InvestcomInfoExample groupByInvestmentField() {
        if(groupByClause == null){
            groupByClause = "investment_field ";
        }
        else{
            groupByClause += " ,investment_field ";
        }
        
        return this;
    }

    public InvestcomInfoExample groupByInvestmentRound() {
        if(groupByClause == null){
            groupByClause = "investment_round ";
        }
        else{
            groupByClause += " ,investment_round ";
        }
        
        return this;
    }

    public InvestcomInfoExample groupByFundManager() {
        if(groupByClause == null){
            groupByClause = "fund_manager ";
        }
        else{
            groupByClause += " ,fund_manager ";
        }
        
        return this;
    }

    public InvestcomInfoExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public InvestcomInfoExample groupByUrl() {
        if(groupByClause == null){
            groupByClause = "url ";
        }
        else{
            groupByClause += " ,url ";
        }
        
        return this;
    }

    public InvestcomInfoExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public InvestcomInfoExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public InvestcomInfoExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public InvestcomInfoExample groupConcatReasonableCapitalScale() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(reasonable_capital_scale SEPARATOR \'|\') as reasonable_capital_scale");
        return this;
    }

    public InvestcomInfoExample groupConcatIndividualProjectinvestmentScale() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(individual_projectinvestment_scale SEPARATOR \'|\') as individual_projectinvestment_scale");
        return this;
    }

    public InvestcomInfoExample groupConcatInvestmentField() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(investment_field SEPARATOR \'|\') as investment_field");
        return this;
    }

    public InvestcomInfoExample groupConcatInvestmentRound() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(investment_round SEPARATOR \'|\') as investment_round");
        return this;
    }

    public InvestcomInfoExample groupConcatFundManager() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(fund_manager SEPARATOR \'|\') as fund_manager");
        return this;
    }

    public InvestcomInfoExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public InvestcomInfoExample groupConcatUrl() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(url SEPARATOR \'|\') as url");
        return this;
    }

    public InvestcomInfoExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public InvestcomInfoExample groupConcatAtime() {
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

        public Criteria andReasonableCapitalScaleIsNull() {
            addCriterion("reasonable_capital_scale is null");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleIsNotNull() {
            addCriterion("reasonable_capital_scale is not null");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleEqualTo(String value) {
            addCriterion("reasonable_capital_scale =", value, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleNotEqualTo(String value) {
            addCriterion("reasonable_capital_scale <>", value, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleGreaterThan(String value) {
            addCriterion("reasonable_capital_scale >", value, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleGreaterThanOrEqualTo(String value) {
            addCriterion("reasonable_capital_scale >=", value, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleLessThan(String value) {
            addCriterion("reasonable_capital_scale <", value, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleLessThanOrEqualTo(String value) {
            addCriterion("reasonable_capital_scale <=", value, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleLike(String value) {
            addCriterion("reasonable_capital_scale like", value, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleNotLike(String value) {
            addCriterion("reasonable_capital_scale not like", value, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleIn(List<String> values) {
            addCriterion("reasonable_capital_scale in", values, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleNotIn(List<String> values) {
            addCriterion("reasonable_capital_scale not in", values, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleBetween(String value1, String value2) {
            addCriterion("reasonable_capital_scale between", value1, value2, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andReasonableCapitalScaleNotBetween(String value1, String value2) {
            addCriterion("reasonable_capital_scale not between", value1, value2, "reasonableCapitalScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleIsNull() {
            addCriterion("individual_projectinvestment_scale is null");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleIsNotNull() {
            addCriterion("individual_projectinvestment_scale is not null");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleEqualTo(String value) {
            addCriterion("individual_projectinvestment_scale =", value, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleNotEqualTo(String value) {
            addCriterion("individual_projectinvestment_scale <>", value, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleGreaterThan(String value) {
            addCriterion("individual_projectinvestment_scale >", value, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleGreaterThanOrEqualTo(String value) {
            addCriterion("individual_projectinvestment_scale >=", value, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleLessThan(String value) {
            addCriterion("individual_projectinvestment_scale <", value, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleLessThanOrEqualTo(String value) {
            addCriterion("individual_projectinvestment_scale <=", value, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleLike(String value) {
            addCriterion("individual_projectinvestment_scale like", value, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleNotLike(String value) {
            addCriterion("individual_projectinvestment_scale not like", value, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleIn(List<String> values) {
            addCriterion("individual_projectinvestment_scale in", values, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleNotIn(List<String> values) {
            addCriterion("individual_projectinvestment_scale not in", values, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleBetween(String value1, String value2) {
            addCriterion("individual_projectinvestment_scale between", value1, value2, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andIndividualProjectinvestmentScaleNotBetween(String value1, String value2) {
            addCriterion("individual_projectinvestment_scale not between", value1, value2, "individualProjectinvestmentScale");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldIsNull() {
            addCriterion("investment_field is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldIsNotNull() {
            addCriterion("investment_field is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldEqualTo(String value) {
            addCriterion("investment_field =", value, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldNotEqualTo(String value) {
            addCriterion("investment_field <>", value, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldGreaterThan(String value) {
            addCriterion("investment_field >", value, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldGreaterThanOrEqualTo(String value) {
            addCriterion("investment_field >=", value, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldLessThan(String value) {
            addCriterion("investment_field <", value, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldLessThanOrEqualTo(String value) {
            addCriterion("investment_field <=", value, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldLike(String value) {
            addCriterion("investment_field like", value, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldNotLike(String value) {
            addCriterion("investment_field not like", value, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldIn(List<String> values) {
            addCriterion("investment_field in", values, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldNotIn(List<String> values) {
            addCriterion("investment_field not in", values, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldBetween(String value1, String value2) {
            addCriterion("investment_field between", value1, value2, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentFieldNotBetween(String value1, String value2) {
            addCriterion("investment_field not between", value1, value2, "investmentField");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundIsNull() {
            addCriterion("investment_round is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundIsNotNull() {
            addCriterion("investment_round is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundEqualTo(String value) {
            addCriterion("investment_round =", value, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundNotEqualTo(String value) {
            addCriterion("investment_round <>", value, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundGreaterThan(String value) {
            addCriterion("investment_round >", value, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundGreaterThanOrEqualTo(String value) {
            addCriterion("investment_round >=", value, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundLessThan(String value) {
            addCriterion("investment_round <", value, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundLessThanOrEqualTo(String value) {
            addCriterion("investment_round <=", value, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundLike(String value) {
            addCriterion("investment_round like", value, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundNotLike(String value) {
            addCriterion("investment_round not like", value, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundIn(List<String> values) {
            addCriterion("investment_round in", values, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundNotIn(List<String> values) {
            addCriterion("investment_round not in", values, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundBetween(String value1, String value2) {
            addCriterion("investment_round between", value1, value2, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundNotBetween(String value1, String value2) {
            addCriterion("investment_round not between", value1, value2, "investmentRound");
            return (Criteria) this;
        }

        public Criteria andFundManagerIsNull() {
            addCriterion("fund_manager is null");
            return (Criteria) this;
        }

        public Criteria andFundManagerIsNotNull() {
            addCriterion("fund_manager is not null");
            return (Criteria) this;
        }

        public Criteria andFundManagerEqualTo(String value) {
            addCriterion("fund_manager =", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotEqualTo(String value) {
            addCriterion("fund_manager <>", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerGreaterThan(String value) {
            addCriterion("fund_manager >", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerGreaterThanOrEqualTo(String value) {
            addCriterion("fund_manager >=", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLessThan(String value) {
            addCriterion("fund_manager <", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLessThanOrEqualTo(String value) {
            addCriterion("fund_manager <=", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLike(String value) {
            addCriterion("fund_manager like", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotLike(String value) {
            addCriterion("fund_manager not like", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerIn(List<String> values) {
            addCriterion("fund_manager in", values, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotIn(List<String> values) {
            addCriterion("fund_manager not in", values, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerBetween(String value1, String value2) {
            addCriterion("fund_manager between", value1, value2, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotBetween(String value1, String value2) {
            addCriterion("fund_manager not between", value1, value2, "fundManager");
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
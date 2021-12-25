package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasOrganizeInfoExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public BasOrganizeInfoExample() {
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

    public BasOrganizeInfoExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public BasOrganizeInfoExample needOname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("oname");
        
        return this;
    }

    public BasOrganizeInfoExample needEname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ename");
        
        return this;
    }

    public BasOrganizeInfoExample needShortname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("shortname");
        
        return this;
    }

    public BasOrganizeInfoExample needFullname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("fullname");
        
        return this;
    }

    public BasOrganizeInfoExample needWeb() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("web");
        
        return this;
    }

    public BasOrganizeInfoExample needConWay() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("con_way");
        
        return this;
    }

    public BasOrganizeInfoExample needIndustry() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("industry");
        
        return this;
    }

    public BasOrganizeInfoExample needScale() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("scale");
        
        return this;
    }

    public BasOrganizeInfoExample needIntroduce() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("introduce");
        
        return this;
    }

    public BasOrganizeInfoExample needAddress() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("address");
        
        return this;
    }

    public BasOrganizeInfoExample needLogo() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("logo");
        
        return this;
    }

    public BasOrganizeInfoExample needStime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("stime");
        
        return this;
    }

    public BasOrganizeInfoExample needOther() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("other");
        
        return this;
    }

    public BasOrganizeInfoExample needSource() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("source");
        
        return this;
    }

    public BasOrganizeInfoExample needUrl() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("url");
        
        return this;
    }

    public BasOrganizeInfoExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public BasOrganizeInfoExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public BasOrganizeInfoExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public BasOrganizeInfoExample needType() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("type");
        
        return this;
    }

    public BasOrganizeInfoExample needFinancingRound() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("financing_round");
        
        return this;
    }

    public BasOrganizeInfoExample needPicture() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("picture");
        
        return this;
    }

    public BasOrganizeInfoExample needDevelopmentHistory() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("development_history");
        
        return this;
    }

    public BasOrganizeInfoExample needFinancingStage() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("financing_stage");
        
        return this;
    }

    public BasOrganizeInfoExample needFinancingTotal() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("financing_total");
        
        return this;
    }

    public BasOrganizeInfoExample needCompanyNature() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("company_nature");
        
        return this;
    }

    public BasOrganizeInfoExample needCorporateCulture() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("corporate_culture");
        
        return this;
    }

    public BasOrganizeInfoExample needTag() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("tag");
        
        return this;
    }

    public BasOrganizeInfoExample needManagementField() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("management_field");
        
        return this;
    }

    public BasOrganizeInfoExample needBusinessPlan() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("business_plan");
        
        return this;
    }

    public BasOrganizeInfoExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByOname(String type) {
        if(orderByClause == null){
            orderByClause = "oname " + type;
        }
        else{
            orderByClause += " ,oname " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByEname(String type) {
        if(orderByClause == null){
            orderByClause = "ename " + type;
        }
        else{
            orderByClause += " ,ename " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByShortname(String type) {
        if(orderByClause == null){
            orderByClause = "shortname " + type;
        }
        else{
            orderByClause += " ,shortname " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByFullname(String type) {
        if(orderByClause == null){
            orderByClause = "fullname " + type;
        }
        else{
            orderByClause += " ,fullname " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByWeb(String type) {
        if(orderByClause == null){
            orderByClause = "web " + type;
        }
        else{
            orderByClause += " ,web " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByConWay(String type) {
        if(orderByClause == null){
            orderByClause = "con_way " + type;
        }
        else{
            orderByClause += " ,con_way " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByIndustry(String type) {
        if(orderByClause == null){
            orderByClause = "industry " + type;
        }
        else{
            orderByClause += " ,industry " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByScale(String type) {
        if(orderByClause == null){
            orderByClause = "scale " + type;
        }
        else{
            orderByClause += " ,scale " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByIntroduce(String type) {
        if(orderByClause == null){
            orderByClause = "introduce " + type;
        }
        else{
            orderByClause += " ,introduce " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByAddress(String type) {
        if(orderByClause == null){
            orderByClause = "address " + type;
        }
        else{
            orderByClause += " ,address " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByLogo(String type) {
        if(orderByClause == null){
            orderByClause = "logo " + type;
        }
        else{
            orderByClause += " ,logo " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByStime(String type) {
        if(orderByClause == null){
            orderByClause = "stime " + type;
        }
        else{
            orderByClause += " ,stime " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByOther(String type) {
        if(orderByClause == null){
            orderByClause = "other " + type;
        }
        else{
            orderByClause += " ,other " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderBySource(String type) {
        if(orderByClause == null){
            orderByClause = "source " + type;
        }
        else{
            orderByClause += " ,source " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByUrl(String type) {
        if(orderByClause == null){
            orderByClause = "url " + type;
        }
        else{
            orderByClause += " ,url " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByType(String type) {
        if(orderByClause == null){
            orderByClause = "type " + type;
        }
        else{
            orderByClause += " ,type " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByFinancingRound(String type) {
        if(orderByClause == null){
            orderByClause = "financing_round " + type;
        }
        else{
            orderByClause += " ,financing_round " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByPicture(String type) {
        if(orderByClause == null){
            orderByClause = "picture " + type;
        }
        else{
            orderByClause += " ,picture " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByDevelopmentHistory(String type) {
        if(orderByClause == null){
            orderByClause = "development_history " + type;
        }
        else{
            orderByClause += " ,development_history " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByFinancingStage(String type) {
        if(orderByClause == null){
            orderByClause = "financing_stage " + type;
        }
        else{
            orderByClause += " ,financing_stage " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByFinancingTotal(String type) {
        if(orderByClause == null){
            orderByClause = "financing_total " + type;
        }
        else{
            orderByClause += " ,financing_total " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByCompanyNature(String type) {
        if(orderByClause == null){
            orderByClause = "company_nature " + type;
        }
        else{
            orderByClause += " ,company_nature " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByCorporateCulture(String type) {
        if(orderByClause == null){
            orderByClause = "corporate_culture " + type;
        }
        else{
            orderByClause += " ,corporate_culture " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByTag(String type) {
        if(orderByClause == null){
            orderByClause = "tag " + type;
        }
        else{
            orderByClause += " ,tag " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByManagementField(String type) {
        if(orderByClause == null){
            orderByClause = "management_field " + type;
        }
        else{
            orderByClause += " ,management_field " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample orderByBusinessPlan(String type) {
        if(orderByClause == null){
            orderByClause = "business_plan " + type;
        }
        else{
            orderByClause += " ,business_plan " + type;
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByOname() {
        if(groupByClause == null){
            groupByClause = "oname ";
        }
        else{
            groupByClause += " ,oname ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByEname() {
        if(groupByClause == null){
            groupByClause = "ename ";
        }
        else{
            groupByClause += " ,ename ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByShortname() {
        if(groupByClause == null){
            groupByClause = "shortname ";
        }
        else{
            groupByClause += " ,shortname ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByFullname() {
        if(groupByClause == null){
            groupByClause = "fullname ";
        }
        else{
            groupByClause += " ,fullname ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByWeb() {
        if(groupByClause == null){
            groupByClause = "web ";
        }
        else{
            groupByClause += " ,web ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByConWay() {
        if(groupByClause == null){
            groupByClause = "con_way ";
        }
        else{
            groupByClause += " ,con_way ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByIndustry() {
        if(groupByClause == null){
            groupByClause = "industry ";
        }
        else{
            groupByClause += " ,industry ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByScale() {
        if(groupByClause == null){
            groupByClause = "scale ";
        }
        else{
            groupByClause += " ,scale ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByIntroduce() {
        if(groupByClause == null){
            groupByClause = "introduce ";
        }
        else{
            groupByClause += " ,introduce ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByAddress() {
        if(groupByClause == null){
            groupByClause = "address ";
        }
        else{
            groupByClause += " ,address ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByLogo() {
        if(groupByClause == null){
            groupByClause = "logo ";
        }
        else{
            groupByClause += " ,logo ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByStime() {
        if(groupByClause == null){
            groupByClause = "stime ";
        }
        else{
            groupByClause += " ,stime ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByOther() {
        if(groupByClause == null){
            groupByClause = "other ";
        }
        else{
            groupByClause += " ,other ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupBySource() {
        if(groupByClause == null){
            groupByClause = "source ";
        }
        else{
            groupByClause += " ,source ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByUrl() {
        if(groupByClause == null){
            groupByClause = "url ";
        }
        else{
            groupByClause += " ,url ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByType() {
        if(groupByClause == null){
            groupByClause = "type ";
        }
        else{
            groupByClause += " ,type ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByFinancingRound() {
        if(groupByClause == null){
            groupByClause = "financing_round ";
        }
        else{
            groupByClause += " ,financing_round ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByPicture() {
        if(groupByClause == null){
            groupByClause = "picture ";
        }
        else{
            groupByClause += " ,picture ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByDevelopmentHistory() {
        if(groupByClause == null){
            groupByClause = "development_history ";
        }
        else{
            groupByClause += " ,development_history ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByFinancingStage() {
        if(groupByClause == null){
            groupByClause = "financing_stage ";
        }
        else{
            groupByClause += " ,financing_stage ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByFinancingTotal() {
        if(groupByClause == null){
            groupByClause = "financing_total ";
        }
        else{
            groupByClause += " ,financing_total ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByCompanyNature() {
        if(groupByClause == null){
            groupByClause = "company_nature ";
        }
        else{
            groupByClause += " ,company_nature ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByCorporateCulture() {
        if(groupByClause == null){
            groupByClause = "corporate_culture ";
        }
        else{
            groupByClause += " ,corporate_culture ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByTag() {
        if(groupByClause == null){
            groupByClause = "tag ";
        }
        else{
            groupByClause += " ,tag ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByManagementField() {
        if(groupByClause == null){
            groupByClause = "management_field ";
        }
        else{
            groupByClause += " ,management_field ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupByBusinessPlan() {
        if(groupByClause == null){
            groupByClause = "business_plan ";
        }
        else{
            groupByClause += " ,business_plan ";
        }
        
        return this;
    }

    public BasOrganizeInfoExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public BasOrganizeInfoExample groupConcatOname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(oname SEPARATOR \'|\') as oname");
        return this;
    }

    public BasOrganizeInfoExample groupConcatEname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ename SEPARATOR \'|\') as ename");
        return this;
    }

    public BasOrganizeInfoExample groupConcatShortname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(shortname SEPARATOR \'|\') as shortname");
        return this;
    }

    public BasOrganizeInfoExample groupConcatFullname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(fullname SEPARATOR \'|\') as fullname");
        return this;
    }

    public BasOrganizeInfoExample groupConcatWeb() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(web SEPARATOR \'|\') as web");
        return this;
    }

    public BasOrganizeInfoExample groupConcatConWay() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(con_way SEPARATOR \'|\') as con_way");
        return this;
    }

    public BasOrganizeInfoExample groupConcatIndustry() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(industry SEPARATOR \'|\') as industry");
        return this;
    }

    public BasOrganizeInfoExample groupConcatScale() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(scale SEPARATOR \'|\') as scale");
        return this;
    }

    public BasOrganizeInfoExample groupConcatIntroduce() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(introduce SEPARATOR \'|\') as introduce");
        return this;
    }

    public BasOrganizeInfoExample groupConcatAddress() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(address SEPARATOR \'|\') as address");
        return this;
    }

    public BasOrganizeInfoExample groupConcatLogo() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(logo SEPARATOR \'|\') as logo");
        return this;
    }

    public BasOrganizeInfoExample groupConcatStime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(stime SEPARATOR \'|\') as stime");
        return this;
    }

    public BasOrganizeInfoExample groupConcatOther() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(other SEPARATOR \'|\') as other");
        return this;
    }

    public BasOrganizeInfoExample groupConcatSource() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(source SEPARATOR \'|\') as source");
        return this;
    }

    public BasOrganizeInfoExample groupConcatUrl() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(url SEPARATOR \'|\') as url");
        return this;
    }

    public BasOrganizeInfoExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public BasOrganizeInfoExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public BasOrganizeInfoExample groupConcatAtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(atime SEPARATOR \'|\') as atime");
        return this;
    }

    public BasOrganizeInfoExample groupConcatType() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(type SEPARATOR \'|\') as type");
        return this;
    }

    public BasOrganizeInfoExample groupConcatFinancingRound() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(financing_round SEPARATOR \'|\') as financing_round");
        return this;
    }

    public BasOrganizeInfoExample groupConcatPicture() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(picture SEPARATOR \'|\') as picture");
        return this;
    }

    public BasOrganizeInfoExample groupConcatDevelopmentHistory() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(development_history SEPARATOR \'|\') as development_history");
        return this;
    }

    public BasOrganizeInfoExample groupConcatFinancingStage() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(financing_stage SEPARATOR \'|\') as financing_stage");
        return this;
    }

    public BasOrganizeInfoExample groupConcatFinancingTotal() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(financing_total SEPARATOR \'|\') as financing_total");
        return this;
    }

    public BasOrganizeInfoExample groupConcatCompanyNature() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(company_nature SEPARATOR \'|\') as company_nature");
        return this;
    }

    public BasOrganizeInfoExample groupConcatCorporateCulture() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(corporate_culture SEPARATOR \'|\') as corporate_culture");
        return this;
    }

    public BasOrganizeInfoExample groupConcatTag() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(tag SEPARATOR \'|\') as tag");
        return this;
    }

    public BasOrganizeInfoExample groupConcatManagementField() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(management_field SEPARATOR \'|\') as management_field");
        return this;
    }

    public BasOrganizeInfoExample groupConcatBusinessPlan() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(business_plan SEPARATOR \'|\') as business_plan");
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

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("shortname is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("shortname is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("shortname =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("shortname <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("shortname >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("shortname >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("shortname <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("shortname <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("shortname like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("shortname not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("shortname in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("shortname not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("shortname between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("shortname not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("fullname is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("fullname is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("fullname =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("fullname <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("fullname >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("fullname >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("fullname <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("fullname <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("fullname like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("fullname not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("fullname in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("fullname not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("fullname between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("fullname not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andWebIsNull() {
            addCriterion("web is null");
            return (Criteria) this;
        }

        public Criteria andWebIsNotNull() {
            addCriterion("web is not null");
            return (Criteria) this;
        }

        public Criteria andWebEqualTo(String value) {
            addCriterion("web =", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotEqualTo(String value) {
            addCriterion("web <>", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThan(String value) {
            addCriterion("web >", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThanOrEqualTo(String value) {
            addCriterion("web >=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThan(String value) {
            addCriterion("web <", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThanOrEqualTo(String value) {
            addCriterion("web <=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLike(String value) {
            addCriterion("web like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotLike(String value) {
            addCriterion("web not like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebIn(List<String> values) {
            addCriterion("web in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotIn(List<String> values) {
            addCriterion("web not in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebBetween(String value1, String value2) {
            addCriterion("web between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotBetween(String value1, String value2) {
            addCriterion("web not between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andConWayIsNull() {
            addCriterion("con_way is null");
            return (Criteria) this;
        }

        public Criteria andConWayIsNotNull() {
            addCriterion("con_way is not null");
            return (Criteria) this;
        }

        public Criteria andConWayEqualTo(String value) {
            addCriterion("con_way =", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayNotEqualTo(String value) {
            addCriterion("con_way <>", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayGreaterThan(String value) {
            addCriterion("con_way >", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayGreaterThanOrEqualTo(String value) {
            addCriterion("con_way >=", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayLessThan(String value) {
            addCriterion("con_way <", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayLessThanOrEqualTo(String value) {
            addCriterion("con_way <=", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayLike(String value) {
            addCriterion("con_way like", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayNotLike(String value) {
            addCriterion("con_way not like", value, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayIn(List<String> values) {
            addCriterion("con_way in", values, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayNotIn(List<String> values) {
            addCriterion("con_way not in", values, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayBetween(String value1, String value2) {
            addCriterion("con_way between", value1, value2, "conWay");
            return (Criteria) this;
        }

        public Criteria andConWayNotBetween(String value1, String value2) {
            addCriterion("con_way not between", value1, value2, "conWay");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andScaleIsNull() {
            addCriterion("scale is null");
            return (Criteria) this;
        }

        public Criteria andScaleIsNotNull() {
            addCriterion("scale is not null");
            return (Criteria) this;
        }

        public Criteria andScaleEqualTo(String value) {
            addCriterion("scale =", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotEqualTo(String value) {
            addCriterion("scale <>", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThan(String value) {
            addCriterion("scale >", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThanOrEqualTo(String value) {
            addCriterion("scale >=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThan(String value) {
            addCriterion("scale <", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThanOrEqualTo(String value) {
            addCriterion("scale <=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLike(String value) {
            addCriterion("scale like", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotLike(String value) {
            addCriterion("scale not like", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleIn(List<String> values) {
            addCriterion("scale in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotIn(List<String> values) {
            addCriterion("scale not in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleBetween(String value1, String value2) {
            addCriterion("scale between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotBetween(String value1, String value2) {
            addCriterion("scale not between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andStimeIsNull() {
            addCriterion("stime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("stime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(String value) {
            addCriterion("stime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(String value) {
            addCriterion("stime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(String value) {
            addCriterion("stime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(String value) {
            addCriterion("stime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(String value) {
            addCriterion("stime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(String value) {
            addCriterion("stime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLike(String value) {
            addCriterion("stime like", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotLike(String value) {
            addCriterion("stime not like", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<String> values) {
            addCriterion("stime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<String> values) {
            addCriterion("stime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(String value1, String value2) {
            addCriterion("stime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(String value1, String value2) {
            addCriterion("stime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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

        public Criteria andFinancingRoundIsNull() {
            addCriterion("financing_round is null");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundIsNotNull() {
            addCriterion("financing_round is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundEqualTo(String value) {
            addCriterion("financing_round =", value, "financingRound");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundNotEqualTo(String value) {
            addCriterion("financing_round <>", value, "financingRound");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundGreaterThan(String value) {
            addCriterion("financing_round >", value, "financingRound");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundGreaterThanOrEqualTo(String value) {
            addCriterion("financing_round >=", value, "financingRound");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundLessThan(String value) {
            addCriterion("financing_round <", value, "financingRound");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundLessThanOrEqualTo(String value) {
            addCriterion("financing_round <=", value, "financingRound");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundLike(String value) {
            addCriterion("financing_round like", value, "financingRound");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundNotLike(String value) {
            addCriterion("financing_round not like", value, "financingRound");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundIn(List<String> values) {
            addCriterion("financing_round in", values, "financingRound");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundNotIn(List<String> values) {
            addCriterion("financing_round not in", values, "financingRound");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundBetween(String value1, String value2) {
            addCriterion("financing_round between", value1, value2, "financingRound");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundNotBetween(String value1, String value2) {
            addCriterion("financing_round not between", value1, value2, "financingRound");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryIsNull() {
            addCriterion("development_history is null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryIsNotNull() {
            addCriterion("development_history is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryEqualTo(String value) {
            addCriterion("development_history =", value, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryNotEqualTo(String value) {
            addCriterion("development_history <>", value, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryGreaterThan(String value) {
            addCriterion("development_history >", value, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("development_history >=", value, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryLessThan(String value) {
            addCriterion("development_history <", value, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryLessThanOrEqualTo(String value) {
            addCriterion("development_history <=", value, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryLike(String value) {
            addCriterion("development_history like", value, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryNotLike(String value) {
            addCriterion("development_history not like", value, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryIn(List<String> values) {
            addCriterion("development_history in", values, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryNotIn(List<String> values) {
            addCriterion("development_history not in", values, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryBetween(String value1, String value2) {
            addCriterion("development_history between", value1, value2, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andDevelopmentHistoryNotBetween(String value1, String value2) {
            addCriterion("development_history not between", value1, value2, "developmentHistory");
            return (Criteria) this;
        }

        public Criteria andFinancingStageIsNull() {
            addCriterion("financing_stage is null");
            return (Criteria) this;
        }

        public Criteria andFinancingStageIsNotNull() {
            addCriterion("financing_stage is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingStageEqualTo(String value) {
            addCriterion("financing_stage =", value, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingStageNotEqualTo(String value) {
            addCriterion("financing_stage <>", value, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingStageGreaterThan(String value) {
            addCriterion("financing_stage >", value, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingStageGreaterThanOrEqualTo(String value) {
            addCriterion("financing_stage >=", value, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingStageLessThan(String value) {
            addCriterion("financing_stage <", value, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingStageLessThanOrEqualTo(String value) {
            addCriterion("financing_stage <=", value, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingStageLike(String value) {
            addCriterion("financing_stage like", value, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingStageNotLike(String value) {
            addCriterion("financing_stage not like", value, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingStageIn(List<String> values) {
            addCriterion("financing_stage in", values, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingStageNotIn(List<String> values) {
            addCriterion("financing_stage not in", values, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingStageBetween(String value1, String value2) {
            addCriterion("financing_stage between", value1, value2, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingStageNotBetween(String value1, String value2) {
            addCriterion("financing_stage not between", value1, value2, "financingStage");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalIsNull() {
            addCriterion("financing_total is null");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalIsNotNull() {
            addCriterion("financing_total is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalEqualTo(String value) {
            addCriterion("financing_total =", value, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalNotEqualTo(String value) {
            addCriterion("financing_total <>", value, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalGreaterThan(String value) {
            addCriterion("financing_total >", value, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalGreaterThanOrEqualTo(String value) {
            addCriterion("financing_total >=", value, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalLessThan(String value) {
            addCriterion("financing_total <", value, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalLessThanOrEqualTo(String value) {
            addCriterion("financing_total <=", value, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalLike(String value) {
            addCriterion("financing_total like", value, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalNotLike(String value) {
            addCriterion("financing_total not like", value, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalIn(List<String> values) {
            addCriterion("financing_total in", values, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalNotIn(List<String> values) {
            addCriterion("financing_total not in", values, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalBetween(String value1, String value2) {
            addCriterion("financing_total between", value1, value2, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andFinancingTotalNotBetween(String value1, String value2) {
            addCriterion("financing_total not between", value1, value2, "financingTotal");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIsNull() {
            addCriterion("company_nature is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIsNotNull() {
            addCriterion("company_nature is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureEqualTo(String value) {
            addCriterion("company_nature =", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotEqualTo(String value) {
            addCriterion("company_nature <>", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureGreaterThan(String value) {
            addCriterion("company_nature >", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureGreaterThanOrEqualTo(String value) {
            addCriterion("company_nature >=", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLessThan(String value) {
            addCriterion("company_nature <", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLessThanOrEqualTo(String value) {
            addCriterion("company_nature <=", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLike(String value) {
            addCriterion("company_nature like", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotLike(String value) {
            addCriterion("company_nature not like", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIn(List<String> values) {
            addCriterion("company_nature in", values, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotIn(List<String> values) {
            addCriterion("company_nature not in", values, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureBetween(String value1, String value2) {
            addCriterion("company_nature between", value1, value2, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotBetween(String value1, String value2) {
            addCriterion("company_nature not between", value1, value2, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureIsNull() {
            addCriterion("corporate_culture is null");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureIsNotNull() {
            addCriterion("corporate_culture is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureEqualTo(String value) {
            addCriterion("corporate_culture =", value, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureNotEqualTo(String value) {
            addCriterion("corporate_culture <>", value, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureGreaterThan(String value) {
            addCriterion("corporate_culture >", value, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_culture >=", value, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureLessThan(String value) {
            addCriterion("corporate_culture <", value, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureLessThanOrEqualTo(String value) {
            addCriterion("corporate_culture <=", value, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureLike(String value) {
            addCriterion("corporate_culture like", value, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureNotLike(String value) {
            addCriterion("corporate_culture not like", value, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureIn(List<String> values) {
            addCriterion("corporate_culture in", values, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureNotIn(List<String> values) {
            addCriterion("corporate_culture not in", values, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureBetween(String value1, String value2) {
            addCriterion("corporate_culture between", value1, value2, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andCorporateCultureNotBetween(String value1, String value2) {
            addCriterion("corporate_culture not between", value1, value2, "corporateCulture");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andManagementFieldIsNull() {
            addCriterion("management_field is null");
            return (Criteria) this;
        }

        public Criteria andManagementFieldIsNotNull() {
            addCriterion("management_field is not null");
            return (Criteria) this;
        }

        public Criteria andManagementFieldEqualTo(String value) {
            addCriterion("management_field =", value, "managementField");
            return (Criteria) this;
        }

        public Criteria andManagementFieldNotEqualTo(String value) {
            addCriterion("management_field <>", value, "managementField");
            return (Criteria) this;
        }

        public Criteria andManagementFieldGreaterThan(String value) {
            addCriterion("management_field >", value, "managementField");
            return (Criteria) this;
        }

        public Criteria andManagementFieldGreaterThanOrEqualTo(String value) {
            addCriterion("management_field >=", value, "managementField");
            return (Criteria) this;
        }

        public Criteria andManagementFieldLessThan(String value) {
            addCriterion("management_field <", value, "managementField");
            return (Criteria) this;
        }

        public Criteria andManagementFieldLessThanOrEqualTo(String value) {
            addCriterion("management_field <=", value, "managementField");
            return (Criteria) this;
        }

        public Criteria andManagementFieldLike(String value) {
            addCriterion("management_field like", value, "managementField");
            return (Criteria) this;
        }

        public Criteria andManagementFieldNotLike(String value) {
            addCriterion("management_field not like", value, "managementField");
            return (Criteria) this;
        }

        public Criteria andManagementFieldIn(List<String> values) {
            addCriterion("management_field in", values, "managementField");
            return (Criteria) this;
        }

        public Criteria andManagementFieldNotIn(List<String> values) {
            addCriterion("management_field not in", values, "managementField");
            return (Criteria) this;
        }

        public Criteria andManagementFieldBetween(String value1, String value2) {
            addCriterion("management_field between", value1, value2, "managementField");
            return (Criteria) this;
        }

        public Criteria andManagementFieldNotBetween(String value1, String value2) {
            addCriterion("management_field not between", value1, value2, "managementField");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanIsNull() {
            addCriterion("business_plan is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanIsNotNull() {
            addCriterion("business_plan is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanEqualTo(String value) {
            addCriterion("business_plan =", value, "businessPlan");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanNotEqualTo(String value) {
            addCriterion("business_plan <>", value, "businessPlan");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanGreaterThan(String value) {
            addCriterion("business_plan >", value, "businessPlan");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanGreaterThanOrEqualTo(String value) {
            addCriterion("business_plan >=", value, "businessPlan");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanLessThan(String value) {
            addCriterion("business_plan <", value, "businessPlan");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanLessThanOrEqualTo(String value) {
            addCriterion("business_plan <=", value, "businessPlan");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanLike(String value) {
            addCriterion("business_plan like", value, "businessPlan");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanNotLike(String value) {
            addCriterion("business_plan not like", value, "businessPlan");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanIn(List<String> values) {
            addCriterion("business_plan in", values, "businessPlan");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanNotIn(List<String> values) {
            addCriterion("business_plan not in", values, "businessPlan");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanBetween(String value1, String value2) {
            addCriterion("business_plan between", value1, value2, "businessPlan");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanNotBetween(String value1, String value2) {
            addCriterion("business_plan not between", value1, value2, "businessPlan");
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
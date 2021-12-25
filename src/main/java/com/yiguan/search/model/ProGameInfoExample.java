package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProGameInfoExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public ProGameInfoExample() {
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

    public ProGameInfoExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public ProGameInfoExample needGname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("gname");
        
        return this;
    }

    public ProGameInfoExample needGename() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("gename");
        
        return this;
    }

    public ProGameInfoExample needLogo() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("logo");
        
        return this;
    }

    public ProGameInfoExample needVersion() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("version");
        
        return this;
    }

    public ProGameInfoExample needLanguage() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("language");
        
        return this;
    }

    public ProGameInfoExample needNetworkType() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("network_type");
        
        return this;
    }

    public ProGameInfoExample needSuitableAge() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("suitable_age");
        
        return this;
    }

    public ProGameInfoExample needIssueArea() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("issue_area");
        
        return this;
    }

    public ProGameInfoExample needPublisher() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("publisher");
        
        return this;
    }

    public ProGameInfoExample needGstyle() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("gstyle");
        
        return this;
    }

    public ProGameInfoExample needGtags() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("gtags");
        
        return this;
    }

    public ProGameInfoExample needPicture() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("picture");
        
        return this;
    }

    public ProGameInfoExample needViewpoint() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("viewpoint");
        
        return this;
    }

    public ProGameInfoExample needEngine() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("engine");
        
        return this;
    }

    public ProGameInfoExample needGrade() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("grade");
        
        return this;
    }

    public ProGameInfoExample needDpprogress() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("dpprogress");
        
        return this;
    }

    public ProGameInfoExample needGtheme() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("gtheme");
        
        return this;
    }

    public ProGameInfoExample needScale() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("scale");
        
        return this;
    }

    public ProGameInfoExample needPdemand() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("pdemand");
        
        return this;
    }

    public ProGameInfoExample needPrice() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("price");
        
        return this;
    }

    public ProGameInfoExample needChargeMode() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("charge_mode");
        
        return this;
    }

    public ProGameInfoExample needDevelopCom() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("develop_com");
        
        return this;
    }

    public ProGameInfoExample needGDesc() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("g_desc");
        
        return this;
    }

    public ProGameInfoExample needPtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ptime");
        
        return this;
    }

    public ProGameInfoExample needBetaTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("beta_time");
        
        return this;
    }

    public ProGameInfoExample needTestTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("test_time");
        
        return this;
    }

    public ProGameInfoExample needBetatestTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("betatest_time");
        
        return this;
    }

    public ProGameInfoExample needSetTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("set_time");
        
        return this;
    }

    public ProGameInfoExample needWeb() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("web");
        
        return this;
    }

    public ProGameInfoExample needUrl() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("url");
        
        return this;
    }

    public ProGameInfoExample needSource() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("source");
        
        return this;
    }

    public ProGameInfoExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public ProGameInfoExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public ProGameInfoExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public ProGameInfoExample needGamespy() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("gamespy");
        
        return this;
    }

    public ProGameInfoExample needOperator() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("operator");
        
        return this;
    }

    public ProGameInfoExample needFilmsTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("films_time");
        
        return this;
    }

    public ProGameInfoExample needGameSize() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("game_size");
        
        return this;
    }

    public ProGameInfoExample needWebUpdateTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("web_update_time");
        
        return this;
    }

    public ProGameInfoExample needDownloadLink() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("download_link");
        
        return this;
    }

    public ProGameInfoExample needPackagename() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("packagename");
        
        return this;
    }

    public ProGameInfoExample needGameUpdateTime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("game_update_time");
        
        return this;
    }

    public ProGameInfoExample needFamilysharing() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("familysharing");
        
        return this;
    }

    public ProGameInfoExample needSupportwatch() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("supportwatch");
        
        return this;
    }

    public ProGameInfoExample needSupportwebsite() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("supportwebsite");
        
        return this;
    }

    public ProGameInfoExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByGname(String type) {
        if(orderByClause == null){
            orderByClause = "gname " + type;
        }
        else{
            orderByClause += " ,gname " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByGename(String type) {
        if(orderByClause == null){
            orderByClause = "gename " + type;
        }
        else{
            orderByClause += " ,gename " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByLogo(String type) {
        if(orderByClause == null){
            orderByClause = "logo " + type;
        }
        else{
            orderByClause += " ,logo " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByVersion(String type) {
        if(orderByClause == null){
            orderByClause = "version " + type;
        }
        else{
            orderByClause += " ,version " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByLanguage(String type) {
        if(orderByClause == null){
            orderByClause = "language " + type;
        }
        else{
            orderByClause += " ,language " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByNetworkType(String type) {
        if(orderByClause == null){
            orderByClause = "network_type " + type;
        }
        else{
            orderByClause += " ,network_type " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderBySuitableAge(String type) {
        if(orderByClause == null){
            orderByClause = "suitable_age " + type;
        }
        else{
            orderByClause += " ,suitable_age " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByIssueArea(String type) {
        if(orderByClause == null){
            orderByClause = "issue_area " + type;
        }
        else{
            orderByClause += " ,issue_area " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByPublisher(String type) {
        if(orderByClause == null){
            orderByClause = "publisher " + type;
        }
        else{
            orderByClause += " ,publisher " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByGstyle(String type) {
        if(orderByClause == null){
            orderByClause = "gstyle " + type;
        }
        else{
            orderByClause += " ,gstyle " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByGtags(String type) {
        if(orderByClause == null){
            orderByClause = "gtags " + type;
        }
        else{
            orderByClause += " ,gtags " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByPicture(String type) {
        if(orderByClause == null){
            orderByClause = "picture " + type;
        }
        else{
            orderByClause += " ,picture " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByViewpoint(String type) {
        if(orderByClause == null){
            orderByClause = "viewpoint " + type;
        }
        else{
            orderByClause += " ,viewpoint " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByEngine(String type) {
        if(orderByClause == null){
            orderByClause = "engine " + type;
        }
        else{
            orderByClause += " ,engine " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByGrade(String type) {
        if(orderByClause == null){
            orderByClause = "grade " + type;
        }
        else{
            orderByClause += " ,grade " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByDpprogress(String type) {
        if(orderByClause == null){
            orderByClause = "dpprogress " + type;
        }
        else{
            orderByClause += " ,dpprogress " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByGtheme(String type) {
        if(orderByClause == null){
            orderByClause = "gtheme " + type;
        }
        else{
            orderByClause += " ,gtheme " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByScale(String type) {
        if(orderByClause == null){
            orderByClause = "scale " + type;
        }
        else{
            orderByClause += " ,scale " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByPdemand(String type) {
        if(orderByClause == null){
            orderByClause = "pdemand " + type;
        }
        else{
            orderByClause += " ,pdemand " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByPrice(String type) {
        if(orderByClause == null){
            orderByClause = "price " + type;
        }
        else{
            orderByClause += " ,price " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByChargeMode(String type) {
        if(orderByClause == null){
            orderByClause = "charge_mode " + type;
        }
        else{
            orderByClause += " ,charge_mode " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByDevelopCom(String type) {
        if(orderByClause == null){
            orderByClause = "develop_com " + type;
        }
        else{
            orderByClause += " ,develop_com " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByGDesc(String type) {
        if(orderByClause == null){
            orderByClause = "g_desc " + type;
        }
        else{
            orderByClause += " ,g_desc " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByPtime(String type) {
        if(orderByClause == null){
            orderByClause = "ptime " + type;
        }
        else{
            orderByClause += " ,ptime " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByBetaTime(String type) {
        if(orderByClause == null){
            orderByClause = "beta_time " + type;
        }
        else{
            orderByClause += " ,beta_time " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByTestTime(String type) {
        if(orderByClause == null){
            orderByClause = "test_time " + type;
        }
        else{
            orderByClause += " ,test_time " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByBetatestTime(String type) {
        if(orderByClause == null){
            orderByClause = "betatest_time " + type;
        }
        else{
            orderByClause += " ,betatest_time " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderBySetTime(String type) {
        if(orderByClause == null){
            orderByClause = "set_time " + type;
        }
        else{
            orderByClause += " ,set_time " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByWeb(String type) {
        if(orderByClause == null){
            orderByClause = "web " + type;
        }
        else{
            orderByClause += " ,web " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByUrl(String type) {
        if(orderByClause == null){
            orderByClause = "url " + type;
        }
        else{
            orderByClause += " ,url " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderBySource(String type) {
        if(orderByClause == null){
            orderByClause = "source " + type;
        }
        else{
            orderByClause += " ,source " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByGamespy(String type) {
        if(orderByClause == null){
            orderByClause = "gamespy " + type;
        }
        else{
            orderByClause += " ,gamespy " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByOperator(String type) {
        if(orderByClause == null){
            orderByClause = "operator " + type;
        }
        else{
            orderByClause += " ,operator " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByFilmsTime(String type) {
        if(orderByClause == null){
            orderByClause = "films_time " + type;
        }
        else{
            orderByClause += " ,films_time " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByGameSize(String type) {
        if(orderByClause == null){
            orderByClause = "game_size " + type;
        }
        else{
            orderByClause += " ,game_size " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByWebUpdateTime(String type) {
        if(orderByClause == null){
            orderByClause = "web_update_time " + type;
        }
        else{
            orderByClause += " ,web_update_time " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByDownloadLink(String type) {
        if(orderByClause == null){
            orderByClause = "download_link " + type;
        }
        else{
            orderByClause += " ,download_link " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByPackagename(String type) {
        if(orderByClause == null){
            orderByClause = "packagename " + type;
        }
        else{
            orderByClause += " ,packagename " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByGameUpdateTime(String type) {
        if(orderByClause == null){
            orderByClause = "game_update_time " + type;
        }
        else{
            orderByClause += " ,game_update_time " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderByFamilysharing(String type) {
        if(orderByClause == null){
            orderByClause = "familysharing " + type;
        }
        else{
            orderByClause += " ,familysharing " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderBySupportwatch(String type) {
        if(orderByClause == null){
            orderByClause = "supportwatch " + type;
        }
        else{
            orderByClause += " ,supportwatch " + type;
        }
        
        return this;
    }

    public ProGameInfoExample orderBySupportwebsite(String type) {
        if(orderByClause == null){
            orderByClause = "supportwebsite " + type;
        }
        else{
            orderByClause += " ,supportwebsite " + type;
        }
        
        return this;
    }

    public ProGameInfoExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByGname() {
        if(groupByClause == null){
            groupByClause = "gname ";
        }
        else{
            groupByClause += " ,gname ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByGename() {
        if(groupByClause == null){
            groupByClause = "gename ";
        }
        else{
            groupByClause += " ,gename ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByLogo() {
        if(groupByClause == null){
            groupByClause = "logo ";
        }
        else{
            groupByClause += " ,logo ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByVersion() {
        if(groupByClause == null){
            groupByClause = "version ";
        }
        else{
            groupByClause += " ,version ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByLanguage() {
        if(groupByClause == null){
            groupByClause = "language ";
        }
        else{
            groupByClause += " ,language ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByNetworkType() {
        if(groupByClause == null){
            groupByClause = "network_type ";
        }
        else{
            groupByClause += " ,network_type ";
        }
        
        return this;
    }

    public ProGameInfoExample groupBySuitableAge() {
        if(groupByClause == null){
            groupByClause = "suitable_age ";
        }
        else{
            groupByClause += " ,suitable_age ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByIssueArea() {
        if(groupByClause == null){
            groupByClause = "issue_area ";
        }
        else{
            groupByClause += " ,issue_area ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByPublisher() {
        if(groupByClause == null){
            groupByClause = "publisher ";
        }
        else{
            groupByClause += " ,publisher ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByGstyle() {
        if(groupByClause == null){
            groupByClause = "gstyle ";
        }
        else{
            groupByClause += " ,gstyle ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByGtags() {
        if(groupByClause == null){
            groupByClause = "gtags ";
        }
        else{
            groupByClause += " ,gtags ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByPicture() {
        if(groupByClause == null){
            groupByClause = "picture ";
        }
        else{
            groupByClause += " ,picture ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByViewpoint() {
        if(groupByClause == null){
            groupByClause = "viewpoint ";
        }
        else{
            groupByClause += " ,viewpoint ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByEngine() {
        if(groupByClause == null){
            groupByClause = "engine ";
        }
        else{
            groupByClause += " ,engine ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByGrade() {
        if(groupByClause == null){
            groupByClause = "grade ";
        }
        else{
            groupByClause += " ,grade ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByDpprogress() {
        if(groupByClause == null){
            groupByClause = "dpprogress ";
        }
        else{
            groupByClause += " ,dpprogress ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByGtheme() {
        if(groupByClause == null){
            groupByClause = "gtheme ";
        }
        else{
            groupByClause += " ,gtheme ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByScale() {
        if(groupByClause == null){
            groupByClause = "scale ";
        }
        else{
            groupByClause += " ,scale ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByPdemand() {
        if(groupByClause == null){
            groupByClause = "pdemand ";
        }
        else{
            groupByClause += " ,pdemand ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByPrice() {
        if(groupByClause == null){
            groupByClause = "price ";
        }
        else{
            groupByClause += " ,price ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByChargeMode() {
        if(groupByClause == null){
            groupByClause = "charge_mode ";
        }
        else{
            groupByClause += " ,charge_mode ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByDevelopCom() {
        if(groupByClause == null){
            groupByClause = "develop_com ";
        }
        else{
            groupByClause += " ,develop_com ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByGDesc() {
        if(groupByClause == null){
            groupByClause = "g_desc ";
        }
        else{
            groupByClause += " ,g_desc ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByPtime() {
        if(groupByClause == null){
            groupByClause = "ptime ";
        }
        else{
            groupByClause += " ,ptime ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByBetaTime() {
        if(groupByClause == null){
            groupByClause = "beta_time ";
        }
        else{
            groupByClause += " ,beta_time ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByTestTime() {
        if(groupByClause == null){
            groupByClause = "test_time ";
        }
        else{
            groupByClause += " ,test_time ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByBetatestTime() {
        if(groupByClause == null){
            groupByClause = "betatest_time ";
        }
        else{
            groupByClause += " ,betatest_time ";
        }
        
        return this;
    }

    public ProGameInfoExample groupBySetTime() {
        if(groupByClause == null){
            groupByClause = "set_time ";
        }
        else{
            groupByClause += " ,set_time ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByWeb() {
        if(groupByClause == null){
            groupByClause = "web ";
        }
        else{
            groupByClause += " ,web ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByUrl() {
        if(groupByClause == null){
            groupByClause = "url ";
        }
        else{
            groupByClause += " ,url ";
        }
        
        return this;
    }

    public ProGameInfoExample groupBySource() {
        if(groupByClause == null){
            groupByClause = "source ";
        }
        else{
            groupByClause += " ,source ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByGamespy() {
        if(groupByClause == null){
            groupByClause = "gamespy ";
        }
        else{
            groupByClause += " ,gamespy ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByOperator() {
        if(groupByClause == null){
            groupByClause = "operator ";
        }
        else{
            groupByClause += " ,operator ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByFilmsTime() {
        if(groupByClause == null){
            groupByClause = "films_time ";
        }
        else{
            groupByClause += " ,films_time ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByGameSize() {
        if(groupByClause == null){
            groupByClause = "game_size ";
        }
        else{
            groupByClause += " ,game_size ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByWebUpdateTime() {
        if(groupByClause == null){
            groupByClause = "web_update_time ";
        }
        else{
            groupByClause += " ,web_update_time ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByDownloadLink() {
        if(groupByClause == null){
            groupByClause = "download_link ";
        }
        else{
            groupByClause += " ,download_link ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByPackagename() {
        if(groupByClause == null){
            groupByClause = "packagename ";
        }
        else{
            groupByClause += " ,packagename ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByGameUpdateTime() {
        if(groupByClause == null){
            groupByClause = "game_update_time ";
        }
        else{
            groupByClause += " ,game_update_time ";
        }
        
        return this;
    }

    public ProGameInfoExample groupByFamilysharing() {
        if(groupByClause == null){
            groupByClause = "familysharing ";
        }
        else{
            groupByClause += " ,familysharing ";
        }
        
        return this;
    }

    public ProGameInfoExample groupBySupportwatch() {
        if(groupByClause == null){
            groupByClause = "supportwatch ";
        }
        else{
            groupByClause += " ,supportwatch ";
        }
        
        return this;
    }

    public ProGameInfoExample groupBySupportwebsite() {
        if(groupByClause == null){
            groupByClause = "supportwebsite ";
        }
        else{
            groupByClause += " ,supportwebsite ";
        }
        
        return this;
    }

    public ProGameInfoExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public ProGameInfoExample groupConcatGname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(gname SEPARATOR \'|\') as gname");
        return this;
    }

    public ProGameInfoExample groupConcatGename() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(gename SEPARATOR \'|\') as gename");
        return this;
    }

    public ProGameInfoExample groupConcatLogo() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(logo SEPARATOR \'|\') as logo");
        return this;
    }

    public ProGameInfoExample groupConcatVersion() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(version SEPARATOR \'|\') as version");
        return this;
    }

    public ProGameInfoExample groupConcatLanguage() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(language SEPARATOR \'|\') as language");
        return this;
    }

    public ProGameInfoExample groupConcatNetworkType() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(network_type SEPARATOR \'|\') as network_type");
        return this;
    }

    public ProGameInfoExample groupConcatSuitableAge() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(suitable_age SEPARATOR \'|\') as suitable_age");
        return this;
    }

    public ProGameInfoExample groupConcatIssueArea() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(issue_area SEPARATOR \'|\') as issue_area");
        return this;
    }

    public ProGameInfoExample groupConcatPublisher() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(publisher SEPARATOR \'|\') as publisher");
        return this;
    }

    public ProGameInfoExample groupConcatGstyle() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(gstyle SEPARATOR \'|\') as gstyle");
        return this;
    }

    public ProGameInfoExample groupConcatGtags() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(gtags SEPARATOR \'|\') as gtags");
        return this;
    }

    public ProGameInfoExample groupConcatPicture() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(picture SEPARATOR \'|\') as picture");
        return this;
    }

    public ProGameInfoExample groupConcatViewpoint() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(viewpoint SEPARATOR \'|\') as viewpoint");
        return this;
    }

    public ProGameInfoExample groupConcatEngine() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(engine SEPARATOR \'|\') as engine");
        return this;
    }

    public ProGameInfoExample groupConcatGrade() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(grade SEPARATOR \'|\') as grade");
        return this;
    }

    public ProGameInfoExample groupConcatDpprogress() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(dpprogress SEPARATOR \'|\') as dpprogress");
        return this;
    }

    public ProGameInfoExample groupConcatGtheme() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(gtheme SEPARATOR \'|\') as gtheme");
        return this;
    }

    public ProGameInfoExample groupConcatScale() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(scale SEPARATOR \'|\') as scale");
        return this;
    }

    public ProGameInfoExample groupConcatPdemand() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(pdemand SEPARATOR \'|\') as pdemand");
        return this;
    }

    public ProGameInfoExample groupConcatPrice() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(price SEPARATOR \'|\') as price");
        return this;
    }

    public ProGameInfoExample groupConcatChargeMode() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(charge_mode SEPARATOR \'|\') as charge_mode");
        return this;
    }

    public ProGameInfoExample groupConcatDevelopCom() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(develop_com SEPARATOR \'|\') as develop_com");
        return this;
    }

    public ProGameInfoExample groupConcatGDesc() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(g_desc SEPARATOR \'|\') as g_desc");
        return this;
    }

    public ProGameInfoExample groupConcatPtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ptime SEPARATOR \'|\') as ptime");
        return this;
    }

    public ProGameInfoExample groupConcatBetaTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(beta_time SEPARATOR \'|\') as beta_time");
        return this;
    }

    public ProGameInfoExample groupConcatTestTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(test_time SEPARATOR \'|\') as test_time");
        return this;
    }

    public ProGameInfoExample groupConcatBetatestTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(betatest_time SEPARATOR \'|\') as betatest_time");
        return this;
    }

    public ProGameInfoExample groupConcatSetTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(set_time SEPARATOR \'|\') as set_time");
        return this;
    }

    public ProGameInfoExample groupConcatWeb() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(web SEPARATOR \'|\') as web");
        return this;
    }

    public ProGameInfoExample groupConcatUrl() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(url SEPARATOR \'|\') as url");
        return this;
    }

    public ProGameInfoExample groupConcatSource() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(source SEPARATOR \'|\') as source");
        return this;
    }

    public ProGameInfoExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public ProGameInfoExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public ProGameInfoExample groupConcatAtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(atime SEPARATOR \'|\') as atime");
        return this;
    }

    public ProGameInfoExample groupConcatGamespy() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(gamespy SEPARATOR \'|\') as gamespy");
        return this;
    }

    public ProGameInfoExample groupConcatOperator() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(operator SEPARATOR \'|\') as operator");
        return this;
    }

    public ProGameInfoExample groupConcatFilmsTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(films_time SEPARATOR \'|\') as films_time");
        return this;
    }

    public ProGameInfoExample groupConcatGameSize() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(game_size SEPARATOR \'|\') as game_size");
        return this;
    }

    public ProGameInfoExample groupConcatWebUpdateTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(web_update_time SEPARATOR \'|\') as web_update_time");
        return this;
    }

    public ProGameInfoExample groupConcatDownloadLink() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(download_link SEPARATOR \'|\') as download_link");
        return this;
    }

    public ProGameInfoExample groupConcatPackagename() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(packagename SEPARATOR \'|\') as packagename");
        return this;
    }

    public ProGameInfoExample groupConcatGameUpdateTime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(game_update_time SEPARATOR \'|\') as game_update_time");
        return this;
    }

    public ProGameInfoExample groupConcatFamilysharing() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(familysharing SEPARATOR \'|\') as familysharing");
        return this;
    }

    public ProGameInfoExample groupConcatSupportwatch() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(supportwatch SEPARATOR \'|\') as supportwatch");
        return this;
    }

    public ProGameInfoExample groupConcatSupportwebsite() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(supportwebsite SEPARATOR \'|\') as supportwebsite");
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

        public Criteria andGenameIsNull() {
            addCriterion("gename is null");
            return (Criteria) this;
        }

        public Criteria andGenameIsNotNull() {
            addCriterion("gename is not null");
            return (Criteria) this;
        }

        public Criteria andGenameEqualTo(String value) {
            addCriterion("gename =", value, "gename");
            return (Criteria) this;
        }

        public Criteria andGenameNotEqualTo(String value) {
            addCriterion("gename <>", value, "gename");
            return (Criteria) this;
        }

        public Criteria andGenameGreaterThan(String value) {
            addCriterion("gename >", value, "gename");
            return (Criteria) this;
        }

        public Criteria andGenameGreaterThanOrEqualTo(String value) {
            addCriterion("gename >=", value, "gename");
            return (Criteria) this;
        }

        public Criteria andGenameLessThan(String value) {
            addCriterion("gename <", value, "gename");
            return (Criteria) this;
        }

        public Criteria andGenameLessThanOrEqualTo(String value) {
            addCriterion("gename <=", value, "gename");
            return (Criteria) this;
        }

        public Criteria andGenameLike(String value) {
            addCriterion("gename like", value, "gename");
            return (Criteria) this;
        }

        public Criteria andGenameNotLike(String value) {
            addCriterion("gename not like", value, "gename");
            return (Criteria) this;
        }

        public Criteria andGenameIn(List<String> values) {
            addCriterion("gename in", values, "gename");
            return (Criteria) this;
        }

        public Criteria andGenameNotIn(List<String> values) {
            addCriterion("gename not in", values, "gename");
            return (Criteria) this;
        }

        public Criteria andGenameBetween(String value1, String value2) {
            addCriterion("gename between", value1, value2, "gename");
            return (Criteria) this;
        }

        public Criteria andGenameNotBetween(String value1, String value2) {
            addCriterion("gename not between", value1, value2, "gename");
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

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIsNull() {
            addCriterion("network_type is null");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIsNotNull() {
            addCriterion("network_type is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeEqualTo(Byte value) {
            addCriterion("network_type =", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotEqualTo(Byte value) {
            addCriterion("network_type <>", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeGreaterThan(Byte value) {
            addCriterion("network_type >", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("network_type >=", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeLessThan(Byte value) {
            addCriterion("network_type <", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeLessThanOrEqualTo(Byte value) {
            addCriterion("network_type <=", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIn(List<Byte> values) {
            addCriterion("network_type in", values, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotIn(List<Byte> values) {
            addCriterion("network_type not in", values, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeBetween(Byte value1, Byte value2) {
            addCriterion("network_type between", value1, value2, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("network_type not between", value1, value2, "networkType");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeIsNull() {
            addCriterion("suitable_age is null");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeIsNotNull() {
            addCriterion("suitable_age is not null");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeEqualTo(String value) {
            addCriterion("suitable_age =", value, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeNotEqualTo(String value) {
            addCriterion("suitable_age <>", value, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeGreaterThan(String value) {
            addCriterion("suitable_age >", value, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeGreaterThanOrEqualTo(String value) {
            addCriterion("suitable_age >=", value, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeLessThan(String value) {
            addCriterion("suitable_age <", value, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeLessThanOrEqualTo(String value) {
            addCriterion("suitable_age <=", value, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeLike(String value) {
            addCriterion("suitable_age like", value, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeNotLike(String value) {
            addCriterion("suitable_age not like", value, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeIn(List<String> values) {
            addCriterion("suitable_age in", values, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeNotIn(List<String> values) {
            addCriterion("suitable_age not in", values, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeBetween(String value1, String value2) {
            addCriterion("suitable_age between", value1, value2, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeNotBetween(String value1, String value2) {
            addCriterion("suitable_age not between", value1, value2, "suitableAge");
            return (Criteria) this;
        }

        public Criteria andIssueAreaIsNull() {
            addCriterion("issue_area is null");
            return (Criteria) this;
        }

        public Criteria andIssueAreaIsNotNull() {
            addCriterion("issue_area is not null");
            return (Criteria) this;
        }

        public Criteria andIssueAreaEqualTo(String value) {
            addCriterion("issue_area =", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotEqualTo(String value) {
            addCriterion("issue_area <>", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaGreaterThan(String value) {
            addCriterion("issue_area >", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaGreaterThanOrEqualTo(String value) {
            addCriterion("issue_area >=", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaLessThan(String value) {
            addCriterion("issue_area <", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaLessThanOrEqualTo(String value) {
            addCriterion("issue_area <=", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaLike(String value) {
            addCriterion("issue_area like", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotLike(String value) {
            addCriterion("issue_area not like", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaIn(List<String> values) {
            addCriterion("issue_area in", values, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotIn(List<String> values) {
            addCriterion("issue_area not in", values, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaBetween(String value1, String value2) {
            addCriterion("issue_area between", value1, value2, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotBetween(String value1, String value2) {
            addCriterion("issue_area not between", value1, value2, "issueArea");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andGstyleIsNull() {
            addCriterion("gstyle is null");
            return (Criteria) this;
        }

        public Criteria andGstyleIsNotNull() {
            addCriterion("gstyle is not null");
            return (Criteria) this;
        }

        public Criteria andGstyleEqualTo(String value) {
            addCriterion("gstyle =", value, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGstyleNotEqualTo(String value) {
            addCriterion("gstyle <>", value, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGstyleGreaterThan(String value) {
            addCriterion("gstyle >", value, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGstyleGreaterThanOrEqualTo(String value) {
            addCriterion("gstyle >=", value, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGstyleLessThan(String value) {
            addCriterion("gstyle <", value, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGstyleLessThanOrEqualTo(String value) {
            addCriterion("gstyle <=", value, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGstyleLike(String value) {
            addCriterion("gstyle like", value, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGstyleNotLike(String value) {
            addCriterion("gstyle not like", value, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGstyleIn(List<String> values) {
            addCriterion("gstyle in", values, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGstyleNotIn(List<String> values) {
            addCriterion("gstyle not in", values, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGstyleBetween(String value1, String value2) {
            addCriterion("gstyle between", value1, value2, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGstyleNotBetween(String value1, String value2) {
            addCriterion("gstyle not between", value1, value2, "gstyle");
            return (Criteria) this;
        }

        public Criteria andGtagsIsNull() {
            addCriterion("gtags is null");
            return (Criteria) this;
        }

        public Criteria andGtagsIsNotNull() {
            addCriterion("gtags is not null");
            return (Criteria) this;
        }

        public Criteria andGtagsEqualTo(String value) {
            addCriterion("gtags =", value, "gtags");
            return (Criteria) this;
        }

        public Criteria andGtagsNotEqualTo(String value) {
            addCriterion("gtags <>", value, "gtags");
            return (Criteria) this;
        }

        public Criteria andGtagsGreaterThan(String value) {
            addCriterion("gtags >", value, "gtags");
            return (Criteria) this;
        }

        public Criteria andGtagsGreaterThanOrEqualTo(String value) {
            addCriterion("gtags >=", value, "gtags");
            return (Criteria) this;
        }

        public Criteria andGtagsLessThan(String value) {
            addCriterion("gtags <", value, "gtags");
            return (Criteria) this;
        }

        public Criteria andGtagsLessThanOrEqualTo(String value) {
            addCriterion("gtags <=", value, "gtags");
            return (Criteria) this;
        }

        public Criteria andGtagsLike(String value) {
            addCriterion("gtags like", value, "gtags");
            return (Criteria) this;
        }

        public Criteria andGtagsNotLike(String value) {
            addCriterion("gtags not like", value, "gtags");
            return (Criteria) this;
        }

        public Criteria andGtagsIn(List<String> values) {
            addCriterion("gtags in", values, "gtags");
            return (Criteria) this;
        }

        public Criteria andGtagsNotIn(List<String> values) {
            addCriterion("gtags not in", values, "gtags");
            return (Criteria) this;
        }

        public Criteria andGtagsBetween(String value1, String value2) {
            addCriterion("gtags between", value1, value2, "gtags");
            return (Criteria) this;
        }

        public Criteria andGtagsNotBetween(String value1, String value2) {
            addCriterion("gtags not between", value1, value2, "gtags");
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

        public Criteria andViewpointIsNull() {
            addCriterion("viewpoint is null");
            return (Criteria) this;
        }

        public Criteria andViewpointIsNotNull() {
            addCriterion("viewpoint is not null");
            return (Criteria) this;
        }

        public Criteria andViewpointEqualTo(String value) {
            addCriterion("viewpoint =", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointNotEqualTo(String value) {
            addCriterion("viewpoint <>", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointGreaterThan(String value) {
            addCriterion("viewpoint >", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointGreaterThanOrEqualTo(String value) {
            addCriterion("viewpoint >=", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointLessThan(String value) {
            addCriterion("viewpoint <", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointLessThanOrEqualTo(String value) {
            addCriterion("viewpoint <=", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointLike(String value) {
            addCriterion("viewpoint like", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointNotLike(String value) {
            addCriterion("viewpoint not like", value, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointIn(List<String> values) {
            addCriterion("viewpoint in", values, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointNotIn(List<String> values) {
            addCriterion("viewpoint not in", values, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointBetween(String value1, String value2) {
            addCriterion("viewpoint between", value1, value2, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andViewpointNotBetween(String value1, String value2) {
            addCriterion("viewpoint not between", value1, value2, "viewpoint");
            return (Criteria) this;
        }

        public Criteria andEngineIsNull() {
            addCriterion("engine is null");
            return (Criteria) this;
        }

        public Criteria andEngineIsNotNull() {
            addCriterion("engine is not null");
            return (Criteria) this;
        }

        public Criteria andEngineEqualTo(String value) {
            addCriterion("engine =", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotEqualTo(String value) {
            addCriterion("engine <>", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThan(String value) {
            addCriterion("engine >", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThanOrEqualTo(String value) {
            addCriterion("engine >=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThan(String value) {
            addCriterion("engine <", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThanOrEqualTo(String value) {
            addCriterion("engine <=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLike(String value) {
            addCriterion("engine like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotLike(String value) {
            addCriterion("engine not like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineIn(List<String> values) {
            addCriterion("engine in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotIn(List<String> values) {
            addCriterion("engine not in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineBetween(String value1, String value2) {
            addCriterion("engine between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotBetween(String value1, String value2) {
            addCriterion("engine not between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andDpprogressIsNull() {
            addCriterion("dpprogress is null");
            return (Criteria) this;
        }

        public Criteria andDpprogressIsNotNull() {
            addCriterion("dpprogress is not null");
            return (Criteria) this;
        }

        public Criteria andDpprogressEqualTo(String value) {
            addCriterion("dpprogress =", value, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andDpprogressNotEqualTo(String value) {
            addCriterion("dpprogress <>", value, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andDpprogressGreaterThan(String value) {
            addCriterion("dpprogress >", value, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andDpprogressGreaterThanOrEqualTo(String value) {
            addCriterion("dpprogress >=", value, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andDpprogressLessThan(String value) {
            addCriterion("dpprogress <", value, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andDpprogressLessThanOrEqualTo(String value) {
            addCriterion("dpprogress <=", value, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andDpprogressLike(String value) {
            addCriterion("dpprogress like", value, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andDpprogressNotLike(String value) {
            addCriterion("dpprogress not like", value, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andDpprogressIn(List<String> values) {
            addCriterion("dpprogress in", values, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andDpprogressNotIn(List<String> values) {
            addCriterion("dpprogress not in", values, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andDpprogressBetween(String value1, String value2) {
            addCriterion("dpprogress between", value1, value2, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andDpprogressNotBetween(String value1, String value2) {
            addCriterion("dpprogress not between", value1, value2, "dpprogress");
            return (Criteria) this;
        }

        public Criteria andGthemeIsNull() {
            addCriterion("gtheme is null");
            return (Criteria) this;
        }

        public Criteria andGthemeIsNotNull() {
            addCriterion("gtheme is not null");
            return (Criteria) this;
        }

        public Criteria andGthemeEqualTo(String value) {
            addCriterion("gtheme =", value, "gtheme");
            return (Criteria) this;
        }

        public Criteria andGthemeNotEqualTo(String value) {
            addCriterion("gtheme <>", value, "gtheme");
            return (Criteria) this;
        }

        public Criteria andGthemeGreaterThan(String value) {
            addCriterion("gtheme >", value, "gtheme");
            return (Criteria) this;
        }

        public Criteria andGthemeGreaterThanOrEqualTo(String value) {
            addCriterion("gtheme >=", value, "gtheme");
            return (Criteria) this;
        }

        public Criteria andGthemeLessThan(String value) {
            addCriterion("gtheme <", value, "gtheme");
            return (Criteria) this;
        }

        public Criteria andGthemeLessThanOrEqualTo(String value) {
            addCriterion("gtheme <=", value, "gtheme");
            return (Criteria) this;
        }

        public Criteria andGthemeLike(String value) {
            addCriterion("gtheme like", value, "gtheme");
            return (Criteria) this;
        }

        public Criteria andGthemeNotLike(String value) {
            addCriterion("gtheme not like", value, "gtheme");
            return (Criteria) this;
        }

        public Criteria andGthemeIn(List<String> values) {
            addCriterion("gtheme in", values, "gtheme");
            return (Criteria) this;
        }

        public Criteria andGthemeNotIn(List<String> values) {
            addCriterion("gtheme not in", values, "gtheme");
            return (Criteria) this;
        }

        public Criteria andGthemeBetween(String value1, String value2) {
            addCriterion("gtheme between", value1, value2, "gtheme");
            return (Criteria) this;
        }

        public Criteria andGthemeNotBetween(String value1, String value2) {
            addCriterion("gtheme not between", value1, value2, "gtheme");
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

        public Criteria andPdemandIsNull() {
            addCriterion("pdemand is null");
            return (Criteria) this;
        }

        public Criteria andPdemandIsNotNull() {
            addCriterion("pdemand is not null");
            return (Criteria) this;
        }

        public Criteria andPdemandEqualTo(String value) {
            addCriterion("pdemand =", value, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPdemandNotEqualTo(String value) {
            addCriterion("pdemand <>", value, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPdemandGreaterThan(String value) {
            addCriterion("pdemand >", value, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPdemandGreaterThanOrEqualTo(String value) {
            addCriterion("pdemand >=", value, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPdemandLessThan(String value) {
            addCriterion("pdemand <", value, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPdemandLessThanOrEqualTo(String value) {
            addCriterion("pdemand <=", value, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPdemandLike(String value) {
            addCriterion("pdemand like", value, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPdemandNotLike(String value) {
            addCriterion("pdemand not like", value, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPdemandIn(List<String> values) {
            addCriterion("pdemand in", values, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPdemandNotIn(List<String> values) {
            addCriterion("pdemand not in", values, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPdemandBetween(String value1, String value2) {
            addCriterion("pdemand between", value1, value2, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPdemandNotBetween(String value1, String value2) {
            addCriterion("pdemand not between", value1, value2, "pdemand");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andChargeModeIsNull() {
            addCriterion("charge_mode is null");
            return (Criteria) this;
        }

        public Criteria andChargeModeIsNotNull() {
            addCriterion("charge_mode is not null");
            return (Criteria) this;
        }

        public Criteria andChargeModeEqualTo(String value) {
            addCriterion("charge_mode =", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotEqualTo(String value) {
            addCriterion("charge_mode <>", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeGreaterThan(String value) {
            addCriterion("charge_mode >", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_mode >=", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeLessThan(String value) {
            addCriterion("charge_mode <", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeLessThanOrEqualTo(String value) {
            addCriterion("charge_mode <=", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeLike(String value) {
            addCriterion("charge_mode like", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotLike(String value) {
            addCriterion("charge_mode not like", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeIn(List<String> values) {
            addCriterion("charge_mode in", values, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotIn(List<String> values) {
            addCriterion("charge_mode not in", values, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeBetween(String value1, String value2) {
            addCriterion("charge_mode between", value1, value2, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotBetween(String value1, String value2) {
            addCriterion("charge_mode not between", value1, value2, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andDevelopComIsNull() {
            addCriterion("develop_com is null");
            return (Criteria) this;
        }

        public Criteria andDevelopComIsNotNull() {
            addCriterion("develop_com is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopComEqualTo(String value) {
            addCriterion("develop_com =", value, "developCom");
            return (Criteria) this;
        }

        public Criteria andDevelopComNotEqualTo(String value) {
            addCriterion("develop_com <>", value, "developCom");
            return (Criteria) this;
        }

        public Criteria andDevelopComGreaterThan(String value) {
            addCriterion("develop_com >", value, "developCom");
            return (Criteria) this;
        }

        public Criteria andDevelopComGreaterThanOrEqualTo(String value) {
            addCriterion("develop_com >=", value, "developCom");
            return (Criteria) this;
        }

        public Criteria andDevelopComLessThan(String value) {
            addCriterion("develop_com <", value, "developCom");
            return (Criteria) this;
        }

        public Criteria andDevelopComLessThanOrEqualTo(String value) {
            addCriterion("develop_com <=", value, "developCom");
            return (Criteria) this;
        }

        public Criteria andDevelopComLike(String value) {
            addCriterion("develop_com like", value, "developCom");
            return (Criteria) this;
        }

        public Criteria andDevelopComNotLike(String value) {
            addCriterion("develop_com not like", value, "developCom");
            return (Criteria) this;
        }

        public Criteria andDevelopComIn(List<String> values) {
            addCriterion("develop_com in", values, "developCom");
            return (Criteria) this;
        }

        public Criteria andDevelopComNotIn(List<String> values) {
            addCriterion("develop_com not in", values, "developCom");
            return (Criteria) this;
        }

        public Criteria andDevelopComBetween(String value1, String value2) {
            addCriterion("develop_com between", value1, value2, "developCom");
            return (Criteria) this;
        }

        public Criteria andDevelopComNotBetween(String value1, String value2) {
            addCriterion("develop_com not between", value1, value2, "developCom");
            return (Criteria) this;
        }

        public Criteria andGDescIsNull() {
            addCriterion("g_desc is null");
            return (Criteria) this;
        }

        public Criteria andGDescIsNotNull() {
            addCriterion("g_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGDescEqualTo(String value) {
            addCriterion("g_desc =", value, "gDesc");
            return (Criteria) this;
        }

        public Criteria andGDescNotEqualTo(String value) {
            addCriterion("g_desc <>", value, "gDesc");
            return (Criteria) this;
        }

        public Criteria andGDescGreaterThan(String value) {
            addCriterion("g_desc >", value, "gDesc");
            return (Criteria) this;
        }

        public Criteria andGDescGreaterThanOrEqualTo(String value) {
            addCriterion("g_desc >=", value, "gDesc");
            return (Criteria) this;
        }

        public Criteria andGDescLessThan(String value) {
            addCriterion("g_desc <", value, "gDesc");
            return (Criteria) this;
        }

        public Criteria andGDescLessThanOrEqualTo(String value) {
            addCriterion("g_desc <=", value, "gDesc");
            return (Criteria) this;
        }

        public Criteria andGDescLike(String value) {
            addCriterion("g_desc like", value, "gDesc");
            return (Criteria) this;
        }

        public Criteria andGDescNotLike(String value) {
            addCriterion("g_desc not like", value, "gDesc");
            return (Criteria) this;
        }

        public Criteria andGDescIn(List<String> values) {
            addCriterion("g_desc in", values, "gDesc");
            return (Criteria) this;
        }

        public Criteria andGDescNotIn(List<String> values) {
            addCriterion("g_desc not in", values, "gDesc");
            return (Criteria) this;
        }

        public Criteria andGDescBetween(String value1, String value2) {
            addCriterion("g_desc between", value1, value2, "gDesc");
            return (Criteria) this;
        }

        public Criteria andGDescNotBetween(String value1, String value2) {
            addCriterion("g_desc not between", value1, value2, "gDesc");
            return (Criteria) this;
        }

        public Criteria andPtimeIsNull() {
            addCriterion("ptime is null");
            return (Criteria) this;
        }

        public Criteria andPtimeIsNotNull() {
            addCriterion("ptime is not null");
            return (Criteria) this;
        }

        public Criteria andPtimeEqualTo(Date value) {
            addCriterion("ptime =", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotEqualTo(Date value) {
            addCriterion("ptime <>", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeGreaterThan(Date value) {
            addCriterion("ptime >", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ptime >=", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeLessThan(Date value) {
            addCriterion("ptime <", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeLessThanOrEqualTo(Date value) {
            addCriterion("ptime <=", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeIn(List<Date> values) {
            addCriterion("ptime in", values, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotIn(List<Date> values) {
            addCriterion("ptime not in", values, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeBetween(Date value1, Date value2) {
            addCriterion("ptime between", value1, value2, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotBetween(Date value1, Date value2) {
            addCriterion("ptime not between", value1, value2, "ptime");
            return (Criteria) this;
        }

        public Criteria andBetaTimeIsNull() {
            addCriterion("beta_time is null");
            return (Criteria) this;
        }

        public Criteria andBetaTimeIsNotNull() {
            addCriterion("beta_time is not null");
            return (Criteria) this;
        }

        public Criteria andBetaTimeEqualTo(Date value) {
            addCriterion("beta_time =", value, "betaTime");
            return (Criteria) this;
        }

        public Criteria andBetaTimeNotEqualTo(Date value) {
            addCriterion("beta_time <>", value, "betaTime");
            return (Criteria) this;
        }

        public Criteria andBetaTimeGreaterThan(Date value) {
            addCriterion("beta_time >", value, "betaTime");
            return (Criteria) this;
        }

        public Criteria andBetaTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("beta_time >=", value, "betaTime");
            return (Criteria) this;
        }

        public Criteria andBetaTimeLessThan(Date value) {
            addCriterion("beta_time <", value, "betaTime");
            return (Criteria) this;
        }

        public Criteria andBetaTimeLessThanOrEqualTo(Date value) {
            addCriterion("beta_time <=", value, "betaTime");
            return (Criteria) this;
        }

        public Criteria andBetaTimeIn(List<Date> values) {
            addCriterion("beta_time in", values, "betaTime");
            return (Criteria) this;
        }

        public Criteria andBetaTimeNotIn(List<Date> values) {
            addCriterion("beta_time not in", values, "betaTime");
            return (Criteria) this;
        }

        public Criteria andBetaTimeBetween(Date value1, Date value2) {
            addCriterion("beta_time between", value1, value2, "betaTime");
            return (Criteria) this;
        }

        public Criteria andBetaTimeNotBetween(Date value1, Date value2) {
            addCriterion("beta_time not between", value1, value2, "betaTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeIsNull() {
            addCriterion("test_time is null");
            return (Criteria) this;
        }

        public Criteria andTestTimeIsNotNull() {
            addCriterion("test_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestTimeEqualTo(Date value) {
            addCriterion("test_time =", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotEqualTo(Date value) {
            addCriterion("test_time <>", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeGreaterThan(Date value) {
            addCriterion("test_time >", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("test_time >=", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeLessThan(Date value) {
            addCriterion("test_time <", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeLessThanOrEqualTo(Date value) {
            addCriterion("test_time <=", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeIn(List<Date> values) {
            addCriterion("test_time in", values, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotIn(List<Date> values) {
            addCriterion("test_time not in", values, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeBetween(Date value1, Date value2) {
            addCriterion("test_time between", value1, value2, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotBetween(Date value1, Date value2) {
            addCriterion("test_time not between", value1, value2, "testTime");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeIsNull() {
            addCriterion("betatest_time is null");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeIsNotNull() {
            addCriterion("betatest_time is not null");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeEqualTo(Date value) {
            addCriterion("betatest_time =", value, "betatestTime");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeNotEqualTo(Date value) {
            addCriterion("betatest_time <>", value, "betatestTime");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeGreaterThan(Date value) {
            addCriterion("betatest_time >", value, "betatestTime");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("betatest_time >=", value, "betatestTime");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeLessThan(Date value) {
            addCriterion("betatest_time <", value, "betatestTime");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeLessThanOrEqualTo(Date value) {
            addCriterion("betatest_time <=", value, "betatestTime");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeIn(List<Date> values) {
            addCriterion("betatest_time in", values, "betatestTime");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeNotIn(List<Date> values) {
            addCriterion("betatest_time not in", values, "betatestTime");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeBetween(Date value1, Date value2) {
            addCriterion("betatest_time between", value1, value2, "betatestTime");
            return (Criteria) this;
        }

        public Criteria andBetatestTimeNotBetween(Date value1, Date value2) {
            addCriterion("betatest_time not between", value1, value2, "betatestTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNull() {
            addCriterion("set_time is null");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNotNull() {
            addCriterion("set_time is not null");
            return (Criteria) this;
        }

        public Criteria andSetTimeEqualTo(Date value) {
            addCriterion("set_time =", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotEqualTo(Date value) {
            addCriterion("set_time <>", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThan(Date value) {
            addCriterion("set_time >", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("set_time >=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThan(Date value) {
            addCriterion("set_time <", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThanOrEqualTo(Date value) {
            addCriterion("set_time <=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeIn(List<Date> values) {
            addCriterion("set_time in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotIn(List<Date> values) {
            addCriterion("set_time not in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeBetween(Date value1, Date value2) {
            addCriterion("set_time between", value1, value2, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotBetween(Date value1, Date value2) {
            addCriterion("set_time not between", value1, value2, "setTime");
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

        public Criteria andGamespyIsNull() {
            addCriterion("gamespy is null");
            return (Criteria) this;
        }

        public Criteria andGamespyIsNotNull() {
            addCriterion("gamespy is not null");
            return (Criteria) this;
        }

        public Criteria andGamespyEqualTo(String value) {
            addCriterion("gamespy =", value, "gamespy");
            return (Criteria) this;
        }

        public Criteria andGamespyNotEqualTo(String value) {
            addCriterion("gamespy <>", value, "gamespy");
            return (Criteria) this;
        }

        public Criteria andGamespyGreaterThan(String value) {
            addCriterion("gamespy >", value, "gamespy");
            return (Criteria) this;
        }

        public Criteria andGamespyGreaterThanOrEqualTo(String value) {
            addCriterion("gamespy >=", value, "gamespy");
            return (Criteria) this;
        }

        public Criteria andGamespyLessThan(String value) {
            addCriterion("gamespy <", value, "gamespy");
            return (Criteria) this;
        }

        public Criteria andGamespyLessThanOrEqualTo(String value) {
            addCriterion("gamespy <=", value, "gamespy");
            return (Criteria) this;
        }

        public Criteria andGamespyLike(String value) {
            addCriterion("gamespy like", value, "gamespy");
            return (Criteria) this;
        }

        public Criteria andGamespyNotLike(String value) {
            addCriterion("gamespy not like", value, "gamespy");
            return (Criteria) this;
        }

        public Criteria andGamespyIn(List<String> values) {
            addCriterion("gamespy in", values, "gamespy");
            return (Criteria) this;
        }

        public Criteria andGamespyNotIn(List<String> values) {
            addCriterion("gamespy not in", values, "gamespy");
            return (Criteria) this;
        }

        public Criteria andGamespyBetween(String value1, String value2) {
            addCriterion("gamespy between", value1, value2, "gamespy");
            return (Criteria) this;
        }

        public Criteria andGamespyNotBetween(String value1, String value2) {
            addCriterion("gamespy not between", value1, value2, "gamespy");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeIsNull() {
            addCriterion("films_time is null");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeIsNotNull() {
            addCriterion("films_time is not null");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeEqualTo(String value) {
            addCriterion("films_time =", value, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeNotEqualTo(String value) {
            addCriterion("films_time <>", value, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeGreaterThan(String value) {
            addCriterion("films_time >", value, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("films_time >=", value, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeLessThan(String value) {
            addCriterion("films_time <", value, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeLessThanOrEqualTo(String value) {
            addCriterion("films_time <=", value, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeLike(String value) {
            addCriterion("films_time like", value, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeNotLike(String value) {
            addCriterion("films_time not like", value, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeIn(List<String> values) {
            addCriterion("films_time in", values, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeNotIn(List<String> values) {
            addCriterion("films_time not in", values, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeBetween(String value1, String value2) {
            addCriterion("films_time between", value1, value2, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andFilmsTimeNotBetween(String value1, String value2) {
            addCriterion("films_time not between", value1, value2, "filmsTime");
            return (Criteria) this;
        }

        public Criteria andGameSizeIsNull() {
            addCriterion("game_size is null");
            return (Criteria) this;
        }

        public Criteria andGameSizeIsNotNull() {
            addCriterion("game_size is not null");
            return (Criteria) this;
        }

        public Criteria andGameSizeEqualTo(String value) {
            addCriterion("game_size =", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeNotEqualTo(String value) {
            addCriterion("game_size <>", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeGreaterThan(String value) {
            addCriterion("game_size >", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeGreaterThanOrEqualTo(String value) {
            addCriterion("game_size >=", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeLessThan(String value) {
            addCriterion("game_size <", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeLessThanOrEqualTo(String value) {
            addCriterion("game_size <=", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeLike(String value) {
            addCriterion("game_size like", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeNotLike(String value) {
            addCriterion("game_size not like", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeIn(List<String> values) {
            addCriterion("game_size in", values, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeNotIn(List<String> values) {
            addCriterion("game_size not in", values, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeBetween(String value1, String value2) {
            addCriterion("game_size between", value1, value2, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeNotBetween(String value1, String value2) {
            addCriterion("game_size not between", value1, value2, "gameSize");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeIsNull() {
            addCriterion("web_update_time is null");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeIsNotNull() {
            addCriterion("web_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeEqualTo(String value) {
            addCriterion("web_update_time =", value, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeNotEqualTo(String value) {
            addCriterion("web_update_time <>", value, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeGreaterThan(String value) {
            addCriterion("web_update_time >", value, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("web_update_time >=", value, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeLessThan(String value) {
            addCriterion("web_update_time <", value, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("web_update_time <=", value, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeLike(String value) {
            addCriterion("web_update_time like", value, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeNotLike(String value) {
            addCriterion("web_update_time not like", value, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeIn(List<String> values) {
            addCriterion("web_update_time in", values, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeNotIn(List<String> values) {
            addCriterion("web_update_time not in", values, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeBetween(String value1, String value2) {
            addCriterion("web_update_time between", value1, value2, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWebUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("web_update_time not between", value1, value2, "webUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkIsNull() {
            addCriterion("download_link is null");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkIsNotNull() {
            addCriterion("download_link is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkEqualTo(String value) {
            addCriterion("download_link =", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkNotEqualTo(String value) {
            addCriterion("download_link <>", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkGreaterThan(String value) {
            addCriterion("download_link >", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkGreaterThanOrEqualTo(String value) {
            addCriterion("download_link >=", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkLessThan(String value) {
            addCriterion("download_link <", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkLessThanOrEqualTo(String value) {
            addCriterion("download_link <=", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkLike(String value) {
            addCriterion("download_link like", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkNotLike(String value) {
            addCriterion("download_link not like", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkIn(List<String> values) {
            addCriterion("download_link in", values, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkNotIn(List<String> values) {
            addCriterion("download_link not in", values, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkBetween(String value1, String value2) {
            addCriterion("download_link between", value1, value2, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkNotBetween(String value1, String value2) {
            addCriterion("download_link not between", value1, value2, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andPackagenameIsNull() {
            addCriterion("packagename is null");
            return (Criteria) this;
        }

        public Criteria andPackagenameIsNotNull() {
            addCriterion("packagename is not null");
            return (Criteria) this;
        }

        public Criteria andPackagenameEqualTo(String value) {
            addCriterion("packagename =", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotEqualTo(String value) {
            addCriterion("packagename <>", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameGreaterThan(String value) {
            addCriterion("packagename >", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameGreaterThanOrEqualTo(String value) {
            addCriterion("packagename >=", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLessThan(String value) {
            addCriterion("packagename <", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLessThanOrEqualTo(String value) {
            addCriterion("packagename <=", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLike(String value) {
            addCriterion("packagename like", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotLike(String value) {
            addCriterion("packagename not like", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameIn(List<String> values) {
            addCriterion("packagename in", values, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotIn(List<String> values) {
            addCriterion("packagename not in", values, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameBetween(String value1, String value2) {
            addCriterion("packagename between", value1, value2, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotBetween(String value1, String value2) {
            addCriterion("packagename not between", value1, value2, "packagename");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeIsNull() {
            addCriterion("game_update_time is null");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeIsNotNull() {
            addCriterion("game_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeEqualTo(String value) {
            addCriterion("game_update_time =", value, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeNotEqualTo(String value) {
            addCriterion("game_update_time <>", value, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeGreaterThan(String value) {
            addCriterion("game_update_time >", value, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("game_update_time >=", value, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeLessThan(String value) {
            addCriterion("game_update_time <", value, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("game_update_time <=", value, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeLike(String value) {
            addCriterion("game_update_time like", value, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeNotLike(String value) {
            addCriterion("game_update_time not like", value, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeIn(List<String> values) {
            addCriterion("game_update_time in", values, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeNotIn(List<String> values) {
            addCriterion("game_update_time not in", values, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeBetween(String value1, String value2) {
            addCriterion("game_update_time between", value1, value2, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGameUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("game_update_time not between", value1, value2, "gameUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFamilysharingIsNull() {
            addCriterion("familysharing is null");
            return (Criteria) this;
        }

        public Criteria andFamilysharingIsNotNull() {
            addCriterion("familysharing is not null");
            return (Criteria) this;
        }

        public Criteria andFamilysharingEqualTo(String value) {
            addCriterion("familysharing =", value, "familysharing");
            return (Criteria) this;
        }

        public Criteria andFamilysharingNotEqualTo(String value) {
            addCriterion("familysharing <>", value, "familysharing");
            return (Criteria) this;
        }

        public Criteria andFamilysharingGreaterThan(String value) {
            addCriterion("familysharing >", value, "familysharing");
            return (Criteria) this;
        }

        public Criteria andFamilysharingGreaterThanOrEqualTo(String value) {
            addCriterion("familysharing >=", value, "familysharing");
            return (Criteria) this;
        }

        public Criteria andFamilysharingLessThan(String value) {
            addCriterion("familysharing <", value, "familysharing");
            return (Criteria) this;
        }

        public Criteria andFamilysharingLessThanOrEqualTo(String value) {
            addCriterion("familysharing <=", value, "familysharing");
            return (Criteria) this;
        }

        public Criteria andFamilysharingLike(String value) {
            addCriterion("familysharing like", value, "familysharing");
            return (Criteria) this;
        }

        public Criteria andFamilysharingNotLike(String value) {
            addCriterion("familysharing not like", value, "familysharing");
            return (Criteria) this;
        }

        public Criteria andFamilysharingIn(List<String> values) {
            addCriterion("familysharing in", values, "familysharing");
            return (Criteria) this;
        }

        public Criteria andFamilysharingNotIn(List<String> values) {
            addCriterion("familysharing not in", values, "familysharing");
            return (Criteria) this;
        }

        public Criteria andFamilysharingBetween(String value1, String value2) {
            addCriterion("familysharing between", value1, value2, "familysharing");
            return (Criteria) this;
        }

        public Criteria andFamilysharingNotBetween(String value1, String value2) {
            addCriterion("familysharing not between", value1, value2, "familysharing");
            return (Criteria) this;
        }

        public Criteria andSupportwatchIsNull() {
            addCriterion("supportwatch is null");
            return (Criteria) this;
        }

        public Criteria andSupportwatchIsNotNull() {
            addCriterion("supportwatch is not null");
            return (Criteria) this;
        }

        public Criteria andSupportwatchEqualTo(String value) {
            addCriterion("supportwatch =", value, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwatchNotEqualTo(String value) {
            addCriterion("supportwatch <>", value, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwatchGreaterThan(String value) {
            addCriterion("supportwatch >", value, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwatchGreaterThanOrEqualTo(String value) {
            addCriterion("supportwatch >=", value, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwatchLessThan(String value) {
            addCriterion("supportwatch <", value, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwatchLessThanOrEqualTo(String value) {
            addCriterion("supportwatch <=", value, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwatchLike(String value) {
            addCriterion("supportwatch like", value, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwatchNotLike(String value) {
            addCriterion("supportwatch not like", value, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwatchIn(List<String> values) {
            addCriterion("supportwatch in", values, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwatchNotIn(List<String> values) {
            addCriterion("supportwatch not in", values, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwatchBetween(String value1, String value2) {
            addCriterion("supportwatch between", value1, value2, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwatchNotBetween(String value1, String value2) {
            addCriterion("supportwatch not between", value1, value2, "supportwatch");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteIsNull() {
            addCriterion("supportwebsite is null");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteIsNotNull() {
            addCriterion("supportwebsite is not null");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteEqualTo(String value) {
            addCriterion("supportwebsite =", value, "supportwebsite");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteNotEqualTo(String value) {
            addCriterion("supportwebsite <>", value, "supportwebsite");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteGreaterThan(String value) {
            addCriterion("supportwebsite >", value, "supportwebsite");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("supportwebsite >=", value, "supportwebsite");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteLessThan(String value) {
            addCriterion("supportwebsite <", value, "supportwebsite");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteLessThanOrEqualTo(String value) {
            addCriterion("supportwebsite <=", value, "supportwebsite");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteLike(String value) {
            addCriterion("supportwebsite like", value, "supportwebsite");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteNotLike(String value) {
            addCriterion("supportwebsite not like", value, "supportwebsite");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteIn(List<String> values) {
            addCriterion("supportwebsite in", values, "supportwebsite");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteNotIn(List<String> values) {
            addCriterion("supportwebsite not in", values, "supportwebsite");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteBetween(String value1, String value2) {
            addCriterion("supportwebsite between", value1, value2, "supportwebsite");
            return (Criteria) this;
        }

        public Criteria andSupportwebsiteNotBetween(String value1, String value2) {
            addCriterion("supportwebsite not between", value1, value2, "supportwebsite");
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
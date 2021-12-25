package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BasPersonInfoExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public BasPersonInfoExample() {
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

    public BasPersonInfoExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public BasPersonInfoExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public BasPersonInfoExample needName() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("name");
        
        return this;
    }

    public BasPersonInfoExample needEnname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("enname");
        
        return this;
    }

    public BasPersonInfoExample needAge() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("age");
        
        return this;
    }

    public BasPersonInfoExample needAlias() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("alias");
        
        return this;
    }

    public BasPersonInfoExample needHometown() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("hometown");
        
        return this;
    }

    public BasPersonInfoExample needCountry() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("country");
        
        return this;
    }

    public BasPersonInfoExample needNation() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("nation");
        
        return this;
    }

    public BasPersonInfoExample needProvince() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("province");
        
        return this;
    }

    public BasPersonInfoExample needCity() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("city");
        
        return this;
    }

    public BasPersonInfoExample needConWay() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("con_way");
        
        return this;
    }

    public BasPersonInfoExample needSex() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("sex");
        
        return this;
    }

    public BasPersonInfoExample needIdNumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id_number");
        
        return this;
    }

    public BasPersonInfoExample needBirthday() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("birthday");
        
        return this;
    }

    public BasPersonInfoExample needHouseholdRegister() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("household_register");
        
        return this;
    }

    public BasPersonInfoExample needLiveplace() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("liveplace");
        
        return this;
    }

    public BasPersonInfoExample needMaritalStatus() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("marital_status");
        
        return this;
    }

    public BasPersonInfoExample needEmployment() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("employment");
        
        return this;
    }

    public BasPersonInfoExample needDiploma() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("diploma");
        
        return this;
    }

    public BasPersonInfoExample needWorkYears() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("work_years");
        
        return this;
    }

    public BasPersonInfoExample needChildStatus() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("child_status");
        
        return this;
    }

    public BasPersonInfoExample needLivePhoto() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("live_photo");
        
        return this;
    }

    public BasPersonInfoExample needOccuPhoto() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("occu_photo");
        
        return this;
    }

    public BasPersonInfoExample needArtPhoto() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("art_photo");
        
        return this;
    }

    public BasPersonInfoExample needPtag() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ptag");
        
        return this;
    }

    public BasPersonInfoExample needPDesc() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("p_desc");
        
        return this;
    }

    public BasPersonInfoExample needAdvantage() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("advantage");
        
        return this;
    }

    public BasPersonInfoExample needLastuptime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("lastuptime");
        
        return this;
    }

    public BasPersonInfoExample needSource() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("source");
        
        return this;
    }

    public BasPersonInfoExample needUrl() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("url");
        
        return this;
    }

    public BasPersonInfoExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public BasPersonInfoExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public BasPersonInfoExample needType() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("type");
        
        return this;
    }

    public BasPersonInfoExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByName(String type) {
        if(orderByClause == null){
            orderByClause = "name " + type;
        }
        else{
            orderByClause += " ,name " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByEnname(String type) {
        if(orderByClause == null){
            orderByClause = "enname " + type;
        }
        else{
            orderByClause += " ,enname " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByAge(String type) {
        if(orderByClause == null){
            orderByClause = "age " + type;
        }
        else{
            orderByClause += " ,age " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByAlias(String type) {
        if(orderByClause == null){
            orderByClause = "alias " + type;
        }
        else{
            orderByClause += " ,alias " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByHometown(String type) {
        if(orderByClause == null){
            orderByClause = "hometown " + type;
        }
        else{
            orderByClause += " ,hometown " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByCountry(String type) {
        if(orderByClause == null){
            orderByClause = "country " + type;
        }
        else{
            orderByClause += " ,country " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByNation(String type) {
        if(orderByClause == null){
            orderByClause = "nation " + type;
        }
        else{
            orderByClause += " ,nation " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByProvince(String type) {
        if(orderByClause == null){
            orderByClause = "province " + type;
        }
        else{
            orderByClause += " ,province " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByCity(String type) {
        if(orderByClause == null){
            orderByClause = "city " + type;
        }
        else{
            orderByClause += " ,city " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByConWay(String type) {
        if(orderByClause == null){
            orderByClause = "con_way " + type;
        }
        else{
            orderByClause += " ,con_way " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderBySex(String type) {
        if(orderByClause == null){
            orderByClause = "sex " + type;
        }
        else{
            orderByClause += " ,sex " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByIdNumber(String type) {
        if(orderByClause == null){
            orderByClause = "id_number " + type;
        }
        else{
            orderByClause += " ,id_number " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByBirthday(String type) {
        if(orderByClause == null){
            orderByClause = "birthday " + type;
        }
        else{
            orderByClause += " ,birthday " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByHouseholdRegister(String type) {
        if(orderByClause == null){
            orderByClause = "household_register " + type;
        }
        else{
            orderByClause += " ,household_register " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByLiveplace(String type) {
        if(orderByClause == null){
            orderByClause = "liveplace " + type;
        }
        else{
            orderByClause += " ,liveplace " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByMaritalStatus(String type) {
        if(orderByClause == null){
            orderByClause = "marital_status " + type;
        }
        else{
            orderByClause += " ,marital_status " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByEmployment(String type) {
        if(orderByClause == null){
            orderByClause = "employment " + type;
        }
        else{
            orderByClause += " ,employment " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByDiploma(String type) {
        if(orderByClause == null){
            orderByClause = "diploma " + type;
        }
        else{
            orderByClause += " ,diploma " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByWorkYears(String type) {
        if(orderByClause == null){
            orderByClause = "work_years " + type;
        }
        else{
            orderByClause += " ,work_years " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByChildStatus(String type) {
        if(orderByClause == null){
            orderByClause = "child_status " + type;
        }
        else{
            orderByClause += " ,child_status " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByLivePhoto(String type) {
        if(orderByClause == null){
            orderByClause = "live_photo " + type;
        }
        else{
            orderByClause += " ,live_photo " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByOccuPhoto(String type) {
        if(orderByClause == null){
            orderByClause = "occu_photo " + type;
        }
        else{
            orderByClause += " ,occu_photo " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByArtPhoto(String type) {
        if(orderByClause == null){
            orderByClause = "art_photo " + type;
        }
        else{
            orderByClause += " ,art_photo " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByPtag(String type) {
        if(orderByClause == null){
            orderByClause = "ptag " + type;
        }
        else{
            orderByClause += " ,ptag " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByPDesc(String type) {
        if(orderByClause == null){
            orderByClause = "p_desc " + type;
        }
        else{
            orderByClause += " ,p_desc " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByAdvantage(String type) {
        if(orderByClause == null){
            orderByClause = "advantage " + type;
        }
        else{
            orderByClause += " ,advantage " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByLastuptime(String type) {
        if(orderByClause == null){
            orderByClause = "lastuptime " + type;
        }
        else{
            orderByClause += " ,lastuptime " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderBySource(String type) {
        if(orderByClause == null){
            orderByClause = "source " + type;
        }
        else{
            orderByClause += " ,source " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByUrl(String type) {
        if(orderByClause == null){
            orderByClause = "url " + type;
        }
        else{
            orderByClause += " ,url " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample orderByType(String type) {
        if(orderByClause == null){
            orderByClause = "type " + type;
        }
        else{
            orderByClause += " ,type " + type;
        }
        
        return this;
    }

    public BasPersonInfoExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByName() {
        if(groupByClause == null){
            groupByClause = "name ";
        }
        else{
            groupByClause += " ,name ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByEnname() {
        if(groupByClause == null){
            groupByClause = "enname ";
        }
        else{
            groupByClause += " ,enname ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByAge() {
        if(groupByClause == null){
            groupByClause = "age ";
        }
        else{
            groupByClause += " ,age ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByAlias() {
        if(groupByClause == null){
            groupByClause = "alias ";
        }
        else{
            groupByClause += " ,alias ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByHometown() {
        if(groupByClause == null){
            groupByClause = "hometown ";
        }
        else{
            groupByClause += " ,hometown ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByCountry() {
        if(groupByClause == null){
            groupByClause = "country ";
        }
        else{
            groupByClause += " ,country ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByNation() {
        if(groupByClause == null){
            groupByClause = "nation ";
        }
        else{
            groupByClause += " ,nation ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByProvince() {
        if(groupByClause == null){
            groupByClause = "province ";
        }
        else{
            groupByClause += " ,province ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByCity() {
        if(groupByClause == null){
            groupByClause = "city ";
        }
        else{
            groupByClause += " ,city ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByConWay() {
        if(groupByClause == null){
            groupByClause = "con_way ";
        }
        else{
            groupByClause += " ,con_way ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupBySex() {
        if(groupByClause == null){
            groupByClause = "sex ";
        }
        else{
            groupByClause += " ,sex ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByIdNumber() {
        if(groupByClause == null){
            groupByClause = "id_number ";
        }
        else{
            groupByClause += " ,id_number ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByBirthday() {
        if(groupByClause == null){
            groupByClause = "birthday ";
        }
        else{
            groupByClause += " ,birthday ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByHouseholdRegister() {
        if(groupByClause == null){
            groupByClause = "household_register ";
        }
        else{
            groupByClause += " ,household_register ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByLiveplace() {
        if(groupByClause == null){
            groupByClause = "liveplace ";
        }
        else{
            groupByClause += " ,liveplace ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByMaritalStatus() {
        if(groupByClause == null){
            groupByClause = "marital_status ";
        }
        else{
            groupByClause += " ,marital_status ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByEmployment() {
        if(groupByClause == null){
            groupByClause = "employment ";
        }
        else{
            groupByClause += " ,employment ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByDiploma() {
        if(groupByClause == null){
            groupByClause = "diploma ";
        }
        else{
            groupByClause += " ,diploma ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByWorkYears() {
        if(groupByClause == null){
            groupByClause = "work_years ";
        }
        else{
            groupByClause += " ,work_years ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByChildStatus() {
        if(groupByClause == null){
            groupByClause = "child_status ";
        }
        else{
            groupByClause += " ,child_status ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByLivePhoto() {
        if(groupByClause == null){
            groupByClause = "live_photo ";
        }
        else{
            groupByClause += " ,live_photo ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByOccuPhoto() {
        if(groupByClause == null){
            groupByClause = "occu_photo ";
        }
        else{
            groupByClause += " ,occu_photo ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByArtPhoto() {
        if(groupByClause == null){
            groupByClause = "art_photo ";
        }
        else{
            groupByClause += " ,art_photo ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByPtag() {
        if(groupByClause == null){
            groupByClause = "ptag ";
        }
        else{
            groupByClause += " ,ptag ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByPDesc() {
        if(groupByClause == null){
            groupByClause = "p_desc ";
        }
        else{
            groupByClause += " ,p_desc ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByAdvantage() {
        if(groupByClause == null){
            groupByClause = "advantage ";
        }
        else{
            groupByClause += " ,advantage ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByLastuptime() {
        if(groupByClause == null){
            groupByClause = "lastuptime ";
        }
        else{
            groupByClause += " ,lastuptime ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupBySource() {
        if(groupByClause == null){
            groupByClause = "source ";
        }
        else{
            groupByClause += " ,source ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByUrl() {
        if(groupByClause == null){
            groupByClause = "url ";
        }
        else{
            groupByClause += " ,url ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupByType() {
        if(groupByClause == null){
            groupByClause = "type ";
        }
        else{
            groupByClause += " ,type ";
        }
        
        return this;
    }

    public BasPersonInfoExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public BasPersonInfoExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public BasPersonInfoExample groupConcatName() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(name SEPARATOR \'|\') as name");
        return this;
    }

    public BasPersonInfoExample groupConcatEnname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(enname SEPARATOR \'|\') as enname");
        return this;
    }

    public BasPersonInfoExample groupConcatAge() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(age SEPARATOR \'|\') as age");
        return this;
    }

    public BasPersonInfoExample groupConcatAlias() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(alias SEPARATOR \'|\') as alias");
        return this;
    }

    public BasPersonInfoExample groupConcatHometown() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(hometown SEPARATOR \'|\') as hometown");
        return this;
    }

    public BasPersonInfoExample groupConcatCountry() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(country SEPARATOR \'|\') as country");
        return this;
    }

    public BasPersonInfoExample groupConcatNation() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(nation SEPARATOR \'|\') as nation");
        return this;
    }

    public BasPersonInfoExample groupConcatProvince() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(province SEPARATOR \'|\') as province");
        return this;
    }

    public BasPersonInfoExample groupConcatCity() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(city SEPARATOR \'|\') as city");
        return this;
    }

    public BasPersonInfoExample groupConcatConWay() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(con_way SEPARATOR \'|\') as con_way");
        return this;
    }

    public BasPersonInfoExample groupConcatSex() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(sex SEPARATOR \'|\') as sex");
        return this;
    }

    public BasPersonInfoExample groupConcatIdNumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id_number SEPARATOR \'|\') as id_number");
        return this;
    }

    public BasPersonInfoExample groupConcatBirthday() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(birthday SEPARATOR \'|\') as birthday");
        return this;
    }

    public BasPersonInfoExample groupConcatHouseholdRegister() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(household_register SEPARATOR \'|\') as household_register");
        return this;
    }

    public BasPersonInfoExample groupConcatLiveplace() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(liveplace SEPARATOR \'|\') as liveplace");
        return this;
    }

    public BasPersonInfoExample groupConcatMaritalStatus() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(marital_status SEPARATOR \'|\') as marital_status");
        return this;
    }

    public BasPersonInfoExample groupConcatEmployment() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(employment SEPARATOR \'|\') as employment");
        return this;
    }

    public BasPersonInfoExample groupConcatDiploma() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(diploma SEPARATOR \'|\') as diploma");
        return this;
    }

    public BasPersonInfoExample groupConcatWorkYears() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(work_years SEPARATOR \'|\') as work_years");
        return this;
    }

    public BasPersonInfoExample groupConcatChildStatus() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(child_status SEPARATOR \'|\') as child_status");
        return this;
    }

    public BasPersonInfoExample groupConcatLivePhoto() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(live_photo SEPARATOR \'|\') as live_photo");
        return this;
    }

    public BasPersonInfoExample groupConcatOccuPhoto() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(occu_photo SEPARATOR \'|\') as occu_photo");
        return this;
    }

    public BasPersonInfoExample groupConcatArtPhoto() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(art_photo SEPARATOR \'|\') as art_photo");
        return this;
    }

    public BasPersonInfoExample groupConcatPtag() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ptag SEPARATOR \'|\') as ptag");
        return this;
    }

    public BasPersonInfoExample groupConcatPDesc() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(p_desc SEPARATOR \'|\') as p_desc");
        return this;
    }

    public BasPersonInfoExample groupConcatAdvantage() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(advantage SEPARATOR \'|\') as advantage");
        return this;
    }

    public BasPersonInfoExample groupConcatLastuptime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(lastuptime SEPARATOR \'|\') as lastuptime");
        return this;
    }

    public BasPersonInfoExample groupConcatSource() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(source SEPARATOR \'|\') as source");
        return this;
    }

    public BasPersonInfoExample groupConcatUrl() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(url SEPARATOR \'|\') as url");
        return this;
    }

    public BasPersonInfoExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public BasPersonInfoExample groupConcatAtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(atime SEPARATOR \'|\') as atime");
        return this;
    }

    public BasPersonInfoExample groupConcatType() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andEnnameIsNull() {
            addCriterion("enname is null");
            return (Criteria) this;
        }

        public Criteria andEnnameIsNotNull() {
            addCriterion("enname is not null");
            return (Criteria) this;
        }

        public Criteria andEnnameEqualTo(String value) {
            addCriterion("enname =", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotEqualTo(String value) {
            addCriterion("enname <>", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameGreaterThan(String value) {
            addCriterion("enname >", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameGreaterThanOrEqualTo(String value) {
            addCriterion("enname >=", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLessThan(String value) {
            addCriterion("enname <", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLessThanOrEqualTo(String value) {
            addCriterion("enname <=", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLike(String value) {
            addCriterion("enname like", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotLike(String value) {
            addCriterion("enname not like", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameIn(List<String> values) {
            addCriterion("enname in", values, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotIn(List<String> values) {
            addCriterion("enname not in", values, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameBetween(String value1, String value2) {
            addCriterion("enname between", value1, value2, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotBetween(String value1, String value2) {
            addCriterion("enname not between", value1, value2, "enname");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Short value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Short value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Short value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Short value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Short value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Short> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Short> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Short value1, Short value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Short value1, Short value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andHometownIsNull() {
            addCriterion("hometown is null");
            return (Criteria) this;
        }

        public Criteria andHometownIsNotNull() {
            addCriterion("hometown is not null");
            return (Criteria) this;
        }

        public Criteria andHometownEqualTo(String value) {
            addCriterion("hometown =", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotEqualTo(String value) {
            addCriterion("hometown <>", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThan(String value) {
            addCriterion("hometown >", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThanOrEqualTo(String value) {
            addCriterion("hometown >=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThan(String value) {
            addCriterion("hometown <", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThanOrEqualTo(String value) {
            addCriterion("hometown <=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLike(String value) {
            addCriterion("hometown like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotLike(String value) {
            addCriterion("hometown not like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownIn(List<String> values) {
            addCriterion("hometown in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotIn(List<String> values) {
            addCriterion("hometown not in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownBetween(String value1, String value2) {
            addCriterion("hometown between", value1, value2, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotBetween(String value1, String value2) {
            addCriterion("hometown not between", value1, value2, "hometown");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterIsNull() {
            addCriterion("household_register is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterIsNotNull() {
            addCriterion("household_register is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterEqualTo(String value) {
            addCriterion("household_register =", value, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterNotEqualTo(String value) {
            addCriterion("household_register <>", value, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterGreaterThan(String value) {
            addCriterion("household_register >", value, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("household_register >=", value, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterLessThan(String value) {
            addCriterion("household_register <", value, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterLessThanOrEqualTo(String value) {
            addCriterion("household_register <=", value, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterLike(String value) {
            addCriterion("household_register like", value, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterNotLike(String value) {
            addCriterion("household_register not like", value, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterIn(List<String> values) {
            addCriterion("household_register in", values, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterNotIn(List<String> values) {
            addCriterion("household_register not in", values, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterBetween(String value1, String value2) {
            addCriterion("household_register between", value1, value2, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegisterNotBetween(String value1, String value2) {
            addCriterion("household_register not between", value1, value2, "householdRegister");
            return (Criteria) this;
        }

        public Criteria andLiveplaceIsNull() {
            addCriterion("liveplace is null");
            return (Criteria) this;
        }

        public Criteria andLiveplaceIsNotNull() {
            addCriterion("liveplace is not null");
            return (Criteria) this;
        }

        public Criteria andLiveplaceEqualTo(String value) {
            addCriterion("liveplace =", value, "liveplace");
            return (Criteria) this;
        }

        public Criteria andLiveplaceNotEqualTo(String value) {
            addCriterion("liveplace <>", value, "liveplace");
            return (Criteria) this;
        }

        public Criteria andLiveplaceGreaterThan(String value) {
            addCriterion("liveplace >", value, "liveplace");
            return (Criteria) this;
        }

        public Criteria andLiveplaceGreaterThanOrEqualTo(String value) {
            addCriterion("liveplace >=", value, "liveplace");
            return (Criteria) this;
        }

        public Criteria andLiveplaceLessThan(String value) {
            addCriterion("liveplace <", value, "liveplace");
            return (Criteria) this;
        }

        public Criteria andLiveplaceLessThanOrEqualTo(String value) {
            addCriterion("liveplace <=", value, "liveplace");
            return (Criteria) this;
        }

        public Criteria andLiveplaceLike(String value) {
            addCriterion("liveplace like", value, "liveplace");
            return (Criteria) this;
        }

        public Criteria andLiveplaceNotLike(String value) {
            addCriterion("liveplace not like", value, "liveplace");
            return (Criteria) this;
        }

        public Criteria andLiveplaceIn(List<String> values) {
            addCriterion("liveplace in", values, "liveplace");
            return (Criteria) this;
        }

        public Criteria andLiveplaceNotIn(List<String> values) {
            addCriterion("liveplace not in", values, "liveplace");
            return (Criteria) this;
        }

        public Criteria andLiveplaceBetween(String value1, String value2) {
            addCriterion("liveplace between", value1, value2, "liveplace");
            return (Criteria) this;
        }

        public Criteria andLiveplaceNotBetween(String value1, String value2) {
            addCriterion("liveplace not between", value1, value2, "liveplace");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(Boolean value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(Boolean value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(Boolean value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(Boolean value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<Boolean> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<Boolean> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentIsNull() {
            addCriterion("employment is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentIsNotNull() {
            addCriterion("employment is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentEqualTo(Boolean value) {
            addCriterion("employment =", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentNotEqualTo(Boolean value) {
            addCriterion("employment <>", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentGreaterThan(Boolean value) {
            addCriterion("employment >", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("employment >=", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentLessThan(Boolean value) {
            addCriterion("employment <", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentLessThanOrEqualTo(Boolean value) {
            addCriterion("employment <=", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentIn(List<Boolean> values) {
            addCriterion("employment in", values, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentNotIn(List<Boolean> values) {
            addCriterion("employment not in", values, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentBetween(Boolean value1, Boolean value2) {
            addCriterion("employment between", value1, value2, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("employment not between", value1, value2, "employment");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNull() {
            addCriterion("diploma is null");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNotNull() {
            addCriterion("diploma is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomaEqualTo(String value) {
            addCriterion("diploma =", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotEqualTo(String value) {
            addCriterion("diploma <>", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThan(String value) {
            addCriterion("diploma >", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThanOrEqualTo(String value) {
            addCriterion("diploma >=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThan(String value) {
            addCriterion("diploma <", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThanOrEqualTo(String value) {
            addCriterion("diploma <=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLike(String value) {
            addCriterion("diploma like", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotLike(String value) {
            addCriterion("diploma not like", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaIn(List<String> values) {
            addCriterion("diploma in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotIn(List<String> values) {
            addCriterion("diploma not in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaBetween(String value1, String value2) {
            addCriterion("diploma between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotBetween(String value1, String value2) {
            addCriterion("diploma not between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andWorkYearsIsNull() {
            addCriterion("work_years is null");
            return (Criteria) this;
        }

        public Criteria andWorkYearsIsNotNull() {
            addCriterion("work_years is not null");
            return (Criteria) this;
        }

        public Criteria andWorkYearsEqualTo(String value) {
            addCriterion("work_years =", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsNotEqualTo(String value) {
            addCriterion("work_years <>", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsGreaterThan(String value) {
            addCriterion("work_years >", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsGreaterThanOrEqualTo(String value) {
            addCriterion("work_years >=", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsLessThan(String value) {
            addCriterion("work_years <", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsLessThanOrEqualTo(String value) {
            addCriterion("work_years <=", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsLike(String value) {
            addCriterion("work_years like", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsNotLike(String value) {
            addCriterion("work_years not like", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsIn(List<String> values) {
            addCriterion("work_years in", values, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsNotIn(List<String> values) {
            addCriterion("work_years not in", values, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsBetween(String value1, String value2) {
            addCriterion("work_years between", value1, value2, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsNotBetween(String value1, String value2) {
            addCriterion("work_years not between", value1, value2, "workYears");
            return (Criteria) this;
        }

        public Criteria andChildStatusIsNull() {
            addCriterion("child_status is null");
            return (Criteria) this;
        }

        public Criteria andChildStatusIsNotNull() {
            addCriterion("child_status is not null");
            return (Criteria) this;
        }

        public Criteria andChildStatusEqualTo(Boolean value) {
            addCriterion("child_status =", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusNotEqualTo(Boolean value) {
            addCriterion("child_status <>", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusGreaterThan(Boolean value) {
            addCriterion("child_status >", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("child_status >=", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusLessThan(Boolean value) {
            addCriterion("child_status <", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("child_status <=", value, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusIn(List<Boolean> values) {
            addCriterion("child_status in", values, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusNotIn(List<Boolean> values) {
            addCriterion("child_status not in", values, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("child_status between", value1, value2, "childStatus");
            return (Criteria) this;
        }

        public Criteria andChildStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("child_status not between", value1, value2, "childStatus");
            return (Criteria) this;
        }

        public Criteria andLivePhotoIsNull() {
            addCriterion("live_photo is null");
            return (Criteria) this;
        }

        public Criteria andLivePhotoIsNotNull() {
            addCriterion("live_photo is not null");
            return (Criteria) this;
        }

        public Criteria andLivePhotoEqualTo(String value) {
            addCriterion("live_photo =", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoNotEqualTo(String value) {
            addCriterion("live_photo <>", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoGreaterThan(String value) {
            addCriterion("live_photo >", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("live_photo >=", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoLessThan(String value) {
            addCriterion("live_photo <", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoLessThanOrEqualTo(String value) {
            addCriterion("live_photo <=", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoLike(String value) {
            addCriterion("live_photo like", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoNotLike(String value) {
            addCriterion("live_photo not like", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoIn(List<String> values) {
            addCriterion("live_photo in", values, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoNotIn(List<String> values) {
            addCriterion("live_photo not in", values, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoBetween(String value1, String value2) {
            addCriterion("live_photo between", value1, value2, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoNotBetween(String value1, String value2) {
            addCriterion("live_photo not between", value1, value2, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoIsNull() {
            addCriterion("occu_photo is null");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoIsNotNull() {
            addCriterion("occu_photo is not null");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoEqualTo(String value) {
            addCriterion("occu_photo =", value, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoNotEqualTo(String value) {
            addCriterion("occu_photo <>", value, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoGreaterThan(String value) {
            addCriterion("occu_photo >", value, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("occu_photo >=", value, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoLessThan(String value) {
            addCriterion("occu_photo <", value, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoLessThanOrEqualTo(String value) {
            addCriterion("occu_photo <=", value, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoLike(String value) {
            addCriterion("occu_photo like", value, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoNotLike(String value) {
            addCriterion("occu_photo not like", value, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoIn(List<String> values) {
            addCriterion("occu_photo in", values, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoNotIn(List<String> values) {
            addCriterion("occu_photo not in", values, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoBetween(String value1, String value2) {
            addCriterion("occu_photo between", value1, value2, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andOccuPhotoNotBetween(String value1, String value2) {
            addCriterion("occu_photo not between", value1, value2, "occuPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoIsNull() {
            addCriterion("art_photo is null");
            return (Criteria) this;
        }

        public Criteria andArtPhotoIsNotNull() {
            addCriterion("art_photo is not null");
            return (Criteria) this;
        }

        public Criteria andArtPhotoEqualTo(String value) {
            addCriterion("art_photo =", value, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoNotEqualTo(String value) {
            addCriterion("art_photo <>", value, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoGreaterThan(String value) {
            addCriterion("art_photo >", value, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("art_photo >=", value, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoLessThan(String value) {
            addCriterion("art_photo <", value, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoLessThanOrEqualTo(String value) {
            addCriterion("art_photo <=", value, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoLike(String value) {
            addCriterion("art_photo like", value, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoNotLike(String value) {
            addCriterion("art_photo not like", value, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoIn(List<String> values) {
            addCriterion("art_photo in", values, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoNotIn(List<String> values) {
            addCriterion("art_photo not in", values, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoBetween(String value1, String value2) {
            addCriterion("art_photo between", value1, value2, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andArtPhotoNotBetween(String value1, String value2) {
            addCriterion("art_photo not between", value1, value2, "artPhoto");
            return (Criteria) this;
        }

        public Criteria andPtagIsNull() {
            addCriterion("ptag is null");
            return (Criteria) this;
        }

        public Criteria andPtagIsNotNull() {
            addCriterion("ptag is not null");
            return (Criteria) this;
        }

        public Criteria andPtagEqualTo(String value) {
            addCriterion("ptag =", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagNotEqualTo(String value) {
            addCriterion("ptag <>", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagGreaterThan(String value) {
            addCriterion("ptag >", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagGreaterThanOrEqualTo(String value) {
            addCriterion("ptag >=", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagLessThan(String value) {
            addCriterion("ptag <", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagLessThanOrEqualTo(String value) {
            addCriterion("ptag <=", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagLike(String value) {
            addCriterion("ptag like", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagNotLike(String value) {
            addCriterion("ptag not like", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagIn(List<String> values) {
            addCriterion("ptag in", values, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagNotIn(List<String> values) {
            addCriterion("ptag not in", values, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagBetween(String value1, String value2) {
            addCriterion("ptag between", value1, value2, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagNotBetween(String value1, String value2) {
            addCriterion("ptag not between", value1, value2, "ptag");
            return (Criteria) this;
        }

        public Criteria andPDescIsNull() {
            addCriterion("p_desc is null");
            return (Criteria) this;
        }

        public Criteria andPDescIsNotNull() {
            addCriterion("p_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPDescEqualTo(String value) {
            addCriterion("p_desc =", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotEqualTo(String value) {
            addCriterion("p_desc <>", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescGreaterThan(String value) {
            addCriterion("p_desc >", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescGreaterThanOrEqualTo(String value) {
            addCriterion("p_desc >=", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLessThan(String value) {
            addCriterion("p_desc <", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLessThanOrEqualTo(String value) {
            addCriterion("p_desc <=", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLike(String value) {
            addCriterion("p_desc like", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotLike(String value) {
            addCriterion("p_desc not like", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescIn(List<String> values) {
            addCriterion("p_desc in", values, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotIn(List<String> values) {
            addCriterion("p_desc not in", values, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescBetween(String value1, String value2) {
            addCriterion("p_desc between", value1, value2, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotBetween(String value1, String value2) {
            addCriterion("p_desc not between", value1, value2, "pDesc");
            return (Criteria) this;
        }

        public Criteria andAdvantageIsNull() {
            addCriterion("advantage is null");
            return (Criteria) this;
        }

        public Criteria andAdvantageIsNotNull() {
            addCriterion("advantage is not null");
            return (Criteria) this;
        }

        public Criteria andAdvantageEqualTo(String value) {
            addCriterion("advantage =", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotEqualTo(String value) {
            addCriterion("advantage <>", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageGreaterThan(String value) {
            addCriterion("advantage >", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageGreaterThanOrEqualTo(String value) {
            addCriterion("advantage >=", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLessThan(String value) {
            addCriterion("advantage <", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLessThanOrEqualTo(String value) {
            addCriterion("advantage <=", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLike(String value) {
            addCriterion("advantage like", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotLike(String value) {
            addCriterion("advantage not like", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageIn(List<String> values) {
            addCriterion("advantage in", values, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotIn(List<String> values) {
            addCriterion("advantage not in", values, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageBetween(String value1, String value2) {
            addCriterion("advantage between", value1, value2, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotBetween(String value1, String value2) {
            addCriterion("advantage not between", value1, value2, "advantage");
            return (Criteria) this;
        }

        public Criteria andLastuptimeIsNull() {
            addCriterion("lastuptime is null");
            return (Criteria) this;
        }

        public Criteria andLastuptimeIsNotNull() {
            addCriterion("lastuptime is not null");
            return (Criteria) this;
        }

        public Criteria andLastuptimeEqualTo(Date value) {
            addCriterion("lastuptime =", value, "lastuptime");
            return (Criteria) this;
        }

        public Criteria andLastuptimeNotEqualTo(Date value) {
            addCriterion("lastuptime <>", value, "lastuptime");
            return (Criteria) this;
        }

        public Criteria andLastuptimeGreaterThan(Date value) {
            addCriterion("lastuptime >", value, "lastuptime");
            return (Criteria) this;
        }

        public Criteria andLastuptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastuptime >=", value, "lastuptime");
            return (Criteria) this;
        }

        public Criteria andLastuptimeLessThan(Date value) {
            addCriterion("lastuptime <", value, "lastuptime");
            return (Criteria) this;
        }

        public Criteria andLastuptimeLessThanOrEqualTo(Date value) {
            addCriterion("lastuptime <=", value, "lastuptime");
            return (Criteria) this;
        }

        public Criteria andLastuptimeIn(List<Date> values) {
            addCriterion("lastuptime in", values, "lastuptime");
            return (Criteria) this;
        }

        public Criteria andLastuptimeNotIn(List<Date> values) {
            addCriterion("lastuptime not in", values, "lastuptime");
            return (Criteria) this;
        }

        public Criteria andLastuptimeBetween(Date value1, Date value2) {
            addCriterion("lastuptime between", value1, value2, "lastuptime");
            return (Criteria) this;
        }

        public Criteria andLastuptimeNotBetween(Date value1, Date value2) {
            addCriterion("lastuptime not between", value1, value2, "lastuptime");
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
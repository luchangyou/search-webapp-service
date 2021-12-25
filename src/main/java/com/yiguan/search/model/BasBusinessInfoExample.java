package com.yiguan.search.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BasBusinessInfoExample {
    protected String orderByClause;

    protected String groupByClause;

    protected List<String> groupConcatList;

    protected boolean distinct;

    protected List<String> columnFilterList;

    protected List<Criteria> oredCriteria;

    public BasBusinessInfoExample() {
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

    public BasBusinessInfoExample needId() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("id");
        
        return this;
    }

    public BasBusinessInfoExample needBid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("bid");
        
        return this;
    }

    public BasBusinessInfoExample needUuid() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uuid");
        
        return this;
    }

    public BasBusinessInfoExample needCname() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("cname");
        
        return this;
    }

    public BasBusinessInfoExample needCnameOld() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("cname_old");
        
        return this;
    }

    public BasBusinessInfoExample needStockType() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("stock_type");
        
        return this;
    }

    public BasBusinessInfoExample needStockCode() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("stock_code");
        
        return this;
    }

    public BasBusinessInfoExample needTelephone() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("telephone");
        
        return this;
    }

    public BasBusinessInfoExample needEmail() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("email");
        
        return this;
    }

    public BasBusinessInfoExample needWeb() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("web");
        
        return this;
    }

    public BasBusinessInfoExample needAdress() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("adress");
        
        return this;
    }

    public BasBusinessInfoExample needLegalPersen() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("legal_persen");
        
        return this;
    }

    public BasBusinessInfoExample needRcapital() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rcapital");
        
        return this;
    }

    public BasBusinessInfoExample needState() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("state");
        
        return this;
    }

    public BasBusinessInfoExample needEtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("etime");
        
        return this;
    }

    public BasBusinessInfoExample needRtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rtime");
        
        return this;
    }

    public BasBusinessInfoExample needIndustry() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("industry");
        
        return this;
    }

    public BasBusinessInfoExample needRbnumber() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rbnumber");
        
        return this;
    }

    public BasBusinessInfoExample needEnterpriseType() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("enterprise_type");
        
        return this;
    }

    public BasBusinessInfoExample needOcode() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ocode");
        
        return this;
    }

    public BasBusinessInfoExample needOperationPeriod() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("operation_period");
        
        return this;
    }

    public BasBusinessInfoExample needRdepartment() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("rdepartment");
        
        return this;
    }

    public BasBusinessInfoExample needApprovaDate() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("approva_date");
        
        return this;
    }

    public BasBusinessInfoExample needUcCode() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("uc_code");
        
        return this;
    }

    public BasBusinessInfoExample needRadress() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("radress");
        
        return this;
    }

    public BasBusinessInfoExample needBscope() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("bscope");
        
        return this;
    }

    public BasBusinessInfoExample needSource() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("source");
        
        return this;
    }

    public BasBusinessInfoExample needUrl() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("url");
        
        return this;
    }

    public BasBusinessInfoExample needCtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("ctime");
        
        return this;
    }

    public BasBusinessInfoExample needAtime() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("atime");
        
        return this;
    }

    public BasBusinessInfoExample needLon() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("lon");
        
        return this;
    }

    public BasBusinessInfoExample needLat() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("lat");
        
        return this;
    }

    public BasBusinessInfoExample needProvince() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("province");
        
        return this;
    }

    public BasBusinessInfoExample needCity() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("city");
        
        return this;
    }

    public BasBusinessInfoExample needCounty() {
        if(columnFilterList == null){
            columnFilterList = new ArrayList<String>();
        }
        columnFilterList.add("county");
        
        return this;
    }

    public BasBusinessInfoExample orderById(String type) {
        if(orderByClause == null){
            orderByClause = "id " + type;
        }
        else{
            orderByClause += " ,id " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByBid(String type) {
        if(orderByClause == null){
            orderByClause = "bid " + type;
        }
        else{
            orderByClause += " ,bid " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByUuid(String type) {
        if(orderByClause == null){
            orderByClause = "uuid " + type;
        }
        else{
            orderByClause += " ,uuid " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByCname(String type) {
        if(orderByClause == null){
            orderByClause = "cname " + type;
        }
        else{
            orderByClause += " ,cname " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByCnameOld(String type) {
        if(orderByClause == null){
            orderByClause = "cname_old " + type;
        }
        else{
            orderByClause += " ,cname_old " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByStockType(String type) {
        if(orderByClause == null){
            orderByClause = "stock_type " + type;
        }
        else{
            orderByClause += " ,stock_type " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByStockCode(String type) {
        if(orderByClause == null){
            orderByClause = "stock_code " + type;
        }
        else{
            orderByClause += " ,stock_code " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByTelephone(String type) {
        if(orderByClause == null){
            orderByClause = "telephone " + type;
        }
        else{
            orderByClause += " ,telephone " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByEmail(String type) {
        if(orderByClause == null){
            orderByClause = "email " + type;
        }
        else{
            orderByClause += " ,email " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByWeb(String type) {
        if(orderByClause == null){
            orderByClause = "web " + type;
        }
        else{
            orderByClause += " ,web " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByAdress(String type) {
        if(orderByClause == null){
            orderByClause = "adress " + type;
        }
        else{
            orderByClause += " ,adress " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByLegalPersen(String type) {
        if(orderByClause == null){
            orderByClause = "legal_persen " + type;
        }
        else{
            orderByClause += " ,legal_persen " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByRcapital(String type) {
        if(orderByClause == null){
            orderByClause = "rcapital " + type;
        }
        else{
            orderByClause += " ,rcapital " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByState(String type) {
        if(orderByClause == null){
            orderByClause = "state " + type;
        }
        else{
            orderByClause += " ,state " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByEtime(String type) {
        if(orderByClause == null){
            orderByClause = "etime " + type;
        }
        else{
            orderByClause += " ,etime " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByRtime(String type) {
        if(orderByClause == null){
            orderByClause = "rtime " + type;
        }
        else{
            orderByClause += " ,rtime " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByIndustry(String type) {
        if(orderByClause == null){
            orderByClause = "industry " + type;
        }
        else{
            orderByClause += " ,industry " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByRbnumber(String type) {
        if(orderByClause == null){
            orderByClause = "rbnumber " + type;
        }
        else{
            orderByClause += " ,rbnumber " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByEnterpriseType(String type) {
        if(orderByClause == null){
            orderByClause = "enterprise_type " + type;
        }
        else{
            orderByClause += " ,enterprise_type " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByOcode(String type) {
        if(orderByClause == null){
            orderByClause = "ocode " + type;
        }
        else{
            orderByClause += " ,ocode " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByOperationPeriod(String type) {
        if(orderByClause == null){
            orderByClause = "operation_period " + type;
        }
        else{
            orderByClause += " ,operation_period " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByRdepartment(String type) {
        if(orderByClause == null){
            orderByClause = "rdepartment " + type;
        }
        else{
            orderByClause += " ,rdepartment " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByApprovaDate(String type) {
        if(orderByClause == null){
            orderByClause = "approva_date " + type;
        }
        else{
            orderByClause += " ,approva_date " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByUcCode(String type) {
        if(orderByClause == null){
            orderByClause = "uc_code " + type;
        }
        else{
            orderByClause += " ,uc_code " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByRadress(String type) {
        if(orderByClause == null){
            orderByClause = "radress " + type;
        }
        else{
            orderByClause += " ,radress " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByBscope(String type) {
        if(orderByClause == null){
            orderByClause = "bscope " + type;
        }
        else{
            orderByClause += " ,bscope " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderBySource(String type) {
        if(orderByClause == null){
            orderByClause = "source " + type;
        }
        else{
            orderByClause += " ,source " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByUrl(String type) {
        if(orderByClause == null){
            orderByClause = "url " + type;
        }
        else{
            orderByClause += " ,url " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByCtime(String type) {
        if(orderByClause == null){
            orderByClause = "ctime " + type;
        }
        else{
            orderByClause += " ,ctime " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByAtime(String type) {
        if(orderByClause == null){
            orderByClause = "atime " + type;
        }
        else{
            orderByClause += " ,atime " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByLon(String type) {
        if(orderByClause == null){
            orderByClause = "lon " + type;
        }
        else{
            orderByClause += " ,lon " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByLat(String type) {
        if(orderByClause == null){
            orderByClause = "lat " + type;
        }
        else{
            orderByClause += " ,lat " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByProvince(String type) {
        if(orderByClause == null){
            orderByClause = "province " + type;
        }
        else{
            orderByClause += " ,province " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByCity(String type) {
        if(orderByClause == null){
            orderByClause = "city " + type;
        }
        else{
            orderByClause += " ,city " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample orderByCounty(String type) {
        if(orderByClause == null){
            orderByClause = "county " + type;
        }
        else{
            orderByClause += " ,county " + type;
        }
        
        return this;
    }

    public BasBusinessInfoExample groupById() {
        if(groupByClause == null){
            groupByClause = "id ";
        }
        else{
            groupByClause += " ,id ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByBid() {
        if(groupByClause == null){
            groupByClause = "bid ";
        }
        else{
            groupByClause += " ,bid ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByUuid() {
        if(groupByClause == null){
            groupByClause = "uuid ";
        }
        else{
            groupByClause += " ,uuid ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByCname() {
        if(groupByClause == null){
            groupByClause = "cname ";
        }
        else{
            groupByClause += " ,cname ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByCnameOld() {
        if(groupByClause == null){
            groupByClause = "cname_old ";
        }
        else{
            groupByClause += " ,cname_old ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByStockType() {
        if(groupByClause == null){
            groupByClause = "stock_type ";
        }
        else{
            groupByClause += " ,stock_type ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByStockCode() {
        if(groupByClause == null){
            groupByClause = "stock_code ";
        }
        else{
            groupByClause += " ,stock_code ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByTelephone() {
        if(groupByClause == null){
            groupByClause = "telephone ";
        }
        else{
            groupByClause += " ,telephone ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByEmail() {
        if(groupByClause == null){
            groupByClause = "email ";
        }
        else{
            groupByClause += " ,email ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByWeb() {
        if(groupByClause == null){
            groupByClause = "web ";
        }
        else{
            groupByClause += " ,web ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByAdress() {
        if(groupByClause == null){
            groupByClause = "adress ";
        }
        else{
            groupByClause += " ,adress ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByLegalPersen() {
        if(groupByClause == null){
            groupByClause = "legal_persen ";
        }
        else{
            groupByClause += " ,legal_persen ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByRcapital() {
        if(groupByClause == null){
            groupByClause = "rcapital ";
        }
        else{
            groupByClause += " ,rcapital ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByState() {
        if(groupByClause == null){
            groupByClause = "state ";
        }
        else{
            groupByClause += " ,state ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByEtime() {
        if(groupByClause == null){
            groupByClause = "etime ";
        }
        else{
            groupByClause += " ,etime ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByRtime() {
        if(groupByClause == null){
            groupByClause = "rtime ";
        }
        else{
            groupByClause += " ,rtime ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByIndustry() {
        if(groupByClause == null){
            groupByClause = "industry ";
        }
        else{
            groupByClause += " ,industry ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByRbnumber() {
        if(groupByClause == null){
            groupByClause = "rbnumber ";
        }
        else{
            groupByClause += " ,rbnumber ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByEnterpriseType() {
        if(groupByClause == null){
            groupByClause = "enterprise_type ";
        }
        else{
            groupByClause += " ,enterprise_type ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByOcode() {
        if(groupByClause == null){
            groupByClause = "ocode ";
        }
        else{
            groupByClause += " ,ocode ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByOperationPeriod() {
        if(groupByClause == null){
            groupByClause = "operation_period ";
        }
        else{
            groupByClause += " ,operation_period ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByRdepartment() {
        if(groupByClause == null){
            groupByClause = "rdepartment ";
        }
        else{
            groupByClause += " ,rdepartment ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByApprovaDate() {
        if(groupByClause == null){
            groupByClause = "approva_date ";
        }
        else{
            groupByClause += " ,approva_date ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByUcCode() {
        if(groupByClause == null){
            groupByClause = "uc_code ";
        }
        else{
            groupByClause += " ,uc_code ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByRadress() {
        if(groupByClause == null){
            groupByClause = "radress ";
        }
        else{
            groupByClause += " ,radress ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByBscope() {
        if(groupByClause == null){
            groupByClause = "bscope ";
        }
        else{
            groupByClause += " ,bscope ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupBySource() {
        if(groupByClause == null){
            groupByClause = "source ";
        }
        else{
            groupByClause += " ,source ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByUrl() {
        if(groupByClause == null){
            groupByClause = "url ";
        }
        else{
            groupByClause += " ,url ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByCtime() {
        if(groupByClause == null){
            groupByClause = "ctime ";
        }
        else{
            groupByClause += " ,ctime ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByAtime() {
        if(groupByClause == null){
            groupByClause = "atime ";
        }
        else{
            groupByClause += " ,atime ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByLon() {
        if(groupByClause == null){
            groupByClause = "lon ";
        }
        else{
            groupByClause += " ,lon ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByLat() {
        if(groupByClause == null){
            groupByClause = "lat ";
        }
        else{
            groupByClause += " ,lat ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByProvince() {
        if(groupByClause == null){
            groupByClause = "province ";
        }
        else{
            groupByClause += " ,province ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByCity() {
        if(groupByClause == null){
            groupByClause = "city ";
        }
        else{
            groupByClause += " ,city ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupByCounty() {
        if(groupByClause == null){
            groupByClause = "county ";
        }
        else{
            groupByClause += " ,county ";
        }
        
        return this;
    }

    public BasBusinessInfoExample groupConcatId() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(id SEPARATOR \'|\') as id");
        return this;
    }

    public BasBusinessInfoExample groupConcatBid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(bid SEPARATOR \'|\') as bid");
        return this;
    }

    public BasBusinessInfoExample groupConcatUuid() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uuid SEPARATOR \'|\') as uuid");
        return this;
    }

    public BasBusinessInfoExample groupConcatCname() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(cname SEPARATOR \'|\') as cname");
        return this;
    }

    public BasBusinessInfoExample groupConcatCnameOld() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(cname_old SEPARATOR \'|\') as cname_old");
        return this;
    }

    public BasBusinessInfoExample groupConcatStockType() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(stock_type SEPARATOR \'|\') as stock_type");
        return this;
    }

    public BasBusinessInfoExample groupConcatStockCode() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(stock_code SEPARATOR \'|\') as stock_code");
        return this;
    }

    public BasBusinessInfoExample groupConcatTelephone() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(telephone SEPARATOR \'|\') as telephone");
        return this;
    }

    public BasBusinessInfoExample groupConcatEmail() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(email SEPARATOR \'|\') as email");
        return this;
    }

    public BasBusinessInfoExample groupConcatWeb() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(web SEPARATOR \'|\') as web");
        return this;
    }

    public BasBusinessInfoExample groupConcatAdress() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(adress SEPARATOR \'|\') as adress");
        return this;
    }

    public BasBusinessInfoExample groupConcatLegalPersen() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(legal_persen SEPARATOR \'|\') as legal_persen");
        return this;
    }

    public BasBusinessInfoExample groupConcatRcapital() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rcapital SEPARATOR \'|\') as rcapital");
        return this;
    }

    public BasBusinessInfoExample groupConcatState() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(state SEPARATOR \'|\') as state");
        return this;
    }

    public BasBusinessInfoExample groupConcatEtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(etime SEPARATOR \'|\') as etime");
        return this;
    }

    public BasBusinessInfoExample groupConcatRtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rtime SEPARATOR \'|\') as rtime");
        return this;
    }

    public BasBusinessInfoExample groupConcatIndustry() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(industry SEPARATOR \'|\') as industry");
        return this;
    }

    public BasBusinessInfoExample groupConcatRbnumber() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rbnumber SEPARATOR \'|\') as rbnumber");
        return this;
    }

    public BasBusinessInfoExample groupConcatEnterpriseType() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(enterprise_type SEPARATOR \'|\') as enterprise_type");
        return this;
    }

    public BasBusinessInfoExample groupConcatOcode() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ocode SEPARATOR \'|\') as ocode");
        return this;
    }

    public BasBusinessInfoExample groupConcatOperationPeriod() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(operation_period SEPARATOR \'|\') as operation_period");
        return this;
    }

    public BasBusinessInfoExample groupConcatRdepartment() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(rdepartment SEPARATOR \'|\') as rdepartment");
        return this;
    }

    public BasBusinessInfoExample groupConcatApprovaDate() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(approva_date SEPARATOR \'|\') as approva_date");
        return this;
    }

    public BasBusinessInfoExample groupConcatUcCode() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(uc_code SEPARATOR \'|\') as uc_code");
        return this;
    }

    public BasBusinessInfoExample groupConcatRadress() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(radress SEPARATOR \'|\') as radress");
        return this;
    }

    public BasBusinessInfoExample groupConcatBscope() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(bscope SEPARATOR \'|\') as bscope");
        return this;
    }

    public BasBusinessInfoExample groupConcatSource() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(source SEPARATOR \'|\') as source");
        return this;
    }

    public BasBusinessInfoExample groupConcatUrl() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(url SEPARATOR \'|\') as url");
        return this;
    }

    public BasBusinessInfoExample groupConcatCtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(ctime SEPARATOR \'|\') as ctime");
        return this;
    }

    public BasBusinessInfoExample groupConcatAtime() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(atime SEPARATOR \'|\') as atime");
        return this;
    }

    public BasBusinessInfoExample groupConcatLon() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(lon SEPARATOR \'|\') as lon");
        return this;
    }

    public BasBusinessInfoExample groupConcatLat() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(lat SEPARATOR \'|\') as lat");
        return this;
    }

    public BasBusinessInfoExample groupConcatProvince() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(province SEPARATOR \'|\') as province");
        return this;
    }

    public BasBusinessInfoExample groupConcatCity() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(city SEPARATOR \'|\') as city");
        return this;
    }

    public BasBusinessInfoExample groupConcatCounty() {
        if(groupConcatList == null){
            groupConcatList = new ArrayList<String>();
        }
        groupConcatList.add("GROUP_CONCAT(county SEPARATOR \'|\') as county");
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
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

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameOldIsNull() {
            addCriterion("cname_old is null");
            return (Criteria) this;
        }

        public Criteria andCnameOldIsNotNull() {
            addCriterion("cname_old is not null");
            return (Criteria) this;
        }

        public Criteria andCnameOldEqualTo(String value) {
            addCriterion("cname_old =", value, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andCnameOldNotEqualTo(String value) {
            addCriterion("cname_old <>", value, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andCnameOldGreaterThan(String value) {
            addCriterion("cname_old >", value, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andCnameOldGreaterThanOrEqualTo(String value) {
            addCriterion("cname_old >=", value, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andCnameOldLessThan(String value) {
            addCriterion("cname_old <", value, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andCnameOldLessThanOrEqualTo(String value) {
            addCriterion("cname_old <=", value, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andCnameOldLike(String value) {
            addCriterion("cname_old like", value, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andCnameOldNotLike(String value) {
            addCriterion("cname_old not like", value, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andCnameOldIn(List<String> values) {
            addCriterion("cname_old in", values, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andCnameOldNotIn(List<String> values) {
            addCriterion("cname_old not in", values, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andCnameOldBetween(String value1, String value2) {
            addCriterion("cname_old between", value1, value2, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andCnameOldNotBetween(String value1, String value2) {
            addCriterion("cname_old not between", value1, value2, "cnameOld");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNull() {
            addCriterion("stock_type is null");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNotNull() {
            addCriterion("stock_type is not null");
            return (Criteria) this;
        }

        public Criteria andStockTypeEqualTo(String value) {
            addCriterion("stock_type =", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotEqualTo(String value) {
            addCriterion("stock_type <>", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThan(String value) {
            addCriterion("stock_type >", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_type >=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThan(String value) {
            addCriterion("stock_type <", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThanOrEqualTo(String value) {
            addCriterion("stock_type <=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLike(String value) {
            addCriterion("stock_type like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotLike(String value) {
            addCriterion("stock_type not like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeIn(List<String> values) {
            addCriterion("stock_type in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotIn(List<String> values) {
            addCriterion("stock_type not in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeBetween(String value1, String value2) {
            addCriterion("stock_type between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotBetween(String value1, String value2) {
            addCriterion("stock_type not between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andAdressIsNull() {
            addCriterion("adress is null");
            return (Criteria) this;
        }

        public Criteria andAdressIsNotNull() {
            addCriterion("adress is not null");
            return (Criteria) this;
        }

        public Criteria andAdressEqualTo(String value) {
            addCriterion("adress =", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotEqualTo(String value) {
            addCriterion("adress <>", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThan(String value) {
            addCriterion("adress >", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThanOrEqualTo(String value) {
            addCriterion("adress >=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThan(String value) {
            addCriterion("adress <", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThanOrEqualTo(String value) {
            addCriterion("adress <=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLike(String value) {
            addCriterion("adress like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotLike(String value) {
            addCriterion("adress not like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressIn(List<String> values) {
            addCriterion("adress in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotIn(List<String> values) {
            addCriterion("adress not in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressBetween(String value1, String value2) {
            addCriterion("adress between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotBetween(String value1, String value2) {
            addCriterion("adress not between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andLegalPersenIsNull() {
            addCriterion("legal_persen is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersenIsNotNull() {
            addCriterion("legal_persen is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersenEqualTo(String value) {
            addCriterion("legal_persen =", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenNotEqualTo(String value) {
            addCriterion("legal_persen <>", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenGreaterThan(String value) {
            addCriterion("legal_persen >", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenGreaterThanOrEqualTo(String value) {
            addCriterion("legal_persen >=", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenLessThan(String value) {
            addCriterion("legal_persen <", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenLessThanOrEqualTo(String value) {
            addCriterion("legal_persen <=", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenLike(String value) {
            addCriterion("legal_persen like", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenNotLike(String value) {
            addCriterion("legal_persen not like", value, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenIn(List<String> values) {
            addCriterion("legal_persen in", values, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenNotIn(List<String> values) {
            addCriterion("legal_persen not in", values, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenBetween(String value1, String value2) {
            addCriterion("legal_persen between", value1, value2, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andLegalPersenNotBetween(String value1, String value2) {
            addCriterion("legal_persen not between", value1, value2, "legalPersen");
            return (Criteria) this;
        }

        public Criteria andRcapitalIsNull() {
            addCriterion("rcapital is null");
            return (Criteria) this;
        }

        public Criteria andRcapitalIsNotNull() {
            addCriterion("rcapital is not null");
            return (Criteria) this;
        }

        public Criteria andRcapitalEqualTo(String value) {
            addCriterion("rcapital =", value, "rcapital");
            return (Criteria) this;
        }

        public Criteria andRcapitalNotEqualTo(String value) {
            addCriterion("rcapital <>", value, "rcapital");
            return (Criteria) this;
        }

        public Criteria andRcapitalGreaterThan(String value) {
            addCriterion("rcapital >", value, "rcapital");
            return (Criteria) this;
        }

        public Criteria andRcapitalGreaterThanOrEqualTo(String value) {
            addCriterion("rcapital >=", value, "rcapital");
            return (Criteria) this;
        }

        public Criteria andRcapitalLessThan(String value) {
            addCriterion("rcapital <", value, "rcapital");
            return (Criteria) this;
        }

        public Criteria andRcapitalLessThanOrEqualTo(String value) {
            addCriterion("rcapital <=", value, "rcapital");
            return (Criteria) this;
        }

        public Criteria andRcapitalLike(String value) {
            addCriterion("rcapital like", value, "rcapital");
            return (Criteria) this;
        }

        public Criteria andRcapitalNotLike(String value) {
            addCriterion("rcapital not like", value, "rcapital");
            return (Criteria) this;
        }

        public Criteria andRcapitalIn(List<String> values) {
            addCriterion("rcapital in", values, "rcapital");
            return (Criteria) this;
        }

        public Criteria andRcapitalNotIn(List<String> values) {
            addCriterion("rcapital not in", values, "rcapital");
            return (Criteria) this;
        }

        public Criteria andRcapitalBetween(String value1, String value2) {
            addCriterion("rcapital between", value1, value2, "rcapital");
            return (Criteria) this;
        }

        public Criteria andRcapitalNotBetween(String value1, String value2) {
            addCriterion("rcapital not between", value1, value2, "rcapital");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNull() {
            addCriterion("etime is null");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNotNull() {
            addCriterion("etime is not null");
            return (Criteria) this;
        }

        public Criteria andEtimeEqualTo(Date value) {
            addCriterionForJDBCDate("etime =", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("etime <>", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("etime >", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("etime >=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThan(Date value) {
            addCriterionForJDBCDate("etime <", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("etime <=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeIn(List<Date> values) {
            addCriterionForJDBCDate("etime in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("etime not in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("etime between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("etime not between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNull() {
            addCriterion("rtime is null");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNotNull() {
            addCriterion("rtime is not null");
            return (Criteria) this;
        }

        public Criteria andRtimeEqualTo(Date value) {
            addCriterionForJDBCDate("rtime =", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("rtime <>", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("rtime >", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rtime >=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThan(Date value) {
            addCriterionForJDBCDate("rtime <", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rtime <=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeIn(List<Date> values) {
            addCriterionForJDBCDate("rtime in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("rtime not in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rtime between", value1, value2, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rtime not between", value1, value2, "rtime");
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

        public Criteria andRbnumberIsNull() {
            addCriterion("rbnumber is null");
            return (Criteria) this;
        }

        public Criteria andRbnumberIsNotNull() {
            addCriterion("rbnumber is not null");
            return (Criteria) this;
        }

        public Criteria andRbnumberEqualTo(String value) {
            addCriterion("rbnumber =", value, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andRbnumberNotEqualTo(String value) {
            addCriterion("rbnumber <>", value, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andRbnumberGreaterThan(String value) {
            addCriterion("rbnumber >", value, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andRbnumberGreaterThanOrEqualTo(String value) {
            addCriterion("rbnumber >=", value, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andRbnumberLessThan(String value) {
            addCriterion("rbnumber <", value, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andRbnumberLessThanOrEqualTo(String value) {
            addCriterion("rbnumber <=", value, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andRbnumberLike(String value) {
            addCriterion("rbnumber like", value, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andRbnumberNotLike(String value) {
            addCriterion("rbnumber not like", value, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andRbnumberIn(List<String> values) {
            addCriterion("rbnumber in", values, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andRbnumberNotIn(List<String> values) {
            addCriterion("rbnumber not in", values, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andRbnumberBetween(String value1, String value2) {
            addCriterion("rbnumber between", value1, value2, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andRbnumberNotBetween(String value1, String value2) {
            addCriterion("rbnumber not between", value1, value2, "rbnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNull() {
            addCriterion("enterprise_type is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNotNull() {
            addCriterion("enterprise_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeEqualTo(String value) {
            addCriterion("enterprise_type =", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotEqualTo(String value) {
            addCriterion("enterprise_type <>", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThan(String value) {
            addCriterion("enterprise_type >", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_type >=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThan(String value) {
            addCriterion("enterprise_type <", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_type <=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLike(String value) {
            addCriterion("enterprise_type like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotLike(String value) {
            addCriterion("enterprise_type not like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIn(List<String> values) {
            addCriterion("enterprise_type in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotIn(List<String> values) {
            addCriterion("enterprise_type not in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeBetween(String value1, String value2) {
            addCriterion("enterprise_type between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotBetween(String value1, String value2) {
            addCriterion("enterprise_type not between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andOcodeIsNull() {
            addCriterion("ocode is null");
            return (Criteria) this;
        }

        public Criteria andOcodeIsNotNull() {
            addCriterion("ocode is not null");
            return (Criteria) this;
        }

        public Criteria andOcodeEqualTo(String value) {
            addCriterion("ocode =", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeNotEqualTo(String value) {
            addCriterion("ocode <>", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeGreaterThan(String value) {
            addCriterion("ocode >", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ocode >=", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeLessThan(String value) {
            addCriterion("ocode <", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeLessThanOrEqualTo(String value) {
            addCriterion("ocode <=", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeLike(String value) {
            addCriterion("ocode like", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeNotLike(String value) {
            addCriterion("ocode not like", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeIn(List<String> values) {
            addCriterion("ocode in", values, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeNotIn(List<String> values) {
            addCriterion("ocode not in", values, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeBetween(String value1, String value2) {
            addCriterion("ocode between", value1, value2, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeNotBetween(String value1, String value2) {
            addCriterion("ocode not between", value1, value2, "ocode");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodIsNull() {
            addCriterion("operation_period is null");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodIsNotNull() {
            addCriterion("operation_period is not null");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEqualTo(String value) {
            addCriterion("operation_period =", value, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodNotEqualTo(String value) {
            addCriterion("operation_period <>", value, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodGreaterThan(String value) {
            addCriterion("operation_period >", value, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("operation_period >=", value, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodLessThan(String value) {
            addCriterion("operation_period <", value, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodLessThanOrEqualTo(String value) {
            addCriterion("operation_period <=", value, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodLike(String value) {
            addCriterion("operation_period like", value, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodNotLike(String value) {
            addCriterion("operation_period not like", value, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodIn(List<String> values) {
            addCriterion("operation_period in", values, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodNotIn(List<String> values) {
            addCriterion("operation_period not in", values, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBetween(String value1, String value2) {
            addCriterion("operation_period between", value1, value2, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodNotBetween(String value1, String value2) {
            addCriterion("operation_period not between", value1, value2, "operationPeriod");
            return (Criteria) this;
        }

        public Criteria andRdepartmentIsNull() {
            addCriterion("rdepartment is null");
            return (Criteria) this;
        }

        public Criteria andRdepartmentIsNotNull() {
            addCriterion("rdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andRdepartmentEqualTo(String value) {
            addCriterion("rdepartment =", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentNotEqualTo(String value) {
            addCriterion("rdepartment <>", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentGreaterThan(String value) {
            addCriterion("rdepartment >", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("rdepartment >=", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentLessThan(String value) {
            addCriterion("rdepartment <", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentLessThanOrEqualTo(String value) {
            addCriterion("rdepartment <=", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentLike(String value) {
            addCriterion("rdepartment like", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentNotLike(String value) {
            addCriterion("rdepartment not like", value, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentIn(List<String> values) {
            addCriterion("rdepartment in", values, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentNotIn(List<String> values) {
            addCriterion("rdepartment not in", values, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentBetween(String value1, String value2) {
            addCriterion("rdepartment between", value1, value2, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andRdepartmentNotBetween(String value1, String value2) {
            addCriterion("rdepartment not between", value1, value2, "rdepartment");
            return (Criteria) this;
        }

        public Criteria andApprovaDateIsNull() {
            addCriterion("approva_date is null");
            return (Criteria) this;
        }

        public Criteria andApprovaDateIsNotNull() {
            addCriterion("approva_date is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaDateEqualTo(Date value) {
            addCriterionForJDBCDate("approva_date =", value, "approvaDate");
            return (Criteria) this;
        }

        public Criteria andApprovaDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("approva_date <>", value, "approvaDate");
            return (Criteria) this;
        }

        public Criteria andApprovaDateGreaterThan(Date value) {
            addCriterionForJDBCDate("approva_date >", value, "approvaDate");
            return (Criteria) this;
        }

        public Criteria andApprovaDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approva_date >=", value, "approvaDate");
            return (Criteria) this;
        }

        public Criteria andApprovaDateLessThan(Date value) {
            addCriterionForJDBCDate("approva_date <", value, "approvaDate");
            return (Criteria) this;
        }

        public Criteria andApprovaDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approva_date <=", value, "approvaDate");
            return (Criteria) this;
        }

        public Criteria andApprovaDateIn(List<Date> values) {
            addCriterionForJDBCDate("approva_date in", values, "approvaDate");
            return (Criteria) this;
        }

        public Criteria andApprovaDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("approva_date not in", values, "approvaDate");
            return (Criteria) this;
        }

        public Criteria andApprovaDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approva_date between", value1, value2, "approvaDate");
            return (Criteria) this;
        }

        public Criteria andApprovaDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approva_date not between", value1, value2, "approvaDate");
            return (Criteria) this;
        }

        public Criteria andUcCodeIsNull() {
            addCriterion("uc_code is null");
            return (Criteria) this;
        }

        public Criteria andUcCodeIsNotNull() {
            addCriterion("uc_code is not null");
            return (Criteria) this;
        }

        public Criteria andUcCodeEqualTo(String value) {
            addCriterion("uc_code =", value, "ucCode");
            return (Criteria) this;
        }

        public Criteria andUcCodeNotEqualTo(String value) {
            addCriterion("uc_code <>", value, "ucCode");
            return (Criteria) this;
        }

        public Criteria andUcCodeGreaterThan(String value) {
            addCriterion("uc_code >", value, "ucCode");
            return (Criteria) this;
        }

        public Criteria andUcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("uc_code >=", value, "ucCode");
            return (Criteria) this;
        }

        public Criteria andUcCodeLessThan(String value) {
            addCriterion("uc_code <", value, "ucCode");
            return (Criteria) this;
        }

        public Criteria andUcCodeLessThanOrEqualTo(String value) {
            addCriterion("uc_code <=", value, "ucCode");
            return (Criteria) this;
        }

        public Criteria andUcCodeLike(String value) {
            addCriterion("uc_code like", value, "ucCode");
            return (Criteria) this;
        }

        public Criteria andUcCodeNotLike(String value) {
            addCriterion("uc_code not like", value, "ucCode");
            return (Criteria) this;
        }

        public Criteria andUcCodeIn(List<String> values) {
            addCriterion("uc_code in", values, "ucCode");
            return (Criteria) this;
        }

        public Criteria andUcCodeNotIn(List<String> values) {
            addCriterion("uc_code not in", values, "ucCode");
            return (Criteria) this;
        }

        public Criteria andUcCodeBetween(String value1, String value2) {
            addCriterion("uc_code between", value1, value2, "ucCode");
            return (Criteria) this;
        }

        public Criteria andUcCodeNotBetween(String value1, String value2) {
            addCriterion("uc_code not between", value1, value2, "ucCode");
            return (Criteria) this;
        }

        public Criteria andRadressIsNull() {
            addCriterion("radress is null");
            return (Criteria) this;
        }

        public Criteria andRadressIsNotNull() {
            addCriterion("radress is not null");
            return (Criteria) this;
        }

        public Criteria andRadressEqualTo(String value) {
            addCriterion("radress =", value, "radress");
            return (Criteria) this;
        }

        public Criteria andRadressNotEqualTo(String value) {
            addCriterion("radress <>", value, "radress");
            return (Criteria) this;
        }

        public Criteria andRadressGreaterThan(String value) {
            addCriterion("radress >", value, "radress");
            return (Criteria) this;
        }

        public Criteria andRadressGreaterThanOrEqualTo(String value) {
            addCriterion("radress >=", value, "radress");
            return (Criteria) this;
        }

        public Criteria andRadressLessThan(String value) {
            addCriterion("radress <", value, "radress");
            return (Criteria) this;
        }

        public Criteria andRadressLessThanOrEqualTo(String value) {
            addCriterion("radress <=", value, "radress");
            return (Criteria) this;
        }

        public Criteria andRadressLike(String value) {
            addCriterion("radress like", value, "radress");
            return (Criteria) this;
        }

        public Criteria andRadressNotLike(String value) {
            addCriterion("radress not like", value, "radress");
            return (Criteria) this;
        }

        public Criteria andRadressIn(List<String> values) {
            addCriterion("radress in", values, "radress");
            return (Criteria) this;
        }

        public Criteria andRadressNotIn(List<String> values) {
            addCriterion("radress not in", values, "radress");
            return (Criteria) this;
        }

        public Criteria andRadressBetween(String value1, String value2) {
            addCriterion("radress between", value1, value2, "radress");
            return (Criteria) this;
        }

        public Criteria andRadressNotBetween(String value1, String value2) {
            addCriterion("radress not between", value1, value2, "radress");
            return (Criteria) this;
        }

        public Criteria andBscopeIsNull() {
            addCriterion("bscope is null");
            return (Criteria) this;
        }

        public Criteria andBscopeIsNotNull() {
            addCriterion("bscope is not null");
            return (Criteria) this;
        }

        public Criteria andBscopeEqualTo(String value) {
            addCriterion("bscope =", value, "bscope");
            return (Criteria) this;
        }

        public Criteria andBscopeNotEqualTo(String value) {
            addCriterion("bscope <>", value, "bscope");
            return (Criteria) this;
        }

        public Criteria andBscopeGreaterThan(String value) {
            addCriterion("bscope >", value, "bscope");
            return (Criteria) this;
        }

        public Criteria andBscopeGreaterThanOrEqualTo(String value) {
            addCriterion("bscope >=", value, "bscope");
            return (Criteria) this;
        }

        public Criteria andBscopeLessThan(String value) {
            addCriterion("bscope <", value, "bscope");
            return (Criteria) this;
        }

        public Criteria andBscopeLessThanOrEqualTo(String value) {
            addCriterion("bscope <=", value, "bscope");
            return (Criteria) this;
        }

        public Criteria andBscopeLike(String value) {
            addCriterion("bscope like", value, "bscope");
            return (Criteria) this;
        }

        public Criteria andBscopeNotLike(String value) {
            addCriterion("bscope not like", value, "bscope");
            return (Criteria) this;
        }

        public Criteria andBscopeIn(List<String> values) {
            addCriterion("bscope in", values, "bscope");
            return (Criteria) this;
        }

        public Criteria andBscopeNotIn(List<String> values) {
            addCriterion("bscope not in", values, "bscope");
            return (Criteria) this;
        }

        public Criteria andBscopeBetween(String value1, String value2) {
            addCriterion("bscope between", value1, value2, "bscope");
            return (Criteria) this;
        }

        public Criteria andBscopeNotBetween(String value1, String value2) {
            addCriterion("bscope not between", value1, value2, "bscope");
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

        public Criteria andLonIsNull() {
            addCriterion("lon is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("lon is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(String value) {
            addCriterion("lon =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(String value) {
            addCriterion("lon <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(String value) {
            addCriterion("lon >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(String value) {
            addCriterion("lon >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(String value) {
            addCriterion("lon <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(String value) {
            addCriterion("lon <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLike(String value) {
            addCriterion("lon like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotLike(String value) {
            addCriterion("lon not like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<String> values) {
            addCriterion("lon in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<String> values) {
            addCriterion("lon not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(String value1, String value2) {
            addCriterion("lon between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(String value1, String value2) {
            addCriterion("lon not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
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

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
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
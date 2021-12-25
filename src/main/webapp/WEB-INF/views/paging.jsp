<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <c:set var="pagetname" value="${empty tname ? (map.datas[0].mytype eq 'per' ? map.datas[0].name : (map.datas[0].mytype eq 'org' ? map.datas[0].comname :(map.datas[0].mytype eq 'noti' ? map.datas[0].ncomname : (map.datas[0].mytype eq 'event' ? map.datas[0].targetname:map.datas[0].title)))) : tname }"></c:set>
	<c:set var="subpagetname" value="${fn:substring(fn:replace(fn:replace(pagetname,'<font>',''),'</font>',''),0,6)}${(fn:length(pagetname) > 6 ? '...' : '')}"></c:set>

	<input type="hidden" id="psourcetype" name="sourcetype" value="${param.sourcetype}" />
	<input type="hidden" id="pchannel" name="channel" value="${param.channel}" />
	<input type="hidden" id="pid" name="id" value="${empty pageid ? (map.datas[0].id) : pageid }" />
	<input type="hidden" id="pmt" name="mt" value="${empty mt ? (map.datas[0].mytype) : mt }" />
	<input type="hidden" id="pscores" name="scores" value="${empty scores ? (map.datas[0].mytype eq 'noti' ? '' :map.datas[0].scores) : scores}" />
	<input type="hidden" id="pct" name="ct" value="${empty ct ? (map.datas[0].mytype eq 'noti' or map.datas[0].mytype eq 'org' ? map.datas[0].comticker : '') : ct }" />
	<input type="hidden" id="ptags" name="tags" value="${fn:substring(empty tags ? (map.datas[0].mytype eq 'noti' ? map.tags : map.datas[0].tags) : tags, 0, 400)}" />
	<input type="hidden" id="ptname" name="tname" value="${subpagetname }" />
	<input type="hidden" id="pkeyword" name="keyword" value="${keyword}" />
	<input type="hidden" id="pcomticker_select" name="comticker_select" value="${comticker_select}" />
	<input type="hidden" id="pdid" name="did" value="${did}" />
	<input type="hidden" id="ppg" name="pg" value="${param.pg}" />
	<input type="hidden" id="tp" value="${tp}" />
	<input type="hidden" name="ctime" id="pctime" value="${ctime}" />
	<input type="hidden" name="csource" id="pcsource" value="${csource}" />
	<input type="hidden" name="cindustry" id="pcindustry" value="${cindustry}" />
	<input type="hidden" name="ctype" id="pctype" value="${ctype}" />
	<input type="hidden" name="cggtype" id="pcggtype" value="${cggtype}" />
	<input type="hidden" name="csex" id="pcsex" value="${csex}" />
	<input type="hidden" name="cprop" id="pcprop" value="${cprop}" />
	<input type="hidden" name="cyan" id="pcyan" value="${cyan}" />
	<input type="hidden" name="gstype" id="pgstype" value="${gstype}" />
	<input type="hidden" name="cmethod" id="pcmethod" value="${cmethod}" />
	<input type="hidden" name="cprice" id="pcprice" value="${cprice}" />
	<input type="hidden" name="carea" id="pcarea" value="${carea}" />
	<input type="hidden" name="cpertype" id="pcpertype" value="${cpertype}" />
	<input type="hidden" name="csourcecategory" id="pcsourcecategory" value="${csourcecategory}" />
	<input type="hidden" name="csc" id="pcsc" value="${csc}" />
	<input type="hidden" name="mctime" id="pmctime" value="${mctime}" />
	<input type="hidden" name="mctype" id="pmctype" value="${mctype}" />
	<input type="hidden" name="mcarea" id="pmcarea" value="${mcarea}" />
	<input type="hidden" name="mcindustry" id="pmcindustry" value="${mcindustry}" />
	<input type="hidden" name="mkeyword" id="pmkeyword" value="${mkeyword}" />
    <div id="pageButton" class="clearfix pageContainer"></div>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
			<c:if test="${param.sourcetype eq 'detail'}">
<c:set var="pagetname" value="${empty tname ? (map.datas[0].mytype eq 'per' ? map.datas[0].name : (map.datas[0].mytype eq 'org' ? map.datas[0].comname :(map.datas[0].mytype eq 'noti' ? map.datas[0].ncomname : (map.datas[0].mytype eq 'event' ? map.datas[0].targetname:map.datas[0].title)))) : tname }"></c:set>
<c:set var="subpagetname" value="${fn:substring(fn:replace(fn:replace(pagetname,'<font>',''),'</font>',''),0,6)}${(fn:length(pagetname) > 6 ? '...' : '')}"></c:set>
<c:set var="pagetags" value="${fn:substring(empty tags ? (map.datas[0].mytype eq 'noti' ? map.tags : map.datas[0].tags) : tags, 0, 400)}"></c:set>
<c:set var="pagescores" value="${empty scores ? (map.datas[0].mytype eq 'noti' ? '' : map.datas[0].scores) : scores }"></c:set>
<c:set var="pagect" value="${empty ct ? (map.datas[0].mytype eq 'noti' or map.datas[0].mytype eq 'org' ? map.datas[0].comticker : '') : ct }"></c:set>
<c:set var="pageid" value="${empty pageid ? (map.datas[0].id) : pageid }"></c:set>
                <input type="hidden" id="pchannel" name="channel" value="${empty channel ? param.channel : channel}" />
                <input type="hidden" id="pmt" name="mt" value="${empty mt ? (map.datas[0].mytype) : mt }" />
				<input type="hidden" id="pscores" name="scores" value="${pagescores}" />
				<input type="hidden" id="pct" name="ct" value="${pagect}" />
				<input type="hidden" id="ptags" name="tags" value="${pagetags}" />
				<input type="hidden" id="ptname" name="tname" value="${subpagetname}" />
				<input type="hidden" id="pkeyword" name="keyword" value="${keyword}" />
				<input type="hidden" id="pid" name="id" value="${pageid}" />
				<input type="hidden" id="psourcetype" name="sourcetype" value="${param.sourcetype}" />
				<input type="hidden" id="ppg" name="pg" value="1" />
            </c:if>
			<script type="text/javascript" src="/search-webapp-service/resources/js/rpaging.js"></script>
			<c:if test="${param.sourcetype ne 'morelist' || param.channel ne 'person' }">
            <div class="poples clearfix" id="per_div"></div>
            </c:if>
            <c:if test="${param.sourcetype ne 'morelist' || param.channel ne 'org' }">
            <div class="organization" id="org_div"></div>
            </c:if>
            <c:if test="${param.sourcetype ne 'morelist' || param.channel ne 'knowledge' }">
            <div class="organization" id="know_div"></div>
            </c:if>
            <c:if test="${param.sourcetype ne 'morelist' || param.channel ne 'event' }">
            <div class="organization" id="event_div"></div>
            </c:if>

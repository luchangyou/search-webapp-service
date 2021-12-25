<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="/WEB-INF/views/common-header.jsp">
	<jsp:param value="研报详情" name="title"/>
</jsp:include>
<c:set var="data" value="${map.datas[0] }"></c:set>
<div class="clearfix w1000">
    <div class="clearfix w590">
        <div class="clearfix w520">
            <div class="clearfix detailTitle">
                 <span>研报</span>
<%--             <a href="javascript:;" onclick="lookGraph('${data.report_type }','${data.id }','${data.comticker }','${data.report_name }','${fn:substring(map.tags,0,400)}');" style="font-style: normal;font-size:14px;color: gray;" class="hHandle">查看关联图</a> --%>
	        </div> 
	        <p class="contentTitle">${data.report_name }</p>
	        <p class="timeStyle">来源：${empty data.source ? "和讯网" : data.source }&nbsp;&nbsp;&nbsp;&nbsp;发布时间：<span name="date">${empty data.publish_time ? "未知" : data.publish_time}</span>
	        &nbsp;&nbsp;&nbsp;&nbsp;<span><a href="${data.url }" target="_blank" style="color:#a9a9a9; text-decoration: underline;">查看原件</a></span>
	        </p>
            <div class="clearfix content">
            	${data.content }
            </div>
        </div>
    </div>
    <div class="clearfix w410">
<%-- 	<jsp:include page="/WEB-INF/views/list-recommendation.jsp"> --%>
<%-- 		<jsp:param value="detail" name="sourcetype"/> --%>
<%-- 	</jsp:include> --%>
	</div>
</div>
<jsp:include page="/WEB-INF/views/common-footer.jsp"></jsp:include>
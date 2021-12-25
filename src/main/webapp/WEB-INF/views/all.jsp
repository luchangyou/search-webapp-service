<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/common-header.jsp">
	<jsp:param value="全部列表" name="title"/>
</jsp:include>
<div class="clearfix w1000">
	<jsp:include page="/WEB-INF/views/list-main.jsp"></jsp:include>
	<div class="clearfix w410">
	<jsp:include page="/WEB-INF/views/list-recommendation.jsp"></jsp:include>
	</div>
</div>
<jsp:include page="/WEB-INF/views/common-footer.jsp"></jsp:include>
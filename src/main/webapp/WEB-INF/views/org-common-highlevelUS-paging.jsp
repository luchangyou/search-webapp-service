<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

				<div class="clearfix selectedType" tag="1">
<table style="width:100%">
    <tbody>
		<tr>
			<th style="text-align: center;" width="15%">姓名</th>
			<th style="text-align: center;" width="15%">性别</th>
			<th style="text-align: center;" width="25%">出生年月</th>
			<th style="text-align: center;" width="20%">学历</th>
			<th style="text-align: center;" width="25%">职位</th>
		</tr>
	</tbody>
	<tbody>
		<c:forEach var="data" items="${highlevelMap.datas}" varStatus="status">
			<tr>
				<td><a href="/search/detail?channel=${data.mytype }&keyword=${keyword }&id=${data.id}">${data.name }</a></td>
				<td>${data.sex }</td>
				<td>${data.birthday }</td>
				<td>${data.degree }</td>
				<td>${data.job }</td>
			</tr>
		</c:forEach>
		<c:if test="${empty highlevelMap.datas}">
			<tr>
				<td colspan="5" style="text-align: center;height:50px;" >没有数据！</td>
			</tr>
		</c:if>
	</tbody>
</table>
		        </div>

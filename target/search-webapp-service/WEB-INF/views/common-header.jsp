<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% 
response.setHeader("Pragma","no-cache");  
response.setHeader("Cache-Control","no-cache");  
response.setDateHeader("Expires", 0);  
%> 
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="cache-control" content="no-cache">
    <title>${param.title }</title>
    <link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/css/layout.css"/>
    <link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/css/search.css"/>
    <script type="text/javascript" src="/search-webapp-service/resources/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="/search-webapp-service/resources/js/moment.min.js"></script>
    <script type="text/javascript" src="/search-webapp-service/resources/js/util.js"></script>
</head>
<body style="letter-spacing:0;line-height:normal;">
<input type="hidden" id="channel" value="${(empty channel ? param.channel : channel)}">
<input type="hidden" id="comticker_select" value="${comticker_select}">
<input type="hidden" id="did" value="${did}">
<!-- <div class="clearfix"> -->
<div class="clearfix header">
    <div class="headerDiv clearfix">
        <div class="clearfix headWidth">
            <a href="/search" class="fl"><img src="/search-webapp-service/resources/images/logo.png"/></a>
            <div class="searchInput">
                <input autocomplete="off" type="text" id="keyword" name="keyword" value="${keyword }" class="defaultFont searchPosition" onfocus="searchInputFocus(this,'大数据')" onblur="searchInputBlur(this,'大数据')"/>
                <span class="searchBtn" onclick="searchDataList($('#channel').val());"><i></i></span>
                <c:if test="${(empty channel ? param.channel : channel) eq 'org' or (empty channel ? param.channel : channel) eq 'affiche' }">
                <div id="result" style="width:454px"></div>
                </c:if>
            </div>
        </div>
    </div>
    <div class="clearfix navDiv">
        <ul class="clearfix">
            <li><a href="javascript:searchChannel(&#39;all&#39;);"<c:if test="${channel == 'all'}"> class="curr"</c:if>>全部</a></li>
			<li><a href="javascript:searchChannel(&#39;event&#39;);"<c:if test="${channel == 'event'}"> class="curr"</c:if>>事件</a></li>
			<li><a href="javascript:searchChannel(&#39;knowledge&#39;);"<c:if test="${channel == 'knowledge'}"> class="curr"</c:if>>知识</a></li>
			<li><a href="javascript:searchChannel(&#39;person&#39;);"<c:if test="${channel == 'person'}"> class="curr"</c:if>>人物</a></li>
			<li><a href="javascript:searchChannel(&#39;org&#39;);"<c:if test="${channel == 'org'}"> class="curr"</c:if>>组织</a></li>
			<li><a href="javascript:searchChannel(&#39;game&#39;);"<c:if test="${channel == 'game'}"> class="curr"</c:if>>产品</a></li>
        </ul>
    </div>
</div>

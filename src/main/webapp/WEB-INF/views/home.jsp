<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
response.setHeader("Pragma","no-cache");  
response.setHeader("Cache-Control","no-cache");  
response.setDateHeader("Expires", 0);  
%> 
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>金桐搜索</title>
    <link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/css/layout.css"/>
    <link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/css/search.css"/>
    <script type="text/javascript" src="/search-webapp-service/resources/js/jquery-1.7.2.min.js"></script>
</head>
<body>
	<input type="hidden" id="channel" name="channel" value="all" />
	<input type="hidden" id="pg" name="pg" value="1" />
	<input type="hidden" id="comticker_select" value="">
	<input type="hidden" id="did" value="">
    <div class="clearfix positionStyle">
        <div class="indexDiv">
            <div class="clearfix mt7"><img src="/search-webapp-service/resources/images/index_logo.png"/></div>
            <div class="clearfix chooseClass">
                <a href="javascript:void(0)" class="curr" value="all">全部</a>
                <a href="javascript:void(0)" value="event">事件</a>
                <a href="javascript:void(0)" value="knowledge">知识</a>
                <a href="javascript:void(0)" value="person">人物</a>
                <a href="javascript:void(0)" value="org">组织</a>
                <a href="javascript:void(0)" value="game">产品</a>
            </div>
            <div class="clearfix mt10 indexInputDiv searchPosition">
                <input autocomplete="off" type="text" id="keyword" name="keyword" class="indexInput defaultFont" value="" onfocus="searchInputFocus(this,'大数据')" onblur="searchInputBlur(this,'大数据')"/>
                <input type="button" class="searchButton" onclick="searchForIndexPage();">
            </div>
                <div id="resultHide" style="width:456px;text-align: left;z-index: 999;display: none;"></div>
        </div>
        <div class="clearfix footer posA">
            <div class="Links">
                <a href="javascript:">云研究</a><label>|</label><a href="javascript:">关于我们</a><label>|</label><a href="javascript:">注册协议</a><label>|</label><a href="javascript:">加入我们</a><label>|</label><a href="javascript:">大事记</a>
            </div>
            <p class="bottomStyle">版权所有 ©金桐网·京ICP证130290京</p>
            <p class="bottomStyle">公网安备11010502024491号 客服热线：000-7000-11</p>
        </div>
    </div>
</body>
<script type="text/javascript" src="/search-webapp-service/resources/js/search.js" charset="utf8">
</script>
<script type="text/javascript">
	$('#channel').val('all');
	$('#keyword').val('');
</script>
</html>

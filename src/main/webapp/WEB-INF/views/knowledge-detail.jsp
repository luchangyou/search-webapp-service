<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="/WEB-INF/views/common-header.jsp">
	<jsp:param value="知识详情" name="title"/>
</jsp:include>
<c:set var="data" value="${map.datas[0] }"></c:set>
<div class="clearfix secondNav">
    <ul class="secondNavUl clearfix">
        <li><a href="javascript:;" class="curr">新闻动态</a></li>
        <li><a href="javascript:;">最新公告</a></li>
        <li><a href="javascript:;">基本知识</a></li>
        <li><a href="javascript:;">法律法规</a></li>
        <li><a href="javascript:;">经典案例</a></li>
        <li><a href="javascript:;">金融产品</a></li>
        <li><a href="javascript:;">专业图书</a></li>
        <li><a href="javascript:;">展会信息</a></li>
        <li><a href="javascript:;">名人名言</a></li>
        <li><a href="javascript:;">常用图书</a></li>
        <li class="last"><a href="javascript:;">技术前沿</a></li>
    </ul>
</div>
<div class="clearfix w1000 mt0">
    <div class="clearfix w590">
        <div class="clearfix w520">
            <div class="clearfix detailTitle"><span>基本资料</span><a href="javascript:;" onclick="lookGraph('${data.mytype }','${data.id }','${data.comticker }','${data.title }','${fn:substring(data.tags,0,400)}');" style="font-style: normal;font-size:14px;color: gray;" class="hHandle">查看关联图</a></div>
            <center>
            <h3>${basKnowledgeInfo.title }</h3>
            <p class="sourceAndTime">来源：${empty basKnowledgeInfo.source ? "未知" : basKnowledgeInfo.source }&nbsp;&nbsp;&nbsp;&nbsp;发布时间：<span name="date">${empty basKnowledgeInfo.ptime ? (empty basKnowledgeInfo.ctime ? "未知" : basKnowledgeInfo.ctime) : basKnowledgeInfo.ptime}</span></p>
            </center>
            <div class="clearfix content">
            	${fn:replace(basKnowledgeInfo.main,"<p>　　","<p>") }
            </div>
        </div>
    </div>
    <div class="clearfix w410">
	<jsp:include page="/WEB-INF/views/list-recommendation.jsp">
		<jsp:param value="detail" name="sourcetype"/>
	</jsp:include>
	</div>
</div>
<jsp:include page="/WEB-INF/views/common-footer.jsp"></jsp:include>
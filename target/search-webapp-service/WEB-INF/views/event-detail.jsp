<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="/WEB-INF/views/common-header.jsp">
	<jsp:param value="事件详情" name="title"/>
</jsp:include>
<c:set var="data" value="${map.datas[0] }"></c:set>
<div class="clearfix secondNav">
    <!-- <ul class="secondNavUl clearfix">
        <li><a href="javascript:;" class="curr">最新事件</a></li>
        <li><a href="javascript:;">产品交易</a></li>
        <li><a href="javascript:;">医疗</a></li>
        <li><a href="javascript:;">住房</a></li>
        <li class="last"><a href="javascript:;">招聘</a></li>
    </ul> -->
</div>
<div class="clearfix w1000 mt0">
    <div class="clearfix w590">
        <div class="clearfix w520">
            <div class="clearfix detailTitle"><span>基本资料</span>
            <a href="${data.url}"  target="_blank" style="font-style: normal;font-size:14px;color: gray;" class="hHandle"></a><a href="javascript:;" onclick="lookGraph('${data.mytype }','${data.id }','${data.comticker }','${data.targetname }','${fn:substring(data.tags,0,400)}');" style="font-style: normal;font-size:14px;color: gray;" class="hHandle"></a></div>
           
            <!-- 投融资事件  -->
            <c:if test="${!empty eventInvestfinace}">
	            <div class="clearfix detailContent">
		            <ul class="clearfix personageUl">
		                <li class="clearfix">
		                    <label>标的名称</label>
		                    <span>${basEventInfo.title }</span>
		                </li>
		                <li class="clearfix">
		                    <label>融资方</label>
		                    <span>${eventInvestfinace.financiers }</span>
		                </li>
		                <li class="clearfix">
		                    <label>时间</label>
		                    <span>${eventInvestfinace.time  }</span>
		                </li>
		                <li class="clearfix">
		                    <label>所属行业</label>
		                    <span>${eventInvestfinace.industry  }</span>
		                </li>
		                <li class="clearfix">
		                    <label>经济性质</label>
		                    <span>${eventInvestfinace.classLb  }</span>
		                </li>
		                <li class="clearfix">
		                    <label>地区</label>
		                    <span>${eventInvestfinace.domain  }</span>
		                </li>
		                <li class="clearfix">
		                    <label>轮次</label>
		                    <span>${eventInvestfinace.round  }</span>
		                </li>
						<li class="clearfix">
							<label>额度</label>
							<span>${eventInvestfinace.quota  }</span>
						</li>
						<li class="clearfix">
							<label>投资方</label>
							<span>${eventInvestfinace.investors  }</span>
						</li>
						<li class="clearfix">
							<label>项目类别</label>
							<span>${basEventInfo.type }</span>
						</li>
		            </ul>
		        </div>
	        </c:if>
	        
	        <!-- 招聘事件  -->
	        <c:if test="${!empty eventRecruit}">
	            <div class="clearfix detailContent">
		            <ul class="clearfix personageUl">
		                <li class="clearfix">
		                    <label>标的名称</label>
		                    <span>${basEventInfo.title }</span>
		                </li>
		                <li class="clearfix">
		                    <label>招聘组织</label>
		                    <span>${eventRecruit.name }</span>
		                </li>
		                <li class="clearfix">
		                    <label>薪酬</label>
		                    <span>${eventRecruit.salary  }</span>
		                </li>
		                <li class="clearfix">
		                    <label>所在地区</label>
		                    <span>${eventRecruit.domain  }</span>
		                </li>
		                <li class="clearfix">
		                    <label>学历要求</label>
		                    <span>${eventRecruit.education  }</span>
		                </li>
		                <li class="clearfix">
		                    <label>工作经验</label>
		                    <span>${eventRecruit.workexp  }</span>
		                </li>
		                <li class="clearfix">
		                    <label>数据来源</label>
		                    <span>${eventRecruit.source  }</span>
		                </li>
		                <li class="clearfix">
		                    <label>描述</label>
		                    <span>${eventRecruit.abs  }</span>
		                </li>
		            </ul>
		        </div>
	        </c:if>
	        
	        <!-- 并购事件  -->
	        <c:if test="${!empty eventMerger}">
	            <div class="clearfix detailContent">
		            <ul class="clearfix personageUl">
		                <li class="clearfix">
		                    <label>标的名称</label>
		                    <span>${basEventInfo.title }</span>
		                </li>
		                <li class="clearfix">
		                    <label>被收购方</label>
		                    <span>${eventMerger.acquiree }</span>
		                </li>
		                <li class="clearfix">
		                    <label>时间</label>
		                    <span>${eventMerger.time }</span>
		                </li>
		                <li class="clearfix">
		                    <label>所属行业</label>
		                    <span>${eventMerger.industry }</span>
		                </li>
		                <li class="clearfix">
		                    <label>类别</label>
		                    <span>${eventMerger.classLb }</span>
		                </li>
		                <li class="clearfix">
		                    <label>地区</label>
		                    <span>${eventMerger.domain }</span>
		                </li>
		                <li class="clearfix">
		                    <label>股权比例</label>
		                    <span>${eventMerger.equity }</span>
		                </li>
		                <li class="clearfix">
		                    <label>额度</label>
		                    <span>${eventMerger.quota }</span>
		                </li>
		                <li class="clearfix">
		                    <label>收购方</label>
		                    <span>${eventMerger.buyers }</span>
		                </li>
		            </ul>
		        </div>
	        </c:if>
	        
	        <!-- 法律事件 -->
	        <c:if test="${!empty eventLaw}">
	            <div class="clearfix detailContent">
		            <ul class="clearfix personageUl">
		                <li class="clearfix">
		                    <label>标的名称</label>
		                    <span>${basEventInfo.title }</span>
		                </li>
		                <li class="clearfix">
		                    <label>法院</label>
		                    <span>${eventLaw.court }</span>
		                </li>
		                <li class="clearfix">
		                    <label>裁判文书类型</label>
		                    <span>${eventLaw.type }</span>
		                </li>
		                <li class="clearfix">
		                    <label>案号</label>
		                    <span>${eventLaw.caseid }</span>
		                </li>
		                <li class="clearfix">
		                    <label>关联组织</label>
		                    <span>${eventLaw.related }</span>
		                </li>
		                <li class="clearfix">
		                    <label>裁判文书网链接</label>
		                    <span>${eventLaw.urlwenshu }</span>
		                </li>
		                <li class="clearfix">
		                    <label>发布时间</label>
		                    <span>${eventLaw.pulishtime }</span>
		                </li>
		                <li class="clearfix">
		                    <label>原文</label>
		                    <span>${eventLaw.content }</span>
		                </li>
		            </ul>
		        </div>
	        </c:if>

			<!-- 活动事件 -->
			<c:if test="${!empty eventActivity}">
				<div class="clearfix detailContent">
					<ul class="clearfix personageUl">
						<li class="clearfix">
							<label>活动标题</label>
							<span>${eventActivity.name }</span>
						</li>
						<li class="clearfix">
							<label>活动时间</label>
							<span>${eventActivity.time }</span>
						</li>
						<li class="clearfix">
							<label>相关链接</label>
							<span>${eventActivity.url }</span>
						</li>
						<li class="clearfix">
							<label>主办方</label>
							<span>${eventActivity.sponsor }</span>
						</li>
						<li class="clearfix">
							<label>地址</label>
							<span>${eventActivity.location }</span>
						</li>
						<li class="clearfix">
							<label>城市</label>
							<span>${eventActivity.city }</span>
						</li>

					</ul>
				</div>
			</c:if>
        </div>
    </div>
    <div class="clearfix w410">
	<jsp:include page="/WEB-INF/views/list-recommendation.jsp">
		<jsp:param value="detail" name="sourcetype"/>
	</jsp:include>
	</div>
</div>
<jsp:include page="/WEB-INF/views/common-footer.jsp"></jsp:include>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:include page="/WEB-INF/views/common-header.jsp">
	<jsp:param value="人物详情" name="title"/>
</jsp:include>
<c:set var="data" value="${map.datas[0] }"></c:set>
<c:set var="comwithper" value="${map.orgMap }"></c:set>
<div class="clearfix w1000">
    <div class="clearfix w590">
        <div class="clearfix w520">
	        <div class="clearfix detailTitle"><span>基本资料</span>
<%--
				<a href="javascript:;" onclick="lookGraph('${data.mytype }','${data.id }','${data.comticker }','${data.name }','${fn:substring(data.tags,0,400)}');" style="font-style: normal;font-size:14px;color: gray;" class="hHandle">查看关联图</a>
--%>
				<a href="${pageContext.request.contextPath}/person/createPerExcel?uuid=${basPersonInfo.uuid }" style="font-style: normal;font-size:14px;color: gray;" class="hHandle">导出</a>
			</div>
	        <div class="clearfix detailContent">
	        <%-- 上市公司员工 --%>
	            <div class="detailTop clearfix">
	                <ul class="detailTopLeft">
	                    <li><label>姓　　名</label><span>${basPersonInfo.name }</span></li>
	                    <li><label>性　　别</label><span>${basPersonInfo.sex }</span></li>
	                    <li><label>出生日期  </label><span><fmt:formatDate value="${basPersonInfo.birthday }" pattern="yyyy-MM-dd" /></span></li>
	                    <li><label>年　　龄</label><span>${basPersonInfo.age}</span></li>
	                    <li class="noBorder"><label>国　　籍</label><span>${basPersonInfo.country}</span></li>
	                </ul>
	                <div class="detailTopRight"><img src="/search-webapp-service/resources/images/default.jpg"/></div>
	            </div>
	            <ul class="clearfix personageUl">
	            	<li class="clearfix"><label>民　　族</label><span>${basPersonInfo.nation}</span></li>
	            	<li class="clearfix"><label>籍　　贯</label><span>${basPersonInfo.hometown }</span></li>
	            	<li class="clearfix"><label>政治面貌</label><span></span></li>
	            	<li class="clearfix"><label>学　　校</label><span>${perEducationInfo.school }</span></li>
	            	<li class="clearfix"><label>专　　业</label><span>${perEducationInfo.major }</span></li>
	            	<li class="clearfix"><label>学　　历</label><span>${perEducationInfo.diploma}</span></li>
	            	<li class="clearfix"><label>学　　位</label><span>${perEducationInfo.diploma }</span></li>
	            	<li class="clearfix"><label>职　　称</label><span>--</span></li>
	                <li class="clearfix"><label>手　　机</label><span>${basPersonInfo.conWay }</span></li>
	                <li class="clearfix"><label>E-mail</label><span>--</span></li>
	                <li class="clearfix"><label>个人主页</label><span>${basPersonInfo.url}</span></li>
	                <li class="clearfix"><label>证件号码</label><span>--</span></li>
	                <li class="clearfix"><label>是否结婚</label><span>${basPersonInfo.maritalStatus}</span></li>
	                <li class="clearfix"><label>证件类型</label><span>--</span></li>
	                <li class="clearfix"><label>所属行业</label><span>--</span></li>
	                <li class="clearfix"><label>个人信仰</label><span>${data.belief}</span></li>
	                <li class="clearfix"><label>爱　　好</label><span>${data.hobby}</span></li>
	                <li class="clearfix"><label>公司名称</label><span>${perWorkInfo.oname }</span></li>
	                <li class="clearfix"><label>公司股票代码</label><span>--</span></li>
	                <li class="clearfix"><label>职　　务</label><span>${perWorkInfo.job }</span></li>
	                <li class="clearfix"><label>任职开始日期</label><span>${perWorkInfo.startTime}</span></li>
	                <li class="clearfix"><label>任职结束日期</label><span>${perWorkInfo.endTime}</span></li>
	                <li class="clearfix"><label>所在分公司(营业部)</label><span>${perWorkInfo.department}</span></li>
	                <li class="clearfix"><label>公司网址</label><span>${data.comweb  }</span></li>
	                <li class="clearfix"><label>公司类型</label><span>${data.comtype  }</span></li>
	                <li class="clearfix"><label>工作所在地域</label><span>${data.practiceregional}</span></li>
	                <li class="clearfix"><label>办公地址</label><span>${data.officeaddress  }</span></li>
	                <li class="clearfix"><label>公司邮编</label><span>${data.comzipcode  }</span></li>
	                <li class="clearfix"><label>公司传真</label><span>${data.comfax  }</span></li>
	                <li class="clearfix"><label>公司电话</label><span>${data.comtel  }</span></li>
	            </ul>
	            <div class="peopleInfo clearfix">个人资料</div>
	            <div class="clearfix peopleInfoDetail">
	                ${data.introduction }
	            </div>
	            <div class="peopleInfo clearfix">个人简介</div>
	            <div class="clearfix peopleInfoDetail">
	                ${basPersonInfo.pDesc }
	            </div>
	            <div class="peopleInfo clearfix">教育经历</div>
	            <div style="">
		            <div class="orgTh clearfix"><span class="orgSpan11">学校名称</span><span class="orgSpan22">专业</span><span class="orgSpan33">开始时间</span><span class="orgSpan33">结束时间</span></div>
		            <div class="clearfix mb50">
		            	<c:forEach var="edu" items="${perEducationInfoList}">
		                <div class="clearfix"><span class="orgSpan11" title="${edu.school}">${edu.school}&nbsp;</span><span class="orgSpan22" title="${edu.major}">${edu.major}&nbsp;</span><span class="orgSpan33">${edu.startDate}&nbsp;</span><span class="orgSpan33">${edu.endDate}</span></div>
		            	</c:forEach>
		            </div>
	            </div>
	            <div class="peopleInfo clearfix">工作经历</div>
	            <div class="orgList clearfix" style="">
	                <div class="orgTh clearfix"><span class="orgSpan11">组织名称</span><span class="orgSpan22">职务</span><span class="orgSpan33">开始时间</span><span class="orgSpan33">结束时间</span></div>
	                <div class="clearfix">
	                	<c:forEach var="work" items="${perWorkInfoList }">
	                    <div class="clearfix"><span class="orgSpan11" title="${work.oname}">${work.oname}&nbsp;</span><span class="orgSpan22" title="${work.job}">${work.job}&nbsp;</span><span class="orgSpan33">${work.startTime}&nbsp;</span><span class="orgSpan33">${work.endTime}</span></div>
	                    </c:forEach>
	                </div>
	            </div>
	            <div class="peopleInfo clearfix">人物知识</div>
	            <div class="orgList clearfix" style="">
	                <div class="orgTh clearfix"><span class="orgSpan33">姓名</span><span class="orgSpan22">产品名</span><span class="orgSpan33">关系类型</span><span class="orgSpan33">关系权重</span><span class="orgSpan33">权重描述</span></div>
		                <div class="clearfix">
		                	<c:forEach var="know" items="${perKnowledgeList }">
			                    <div class="clearfix">
			                    	<span class="orgSpan33" title="${know.name}"><a href="${pageContext.request.contextPath}/knowledge/detail?uuid=${know.kuuid}">${know.name}</a>&nbsp;</span>
			                    	<span class="orgSpan22" title="${know.kname}">${know.kname}&nbsp;</span>
			                    	<span class="orgSpan33">${know.rtype}&nbsp;</span>
			                    	<span class="orgSpan33">${know.rgrade}</span>
			                    	<span class="orgSpan33">${know.rpDesc}</span>
			                    </div>
		                    </c:forEach>
		                </div>
	            	</div>
	        	</div>
	        	<div class="peopleInfo clearfix">人物组织</div>
	            <div class="orgList clearfix" style="">
	                <div class="orgTh clearfix"><span class="orgSpan33">组织名称</span><span class="orgSpan22">组织描述</span><span class="orgSpan33">关系类型</span><span class="orgSpan33">关系权重</span><span class="orgSpan33">权重描述</span></div>
		                <div class="clearfix">
		                	<c:forEach var="org" items="${perOrganizeList }">
			                    <div class="clearfix">
			                    	<span class="orgSpan33" title="${org.oname}"><a href="${pageContext.request.contextPath}/organize/detail?uuid=${org.ouuid}&keyword=${keyword}">${org.oname}</a>&nbsp;</span>
			                    	<span class="orgSpan22" title="${org.orgDesc}">${org.orgDesc}&nbsp;</span>
			                    	<span class="orgSpan33">${org.rtype}&nbsp;</span>
			                    	<span class="orgSpan33">${org.rgrade}</span>
			                    	<span class="orgSpan33">${org.rgDesc}</span>
			                    </div>
		                    </c:forEach>
		                </div>
	            	</div>
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
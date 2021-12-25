<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:include page="/WEB-INF/views/common-header.jsp">
	<jsp:param value="组织详情" name="title"/>
</jsp:include>



<c:set var="data" value="${map.datas[0] }"></c:set>
<c:set var="comwithper" value="${map.orgMap }"></c:set>
<input id="ct" type="hidden" value="${data.comticker}" />
<input id="comname" type="hidden" value="${data.comname }" />

<script src="/search-webapp-service/resources/js/highstock.js"></script>
<script src="/search-webapp-service/resources/js/chartExt.js"></script>
<script src="/search-webapp-service/resources/js/My97DatePicker/WdatePicker.js"></script>

<link rel="stylesheet" href="/search-webapp-service/resources/component/easytab/css/lrtk.css" type="text/css" />
<script type="text/javascript" src="/search-webapp-service/resources/component/easytab/js/js.js"></script>
<script type="text/javascript" src="/search-webapp-service/resources/component/layer/layer.js"></script>


<script type="text/javascript">




var currentIndex=0;
$(function() {
	initTab(function(index){
		currentIndex=index;
		
	});
	
	initChartData("hangqing");
	initChartData("hangqing_week");
	initChartData("hangqing_month");
	
});





function initChartData(dataType){
	
	$.get("getHangQingData",{
		"stockId":"${data.comticker}",
		"dataType":dataType
	},function(data){
		
		var chartId="container";
		var reportId="report";
		var chartType="dayChart"
		if(dataType=="hangqing_week"){
			chartId="wcontainer";
			reportId="wreport";
			chartType="weekChart";
			$("#zhouLoadgif").hide();
		}
		
		if(dataType=="hangqing_month"){
			chartId="ycontainer";
			reportId="yreport";
			chartType="monthChart";
			$("#yueLoadgif").hide();
		}
	
		
		if(dataType=="hangqing"){
			
			$("#riLoadgif").hide();
		}
		var chartData=eval("("+data+")");
		
		if(chartData.size>0){
			 highStockChart(chartId,reportId,chartData,[],chartType);
		}else{
			
		         var emptyStr="<table style=\"width:100%;height:100%\">"+
					    "<tbody>"+
						"<tr>"+
							"<td style=\"text-align: center;height:120px;\">没有数据！</td>"+
						"</tr>"+
						"</tbody>"+
					"</table>";
					
					$("#"+chartId).html(emptyStr);
					$("#"+reportId).html("");
		}
		
		 $(".cur").click();
	});
	
	
}

function loadDataByTime(){

	
	
	var beginDate=$("#beginDate").val();
	var endDate=$("#endDate").val();
	
	
	if(!beginDate){
		layer.msg("开始时间不能为空");
		return;
	}
	
	
	if(!endDate){
		layer.msg("束时间不能为空");
		return;
	}
	
	var days=getDays(beginDate,endDate);
	if(days<0){
		layer.msg("开始日期不能大于结束日期");
		return;
	}
	
	
	if(currentIndex==0&&days>300){
		layer.msg("日K查询不能超过300天");
		return;
	}
	
	if(currentIndex==1&&days>7*300){
		layer.msg("周K查询不能超过300周");
		return;
	}
	
	if(currentIndex==2&&days>30*300){
		layer.msg("月K查询不能超过30月");
		return;
	}
	
	var dataType="hangqing";
	
	var chartType="dayChart";
	if(currentIndex==1){
		dataType="hangqing_week";
		chartType="weekChart";
		$("#zhouLoadgif").show();
	}
	if(currentIndex==2){
		dataType="hangqing_month";
		chartType="monthChart";
		$("#yueLoadgif").show();
	}
	
	if(currentIndex==0){
		dataType="hangqing";
		chartType="dayChart";
		$("#riLoadgif").show();
	}
	
	

	$.get("getHangQingData",{
		"beginDate":beginDate,
		"endDate":endDate,
		"stockId":"${data.comticker}",
		"dataType":dataType
	},function(data){
		
		var chartId="container";
		var reportId="report";
		if(currentIndex==1){
			chartId="wcontainer";
			reportId="wreport";
			$("#zhouLoadgif").hide();
		}
		
		if(currentIndex==2){
			chartId="ycontainer";
			reportId="yreport";
			$("#yueLoadgif").hide();
		}
	
		
		if(currentIndex==0){
			
			$("#riLoadgif").hide();
		}
		var chartData=eval("("+data+")");
		
		if(chartData.size>0){
			 highStockChart(chartId,reportId,chartData,[],chartType);
		}else{
			
		         var emptyStr="<table style=\"width:100%;height:100%\">"+
					    "<tbody>"+
						"<tr>"+
							"<td style=\"text-align: center;height:120px;\">没有数据！</td>"+
						"</tr>"+
						"</tbody>"+
					"</table>";
					
					$("#"+chartId).html(emptyStr);
					$("#"+reportId).html("");
		}
		
		$("#loadgif").hide();
		 
	});
	
}


function getDays(strDateStart,strDateEnd){
	   var strSeparator = "-"; //日期分隔符
	   var oDate1;
	   var oDate2;
	   var iDays;
	   oDate1= strDateStart.split(strSeparator);
	   oDate2= strDateEnd.split(strSeparator);
	   var strDateS = new Date(oDate1[0], oDate1[1]-1, oDate1[2]);
	   var strDateE = new Date(oDate2[0], oDate2[1]-1, oDate2[2]);
	   iDays = parseInt((strDateE- strDateS) / 1000 / 60 / 60 /24) 
	   return iDays ;
}


</script>



<div class="clearfix" style="width:1100px;margin:103px auto 0;">
    <div class="clearfix" style="width:800px;float: left;">
        <div class="clearfix" style="width:750px;float: left;">
	        <%-- <div class="clearfix detailTitle"><span>基本资料</span><a href="javascript:;" onclick="lookGraph('${data.mytype }','${data.id }','${data.comticker }','${data.comname }','${fn:substring(data.tags,0,400)}');" style="font-style: normal;font-size:14px;color: gray;" class="hHandle">查看关联图</a></div> --%>
	        <div class="clearfix detailContent">
	        <script type="text/javascript">
	        	function changeOrgModule(obj, moduleName){
	        		$(obj).parent().parent().parent().parent().find("td").css("color","#3e3e3e");
	        		$(obj).css("color","#f39800");
	        		$("[class^='orgDetailModule']").each(function(){
	        			$(this).hide();
	        		});
	        		$(".orgDetailModule"+moduleName).show();
	        	}
	        </script>
	        <div class="menuList" style="width:100px;float: left;">
        		<table>
        			<tbody>
        			<tr><th>公司概况</th></tr>
        			<tr><td onclick="changeOrgModule(this,'Summary');" style="color: #f39800">基本资料</td></tr>
        			
        			<tr><td onclick="changeOrgModule(this,'Businesspeople');">公司高管</td></tr>
        			<c:if test="${data.sourceid eq '001001002' and data.sourcecategory ne '总公司' or data.sourceid eq '001001003' and data.sourcecategory eq '分支机构'}">
        			<tr><td onclick="changeOrgModule(this,'Highlevel');">从业人员</td></tr>
        			</c:if>
        			
        			<tr><td class="Businessshareholder" onclick="changeOrgModule(this,'Businessshareholder');">公司股东</td></tr>
        			
        			<c:if test="${fn:startsWith(data.sourceid, '001001001')}">
        			<tr><td onclick="changeOrgModule(this,'Noti');">公司公告</td></tr>
        			<tr><td onclick="changeOrgModule(this,'Financial');">公司财报</td></tr>
        			<tr><td onclick="changeOrgModule(this,'Yanbao');">公司研报</td></tr>
        			</c:if>
        			
        			<c:if test="${((data.sourceid eq '001001002' or fn:startsWith(data.sourceid, '001001001') or data.sourceid eq '001003') and data.sourcecategory eq '总公司') or data.sourceid eq '001001003' and data.sourcecategory eq '期货公司' }">
        			<tr><td onclick="changeOrgModule(this,'Fzjg');">分支机构</td></tr>
        			</c:if>
        			
        			<tr><td onclick="changeOrgModule(this,'Businesschange');">变更信息</td></tr>
        			<tr><td onclick="changeOrgModule(this,'ComWechat');">公众号</td></tr>
        			
        			</tbody>
        		</table>
        		<c:if test="${fn:startsWith(data.sourceid, '001001001') or data.sourceid eq '001003'}">
        		<table>
        			<tbody>
        			<tr><th>行政奖罚</th></tr>
        			<tr><td onclick="changeOrgModule(this,'Jyyc');">经营异常</td></tr>
        			<tr><td onclick="changeOrgModule(this,'Ccxx');">抽查检查</td></tr>
        			</tbody>
        		</table>
        		</c:if>
        		<table>
        			<tbody>
        			<tr><th>知识产权</th></tr>
        			<tr><td onclick="changeOrgModule(this,'Chanquan');">专利信息</td></tr>
        			<tr><td onclick="changeOrgModule(this,'ComIcp');">网站备案</td></tr>
        			<tr><td onclick="changeOrgModule(this,'ComSoftwarecopyright');">著作权</td></tr>
        			<tr><td onclick="changeOrgModule(this,'ComTminfo');">商标</td></tr>
        			<tr><td onclick="changeOrgModule(this,'ComCopyrightwork');">作品著作权</td></tr>
        			</tbody>
        		</table>
        		
        		<table>
        			<tbody>
        			<tr><th>行情数据</th></tr>
        			<tr><td onclick="changeOrgModule(this,'HangQing');">K线图</td></tr>
        			</tbody>
        		</table>
        		
        		<table>
        			<tbody>
        			<tr><th>工商数据</th></tr>
        			<tr><td onclick="changeOrgModule(this,'Businessinfo');">基本信息</td></tr>
        			<tr><td onclick="changeOrgModule(this,'Businessshareholder');">股东信息</td></tr>
        			<tr><td onclick="changeOrgModule(this,'Businesspeople');">主要人员</td></tr>
        			<tr><td onclick="changeOrgModule(this,'Businesschange');">变更记录</td></tr>
        			<tr><td onclick="changeOrgModule(this,'GameInfo');">公司产品</td></tr>
        			<tr><td onclick="changeOrgModule(this,'EventRecruit');">招聘事件</td></tr>
        			<tr><td onclick="changeOrgModule(this,'EventLaw');">法律事件</td></tr>
        			<tr><td onclick="changeOrgModule(this,'EventInvestfinace');">投融资事件</td></tr>
        			<tr><td onclick="changeOrgModule(this,'EventMerger');">并购事件</td></tr>
        			<tr><td onclick="changeOrgModule(this,'OrgOrganize');">关联组织</td></tr>
        			<tr><td onclick="changeOrgModule(this,'OrgPerson');">关联人物</td></tr>
        			<tr><td onclick="changeOrgModule(this,'Investment');">对外投资</td></tr>
        			<tr><td onclick="changeOrgModule(this,'OrgKnowledge');">知识</td></tr>
					<tr><td onclick="changeOrgModule(this,'Equitypledgedpagenum');">股权出质</td></tr>
					<tr><td onclick="changeOrgModule(this,'Abnormaloperation');">经营异常</td></tr>
        			</tbody>
        		</table>
        	</div>
        	<div id="orgDetailMainDiv" style="width:650px;float: left;font-size: 14px">
	        	<div class="fixedOrgDetailTitle">
	        		<span class="comName">
	        		<c:if test="${not empty data.comname }">
	                	${data.comname }
	                </c:if>
	        		<c:if test="${empty data.comname }">
	                	${data.nameen }
	                </c:if>
	                </span>
	        		<c:if test="${not empty data.comticker }">
	                	<span>[${data.comticker }]</span>
	                </c:if>
	                <a href="javascript:;" onclick="lookOrgEventGraph('${basOrganizeInfo.uuid }');" style="font-style: normal;font-size:14px;color: gray;" class="hHandle">事件</a>
	                <%--<a href="javascript:;" onclick="lookOrgImgGraph('${basOrganizeInfo.uuid }');" style="font-style: normal;font-size:14px;color: gray;" class="hHandle">图谱</a>--%>
	                <a href="javascript:;" onclick="orgImgGraph('${basOrganizeInfo.uuid }');" style="font-style: normal;font-size:14px;color: gray;" class="hHandle">图谱</a>
					<a href="${pageContext.request.contextPath}/organize/createOrgExcel?uuid=${basOrganizeInfo.uuid }" style="font-style: normal;font-size:14px;color: gray;" class="hHandle">导出</a>
				</div>

				<input type="hidden" name="basBusinessInfo" value=""/>

	        	<!-- 工商数据 -->
	            <table class="orgDetailModuleBusinessinfo" style="display:none;">
	                <tr class="clearfix"><td class="leftWidth">公司全称</td><td>${empty basBusinessInfo.cname ? '--':basBusinessInfo.cname}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司英文名称</td><td>${empty basOrganizeInfo.ename ? '--':basOrganizeInfo.ename}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">工商注册号</td><td>${empty basBusinessInfo.rbnumber ? '--':basBusinessInfo.rbnumber}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司股票代码</td><td>${empty basBusinessInfo.stockCode ? '--':basBusinessInfo.stockCode}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">股票简称</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司简称</td><td>${empty basOrganizeInfo.shortname ? '--':basOrganizeInfo.shortname}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司曾用名</td><td>${empty basBusinessInfo.cnameOld ? '--':basBusinessInfo.cnameOld}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">法定代表人</td><td>${empty basBusinessInfo.legalPersen ? '--':basBusinessInfo.legalPersen}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司传真</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司邮编</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司电话</td><td>${empty basBusinessInfo.telephone ? '--':basBusinessInfo.telephone}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司网站</td><td>${empty basBusinessInfo.web ? '--':basBusinessInfo.web}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">成立日期</td><td>${empty basBusinessInfo.etime ? '--':basBusinessInfo.etime}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司性质</td><td>${empty basBusinessInfo.enterpriseType ? '--':basBusinessInfo.enterpriseType}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">注册资本（万元）</td><td>${empty basBusinessInfo.rcapital ? '--':basBusinessInfo.rcapital}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司办公地址</td><td>${empty basBusinessInfo.adress ? '--':basBusinessInfo.adress}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司注册地址</td><td>${empty basBusinessInfo.radress ? '--':basBusinessInfo.radress}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">所属行业</td><td>${empty basBusinessInfo.industry ? '--':basBusinessInfo.industry}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">上市时间</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">流通股本<c:if test="${fn:contains(data.transferableshares,'万股') }">（万股）</c:if></td><td>${fn:replace(data.transferableshares,'万股','') }</td></tr>
	                <tr class="clearfix"><td class="leftWidth">发行时间</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">发行数量<c:if test="${data.sourceid ne '001001001003' }">（万股）</c:if></td><td>${fn:replace(data.issuenum,'万股','') }</td></tr>
	                <tr class="clearfix"><td class="leftWidth">发行价格（元）</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">发行市盈率（倍）</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">发行方式</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">主承销商</td><td><c:if test="${not empty data.principunder and not empty comwithper[data.principunder] }"><a href="/search/detail?channel=org&keyword=${keyword }&id=${comwithper[data.principunder]}" style='font-size:14px;color:#3e3e3e;'></c:if>${data.principunder}<c:if test="${not empty data.principunder and not empty comwithper[data.principunder] }"></a></c:if></td></tr>
	                <tr class="clearfix"><td class="leftWidth">上市推荐人</td><td><c:if test="${not empty data.markerrecom and not empty comwithper[data.markerrecom] }"><a href="/search/detail?channel=org&keyword=${keyword }&id=${comwithper[data.markerrecom]}" style='font-size:14px;color:#3e3e3e;'></c:if>${data.markerrecom}<c:if test="${not empty data.markerrecom and not empty comwithper[data.markerrecom] }"></a></c:if></td></tr>
	                <tr class="clearfix"><td class="leftWidth">保荐机构</td><td><c:if test="${not empty data.sponinstitu and not empty comwithper[data.sponinstitu] }"><a href="/search/detail?channel=org&keyword=${keyword }&id=${comwithper[data.sponinstitu]}" style='font-size:14px;color:#3e3e3e;'></c:if>${data.sponinstitu}<c:if test="${not empty data.sponinstitu and not empty comwithper[data.sponinstitu] }"></a></c:if></td></tr>
	                <tr class="clearfix"><td class="leftWidth">主办券商</td><td><c:if test="${not empty data.hostbrokerage and not empty comwithper[data.hostbrokerage] }"><a href="/search/detail?channel=org&keyword=${keyword }&id=${comwithper[data.hostbrokerage]}" style='font-size:14px;color:#3e3e3e;'></c:if>${data.hostbrokerage}<c:if test="${not empty data.hostbrokerage and not empty comwithper[data.hostbrokerage] }"></a></c:if></td></tr>
	                <tr class="clearfix"><td class="leftWidth">首发募资总额</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">证券类型</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">发行市场</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">上市板块</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司简介</td><td>${empty basOrganizeInfo.introduce ? '--':basOrganizeInfo.introduce}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">主营业务</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">经营开始日期</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">经营结束日期</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">工商登记机关</td><td>--</td></tr>
	                <tr class="clearfix"><td class="leftWidth">工商核准日期</td><td>${empty basBusinessInfo.approvaDate ? '--':basBusinessInfo.approvaDate}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">工商登记状态</td><td>--</td></tr>
					<c:if test="${not empty investcomInfo}" >
						<tr class="clearfix"><td class="leftWidth">管理资本规模</td><td>${investcomInfo.reasonableCapitalScale}</td></tr>
						<tr class="clearfix"><td class="leftWidth">单个项目投资规模</td><td>${investcomInfo.individualProjectinvestmentScale}</td></tr>
						<tr class="clearfix"><td class="leftWidth">投资领域</td><td>${investcomInfo.investmentField}</td></tr>
						<tr class="clearfix"><td class="leftWidth">投资轮次</td><td>${investcomInfo.investmentRound}</td></tr>
						<tr class="clearfix"><td class="leftWidth">基金管理方</td><td>${investcomInfo.fundManager}</td></tr>
					</c:if>
	            </table>
	        	
	            <table class="orgDetailModuleSummary">
	                <tr class="clearfix"><td class="leftWidth">公司名称</td><td>${empty basOrganizeInfo.oname ? '--':basOrganizeInfo.oname}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司英文名称</td><td>${empty basOrganizeInfo.ename ? '--':basOrganizeInfo.ename}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司简称</td><td>${empty basOrganizeInfo.shortname ? '--':basOrganizeInfo.shortname}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司全称</td><td>${empty basOrganizeInfo.fullname ? '--':basOrganizeInfo.fullname}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司网址</td><td>${empty basOrganizeInfo.web ? '--':basOrganizeInfo.web}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">联系方式</td><td>${empty basOrganizeInfo.conWay ? '--':basOrganizeInfo.conWay}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">所属行业</td><td>${empty basOrganizeInfo.industry ? '--':basOrganizeInfo.industry}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司规模</td><td>${empty basOrganizeInfo.scale ? '--':basOrganizeInfo.scale}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司介绍</td><td>${empty basOrganizeInfo.introduce ? '--':basOrganizeInfo.introduce}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司地址</td><td>${empty basOrganizeInfo.address ? '--':basOrganizeInfo.address}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">成立时间</td><td>${empty basOrganizeInfo.stime ? '--':basOrganizeInfo.stime}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司性质</td><td>${empty basOrganizeInfo.companyNature ? '--':basOrganizeInfo.companyNature}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司文化</td><td>${empty basOrganizeInfo.corporateCulture ? '--':basOrganizeInfo.corporateCulture}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司标签</td><td>${empty basOrganizeInfo.tag ? '--':basOrganizeInfo.tag}</td></tr>
	                <tr class="clearfix"><td class="leftWidth">公司领域</td><td>${empty basOrganizeInfo.managementField ? '--':basOrganizeInfo.managementField}</td></tr>
					<c:if test="${not empty investcomInfo}" >
						<tr class="clearfix"><td class="leftWidth">管理资本规模</td><td>${investcomInfo.reasonableCapitalScale}</td></tr>
						<tr class="clearfix"><td class="leftWidth">单个项目投资规模</td><td>${investcomInfo.individualProjectinvestmentScale}</td></tr>
						<tr class="clearfix"><td class="leftWidth">投资领域</td><td>${investcomInfo.investmentField}</td></tr>
						<tr class="clearfix"><td class="leftWidth">投资轮次</td><td>${investcomInfo.investmentRound}</td></tr>
						<tr class="clearfix"><td class="leftWidth">基金管理方</td><td>${investcomInfo.fundManager}</td></tr>
					</c:if>
	            </table>
	            
                <div class="orgDetailModuleHighlevel" style="display:none;">
					<c:if test="${data.sourceid ne '001001001004' }">
						<div class="clearfix orgDetailPerTags">
							<!-- <em onclick="openOrClose(this)" style="font-style: normal;font-size:14px;" class="hHandle">收起</em> -->
							<span class="orgDetailPerTagCurr" tag="1">董事会</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<span class="orgDetailPerTag" tag="2">监事会</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<span class="orgDetailPerTag" tag="3">高管</span>
						</div>
						<div class="orgList clearfix dataInfo" style="display:;" id="org_common_highlevel_div"></div>
					</c:if>
                </div>
                
                <div class="orgDetailModuleStock" style="display:none;">
                <c:if test="${data.sourceid eq '001001001004' }">
                <div class="clearfix orgDetailPerTags">
                	<!-- <em onclick="openOrClose(this)" style="font-style: normal;font-size:14px;" class="hHandle">收起</em> -->
		            <span class="orgDetailPerTagCurr" tag="1">机构持股</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		            <span class="orgDetailPerTag" tag="2">共同基金持股</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		            <span class="orgDetailPerTag" tag="3">5%以上持股</span>
		        </div>
		        <div class="orgList clearfix dataInfo" style="display:;" id="org_common_stock_div"></div>
		        </c:if>
                <c:if test="${data.sourceid ne '001001001004' }">
                <div class="clearfix orgDetailPerTags">
                	<!-- <em onclick="openOrClose(this)" style="font-style: normal;font-size:14px;" class="hHandle">收起</em> -->
		            <span class="orgDetailPerTagCurr" tag="1">十大股东</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		            <span class="orgDetailPerTag" tag="2">十大流通股东</span>
		        </div>
		        <div class="orgList clearfix dataInfo" style="display:;" id="org_common_stock_div"></div>
		        </c:if>
                </div>
                
	            <div id="noti_div" class="orgDetailModuleNoti" style="display:none;">
	            <input type="hidden" id="orgct" value="${data.comticker}"/>
		        </div>
		        
		        <div id="yanbao_div" class="orgDetailModuleYanbao" style="display:none;">
	            <input type="hidden" id="yanbao" value="${data.comticker}"/>
		        </div>
		        
		        <div id="Businessinfo_div" class="orgDetailModuleBusinessinfo" style="display:none;">
	            <input type="hidden" id="Businessinfo" value="${data.comname}"/>
		        </div>
		        
		        <!-- 公司股东信息 -->
		        <div id="Businessshareholder_div" class="orgDetailModuleBusinessshareholder" style="display:none;">
	            <input type="hidden" id="Businessshareholder" value="${data.comname}"/>
		            <div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="17%">股东名称</th>
									<th style="text-align: center;" width="20%">投资金额</th>
									<th style="text-align: center;" width="20%">出资比例</th>
									<th style="text-align: center;" width="20%">认缴金额</th>
									<th style="text-align: center;" width="23%">认缴时间</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${comShareholderVoLlist }" varStatus="status">
									<tr>
										<td>${data.name }</td>
										<td>${data.investment }</td>
										<td>${data.investmentRate }</td>
										<td>${data.subscriptionAmount }</td>
										<td>${data.subscriptionTime }</td>
									</tr>
								</c:forEach>
								<c:if test="${empty comShareholderVoLlist}">
									<tr>
										<td colspan="5" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
			        </div>
		        </div>
		        
		        <div id="Businesspeople_div" class="orgDetailModuleBusinesspeople" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="15%">姓名</th>
									<th style="text-align: center;" width="15%">职位</th>
									<th style="text-align: center;" width="25%">地址</th>
									<th style="text-align: center;" width="20%">网址</th>
									<th style="text-align: center;" width="25%">日期</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${comExecutiveInfoList }" varStatus="status">
									<tr>
										<td>${data.pname }</td>
										<td>${data.job }</td>
										<td>${data.adress }</td>
										<td>${data.web }</td>
										<td><fmt:formatDate value="${data.ctime }" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									</tr>
								</c:forEach>
								<c:if test="${empty comExecutiveInfoList}">
									<tr>
										<td colspan="5" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        
		        <div id="Businesschange_div" class="orgDetailModuleBusinesschange" style="display:none;">
	            <input type="hidden" id="Businesschange" value="${data.comname}"/>
	            	<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="35%">变更事项</th>
									<th style="text-align: center;" width="20%">变更前内容</th>
									<th style="text-align: center;" width="20%">变更后内容</th>
									<th style="text-align: center;" width="25%">变更日期</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${comChangeInfoList }" varStatus="status">
									<tr>
										<td>${data.changeItem }</td>
										<td>${data.beforeChange }</td>
										<td>${data.afterChange }</td>
										<td>${data.changeTime }</td>
									</tr>
								</c:forEach>
								<c:if test="${empty comChangeInfoList}">
									<tr>
										<td colspan="4" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
			        </div>
		        </div>
		        
		        <div id="Businesspeople_div" class="orgDetailModuleEventRecruit" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="15%">事件标题</th>
									<th style="text-align: center;" width="15%">事件描述</th>
									<th style="text-align: center;" width="18%">数据来源</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${eventRecruitList }" varStatus="status">
										<tr>
											<td><a href="javascript:;" onclick="openInfo('${pageContext.request.contextPath}/event/detail?id=${data.id}')">${data.title }</a></td>
											<td>${data.edesc }</td>
											<td>${data.source }</td>
										</tr>
									
								</c:forEach>
								<c:if test="${empty eventRecruitList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        <div id="Businesspeople_div" class="orgDetailModuleEventInvestfinace" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="20%">组织名</th>
									<th style="text-align: center;" width="20%">相关事件名</th>
									<th style="text-align: center;" width="15%">相关组织描述</th>
									<th style="text-align: center;" width="15%">发生的关系</th>
									<th style="text-align: center;" width="15%">关系类型</th>
									<th style="text-align: center;" width="15%">行业</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${orgEventList }" varStatus="status">
										<tr>
											<td>${data.oname }</td>
											<td><a href="javascript:;" onclick="openInfo('${pageContext.request.contextPath}/event/investfinaceDetail?euuid=${data.euuid}&keyword=${keyword }&channel=${channel}')">${data.etitle }</a></td>
											<td>${data.orgDesc }</td>
											<td>${data.revent }</td>
											<td>${data.rtype }</td>
											<td>${data.industry }</td>
										</tr>
									
								</c:forEach>
								<c:if test="${empty orgEventList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        <div id="Businesspeople_div" class="orgDetailModuleEventMerger" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="15%">事件标题</th>
									<th style="text-align: center;" width="15%">事件描述</th>
									<th style="text-align: center;" width="18%">数据来源</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${eventMergerList }" varStatus="status">
										<tr>
											<td><a href="javascript:;" onclick="openInfo('${pageContext.request.contextPath}/event/detail?id=${data.id}')">${data.title }</a></td>
											<td>${data.edesc }</td>
											<td>${data.source }</td>
										</tr>
									
								</c:forEach>
								<c:if test="${empty eventMergerList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        <div id="Businesspeople_div" class="orgDetailModuleEventLaw" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="15%">事件标题</th>
									<th style="text-align: center;" width="15%">事件描述</th>
									<th style="text-align: center;" width="18%">数据来源</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${eventLawList }" varStatus="status">
										<tr>
											<td><a href="javascript:;" onclick="openInfo('${pageContext.request.contextPath}/event/detail?id=${data.id}')">${data.title }</a></td>
											<td>${data.edesc }</td>
											<td>${data.source }</td>
										</tr>
									
								</c:forEach>
								<c:if test="${empty eventLawList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        <div id="Businesspeople_div" class="orgDetailModuleGameInfo" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="25%">产品名称</th>
									<th style="text-align: center;" width="25%">关系类型</th>
									<th style="text-align: center;" width="25%">关系权重</th>
									<th style="text-align: center;" width="25%">权重描述</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${orgProductList }" varStatus="status">
									<tr>
										<td><a href="javascript:;" onclick="openInfo('${pageContext.request.contextPath}/orgPro/detail?prUuid=${data.prUuid}')">${data.pname }</a></td>
										<td>${data.rtype }</td>
										<td>${data.rgrade }</td>
										<td>${data.rgDesc }</td>
									</tr>
								</c:forEach>
								<c:if test="${empty orgProductList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        
		        <div id="Businesspeople_div" class="orgDetailModuleOrgOrganize" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="15%">组织名</th>
									<th style="text-align: center;" width="15%">相关组织名</th>
									<th style="text-align: center;" width="18%">相关组织描述</th>
									<th style="text-align: center;" width="18%">发生的关系</th>
									<th style="text-align: center;" width="18%">关系类型</th>
									<th style="text-align: center;" width="16%">关系权重</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${orgOrganizeList }" varStatus="status">
									<tr>
										<td><a href="javascript:;" onclick="openInfo('${pageContext.request.contextPath}/organize/detail?uuid=${data.ouuid}')">${data.oname }</a></td>
										<td>${data.roname }</td>
										<td>${data.orgDesc }</td>
										<td>${data.revent }</td>
										<td>${data.rtype }</td>
										<td>${data.rgrade }</td>
									</tr>
								</c:forEach>
								<c:if test="${empty orgOrganizeList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        
		        <div id="Businesspeople_div" class="orgDetailModuleOrgKnowledge" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="15%">组织名</th>
									<th style="text-align: center;" width="15%">相关知识</th>
									<th style="text-align: center;" width="18%">相关组织描述</th>
									<th style="text-align: center;" width="18%">发生的关系</th>
									<th style="text-align: center;" width="18%">关系类型</th>
									<th style="text-align: center;" width="16%">关系权重</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${orgKnowledgeList }" varStatus="status">
									<tr>
										<td>${data.oname }</td>
										<td>${data.title }</td>
										<td>${data.rgDesc }</td>
										<td>${data.revent }</td>
										<td>${data.rtype }</td>
										<td>${data.rgrade }</td>
									</tr>
								</c:forEach>
								<c:if test="${empty orgKnowledgeList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        <div id="Businesspeople_div" class="orgDetailModuleOrgPerson" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="15%">姓名</th>
									<th style="text-align: center;" width="20%">职务</th>
									<th style="text-align: center;" width="20%">发生的关系</th>
									<th style="text-align: center;" width="25%">关系类型</th>
									<th style="text-align: center;" width="25%">关系权重</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${perOrganizeList }" varStatus="status">
									<tr>
										<td><a href="javascript:;" onclick="openInfo('${pageContext.request.contextPath}/person/detailByUuid?uuid=${data.puuid}')">${data.name }</a></td>
										<td>${data.job }</td>
										<td>${data.revent }</td>
										<td>${data.rtype }</td>
										<td>${data.rgrade }</td>
									</tr>
								</c:forEach>
								<c:if test="${empty perOrganizeList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        <div id="Businesspeople_div" class="orgDetailModuleComWechat" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="25%">公众号名称</th>
									<th style="text-align: center;" width="25%">微信号</th>
									<th style="text-align: center;" width="25%">功能介绍</th>
									<th style="text-align: center;" width="25%">二维码</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${comWechatList }" varStatus="status">
									<tr>
										<td>${data.wechatname }</td>
										<td>${data.wechat }</td>
										<td>${data.wechatfunction }</td>
										<td><img src="${data.qrcode }" width="100px" height="100px"/></td>
									</tr>
								</c:forEach>
								<c:if test="${empty comWechatList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        
		        <div id="Businesspeople_div" class="orgDetailModuleComIcp" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="25%">网站名称</th>
									<th style="text-align: center;" width="25%">网站首页</th>
									<th style="text-align: center;" width="25%">备案号</th>
									<th style="text-align: center;" width="10%">状态</th>
									<th style="text-align: center;" width="15%">单位性质</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${comIcpList }" varStatus="status">
									<tr>
										<td>${data.webname }</td>
										<td>${data.home }</td>
										<td>${data.icpnumber }</td>
										<td>${data.state }</td>
										<td>${data.property }</td>
									</tr>
								</c:forEach>
								<c:if test="${empty comIcpList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        
		        <div id="Businesspeople_div" class="orgDetailModuleComSoftwarecopyright" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="30%">软件全称</th>
									<th style="text-align: center;" width="15%">软件简称</th>
									<th style="text-align: center;" width="15%">登记号</th>
									<th style="text-align: center;" width="10%">版本号</th>
									<th style="text-align: center;" width="30%">著作权人(国籍)</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${comSoftwarecopyrightList }" varStatus="status">
									<tr>
										<td>${data.softwarefullname }</td>
										<td>${data.softwareshortname }</td>
										<td>${data.registrationnumber }</td>
										<td>${data.versionnumber }</td>
										<td>${data.copyrightowner }</td>
									</tr>
								</c:forEach>
								<c:if test="${empty comSoftwarecopyrightList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        
		        <div id="Businesspeople_div" class="orgDetailModuleComTminfo" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="25%">商标名称</th>
									<th style="text-align: center;" width="25%">注册号</th>
									<th style="text-align: center;" width="25%">类别</th>
									<th style="text-align: center;" width="25%">商标图片</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${comTminfoList }" varStatus="status">
									<tr>
										<td>${data.brandname }</td>
										<td>${data.rnumber }</td>
										<td>${data.classLb }</td>
										<td><img src="${data.tmpic }" width="100px" height="100px"/></td>
									</tr>
								</c:forEach>
								<c:if test="${empty comTminfoList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        
		        <div id="Businesspeople_div" class="orgDetailModuleComCopyrightwork" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="25%">作品名称</th>
									<th style="text-align: center;" width="30%">登记号</th>
									<th style="text-align: center;" width="15%">类别</th>
									<th style="text-align: center;" width="15%">完成日期</th>
									<th style="text-align: center;" width="15%">登记日期</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${comCopyrightworkList }" varStatus="status">
									<tr>
										<td>${data.workname }</td>
										<td>${data.rnumber }</td>
										<td>${data.classLb }</td>
										<td>${data.completiondate }</td>
										<td>${data.rdate }</td>
									</tr>
								</c:forEach>
								<c:if test="${empty comCopyrightworkList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        
		        <div id="Businesspeople_div" class="orgDetailModuleChanquan" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="15%">申请号</th>
									<th style="text-align: center;" width="15%">分类号</th>
									<th style="text-align: center;" width="20%">发明名称</th>
									<th style="text-align: center;" width="25%">地址</th>
									<th style="text-align: center;" width="25%">信息图片</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${comPatentList }" varStatus="status">
									<tr>
										<td>${data.anumber }</td>
										<td>${data.cnumber }</td>
										<td>${data.inventionname }</td>
										<td>${data.address }</td>
										<td><img src="${data.imgurl }" width="100px" height="100px"/></td>
									</tr>
								</c:forEach>
								<c:if test="${empty comPatentList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>
		        
		        <div id="Businesspeople_div" class="orgDetailModuleInvestment" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
						    <tbody>
								<tr>
									<th style="text-align: center;" width="20%">组织名</th>
									<th style="text-align: center;" width="20%">法定代表人</th>
									<th style="text-align: center;" width="20%">行业</th>
									<th style="text-align: center;" width="20%">投资金额</th>
									<th style="text-align: center;" width="20%">投资占比</th>
								</tr>
							</tbody>
							<tbody>
								<c:forEach var="data" items="${comInvestmentInfoList }" varStatus="status">
									<tr>
										<td>${data.oname }</td>
										<td>${data.legalPersen }</td>
										<td>${data.industry }</td>
										<td>${data.investment }</td>
										<td>${data.proportion }</td>
									</tr>
								</c:forEach>
								<c:if test="${empty comInvestmentInfoList}">
									<tr>
										<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
							</tbody>
						</table>
		        	</div>
		        </div>

				<div id="Businesspeople_div" class="orgDetailModuleEquitypledgedpagenum" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
							<tbody>
							<tr>
								<th style="text-align: center;" width="20%">出质人</th>
								<th style="text-align: center;" width="20%">出质人证件号</th>
								<th style="text-align: center;" width="20%">质权人</th>
								<th style="text-align: center;" width="20%">质权人号码</th>
								<th style="text-align: center;" width="20%">状态</th>
							</tr>
							</tbody>
							<tbody>
							<c:forEach var="data" items="${comEquitypledgedpagenumList }" varStatus="status">
								<tr>
									<td>${data.pledgor }</td>
									<td>${data.pledgorNumber }</td>
									<td>${data.pledgee }</td>
									<td>${data.pledgeeNumber }</td>
									<td>${data.state }</td>
								</tr>
							</c:forEach>
							<c:if test="${empty comEquitypledgedpagenumList}">
								<tr>
									<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
								</tr>
							</c:if>
							</tbody>
						</table>
					</div>
				</div>

				<div id="Businesspeople_div" class="orgDetailModuleAbnormaloperation" style="display:none;">
					<div class="clearfix selectedType" tag="1">
						<table style="width:100%">
							<tbody>
							<tr>
								<th style="text-align: center;" width="25%">列入原因</th>
								<th style="text-align: center;" width="25%">决定机关</th>
								<th style="text-align: center;" width="25%">移除原因</th>
								<th style="text-align: center;" width="25">移除机关</th>
							</tr>
							</tbody>
							<tbody>
							<c:forEach var="data" items="${comAbnormaloperationList }" varStatus="status">
								<tr>
									<td>${data.inclusionReason }</td>
									<td>${data.decisionOrgan }</td>
									<td>${data.removeReason }</td>
									<td>${data.removeOrgan }</td>
								</tr>
							</c:forEach>
							<c:if test="${empty comAbnormaloperationList }">
								<tr>
									<td colspan="6" style="text-align: center;height:50px;" >没有数据！</td>
								</tr>
							</c:if>
							</tbody>
						</table>
					</div>
				</div>
		        
		        <div class="orgDetailModuleFinancial" style="display:none;">
		        <!-- <div class="peopleInfo clearfix"><span class="hHandle" onclick="openOrClose(this)">收起</span>公司财报</div> -->
		        <div class="orgList clearfix dataInfo" style="display:;">
		        	<br>
		        	<div style="height:30px;padding:0 70px;margin-bottom:10px;">
		            <div class="w98 clearfix">
		                <span class="clearfix pos">
		                    <span class="selectStyle"><span class="selectVal" id="fyear"></span><i></i></span>
		                    <ul class="searchDetail" style="display:none" cname="year">
		                    </ul>
		                </span>
		            </div>
		            <span style="line-height: 25px; font-size:15px; color:#666666; float: left; margin-right: 20px;">年</span>
		            <div class="w98 clearfix">
		                <span class="clearfix pos">
		                    <span class="selectStyle"><span class="selectVal" id="fdate"></span><i></i></span>
		                    <ul class="searchDetail" style="display:none" cname="date">
		                        <li><a href="javascript:void(0)">年度</a></li>
		                        <li><a href="javascript:void(0)">三季</a></li>
		                        <li><a href="javascript:void(0)">中期</a></li>
		                        <li><a href="javascript:void(0)">一季</a></li>
		                    </ul>
		                </span>
		            </div>
		            <div class="w98 clearfix">
		                <span class="clearfix pos">
		                    <span class="selectStyle"><span class="selectVal" id="ftype">资产负债表</span><i></i></span>
		                    <ul class="searchDetail" style="display:none" cname="type">
		                        <li><a href="javascript:void(0)">资产负债表</a></li>
		                        <li><a href="javascript:void(0)">利润表</a></li>
		                        <li><a href="javascript:void(0)">现金流量表</a></li>
		                    </ul>
		                </span>
		            </div>
		            <span style="background-color: #f39b08; height: 25px; width: 60px; display:inline-block;float: right; text-align: center; color: white;line-height: 25px; cursor: pointer;" onclick="getFinancial();">查询</span>
		            </div>
		            <table class="orgReport" align="center">
		            <tbody></tbody>
		            </table>
		        </div>
		        </div>
	        <c:if test="${fn:startsWith(data.sourceid, '001001001') or data.sourceid eq '001003'}">
        		<c:if test="${data.sourcecategory eq '总公司'}">
                <div class="orgDetailModuleFzjg" style="display:none;">
                <!-- <div class="clearfix orgDetailPerTags">
                	<em onclick="openOrClose(this)" style="font-style: normal;font-size:14px;" class="hHandle">收起</em>
		            <span class="orgDetailPerTagCurr" tag="1">分公司</span>
		        </div> -->
		        <div class="orgList clearfix dataInfo" style="display:;">
		        	<div class="clearfix selectedType" tag="1" id="org_common_little_child_fgs_div"></div>
	            </div>
                </div>
     			</c:if>
     			
     			<div class="orgDetailModuleCcxx" style="display:none;">
			        <div class="orgList clearfix dataInfo" style="display:;">
			        	<div class="clearfix selectedType" tag="1" id="org_common_little_other_orgcc_div"></div>
		            </div>
                </div>
     			<div class="orgDetailModuleJyyc" style="display:none;">
			        <div class="orgList clearfix dataInfo" style="display:;">
			        	<div class="clearfix selectedType" tag="1" id="org_common_little_other_orgyc_div"></div>
		            </div>
                </div>
     			<div class="orgDetailModuleBiangeng" style="display:none;">
			        <div class="orgList clearfix dataInfo" style="display:;">
			        	<div class="clearfix selectedType" tag="1" id="org_common_little_other_orghistory_div"></div>
		            </div>
                </div>
     			
     			<script type="text/javascript" src="/search/resources/js/org-common-little.js"></script>
     		</c:if>
                
                
               <div class="orgDetailModuleHangQing" style="display:none;" id="hangQing">
               
               <c:choose>
                <c:when test="${not empty data.comticker}">
                
                <div id="tab" style="border:1px solid #cccccc;height:550px" >
                
                
                 
                
                
                
                <div class="tabList" id="tabList" style="position:absolute;">
                <ul>
                  <li class="cur">日K</li> 
				      <li >周k</li> 
				      <li >月K</li> 
                </ul>
                </div>
                
                <div id="searchDiv"  style="margin-top: 40px;margin-left:40px;position:absolute;">
                
                <font>开始时间 :</font>  <input id="beginDate" type="text"  readonly="readonly"/>
				  <img onclick="WdatePicker({el:'beginDate'})" src="resources/js/My97DatePicker/skin/datePicker.gif" width="16" height="22" align="absmiddle">
               
                <font style="margin-left: 10px">结束时间:</font> <input id="endDate" type="text" readonly="readonly" />
				  <img onclick="WdatePicker({el:'endDate'})" src="resources/js/My97DatePicker/skin/datePicker.gif" width="16" height="22" align="absmiddle">
                  <input type="button"  class="mbutton" value="搜索" style="width:60px;height:25px;margin-left: 5px" onclick="loadDataByTime()">
              
                </div>
                
             <div class="tabCon"  id="tabCon"  style="margin-top: 50px;position:absolute;">
		          <div id="rik"  class="cur"  style="display:block;opacity=1">
						 <div id="report"  style="height:100dpx;width:600px"> </div>
						 <div  id="container" style="height:300dpx;width:600px"></div>
						 <div id="riLoadgif" style="position:absolute;top:150px;left:30%;z-index: 20;">
　　								<img  src="resources/images/loading.gif"/>
						</div>
		           </div>
		                 
				        <div id="zhouDiv" style="disply:none">
							 <div id="wreport"  style="height:100dpx;width:600px"> </div>
						 <div  id="wcontainer" style="height:300dpx;width:600px"></div>
						 
						  	<div id="zhouLoadgif" style="position:absolute;top:150px;left:30%;z-index: 20;">
　　								<img  src="resources/images/loading.gif"/>
							</div>
	                     </div>
		                  <!--年  k div -->
		                 <div id="yueDiv" style="disply:none" >
		                    <div id="yreport"  style="height:100dpx;width:600px"> </div>
						    <div  id="ycontainer" style="height:300dpx;width:600px"></div>
						    	<div id="yueLoadgif" style="position:absolute;top:150px;left:30%;z-index: 20;">
　　								<img  src="resources/images/loading.gif"/>
							</div>
			              </div>
			        
			        </div>
			        </div>
			        
			  
                
                
	                </c:when>
	                 
	                <c:otherwise>
	                <table style="width:100%">
					    <tbody>
						<tr>
							<td colspan="" style="text-align: center;height:50px;">没有数据！</td>
						</tr>
						</tbody>
					</table>
	                </c:otherwise>
              </c:choose>
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

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="/WEB-INF/views/common-header.jsp">
	<jsp:param value="组织详情" name="title"/>
</jsp:include>
<style>

#orgDetail td{border:1px solid #aaa;padding:2px 8px;word-break:break-all;font-size: 16px;
              font-family: STHeiti,"Microsoft Yahei", "微软雅黑", tahoma,arial,'Hiragino Sans GB',\5b8b\4f53,sans-serif;}
</style>



<c:set var="data" value="${map.datas[0] }"></c:set>
<c:set var="comwithper" value="${map.orgMap }"></c:set>
<input id="ct" type="hidden" value="${data.comticker}" />
<input id="comname" type="hidden" value="${data.comname }" />

<script src="resources/js/highstock.js"></script>
<script src="resources/js/chartExt.js"></script>
<script src="resources/js/My97DatePicker/WdatePicker.js"></script>

<link rel="stylesheet" href="resources/component/easytab/css/lrtk.css" type="text/css" />
<script type="text/javascript" src="resources/component/easytab/js/js.js"></script>
<script type="text/javascript" src="resources/component/layer/layer.js"></script>





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
        	<div id="orgDetailMainDiv" style="width:650px;float: left;">
	        	<div class="fixedOrgDetailTitle">
	        		<span class="comName">
	                	${companyName}
	                </span>
	        	</div>
	        
		        <div id="Businessinfo_div" class="orgDetailModuleBusinessinfo">
	            
				             <table style="width:100%" id="orgDetail">
									<tr>
							            <td width="30%" align="right">组织名称：</td>
							            <td>${empty orgProduct.oname ? '--':orgProduct.oname}</td>
									</tr>
									<tr>
							            <td align="right">产品名称：</td>
							            <td>${empty orgProduct.pname ? '--':orgProduct.pname}</td>
									</tr>
									<tr>
							            <td align="right">关系类型：</td>
							            <td>${empty orgProduct.rtype ? '--':orgProduct.rtype}</td>
									</tr>
									<tr>
							            <td align="right">关系权重：</td>
							            <td>${empty orgProduct.rgrade ? '--':orgProduct.rgrade}</td>
									</tr>
									<tr>
							            <td align="right">权重描述：</td>
							            <td>${empty orgProduct.rgDesc ? '--':orgProduct.rgDesc}</td>
									</tr>
									<tr>
							            <td align="right">创建时间：</td>
							            <td>${empty orgProduct.ctime ? '--':orgProduct.ctime}</td>
									</tr>
								<c:if test="${empty orgProduct }">
									<tr>
										<td colspan="2" style="text-align: center;height:50px;" >没有数据！</td>
									</tr>
								</c:if>
						</table>

		        </div>
		        
     			<script type="text/javascript" src="/search/resources/js/org-all.js"></script>
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

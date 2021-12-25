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
	        <div class="clearfix detailTitle"><%-- <span>基本资料</span><a href="javascript:;" onclick="lookGraph('${data.mytype }','${data.id }','${data.comticker }','${data.comname }','${fn:substring(data.tags,0,400)}');" style="font-style: normal;font-size:14px;color: gray;" class="hHandle">查看关联图</a>--%>
	        <a href="${pageContext.request.contextPath}/game/createGameExcel?uuid=${proGameInfo.uuid }" style="font-style: normal;font-size:14px;color: gray;" class="hHandle">导出</a>
	        </div>
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
							            <td width="30%" align="right">产品名称：</td>
							            <td>${empty proGameInfo.gname ? '--':proGameInfo.gname}</td>
									</tr>
									<tr>
							            <td align="right">英文名称：</td>
							            <td>${empty proGameInfo.gename ? '--':proGameInfo.gename}</td>
									</tr>
									<tr>
							            <td align="right">游戏版本：</td>
							            <td>${empty proGameInfo.version ? '--':proGameInfo.version}</td>
									</tr>
									<tr>
							            <td align="right">语言：</td>
							            <td>${empty proGameInfo.language ? '--':proGameInfo.language}</td>
									</tr>
									<tr>
							            <td align="right">适合年龄：</td>
							            <td>${empty proGameInfo.suitableAge ? '--':proGameInfo.suitableAge}</td>
									</tr>
									<tr>
							            <td align="right">发行区域：</td>
							            <td>${empty proGameInfo.issueArea ? '--':proGameInfo.issueArea}</td>
									</tr>
									<tr>
							            <td align="right">发行商：</td>
							            <td>${empty proGameInfo.publisher ? '--':proGameInfo.publisher}</td>
									</tr>
									<tr>
							            <td align="right">游戏风格：</td>
							            <td>${empty proGameInfo.gstyle ? '--':proGameInfo.gstyle}</td>
									</tr>
									<tr>
							            <td align="right">标签：</td>
							            <td>${empty proGameInfo.gtags ? '--':proGameInfo.gtags}</td>
									</tr>
									<tr>
							            <td align="right">游戏视角：</td>
							            <td>${empty proGameInfo.viewpoint ? '--':proGameInfo.viewpoint}</td>
									</tr>
									<tr>
							            <td align="right">游戏引擎：</td>
							            <td>${empty proGameInfo.engine ? '--':proGameInfo.engine}</td>
									</tr>
									<tr>
							            <td align="right">游戏品级：</td>
							            <td>${empty proGameInfo.grade ? '--':proGameInfo.grade}</td>
									</tr>
									<tr>
							            <td align="right">研发进度：</td>
							            <td>${empty proGameInfo.dpprogress ? '--':proGameInfo.dpprogress}</td>
									</tr>
									<tr>
							            <td align="right">游戏题材：</td>
							            <td>${empty proGameInfo.gtheme ? '--':proGameInfo.gtheme}</td>
									</tr>
									<tr>
							            <td align="right">团队规模：</td>
							            <td>${empty proGameInfo.scale ? '--':proGameInfo.scale}</td>
									</tr>
									<tr>
							            <td align="right">付费方式：</td>
							            <td>${empty proGameInfo.chargeMode ? '--':proGameInfo.chargeMode}</td>
									</tr>
									<tr>
							            <td align="right">研发公司：</td>
							            <td>${empty proGameInfo.developCom ? '--':proGameInfo.developCom}</td>
									</tr>
									<tr>
							            <td align="right">游戏介绍：</td>
							            <td>${empty proGameInfo.gDesc ? '--':proGameInfo.gDesc}</td>
									</tr>
									<tr>
							            <td align="right">公测时间：</td>
							            <td>${empty proGameInfo.betaTime ? '--':proGameInfo.betaTime}</td>
									</tr>
									<tr>
							            <td align="right">内测时间：</td>
							            <td>${empty proGameInfo.testTime ? '--':proGameInfo.testTime}</td>
									</tr>
									<tr>
							            <td align="right">游戏官网：</td>
							            <td>${empty proGameInfo.web ? '--':proGameInfo.web}</td>
									</tr>
									<tr>
							            <td align="right">游戏画面：</td>
							            <td>${empty proGameInfo.gamespy ? '--':proGameInfo.gamespy}</td>
									</tr>
									<tr>
							            <td align="right">运营商：</td>
							            <td>${empty proGameInfo.operator ? '--':proGameInfo.operator}</td>
									</tr>
									<tr>
							            <td align="right">包名：</td>
							            <td>${empty proGameInfo.packagename ? '--':proGameInfo.packagename}</td>
									</tr>
									<tr>
							            <td align="right">更新日期：</td>
							            <td>${empty proGameInfo.gameUpdateTime ? '--':proGameInfo.gameUpdateTime}</td>
									</tr>
									<tr>
							            <td align="right">家人共享：</td>
							            <td>${empty proGameInfo.familysharing ? '--':proGameInfo.familysharing}</td>
									</tr>
									<tr>
							            <td align="right">是否支持Watch：</td>
							            <td>${empty proGameInfo.supportwatch ? '--':proGameInfo.supportwatch}</td>
									</tr>
									<tr>
							            <td align="right">支持网站：</td>
							            <td>${empty proGameInfo.supportwebsite ? '--':proGameInfo.supportwebsite}</td>
									</tr>
									<tr>
							            <td align="right">游戏截图：</td>
							            <td>
							            
							            <c:if test="${empty pics }">暂无图片</c:if>
							            <c:if test="${!empty pics }">
							            <c:forEach var="pic" items="${pics }">
							            	<img src="${pic}" width="100px" height="100px"/>
							            </c:forEach>
							            </c:if>
							            </td>
									</tr>
									<tr>
							            <td align="right">LOGO：</td>
							            <td>
							            <c:if test="${empty proGameInfo.logo }">暂无图片</c:if>
							            <c:if test="${!empty proGameInfo.logo }">
							            <img src="${proGameInfo.logo}" width="100px" height="100px"/>
							            </c:if>
							            </td>
									</tr>
								<c:if test="${empty proGameInfo }">
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

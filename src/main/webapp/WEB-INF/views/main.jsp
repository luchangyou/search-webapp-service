<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>数据管理--金桐网</title>
		<link rel="SHORTCUT ICON" href="http://static.gintong.com/resources/images/v4/favicon.ico" type="image/x-icon">
		<link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/files/easyui.css">
		<link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/files/icon.css">
		<link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/files/color.css">
		<link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/files/main.css">
		<script src="/search-webapp-service/resources/files/jquery.js" type="text/javascript"></script>
		<script src="/search-webapp-service/resources/files/jquery_002.js" type="text/javascript"></script>
		<script src="/search-webapp-service/resources/files/easyui-lang-zh_CN.js" type="text/javascript"></script>
		<script src="/search-webapp-service/resources/files/common.js" type="text/javascript"></script>
		<style type="text/css">
			select{height:28px;}
			#homeData table {background-color: white;}
			#homeData td {border-right: 1px solid #fff}
			#homeData td div{max-width:400px;max-height:50px; overflow: hidden;}
			#sourceContent table td{padding:10px;}
			.nowrap{white-space:nowrap;}
			.hrpeodetail{border:1px solid #000 ; border-collapse: collapse;margin:5px auto;width:700px;max-width:700px;}
			.hrpeodetail td{border:1px solid #000 ;padding:5px;min-width:80px;}
			li{list-style: none;}
			.contData_u1{width: 80%;margin-left: 10%;}
			.contData_u1>li{float: left;width: 30%;height: 120px;margin-top: 3%;margin-left:3%; }
			.contData_u1_l1{background: #297CD3}
			.contData_u1_l2{background: #69D7A3}
			.contData_u1_l3{background: #EFA82F}
			.contData_u1_l4{background: #BE6BC8}
			.contData_u1_l5{background: #1CC3E3}
			.contData_u1_l6{background: #A590FF}
			.contData_u2{width: 80%;margin-left: 10%;}
			.contData_u2>li{width: 100%;text-align: center;line-height: 140%;}
			.contData_u2>li>img{width: 16%;margin-top: 3%;}

		</style>
		
		<link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/files/law.css">
		<script src="/search-webapp-service/resources/files/json2.js" type="text/javascript"></script>
		
	</head>
	<body style="letter-spacing: 0px; line-height: normal; cursor: auto;">
		<div class="header0" style="width: 1903px;">
			<div class="header cl">
			<div class="logo">金桐网数据管理系统</div>
			<ul class="navi">
				
				
			</ul>
			<div style="margin:20px 80px 20px 0; float:right;color:white;">
				<c:if test="${empty userInfo }">
				<span onclick="location.href = '${pageContext.request.contextPath}/user/toLoginPage';" style="margin-left: 50px;cursor: pointer;">登录</span><span onclick="location.href = '${pageContext.request.contextPath}/user/toSignupPage';" style="margin-left: 50px;cursor: pointer;">注册</span>
				</c:if>
				<c:if test="${!empty userInfo }">
				<span>用户：${userInfo.userName }</span><span onclick="location.href = '${pageContext.request.contextPath}/user/LogOut';" style="margin-left: 50px;cursor: pointer;">退出登录</span>
				</c:if>
			</div>
			</div>
		</div>

		<div class="main cl" style="width: 1903px;">
			<div class="contData fl" id="homeData" style="width: 1903px;">
				<div class="contTabView">
					<div id="dataDiv" name="dataDiv">

					</div>
					<ul class="contData_u1">
						<li class="contData_u1_l1"  onclick="location.href='${pageContext.request.contextPath}/home/home'">
							<ul class="contData_u2">
								<li>
									<img src="/search-webapp-service/resources/img/zonghe9.gif" />
								</li>
								<li>
									企业官网
								</li>
								<li>
									CORPORATE WEBSITES
								</li>
							</ul>
						</li>
						<li class="contData_u1_l2" onclick="location.href='http://192.168.101.111:8080/pentaho/game?userid=${userInfo.userName }&password=${userInfo.passWord }'">
							<ul class="contData_u2">
								<li>
									<img src="/search-webapp-service/resources/img/zonghe9.gif" />
								</li>
								<li>
									购物商城
								</li>
								<li>
									SHOPPING MALL
								</li>
							</ul>
						</li>
						<li class="contData_u1_l3">
							<ul class="contData_u2">
								<li>
									<img src="/search-webapp-service/resources/img/zonghe9.gif" />
								</li>
								<li>
									空间域名
								</li>
								<li>
									SPACE SERVICE
								</li>
							</ul>
						</li>
						<li class="contData_u1_l4">
							<ul class="contData_u2">
								<li>
									<img src="/search-webapp-service/resources/img/zonghe9.gif" />
								</li>
								<li>
									行业门户
								</li>
								<li>
									INDUSTRY PORTAL
								</li>
							</ul>
						</li>
						<li class="contData_u1_l5">
							<ul class="contData_u2">
								<li>
									<img src="/search-webapp-service/resources/img/zonghe9.gif" />
								</li>
								<li>
									三合一网站
								</li>
								<li>
									TRIAD WEBSITE
								</li>
							</ul>
						</li>
						<li class="contData_u1_l6">
							<ul class="contData_u2">
								<li>
									<img src="/search-webapp-service/resources/img/zonghe9.gif" />
								</li>
								<li>
									全网营销
								</li>
								<li>
									NETWORK MARKETING
								</li>
							</ul>
						</li>
					</ul>
					
					
				</div>
			</div>
			<div id="masklayer" style="display:none;position: fixed; top:0px;left:0;background-color: rgba(100,100,100,0.6);width: 100%;height:100%;padding:0px;">
			<div id="dataPreview" style="position: fixed; top: 10px; border: 8px solid rgba(100, 100, 100, 0.6); border-radius: 5px; width: 900px; padding: 0px; left: 501.5px;">
				<div style="background-color: white;padding:10px;">
				<div id="dragBar" style="text-align:right;background-color: #fafafa;margin:-10px -10px 10px;"><span class="closePreview" onclick="$('#masklayer').hide();">×<span></span></span></div>
				<div id="dataContent" style="min-height: 480px; overflow: auto; height: 797px;">
				</div>
				<div style="width:100px;margin:20px auto 10px;">
					<button onclick="$('#masklayer').hide();" style="width:100px">关闭</button>
				</div>
				</div>
			</div>
			</div>
		</div>
	<script type="text/javascript">
		$(window).resize(function(){
			var w = $('body').width() < 780 ? 780 : $('body').width();
			$('.main,.header0').width($('body').width() < 800 ? 800 : $('body').width());
			$('.contData').width(w);
			$('#dataPreview').css("left", $('body').width()/2-450);
			$('#dataContent').css("height", $(window).height()-150);
		});
		$(function(){
			//处理异步请求session过期问题
			/* jQuery(function($){  
			    // 备份jquery的ajax方法    
			    var _ajax=$.ajax;  
			    // 重写ajax方法，先判断登录在执行success函数   
			    $.ajax=function(opt){  
			        var _success = opt && opt.success || function(a, b){};  
			        var _opt = $.extend(opt, {  
			            success:function(data, textStatus){  
			                // 如果后台将请求重定向到了登录页，则data里面存放的就是登录页的源码，这里需要找到data是登录页的证据(标记)  
			                if(typeof data == "string" && data.indexOf('lgpf80g') != -1) { 
			                	//alert(window.location.href);
			                    window.location.href= "/dm";  
			                    return;  
			                }  
			                _success(data, textStatus);    
			            }    
			        });  
			        _ajax(_opt);  
			    };  
			});  */
			$(window).resize();
			/* $("#keyword111").on("keydown",function(event){
				if(event.keyCode == 13){
					searchList(1);
				}
			}); */
			/* resetCondition("anli");
			resetCondition("fagui");
			$(".conditionBlock label input").click(function(){
				if($(this).attr("name").indexOf("all") != -1){
					if($(this).prop("checked")){
						$("[name='"+$(this).attr("name").replace("_all","")+"']").prop("checked",false);
					}
				}else{
					if($(this).prop("checked")){
						$("[name='"+$(this).attr("name")+"_all']").prop("checked",false);
					}
				}
			});
			$("[name='filterType'][value='all']").click();
			$("[name='allDataType'][value='anli']").click();
			searchList(1,"init");
			$("#keyword111").focus();
			dragDataPreview(); */
		});
		
		function changeConditionBlock(divID){
			if(divID == "all"){
				$("#expandCondition").hide();
				$("#resetCondition").hide();
				$(".conditionBlock").hide();
				$("#data_all").show();
				$("#data_anli").hide();
				$("#data_fagui").hide();
			}else{
				$("#expandCondition").show();
				$("#resetCondition").show();
				$("#data_all").hide();
				if(divID == "anli"){
					$("#anli").show();
					$("#data_anli").show();
					$("#fagui").hide();
					$("#data_fagui").hide();
				}else{
					$("#anli").hide();
					$("#data_anli").hide();
					$("#fagui").show();
					$("#data_fagui").show();
				}
			}
			$("#nowTab").val("_" + divID);
			$("#expandCondition").text("收起条件");
		}
		
		function changeDataAllType(type){
			if(type == "anli"){
				$("#data_all_anli").show();
				$("#data_all_fagui").hide();
			}else{
				$("#data_all_anli").hide();
				$("#data_all_fagui").show();
			}
		}

		function expandCondition(){
			var content = $("#expandCondition").text();
			if(content == "收起条件"){
				$("#"+$("#nowTab").val().replace("_","")).slideUp("slow");
				content = "展开条件";
			}else{
				$("#"+$("#nowTab").val().replace("_","")).slideDown("slow");
				content = "收起条件";
			}
			$("#expandCondition").text(content);
		}

		function resetInput(){
			var checkedConType = $("[name='filterType']:checked").val();
			resetCondition(checkedConType);
		}
		
		function resetCondition(type){
			$("#"+type+" input").prop("checked",false);
			$("#"+type+" input[name$='_all']").prop("checked",true);
			if(type === "fagui"){
				$("#fagui .easyui-datebox").datebox("setValue","");
			}
		}
		
		function searchList(pn, init){
			var nowTab = $("#nowTab").val();
			if(nowTab == "_all"){
				selectDataList(pn, "_all_anli", init);
				selectDataList(pn, "_all_fagui", init);
			}else{
				selectDataList(pn, nowTab);
			}
			
		}
		
		function selectList(pn){
			var nowTab = $("#nowTab").val();
			if(nowTab == "_all" && $("[name='allDataType']:checked").val() == "anli"){
				nowTab = "_all_anli";
			}else if(nowTab == "_all" && $("[name='allDataType']:checked").val() == "fagui"){
				nowTab = "_all_fagui";
			}
			if(pn === "" || isNaN(pn)){
				alert("请输入正确的页码");
				return;
			}
			if( (parseInt(pn) < 1) || parseInt(pn) > parseInt($("#totalPage"+nowTab).text())){
				pn = 1;
			}
			selectDataList(pn, nowTab);
		}
		
		
		function selectDataList(pn, nowTab, init){
			$("body").css("cursor", "wait");
			var ps = parseInt($("#pageSize"+nowTab).val());
			var type = "anli";
			var cond = {};
			if(nowTab == "_anli"){
				$("#anli .level1").each(function(){
					var condKey = $(this).attr("type");
					var condValue = "";
					$(this).find("input:checked").each(function(){
						condValue += ","+$(this).val();
					});
					cond[condKey] = condValue.substring(1);
				});
				$("#anli .level2").each(function(){
					var condKey = $(this).attr("type");
					var condValue = "";
					if(!$(this).find("input:eq(0)").prop("checked")){
						$(this).find("tr").each(function(){
							if($(this).find("input:checked").size() > 0){
								var zuiming = $(this).find("[name='zuiming']").text();
								condValue += "," + zuiming + "-";
								var qx = "";
								$(this).find("input:checked").each(function(){
									qx += "_"+$(this).val();
								});
								condValue += qx.substring(1);
							}
						});
					}
					cond[condKey] = condValue.substring(1);
				});
			}else if(nowTab == "_fagui"){
				type = "fagui";
				$("#fagui .level1").each(function(){
					var condKey = $(this).attr("type");
					var condValue = "";
					$(this).find("input:checked").each(function(){
						condValue += ","+$(this).val();
					});
					cond[condKey] = condValue.substring(1);
				});
				$("#fagui .dateCond").each(function(){
					var condKey = $(this).attr("type");
					$(this).find("input[name='startTime'],input[name='endTime']").each(function(){
						cond[condKey+"."+$(this).attr("name")] = $(this).val();
					});
				});
			}else if(nowTab == "_all_fagui"){
				type = "fagui";
			}
			//alert(JSON.stringify(cond));return;
			$.get("/dm/src/data/list/law",{
					keyword : $.trim($("#keyword111").val()),
					type : type,
					cond : JSON.stringify(cond),
					pn : pn,
					ps : ps,
					r : Math.random()
				},function(result){
					var dataListHtml = $("#dataList"+nowTab).empty();
					for(var i = 0; i < result.datas.length; i++){
						var dd = result.datas[i];
						var dataDetailDiv = $("<div class='dataDetail'></div>");
						if(type == "anli"){
							dataDetailDiv.append("<p><span class='dataDetailTitle' onclick='preview("+dd.id+")'>"+dd.title+"</span><span>("+dd.class3+"|"+dd.class2+"|"+dd.class1+")</span></p>");
							dataDetailDiv.append($("<p class='dataDetailInfo'></p>").append("<span>"+$("<div>"+dd.fayuan+"</div>").text()+"</span>").append("<span>"+$("<div>"+dd.anhao+"</div>").text()+"</span>").append("<span name='longDate'>"+(dd.trial_time? dd.trial_time : dd.publish_time)+"</span>"));
							dataDetailDiv.append("<div class='dataDetailContent'>"+dd.contenttext+"</div>");
						}else if(type == "fagui"){
							//dataDetailDiv.append("<p><span class='dataDetailTitle' onclick='preview("+dd.id+")'>"+dd.title+"</span><span>("+dd.category+")</span></p>");
							dataDetailDiv.append("<p><span class='dataDetailTitle' onclick='preview("+dd.id+")'>"+dd.title+"</span></p>");
							dataDetailDiv.append($("<p class='dataDetailInfo'></p>").append("<span>"+dd.law_publish_org+"</span>").append("<span>"+(dd.law_number == "None" ? "" : dd.law_number)+"</span>"));
							dataDetailDiv.append("<div class='dataDetailContent'>"+dd.contenttext+"</div>");
						}
						dataListHtml.append(dataDetailDiv);
					}
					if(dataListHtml.html() == ""){
						dataListHtml.append("<span>没有查到数据！</span>");
					}
					$("#dataList"+nowTab).find("[name='longDate']").each(function(){
						 $(this).text(getPublishTime($(this).text()));
					 });
					$("#total"+nowTab).html(result.total);
					var totalPage = Math.floor((result.total+ps-1)/ps);
					$("#totalPage"+nowTab).text(totalPage);
					$("#pageButton"+nowTab).html(genPageHTML(pn, totalPage));
					$("body").css("cursor", "auto");
					if(init !== "init")
					location.href = location.href.replace("#dataDiv","") + "#dataDiv";
			});
		}
		
		function genPageHTML(pageNo, totalPage) {
			pageNo = parseInt(pageNo);
			var groupSize = 7;
			var range = Math.floor((pageNo >= (groupSize + 1) / 2
					&& pageNo <= (totalPage - (groupSize - 1) / 2) ? groupSize
					: pageNo < (groupSize + 1) / 2 ? groupSize + 2
							* ((groupSize + 1) / 2 - pageNo) : groupSize + 2
							* (pageNo - (totalPage - (groupSize - 1) / 2))) / 2);
			var pageStr = '';
			if (totalPage > 1) {
				if (pageNo > 1) {
					pageStr += '<span class="nextPage" onclick="selectList(' + (pageNo - 1) + ');">上一页</span>';
				}
				for ( var i = 0; i < totalPage; i++) {
					if (Math.abs(i + 1 - pageNo) > range) {
						continue;
					}
					pageStr += '<span onclick="selectList('
							+ (i + 1) + ');"'
							+ (pageNo == (i + 1) ? ' class="curr"' : '') + '>' + (i + 1)
							+ '</span>';
				}
				if (pageNo < totalPage) {
					pageStr += '<span class="nextPage" onclick="selectList(' + (pageNo + 1) + ');">下一页</span>';
				}
			}

			return pageStr;
		}
		 
		 function preview(id){
			 $("body").css("cursor", "wait");
			 var nowTab = $("#nowTab").val();
			 var type = ((nowTab == "_all" && $("[name='allDataType']:checked").val() == "fagui") || nowTab == "_fagui" ? "fagui" : "anli");
			 $.get("/dm/src/data/detail/law",{
				 id : id,
				 type : type,
				r : Math.random()
			 },function(result){
				 result = result.datas[0];
				 if(type == "anli"){
					 $("#dataContent").html("<div style='text-align:center; font-size:20px; font-weight:bold;'>" + result.title + "</div></br><div name='longDate' style='text-align:center; font-size:15px; font-weight:bold;'>" + (result.trial_time? result.trial_time : result.publish_time) + "</div></br>" + result.content.replace("//W3C//DTD HTML 4.0 Transitional//EN'&gt;",""));
						
				}else if(type == "fagui"){
					 $("#dataContent").html("<div style='text-align:center; font-size:20px; font-weight:bold;'>" + result.title + "</div></br><div name='longDate' style='text-align:center; font-size:15px; font-weight:bold;'>" + result.law_publish_time + "</div></br>" + result.content);
					
				}
				 $("#dataPreview div[name='longDate']").each(function(){
					 $(this).text(getPublishTime($(this).text()));
				 });
				 $("#masklayer").show();
				 $("#dataContent").scrollTop(0);
				 $("body").css("cursor", "auto");
			 });
		 }
		 
		 function getPublishTime(publishTime){
				if(publishTime == "未知" || publishTime === "0" || isNaN(publishTime)){
					return "";
				}
				if(publishTime){
					var now = new Date(parseFloat(publishTime));
					var date = now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate();
					return date.replace(/-(\d)\b/g, "-0$1");
				}
			}
		 
		 function dragDataPreview(){
	            /*--------------拖曳效果----------------
	            *原理：标记拖曳状态dragging ,坐标位置iX, iY
	            *         mousedown:fn(){dragging = true, 记录起始坐标位置，设置鼠标捕获}
	            *         mouseover:fn(){判断如果dragging = true, 则当前坐标位置 - 记录起始坐标位置，绝对定位的元素获得差值}
	            *         mouseup:fn(){dragging = false, 释放鼠标捕获，防止冒泡}
	            */
	            var dragging = false;
	            var iX, iY;
	            $("#dragBar").mousedown(function(e) {
	                dragging = true;
	                iX = e.clientX - $("#dataPreview").position().left;
	                iY = e.clientY - $("#dataPreview").position().top;
	                this.setCapture && this.setCapture();
	                return false;
	            });
	            document.onmousemove = function(e) {
	                if (dragging) {
	                var e = e || window.event;
	                var oX = e.clientX - iX;
	                var oY = e.clientY - iY;
	                oX = oX < -850 ? -850 : oX;
	                oX = oX > $(window).width()-50 ? $(window).width() -50 : oX;
	                oY = oY < 0 ? 0 : oY;
	                oY = oY > $(window).height()-30 ? $(window).height() -30 : oY;
	                $("#dataPreview").css({"left":oX + "px", "top":oY + "px"});
	                return false;
	                }
	            };
	            $(document).mouseup(function(e) {
	                dragging = false;
	                $("#dragBar")[0].releaseCapture();
	                e.cancelBubble = true;
	            })
	 
	        }
	</script>
	


<div class="panel combo-p" style="position: absolute; z-index: 10; display: none;"><div class="combo-panel panel-body panel-body-noheader" title="" id="" style="overflow: hidden;"><div class="datebox-calendar-inner"></div></div></div><div class="panel combo-p" style="position: absolute; z-index: 10; display: none;"><div class="combo-panel panel-body panel-body-noheader" title="" id="" style="overflow: hidden;"><div class="datebox-calendar-inner"></div></div></div><div class="panel combo-p" style="position: absolute; z-index: 10; display: none;"><div class="combo-panel panel-body panel-body-noheader" title="" id="" style="overflow: hidden;"><div class="datebox-calendar-inner panel-noscroll"><div id="cc" class="easyui-calendar calendar calendar-shared calendar-noborder easyui-fluid" style="width: 0px; height: 178px;"><div class="calendar-header"><div class="calendar-nav calendar-prevmonth"></div><div class="calendar-nav calendar-nextmonth"></div><div class="calendar-nav calendar-prevyear"></div><div class="calendar-nav calendar-nextyear"></div><div class="calendar-title"><span class="calendar-text">八月 2017</span></div></div><div class="calendar-body" style="height: 156px;"><table class="calendar-dtable" cellspacing="0" cellpadding="0" border="0"><thead><tr><th>日</th><th>一</th><th>二</th><th>三</th><th>四</th><th>五</th><th>六</th></tr></thead><tbody><tr class="calendar-first"><td class="calendar-day calendar-other-month calendar-sunday calendar-first " abbr="2017,7,30" style="">30</td><td class="calendar-day calendar-other-month " abbr="2017,7,31" style="">31</td><td class="calendar-day " abbr="2017,8,1" style="">1</td><td class="calendar-day " abbr="2017,8,2" style="">2</td><td class="calendar-day " abbr="2017,8,3" style="">3</td><td class="calendar-day " abbr="2017,8,4" style="">4</td><td class="calendar-day calendar-saturday calendar-last " abbr="2017,8,5" style="">5</td></tr><tr class=""><td class="calendar-day calendar-sunday calendar-first " abbr="2017,8,6" style="">6</td><td class="calendar-day calendar-today calendar-selected " abbr="2017,8,7" style="">7</td><td class="calendar-day " abbr="2017,8,8" style="">8</td><td class="calendar-day " abbr="2017,8,9" style="">9</td><td class="calendar-day " abbr="2017,8,10" style="">10</td><td class="calendar-day " abbr="2017,8,11" style="">11</td><td class="calendar-day calendar-saturday calendar-last " abbr="2017,8,12" style="">12</td></tr><tr class=""><td class="calendar-day calendar-sunday calendar-first " abbr="2017,8,13" style="">13</td><td class="calendar-day " abbr="2017,8,14" style="">14</td><td class="calendar-day " abbr="2017,8,15" style="">15</td><td class="calendar-day " abbr="2017,8,16" style="">16</td><td class="calendar-day " abbr="2017,8,17" style="">17</td><td class="calendar-day " abbr="2017,8,18" style="">18</td><td class="calendar-day calendar-saturday calendar-last " abbr="2017,8,19" style="">19</td></tr><tr class=""><td class="calendar-day calendar-sunday calendar-first " abbr="2017,8,20" style="">20</td><td class="calendar-day " abbr="2017,8,21" style="">21</td><td class="calendar-day " abbr="2017,8,22" style="">22</td><td class="calendar-day " abbr="2017,8,23" style="">23</td><td class="calendar-day " abbr="2017,8,24" style="">24</td><td class="calendar-day " abbr="2017,8,25" style="">25</td><td class="calendar-day calendar-saturday calendar-last " abbr="2017,8,26" style="">26</td></tr><tr class=""><td class="calendar-day calendar-sunday calendar-first " abbr="2017,8,27" style="">27</td><td class="calendar-day " abbr="2017,8,28" style="">28</td><td class="calendar-day " abbr="2017,8,29" style="">29</td><td class="calendar-day " abbr="2017,8,30" style="">30</td><td class="calendar-day " abbr="2017,8,31" style="">31</td><td class="calendar-day calendar-other-month " abbr="2017,9,1" style="">1</td><td class="calendar-day calendar-other-month calendar-saturday calendar-last " abbr="2017,9,2" style="">2</td></tr><tr class="calendar-last"><td class="calendar-day calendar-other-month calendar-sunday calendar-first " abbr="2017,9,3" style="">3</td><td class="calendar-day calendar-other-month " abbr="2017,9,4" style="">4</td><td class="calendar-day calendar-other-month " abbr="2017,9,5" style="">5</td><td class="calendar-day calendar-other-month " abbr="2017,9,6" style="">6</td><td class="calendar-day calendar-other-month " abbr="2017,9,7" style="">7</td><td class="calendar-day calendar-other-month " abbr="2017,9,8" style="">8</td><td class="calendar-day calendar-other-month calendar-saturday calendar-last " abbr="2017,9,9" style="">9</td></tr></tbody></table><div class="calendar-menu" style="display: none;"><div class="calendar-menu-year-inner"><span class="calendar-nav calendar-menu-prev"></span><span><input class="calendar-menu-year" type="text"></span><span class="calendar-nav calendar-menu-next"></span></div><div class="calendar-menu-month-inner"></div></div></div></div></div></div></div><div class="panel combo-p" style="position: absolute; z-index: 10; display: none;"><div class="combo-panel panel-body panel-body-noheader" title="" id="" style="overflow: hidden;"><div class="datebox-calendar-inner panel-noscroll"><div id="cc" class="easyui-calendar calendar calendar-shared calendar-noborder easyui-fluid" style="width: 0px; height: 178px;"><div class="calendar-header"><div class="calendar-nav calendar-prevmonth"></div><div class="calendar-nav calendar-nextmonth"></div><div class="calendar-nav calendar-prevyear"></div><div class="calendar-nav calendar-nextyear"></div><div class="calendar-title"><span class="calendar-text">八月 2017</span></div></div><div class="calendar-body" style="height: 156px;"><table class="calendar-dtable" cellspacing="0" cellpadding="0" border="0"><thead><tr><th>日</th><th>一</th><th>二</th><th>三</th><th>四</th><th>五</th><th>六</th></tr></thead><tbody><tr class="calendar-first"><td class="calendar-day calendar-other-month calendar-sunday calendar-first " abbr="2017,7,30" style="">30</td><td class="calendar-day calendar-other-month " abbr="2017,7,31" style="">31</td><td class="calendar-day " abbr="2017,8,1" style="">1</td><td class="calendar-day " abbr="2017,8,2" style="">2</td><td class="calendar-day " abbr="2017,8,3" style="">3</td><td class="calendar-day " abbr="2017,8,4" style="">4</td><td class="calendar-day calendar-saturday calendar-last " abbr="2017,8,5" style="">5</td></tr><tr class=""><td class="calendar-day calendar-sunday calendar-first " abbr="2017,8,6" style="">6</td><td class="calendar-day calendar-today calendar-selected " abbr="2017,8,7" style="">7</td><td class="calendar-day " abbr="2017,8,8" style="">8</td><td class="calendar-day " abbr="2017,8,9" style="">9</td><td class="calendar-day " abbr="2017,8,10" style="">10</td><td class="calendar-day " abbr="2017,8,11" style="">11</td><td class="calendar-day calendar-saturday calendar-last " abbr="2017,8,12" style="">12</td></tr><tr class=""><td class="calendar-day calendar-sunday calendar-first " abbr="2017,8,13" style="">13</td><td class="calendar-day " abbr="2017,8,14" style="">14</td><td class="calendar-day " abbr="2017,8,15" style="">15</td><td class="calendar-day " abbr="2017,8,16" style="">16</td><td class="calendar-day " abbr="2017,8,17" style="">17</td><td class="calendar-day " abbr="2017,8,18" style="">18</td><td class="calendar-day calendar-saturday calendar-last " abbr="2017,8,19" style="">19</td></tr><tr class=""><td class="calendar-day calendar-sunday calendar-first " abbr="2017,8,20" style="">20</td><td class="calendar-day " abbr="2017,8,21" style="">21</td><td class="calendar-day " abbr="2017,8,22" style="">22</td><td class="calendar-day " abbr="2017,8,23" style="">23</td><td class="calendar-day " abbr="2017,8,24" style="">24</td><td class="calendar-day " abbr="2017,8,25" style="">25</td><td class="calendar-day calendar-saturday calendar-last " abbr="2017,8,26" style="">26</td></tr><tr class=""><td class="calendar-day calendar-sunday calendar-first " abbr="2017,8,27" style="">27</td><td class="calendar-day " abbr="2017,8,28" style="">28</td><td class="calendar-day " abbr="2017,8,29" style="">29</td><td class="calendar-day " abbr="2017,8,30" style="">30</td><td class="calendar-day " abbr="2017,8,31" style="">31</td><td class="calendar-day calendar-other-month " abbr="2017,9,1" style="">1</td><td class="calendar-day calendar-other-month calendar-saturday calendar-last " abbr="2017,9,2" style="">2</td></tr><tr class="calendar-last"><td class="calendar-day calendar-other-month calendar-sunday calendar-first " abbr="2017,9,3" style="">3</td><td class="calendar-day calendar-other-month " abbr="2017,9,4" style="">4</td><td class="calendar-day calendar-other-month " abbr="2017,9,5" style="">5</td><td class="calendar-day calendar-other-month " abbr="2017,9,6" style="">6</td><td class="calendar-day calendar-other-month " abbr="2017,9,7" style="">7</td><td class="calendar-day calendar-other-month " abbr="2017,9,8" style="">8</td><td class="calendar-day calendar-other-month calendar-saturday calendar-last " abbr="2017,9,9" style="">9</td></tr></tbody></table><div class="calendar-menu" style="display: none;"><div class="calendar-menu-year-inner"><span class="calendar-nav calendar-menu-prev"></span><span><input class="calendar-menu-year" type="text"></span><span class="calendar-nav calendar-menu-next"></span></div><div class="calendar-menu-month-inner"></div></div></div></div></div></div></div></body></html>
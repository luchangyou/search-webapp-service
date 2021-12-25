<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<script>
 function gs(){
	 var org=document.getElementById("org");
	 var shuxing=document.getElementById("shuxing");
	 org.style.display="none";
	 shuxing.style.display="block";
 }
       
 function zz(){
	 var org=document.getElementById("org");
	 var shuxing=document.getElementById("shuxing");
	 org.style.display="block";
	 shuxing.style.display="none";
 }
 $(document).ready(function(){
	 var gongshang=document.getElementById("gongshang");
	 var value=gongshang.value;
	 if(value=="gsdata"){
		 var org=document.getElementById("org");
		 var shuxing=document.getElementById("shuxing");
		 org.style.display="none";
		 shuxing.style.display="block";
	 }
 });
</script>
        <input type="hidden" id="gongshang" value="${gongshangtype}"/>
            <c:if test="${param.channel eq 'event'}">
            <div class="w98 clearfix">
                <span class="clearfix pos">
                    <span class="selectStyle"><span class="selectVal" id="cmethod" value="${cmethod}">${empty cmethod_text ? "不限类型" : cmethod_text }</span><i></i></span>
                    <ul class="searchDetail" style="display:none" cname="cmethod">
                        <li><a href="javascript:void(0)" value="">不限类型</a></li>
                        <li><a href="javascript:void(0)" value="投融资事件">投融资事件</a></li>
                        <li><a href="javascript:void(0)" value="招聘事件">招聘事件</a></li>
                        <li><a href="javascript:void(0)" value="并购事件">并购事件</a></li>
                    </ul>
                </span>
            </div>
            </c:if>
        	<c:if test="${param.channel eq 'event' }">
            <div class="w98 clearfix">
                <span class="clearfix pos">
                    <span class="selectStyle"><span class="selectVal" id="ctime">${empty ctime ? "不限时间" : ctime }</span><i></i></span>
                    <ul class="searchDetail" style="display:none" cname="ctime">
                        <li><a href="javascript:void(0)">不限时间</a></li>
                        <c:if test="${param.channel ne 'event' }">
                        <li><a href="javascript:void(0)">过去1小时内</a></li>
                        </c:if>
                        <li><a href="javascript:void(0)">过去1天内</a></li>
                        <li><a href="javascript:void(0)">过去1周内</a></li>
                        <li><a href="javascript:void(0)">过去1个月内</a></li>
                        <li><a href="javascript:void(0)">过去1年内</a></li>
                        <!-- <li><a href="javascript:void(0)" id="customLi">自定义时间</a></li>
                        <li class="dateSearch">
                            <label>时间范围：</label><input type="text"/> <label>-</label><input type="text"/> <span>搜索</span>
                        </li> -->
                    </ul>
                </span>
            </div>
            </c:if>
        	<c:if test="${param.channel eq 'event'}">
            <div class="w98 clearfix">
                <span class="clearfix pos">
                    <span class="selectStyle"><span class="selectVal" id="cprice">${empty cprice ? "不限金额" : cprice }</span><i></i></span>
                    <ul class="searchDetail" style="display:none" cname="cprice">
                        <li><a href="javascript:void(0)">不限金额</a></li>
                        <li><a href="javascript:void(0)">500万以内</a></li>
                        <li><a href="javascript:void(0)">500万-2000万</a></li>
                        <li><a href="javascript:void(0)">2000万-5000万</a></li>
                        <li><a href="javascript:void(0)">5000万以上</a></li>
                    </ul>
                </span>
            </div>
            </c:if>
        </div>
        <c:if test="${param.channel eq 'event'}">
        <span class="filter" tag="1" style="text-decoration: none; cursor:default;">条件筛选</span>
        </c:if>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<div class="clearfix w590">
	<div class="clearfix filterDiv" <c:if test="${param.channel eq 'all'}">style="height:20px;"</c:if>>
    <jsp:include page="/WEB-INF/views/list-condition.jsp"></jsp:include>
    </div>
   <%--  <jsp:include page="/WEB-INF/views/list-recommendation-keyword.jsp"></jsp:include> --%>
   <br>
    <div class="clearfix dataList">
<!--     	<c:if test="${empty map.datas }"> -->
<!--     	<input type="hidden" value="empty" id="mainDatalist" /> -->
<!--     	<div class="emptyResult"> -->
<!--     	<p>抱歉，未搜索到与“${keyword }”匹配的结果！</p> -->
<!-- 		<p>为了更好的方便您的检索，请您输入精确关键词进行搜索</p> -->
<!-- 		<p>例如：<a href="/search-webapp-service/list?channel=org&pg=1&keyword=白云机场">白云机场</a> -->
<!-- 		<a href="/search-webapp-service/list?channel=person&pg=1&keyword=肖刚">肖刚</a> -->
<!-- 		<a href="/search-webapp-service/list?channel=knowledge&pg=1&keyword=獐子岛事件">獐子岛事件</a> -->
<!-- 		</p> -->
<!-- 		</div> -->
<!--     	</c:if> -->
    	<c:if test="${!empty basPersonInfoList}">
			<c:forEach items="${basPersonInfoList }" var="listOne"
				varStatus="status">
				<div class="listContent clearfix">
					<div class="clearfix titleAndTime">
						<a href="${pageContext.request.contextPath}/person/detail?id=${listOne.id}"><c:if test="${param.channel eq 'all' }">[人物]</c:if>${fn:trim(listOne.name) }</a>
						<span></span>
					</div>
					<p class="clearfix contentStyle">人物类别：'--'</p>
					<p class="clearfix contentStyle">性　　别：${empty listOne.sex ? '--':listOne.sex}</p>
					<p class="clearfix contentStyle">学　　历：${empty listOne.diploma ? '--':listOne.diploma}</p>
					<p class="clearfix contentStyle">职　　务：${empty listOne.job ? '--':listOne.job}</p>
					<p class="clearfix contentStyle">公司名称：${empty listOne.oname ? '--':listOne.oname}</p>
					<!-- <div class="clearfix contentStyle">
				<ul class="osList">
					<li><a href="javascript:gotoOtherSearchEngine(&#39;baidu&#39;,&#39;张元贞&#39;);">
						<div>
								<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAABIAAAASABGyWs+AAAACXZwQWcAAAAQAAAAEABcxq3DAAABx0lEQVQ4y6WTz2sTYRCGn90kZk2bQ6TU5tCIoIcVRdhSIkERoYoHBSmUQs3J9OCPg+depJcevBREEFSKCioiRPIHCB6UYAkWQdoq6GGTSpvQRpNGzW6THQ+hsdskFOx7nPnm/Z755htFN0xhF/ICLHyI/FfxkYEsarvE6ze/OX4iRzJVAeD+TJnJqSJ1pwPBdr18VWFjQ3j8bJ1w2Mudez8BiEU1zg0FXGddBMUfjSsCgUZ4X0hlebnWzG/G2xLMfbSIJ/JEBzVuTYTQ/AqXR4NE+r3MZiyOHd3D4UM+0rNVYlHtn4NumCIicnu6KLphim6Y8vWbLe106uyS6IYpT1+URUREN0xpMoX7GjCaX6Gnx8P8os3w2Aoj8RWWvteoWsLqWh2AhUW7tYWx0SChkMrBAz5KJYcrVwusVxpvMn6jwPNHfcSiGpk5i6EzgVYDjwoXznexulYnnsg3iwGyuRrXbhZ48nA/ml/pPIVS2SGeyJPN1diuT/M249cLLuMWg2Sq0rZ466SSqV+dDXw+hZ3kOO7Vcf3ESxe7eJv+w7t0lUi/l9Mn9+LxwPuMxecvNoMDfkaGuzsbBLtVHtzt3ZFiq5TdrvNf2a29WJ7uSvYAAAAldEVYdGRhdGU6Y3JlYXRlADIwMTMtMDMtMDhUMDQ6NTQ6NDgrMDg6MDBZUOW1AAAAJXRFWHRkYXRlOm1vZGlmeQAyMDEzLTAzLTA4VDA0OjU0OjQ4KzA4OjAwKA1dCQAAAABJRU5ErkJggg==">百度百科
							</div></a></li>
					<li><a href="javascript:gotoOtherSearchEngine(&#39;wiki&#39;,&#39;张元贞&#39;);">
						<div>
								<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABHNCSVQICAgIfAhkiAAAAeZJREFUOI2tk79rGmEYxz9JQUqgmIRAszTTWYQidgjFQfSOk0SCkJOkXW4TM6TgHjqc+RP8P4pyUzL0jmZwKaGYayik5YXTITRUr3oO0sFgh5C3sXUp6QPv8D4838/z633nxtfjCfew+fuI/w/AdV1M06SwVcB1XQDqb+sUtgpYloUQAgDLsjBNEyEEQggqlQqmaTKv6zqJZwnanbak7rzcAaBRbwAQdAMWHi6gqRqKorAUXQJAU7WbFnZf7RIOQmzbJugGABhFg3AQ4rU8fN/n8tsl5b3yVPnlvfINQFEUMmoGu2Hj+z4AqqaSTCapHlZxHAc1o0rh2aczeZdDLJVKADiOwy3UKBqIr4Lzz+eyraAbcPrhlMXlxWmAruskk0mazaYcnKqppFIpwn4os/fDPqOfI3RdnwYApNNpnHcOXsub6rXdacsNnbw/Ye3J2u813g08eHOA8lShYTcIugFeyyPxPMHK8gq2bQPQ6/YoGkWpeWBVrcO7kGE4pPWxxdX3K1Yfr7JtbDMYDjg+OiYSiTAajdjIb8yuACAWi9H70ZNvQFEUstksALVajVwuNy0YX48nf578Zn6S38xPLr5cSN/+6/1JPB7/K3Zu1m90XZfooyjrL9alTwhBp9OR07+1mYB/sV98se4q5Qco0AAAAABJRU5ErkJggg==">维基百科
							</div></a></li>
					<li><a href="javascript:gotoOtherSearchEngine(&#39;sogou&#39;,&#39;张元贞&#39;);">
						<div>
								<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAA7EAAAOxAGVKw4bAAAC8klEQVQokTXSa09TZxwA8P//OU97Ti/2coootLYIYxQRmXir4FyGgrxQ1hiXGONI5juTJfsGJn4OX6khzqjbNDOCAULCqgMRb9BSW4qlFAq9WQqnPZxznuOLxU/we/NDpuoMGQPVgHo1v5p+9bIcmcPiZ44I6PHuOX5E9B9EagXgdARCCOqqwhgDJuenJ6Mjf+3wptpGv+hyVKvV9cTyZmqxvrnp2+AVY22TDkgoQVXdRsZSE8Ox8fG2M7113afBZANAAABglcTi24e3mSofHfzNUOcjHEXGpGL4zbs/7nQEf7bt2Vd6P7W1+klTmGAxWz0+S3M7ZzS+vnuL8JaOa9eJpYbqVenj8+GGQyeMqhy/+TuXjskckwnVdAQdNatjd8+A/8z5Vw+GclP/1vYEqRSP4HahrnMg82iIX4k6nSZ2tNtyqk/WDVIisTY7I+VztN63v7U9PfWitidIM5GkXXRTl4fyZkbRSHaUYloppM2HumydXXsHrihliRNdrhZ/MjoHAFSVSnang1h2ib3B9XJuIx4S0uGdf1a00HPe2+o4ftbkPwlUIKJzGwAAKKCMhEcOzQc6vO4bW7Nj2/MvIJUQsmtacmFletLVN+jsuwwIOgIAUM5sLeVzNZVK9v1rsyjav//JFuhXUnEl9ASmRw0bmeLon9b2E1qlZPpfEBsPRGN/+zZWMyOPKwtzvkBAaG0zu+woGBQdNRl0QCBaeTFqE0wAQJ0tB3fGnmbDs77Tp5LZ1czEsDr+mKMoaDLPNNXhcfZfVkFIvJlvOtkNAKgxNTsTCj+5d+yXX8173fJSTF5f1op5Xdc4526Lt93o+2ZhbLiQigeuDhKbB1VFBkVdGnm4NDN9+OKlms4AgACgf90BAErpvzFGwH6km3C7KCFUp2T/uQs8Tz/cHzJMjLtb2hx2sVqprhdyrsYGtlmMjD5r+qHXDgYAQMYYQ0CmEKZKy5+SoZflWJiTChoi5/Y59nkykWh9x3feH/vRZCMc/QJmwFdLBRcT7gAAAABJRU5ErkJggg==">搜狗百科
							</div></a></li>
					<li><a href="javascript:gotoOtherSearchEngine(&#39;haosou&#39;,&#39;张元贞&#39;);">
						<div>
								<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAA7EAAAOxAGVKw4bAAADE0lEQVQokSXBXWxTVRwA8HPOvbf3tl3pxspcuw42aTvYDMPoNDgcOjCoU99QghCEZA/iEmKEB4h70MiLX08aJC5+RBeNUyAhwaFkmAVhjWPZR6Rb9wHMtZ1tb3vb3d7dj3PO3wd/P8w5RcAYF4goMJYzUqO2Oj5zw7Pwa1tjKBjr3hh8oUmsky1mKliUsIBtyjFlRBacwmh57GOnMOIPrJPa5rvXO/9899kaTje3wI4zu31HW8GxuYCxY6kgbTQXRsm3B7GQkXf3sfZ9WNkhVbnVJE4NpZ0P415dD3ywq/rMUzrXkc1sKzuXfiuWe9NdnP46SxkDsAAMU9V5HsAyH9DFJ37JoHPa0LwBjkgJsb773BtPip8OlLYffPvG6fce7/shebXkc7KqGaneVHblz37zmrdL1z6ZcO1tICSTQYODJNaV7+h549apKzB69v6FoX+HfUrgHp+sKNbAzOXZiCacesQ1lqZ3VOJMT2nJwsrzvQFX4EB4b6vy8E5/qyFIhqV6ERG4rXg8ksVcL24lkqs0NU/s2bsDPX2TL/d4sLjnoQ6gkg+E+ip5XEuMm/mb9r2oEJQdLwS85brKsDAh3o+0fxF55Rz35azc63+9s2CmtTW6VWpaFct+RuoMWiOFZbcfGcZn3WPlSJhUujrVUCBRNDYIyvGWY21VzQea9y05xRI3DkVfmq+klt2kWfD/zebO7xqL1YZJ1OPeLtOfVpkFPlQx8uX1vJXZ6d2SVFM/L/2WcrQ2pbrs8B+zw9hVebKxCwNnAxm9N8FPhKynxVvBqi2MV26qk53hjkYpuGj8M5tflsW18zP97f5nvtwziCi1i4zun0uhi+nT41bJsuF/HIACULhduPzc9abHLrXezsUBAFuUSgyyQHunzCsJrYZIhzavHXs0s0FeXdQXfy+MxJf/qBciRWggReX4tiOYMWZycGHsoPWv5q0LE/rMLK2tH+7u+Ah5Vnx2fbv38KsNJ96Pn/xeu1Srt2DOOQAAQhghQnDZsadXWWIFYbYUbcxHg6EQiSGRjaSu9cf772gP/gPrmaxzNiH9sQAAAABJRU5ErkJggg==">好搜百科
							</div></a></li>
				</ul>
			</div> -->
				</div>
			</c:forEach>
			<%-- 人物:
          <c:forEach items="${basPersonInfoList }" var="listOne" varStatus="status">
           	<p>${listOne.name }+"--"+${listOne.enname }+"--"+${listOne.age }+"--"+${listOne.alias }</p>
           </c:forEach> --%>
			<hr />
		</c:if>

		<c:if test="${!empty basKnowledgeInfoList}">
			<c:forEach items="${basKnowledgeInfoList }" var="listOne"
				varStatus="status">
				<div class="listContent clearfix">
					<div class="clearfix titleAndTime">
						<a href="${pageContext.request.contextPath}/knowledge/detail?id=${listOne.id}"><c:if test="${param.channel eq 'all' }">[知识]</c:if>${listOne.title }<font></font></a>
						<span name="day">${fn:trim(listOne.ptime) }</span>
					</div>
					<div class="clearfix contentStyle">摘要：${fn:substring(fn:trim(listOne.main), 0, 150)}${(fn:length(fn:trim(listOne.main)) > 150 ? '...' : '')}...</div>
					<c:set var="knowUrl"
						value="${fn:substring(fn:trim(listOne.url), 0, 50)}${(fn:length(fn:trim(listOne.url)) > 50 ? '...' : '')}&nbsp;&nbsp;&nbsp;&nbsp;" />
					<div class="clearfix url">${empty fn:trim(listOne.url) ? '' : knowUrl }<span
							name="date"> <fmt:formatDate value="${listOne.ctime }" pattern="yyyy-MM-dd HH:mm:ss" /></span>
					</div>
				</div>
			</c:forEach>
			<hr />
		</c:if>

		<c:if test="${!empty basEventInfoList}">
			<c:forEach items="${basEventInfoList }" var="listOne"
				varStatus="status">
				<div class="listContent clearfix">
		            <div class="clearfix titleAndTime">
		                <a href="${pageContext.request.contextPath}/event/detail?id=${listOne.id}"><c:if test="${param.channel eq 'all' }">[事件]</c:if>${fn:trim(listOne.title ) }</a>
		                <%-- <span name="day">${fn:trim(data.crawl_datetime) }</span> --%>
		            </div>
		            <div class="clearfix contentStyle">
						<table width="100%">
							<tbody>
								<tr><td>所在地区：'--'</td><td>数据来源：${empty fn:trim(listOne.source ) ? '--' : fn:trim(listOne.source ) }</td></tr>
								<tr><td>开始日期：'--'</td><td>截止日期：'--'</td></tr>
							</tbody>
						</table>
					</div>
            		<c:set var="eventUrl" value="${fn:substring(fn:trim(listOne.url), 0, 50)}${(fn:length(fn:trim(listOne.url)) > 50 ? '...' : '')}&nbsp;&nbsp;&nbsp;&nbsp;"/>
            		<div class="clearfix url"><a href="${fn:trim(listOne.url)}" target="_blank" class="url">${empty fn:trim(listOne.url) ? '' : eventUrl }</a><%-- <span name="date">${empty data.publish_time ? (empty data.crawl_datetime ? "" : data.crawl_datetime) : data.publish_time}</span> --%></div>
        		</div>
			</c:forEach>
			<hr />
		</c:if>

		<c:if test="${!empty basOrganizeInfoList}">
			<c:forEach items="${basOrganizeInfoList }" var="listOne"
				varStatus="status">
				<div class="listContent clearfix">
					<div class="clearfix titleAndTime">
						<a href="${pageContext.request.contextPath}/organize/detail?uuid=${listOne.uuid}"><c:if test="${param.channel eq 'org' }">[组织]</c:if>${listOne.oname }<font></font></a>
						<span name="day"></span>
					</div>
					<p class="clearfix contentStyle">公司简称：${empty listOne.shortname ? '--':listOne.shortname}</p>
					<p class="clearfix contentStyle">公司类别：${empty listOne.companyNature ? '--':listOne.companyNature}</p>
					<p class="clearfix contentStyle">所属行业：${empty listOne.industry ? '--':listOne.industry}</p>
					<p class="clearfix contentStyle">公司地址：${empty listOne.address ? '--':listOne.address}</p>
					<p class="clearfix contentStyle">公司网站：${empty listOne.web ? '--':listOne.web}</p>
					<p class="clearfix contentStyle">主营业务：${empty listOne.managementField ? '--':listOne.managementField}</p>
					<p class="clearfix contentStyle">公司简介：${empty listOne.introduce ? '--':listOne.introduce}</p>

					<!-- <div class="clearfix contentStyle">
						<ul class="osList">
							<li><a href="javascript:gotoOtherSearchEngine(&#39;baidu&#39;,&#39;张元贞&#39;);">
								<div>
										<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAABIAAAASABGyWs+AAAACXZwQWcAAAAQAAAAEABcxq3DAAABx0lEQVQ4y6WTz2sTYRCGn90kZk2bQ6TU5tCIoIcVRdhSIkERoYoHBSmUQs3J9OCPg+depJcevBREEFSKCioiRPIHCB6UYAkWQdoq6GGTSpvQRpNGzW6THQ+hsdskFOx7nPnm/Z755htFN0xhF/ICLHyI/FfxkYEsarvE6ze/OX4iRzJVAeD+TJnJqSJ1pwPBdr18VWFjQ3j8bJ1w2Mudez8BiEU1zg0FXGddBMUfjSsCgUZ4X0hlebnWzG/G2xLMfbSIJ/JEBzVuTYTQ/AqXR4NE+r3MZiyOHd3D4UM+0rNVYlHtn4NumCIicnu6KLphim6Y8vWbLe106uyS6IYpT1+URUREN0xpMoX7GjCaX6Gnx8P8os3w2Aoj8RWWvteoWsLqWh2AhUW7tYWx0SChkMrBAz5KJYcrVwusVxpvMn6jwPNHfcSiGpk5i6EzgVYDjwoXznexulYnnsg3iwGyuRrXbhZ48nA/ml/pPIVS2SGeyJPN1diuT/M249cLLuMWg2Sq0rZ466SSqV+dDXw+hZ3kOO7Vcf3ESxe7eJv+w7t0lUi/l9Mn9+LxwPuMxecvNoMDfkaGuzsbBLtVHtzt3ZFiq5TdrvNf2a29WJ7uSvYAAAAldEVYdGRhdGU6Y3JlYXRlADIwMTMtMDMtMDhUMDQ6NTQ6NDgrMDg6MDBZUOW1AAAAJXRFWHRkYXRlOm1vZGlmeQAyMDEzLTAzLTA4VDA0OjU0OjQ4KzA4OjAwKA1dCQAAAABJRU5ErkJggg==">百度百科
									</div></a></li>
							<li><a href="javascript:gotoOtherSearchEngine(&#39;wiki&#39;,&#39;张元贞&#39;);">
								<div>
										<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABHNCSVQICAgIfAhkiAAAAeZJREFUOI2tk79rGmEYxz9JQUqgmIRAszTTWYQidgjFQfSOk0SCkJOkXW4TM6TgHjqc+RP8P4pyUzL0jmZwKaGYayik5YXTITRUr3oO0sFgh5C3sXUp6QPv8D4838/z633nxtfjCfew+fuI/w/AdV1M06SwVcB1XQDqb+sUtgpYloUQAgDLsjBNEyEEQggqlQqmaTKv6zqJZwnanbak7rzcAaBRbwAQdAMWHi6gqRqKorAUXQJAU7WbFnZf7RIOQmzbJugGABhFg3AQ4rU8fN/n8tsl5b3yVPnlvfINQFEUMmoGu2Hj+z4AqqaSTCapHlZxHAc1o0rh2aczeZdDLJVKADiOwy3UKBqIr4Lzz+eyraAbcPrhlMXlxWmAruskk0mazaYcnKqppFIpwn4os/fDPqOfI3RdnwYApNNpnHcOXsub6rXdacsNnbw/Ye3J2u813g08eHOA8lShYTcIugFeyyPxPMHK8gq2bQPQ6/YoGkWpeWBVrcO7kGE4pPWxxdX3K1Yfr7JtbDMYDjg+OiYSiTAajdjIb8yuACAWi9H70ZNvQFEUstksALVajVwuNy0YX48nf578Zn6S38xPLr5cSN/+6/1JPB7/K3Zu1m90XZfooyjrL9alTwhBp9OR07+1mYB/sV98se4q5Qco0AAAAABJRU5ErkJggg==">维基百科
									</div></a></li>
							<li><a href="javascript:gotoOtherSearchEngine(&#39;sogou&#39;,&#39;张元贞&#39;);">
								<div>
										<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAA7EAAAOxAGVKw4bAAAC8klEQVQokTXSa09TZxwA8P//OU97Ti/2coootLYIYxQRmXir4FyGgrxQ1hiXGONI5juTJfsGJn4OX6khzqjbNDOCAULCqgMRb9BSW4qlFAq9WQqnPZxznuOLxU/we/NDpuoMGQPVgHo1v5p+9bIcmcPiZ44I6PHuOX5E9B9EagXgdARCCOqqwhgDJuenJ6Mjf+3wptpGv+hyVKvV9cTyZmqxvrnp2+AVY22TDkgoQVXdRsZSE8Ox8fG2M7113afBZANAAABglcTi24e3mSofHfzNUOcjHEXGpGL4zbs/7nQEf7bt2Vd6P7W1+klTmGAxWz0+S3M7ZzS+vnuL8JaOa9eJpYbqVenj8+GGQyeMqhy/+TuXjskckwnVdAQdNatjd8+A/8z5Vw+GclP/1vYEqRSP4HahrnMg82iIX4k6nSZ2tNtyqk/WDVIisTY7I+VztN63v7U9PfWitidIM5GkXXRTl4fyZkbRSHaUYloppM2HumydXXsHrihliRNdrhZ/MjoHAFSVSnang1h2ib3B9XJuIx4S0uGdf1a00HPe2+o4ftbkPwlUIKJzGwAAKKCMhEcOzQc6vO4bW7Nj2/MvIJUQsmtacmFletLVN+jsuwwIOgIAUM5sLeVzNZVK9v1rsyjav//JFuhXUnEl9ASmRw0bmeLon9b2E1qlZPpfEBsPRGN/+zZWMyOPKwtzvkBAaG0zu+woGBQdNRl0QCBaeTFqE0wAQJ0tB3fGnmbDs77Tp5LZ1czEsDr+mKMoaDLPNNXhcfZfVkFIvJlvOtkNAKgxNTsTCj+5d+yXX8173fJSTF5f1op5Xdc4526Lt93o+2ZhbLiQigeuDhKbB1VFBkVdGnm4NDN9+OKlms4AgACgf90BAErpvzFGwH6km3C7KCFUp2T/uQs8Tz/cHzJMjLtb2hx2sVqprhdyrsYGtlmMjD5r+qHXDgYAQMYYQ0CmEKZKy5+SoZflWJiTChoi5/Y59nkykWh9x3feH/vRZCMc/QJmwFdLBRcT7gAAAABJRU5ErkJggg==">搜狗百科
									</div></a></li>
							<li><a href="javascript:gotoOtherSearchEngine(&#39;haosou&#39;,&#39;张元贞&#39;);">
								<div>
										<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAA7EAAAOxAGVKw4bAAADE0lEQVQokSXBXWxTVRwA8HPOvbf3tl3pxspcuw42aTvYDMPoNDgcOjCoU99QghCEZA/iEmKEB4h70MiLX08aJC5+RBeNUyAhwaFkmAVhjWPZR6Rb9wHMtZ1tb3vb3d7dj3PO3wd/P8w5RcAYF4goMJYzUqO2Oj5zw7Pwa1tjKBjr3hh8oUmsky1mKliUsIBtyjFlRBacwmh57GOnMOIPrJPa5rvXO/9899kaTje3wI4zu31HW8GxuYCxY6kgbTQXRsm3B7GQkXf3sfZ9WNkhVbnVJE4NpZ0P415dD3ywq/rMUzrXkc1sKzuXfiuWe9NdnP46SxkDsAAMU9V5HsAyH9DFJ37JoHPa0LwBjkgJsb773BtPip8OlLYffPvG6fce7/shebXkc7KqGaneVHblz37zmrdL1z6ZcO1tICSTQYODJNaV7+h549apKzB69v6FoX+HfUrgHp+sKNbAzOXZiCacesQ1lqZ3VOJMT2nJwsrzvQFX4EB4b6vy8E5/qyFIhqV6ERG4rXg8ksVcL24lkqs0NU/s2bsDPX2TL/d4sLjnoQ6gkg+E+ip5XEuMm/mb9r2oEJQdLwS85brKsDAh3o+0fxF55Rz35azc63+9s2CmtTW6VWpaFct+RuoMWiOFZbcfGcZn3WPlSJhUujrVUCBRNDYIyvGWY21VzQea9y05xRI3DkVfmq+klt2kWfD/zebO7xqL1YZJ1OPeLtOfVpkFPlQx8uX1vJXZ6d2SVFM/L/2WcrQ2pbrs8B+zw9hVebKxCwNnAxm9N8FPhKynxVvBqi2MV26qk53hjkYpuGj8M5tflsW18zP97f5nvtwziCi1i4zun0uhi+nT41bJsuF/HIACULhduPzc9abHLrXezsUBAFuUSgyyQHunzCsJrYZIhzavHXs0s0FeXdQXfy+MxJf/qBciRWggReX4tiOYMWZycGHsoPWv5q0LE/rMLK2tH+7u+Ah5Vnx2fbv38KsNJ96Pn/xeu1Srt2DOOQAAQhghQnDZsadXWWIFYbYUbcxHg6EQiSGRjaSu9cf772gP/gPrmaxzNiH9sQAAAABJRU5ErkJggg==">好搜百科
									</div></a></li>
						</ul>
					</div> -->
				</div>
				<!--              	<p>${listOne.oname }+"--"+${listOne.ename }+"--"+${listOne.shortname }+"--"+${listOne.fullname }</p> -->
			</c:forEach>
			<hr />
		</c:if>

		<!-- 产品 -->
		<c:if test="${!empty proGameInfoList}">
			<c:forEach items="${proGameInfoList }" var="listOne"
				varStatus="status">
				<div class="listContent clearfix">
					<div class="clearfix titleAndTime">
						<a href="${pageContext.request.contextPath}/game/detail?id=${listOne.id}"><c:if test="${param.channel eq 'all' }">[产品]</c:if>${fn:trim(listOne.gname) }</a>
						<span></span>
					</div>
					<p class="clearfix contentStyle">游戏风格：${empty listOne.gstyle ? '--':listOne.gstyle}</p>
					<p class="clearfix contentStyle">游戏画面：${empty listOne.gamespy ? '--':listOne.gamespy}</p>
					<p class="clearfix contentStyle">游戏引擎：${empty listOne.engine ? '--':listOne.engine}</p>
					<p class="clearfix contentStyle">研发公司：${empty listOne.developCom ? '--':listOne.developCom}</p>
					<p class="clearfix contentStyle">运营商：${empty listOne.operator ? '--':listOne.operator}</p>
				</div>
			</c:forEach>
			<%-- 人物:
          <c:forEach items="${basPersonInfoList }" var="listOne" varStatus="status">
           	<p>${listOne.name }+"--"+${listOne.enname }+"--"+${listOne.age }+"--"+${listOne.alias }</p>
           </c:forEach> --%>
			<hr />
		</c:if>
	</div>
    <jsp:include page="/WEB-INF/views/paging.jsp">
	    <jsp:param value="list" name="sourcetype"/>
	</jsp:include>
</div>

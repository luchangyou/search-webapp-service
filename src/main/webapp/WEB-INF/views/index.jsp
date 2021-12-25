<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<link rel="SHORTCUT ICON" href="http://static.gintong.com/resources/images/v4/favicon.ico" type="image/x-icon">
		<link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/logout_files/login.css">
		<script src="/search-webapp-service/resources/logout_files/jquery.js" type="text/javascript"></script>
	</head>
	<body>
		<input value="lgpf80g" type="hidden">
		<div class="loginMain cl" style="">
			<div class="loginForm" style="margin-top: 289.5px; margin-bottom: 289.5px;">
				<div class="login_logo">
					<img src="/search-webapp-service/resources/logout_files/logo.png">
					<p>金桐网数据管理系统</p>
				</div>
				<p id="remind" style="visibility: hidden;">
					<span class="remind_icon"></span>
					<i class="remind_cont"></i>
				</p><p>
				</p>
				<form id="loginForm" action="${pageContext.request.contextPath}/user/login" method="post">
				<p id="username_box"><span class="usernameho_icon" id="usn_icon"></span><input placeholder="请输入用户名" id="username" name="userName" type="text"></p>
				<p id="password_box"><span class="password_icon" id="pw_icon"></span><input value="" placeholder="请输入密码" id="password" name="passWord" type="password"></p>				
				<p id="remember_pw">
					<!-- <input type="checkbox" name="rbpw" id="check"/>
					<i>记住我的密码</i>
					<b>忘记密码？</b> -->
				</p>
				<p class="login_btn" onclick="login();" style="cursor: pointer;"></p>
				</form>
			</div>			
		</div>
	
	<script>
		$(document).ready(function(){
			$("#username").on("focus",function(){
				$("#usn_icon").removeClass("username_icon").addClass("usernameho_icon");
			}).focus();
			$("#password").on("focus",function(){
				$("#pw_icon").removeClass("password_icon").addClass("passwordho_icon");
			});
			$("#username, #password").on("keydown",function(event){
				if(event.keyCode == 13){
					login();
				}
			});
			if($(window).height() > 368){
				$(".loginForm").css({"margin-top":$(window).height()/2-184,"margin-bottom":$(window).height()/2-184});
			}
		});
		function login(){
		
			var userName = $.trim($("#username").val());
			var pwd = $.trim($("#password").val());
			if(!userName){
				$(".remind_cont").text("请输入用户名");
				$("#remind").css("visibility","visible");
				return;
			}
			if(!pwd){
				$(".remind_cont").text("请输入密码");
				$("#remind").css("visibility","visible");
				return;
			}
			$("#remind").css("visibility","hidden");
			
			document.getElementById("loginForm").submit();
		}
	</script>

</body></html>
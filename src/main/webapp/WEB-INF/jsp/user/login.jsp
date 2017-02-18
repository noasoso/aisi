<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="ui-page-login">

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title></title>
		<link href="/css/mui.min.css" rel="stylesheet" />
		<link href="/css/login.css" rel="stylesheet" />
		<link href="/css/style.css" rel="stylesheet" />
		<script src="/js/mui.min.js"></script>
		<script src="/js/mui.enterfocus.js"></script>
	</head>

	<body>
		<header class="mui-bar mui-bar-nav">
			<h1 class="mui-title">登录</h1>
		</header>
		<div class="mui-content">
			<form id='login-form' class="mui-input-group">
				<div class="mui-input-row">
					<label>账号</label>
					<input id='account' type="text" class="mui-input-clear mui-input" placeholder="请输入账号">
				</div>
				<div class="mui-input-row">
					<label>密码</label>
					<input id='password' type="password" class="mui-input-clear mui-input" placeholder="请输入密码">
				</div>
			</form>
			<div class="mui-content-padded">
			<p>默认帐号为您的“微信号”</p>
			<p>默认密码为身份证后六位 </p>
			<p>首次登入后请更改密码。</p>
			</div>
			<div class="mui-content-padded">
				<button id='login' class="mui-btn mui-btn-block mui-btn-primary">登录</button>
				<div class="link-area">
					<a id='reg'>申请代理</a> 
				</div>
			</div>
		</div>
		<script>
			(function($, doc) {
				var loginButton = doc.getElementById('login');
				var accountBox = doc.getElementById('account');
				var passwordBox = doc.getElementById('password');
				var autoLoginButton = doc.getElementById("autoLogin");
				var regButton = doc.getElementById('reg');
				var forgetButton = doc.getElementById('forgetPassword');

				loginButton.addEventListener('click', function(event) {

					mui.ajax({
						type: "post",
						url: "login",
						async: true,
						data: {
							name: accountBox.value.trim(),
							pass: passwordBox.value.trim()
						},
						dataType: "json",
						timeout: 1000,
						success: function(data) {
							if(data.status==0){
								$.openWindow('/user/main');
							}else{
								mui.toast(data.msg);
							}
						},
						error: function(xhr, type, errorThrown) {
							mui.toast("登录失败")
//							mui.alert("登陆失败")
						}
					});
				})
				
				regButton.addEventListener('click', function(event) {

					$.openWindow('/user/reg')
				})


			}(mui, document));
		</script>
	</body>

</html>
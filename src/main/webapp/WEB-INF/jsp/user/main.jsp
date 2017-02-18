<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title></title>
		<link href="/css/mui.min.css" rel="stylesheet" />
		<style>
			ul {
				font-size: 14px;
				color: #8f8f94;
			}
			.mui-btn {
				padding: 10px;
			}
		</style>
	</head>

	<body>
		<header class="mui-bar mui-bar-nav" style="padding-right: 15px;">
			<h1 class="mui-title">登录模板</h1>
			<button id='setting' class=" mui-pull-right mui-btn-link">设置</button>
		</header>
		<div class="mui-content">
			<div class="mui-content-padded">
				<p>
					您好 <span id='account'></span>，您已成功登录。
					<ul>
						<li>这是mui带登录和设置模板的示例App首页。</li>
						<li>您可以点击右上角的 “设置” 按钮，进入设置模板，体验div窗体切换示例。</li>
						<li>在 “设置” 中点击 “退出” 可以 “注销当前账户” 或 “直接关闭应用”。</li>
						<li>你可以设置 “锁屏图案”，这样可通过手势密码代替输入账号、密码；</li>
					</ul>
				</p>
				<!--<button  class="mui-btn mui-btn-block mui-btn-primary">设置</button>-->
				<!--
				<button id='exit' class="mui-btn mui-btn-block mui-btn-green">关闭</button>
                <button id='logout' class="mui-btn mui-btn-red mui-btn-block">注销登录</button>
                -->
			</div>
		</div>
		<script src="/js/mui.min.js"></script>
		<script>
			(function($, doc) {
			
			}(mui, document));
		</script>
	</body>

</html>
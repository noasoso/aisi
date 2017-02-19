<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title></title>
<link href="/css/mui.min.css" rel="stylesheet" />
<link href="/css/login.css" rel="stylesheet" />
</head>
<body>
	<div class="mui-content">
		<div class="mui-content-padded">
			<p>
				您好 <span id='account'>${user.name }</span>，您已成功登录。
			</p>
		</div>
		<div class="mui-content-padded">
			<p>默认帐号为您的“微信号”</p>
			<p>默认密码为身份证后六位 </p>
			<p>首次登入后请更改密码。</p>
			</div>
	</div>
	
	<div class="mui-card">
		<ul class="mui-table-view mui-grid-view mui-grid-9">
			<li class="mui-table-view-cell mui-media mui-col-xs-6 mui-col-sm-6">
				<a href="#"> <span class="mui-icon mui-icon-home"></span>
					<div class="mui-media-body">Home</div>
			</a>
			</li>
		</ul>
	</div>
	

	
	<script src="/js/mui.min.js"></script>
	<script>
		(function($, doc) {}(mui, document));
	</script>
</body>

</html>
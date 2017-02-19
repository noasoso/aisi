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
	
	  <div class="music_div">
                    <table style="width: 100%; margin: 10px auto">
                        <tbody>
                            <tr>
                                <td class="img_td"><a href="ProductDetail.aspx?Id=0">
                                    <img src="/temple/mlsy/ico/cpxx.png" style="width: 80%; margin-bottom: 20px;" />
                                </a></td>

                                <td class="img_td"><a href="ArticleHtml.aspx?QueryKey=买家照片">
                                    <img src="/temple/mlsy/ico/mjzp.png" style="width: 80%;" />
                                </a></td>

                                <td class="img_td"><a href="ArticleCenterList.aspx?QueryKey=产品视频">
                                    <img src="/temple/mlsy/ico/cpsp.png" style="width: 80%;" />
                                </a></td>

                                <td class="img_td"><a href="query.aspx?FWCode=">
                                    <img src="/temple/mlsy/ico/fwcx.png" style="width: 80%;" />
                                </a></td>
                            </tr>

                            <tr>
                                <td class="img_td"><a href="ArticleHtml.aspx?QueryKey=积分活动">
                                    <img src="/temple/mlsy/ico/jfhd.png" style="width: 80%;" />
                                </a></td>
                                <td class="img_td"><a href="Product.aspx">
                                    <img src="/temple/mlsy/ico/cpxl.png" style="width: 80%;" />
                                </a></td>

                                <td class="img_td"><a href="/a/Agent.aspx">
                                    <img src="/temple/mlsy/ico/dlxx.png" style="width: 80%;" />
                                </a></td>

                                <td class="img_td">
                                    <a href="/a/Manager/FollowMe.aspx">
                                        <img src="/temple/mlsy/ico/wxgz.png" style="width: 80%;" />
                                    </a></td>
                            </tr>

                        </tbody>
                    </table>
                </div>

	
	<script src="/js/mui.min.js"></script>
	<script>
		(function($, doc) {}(mui, document));
	</script>
</body>

</html>
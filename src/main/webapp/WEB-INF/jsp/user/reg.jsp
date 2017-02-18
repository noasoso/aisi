<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="ui-page-login">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title></title>
<!--标准mui.css-->
<link href="/css/mui.min.css" rel="stylesheet" />
<link href="/css/reg.css" rel="stylesheet" />
<script src="/js/mui.min.js"></script>
</head>

<body>
	<header class="mui-bar mui-bar-nav">
		<h1 class="mui-title">注册代理</h1>
	</header>
	<div class="mui-content">
		<form id="formid" name="formid" method="post">
			<h5>
				<span style="color:red;">*</span> 姓名：
			</h5>
			<div class="mui-input-row mui-password">
				<input id="name" name="name" type="text" placeholder="姓名"
					class="mui-input-clear mui-input">
			</div>
			<h5>
				<span style="color:red;">*</span> 微信：
			</h5>
			<div class="mui-input-row mui-password">
				<input id="wechat" name="wechat" type="text" placeholder="微信"
					class="mui-input-clear mui-input">
			</div>
			<h5>
				<span style="color:red;">*</span> 手机：
			</h5>
			<div class="mui-input-row mui-password">
				<input id="mobile_phone" name="mobile_phone" type="text"
					placeholder="手机" class="mui-input-clear mui-input">
			</div>
			<h5>
				<span style="color:red;">*</span> 身份证：
			</h5>
			<div class="mui-input-row mui-password">
				<input id="cardid" name="cardid" type="text" placeholder="身份证"
					class="mui-input-clear mui-input">
			</div>
			<h5>
				<span style="color:red;">*</span> 收货地址：
			</h5>
			<div class="mui-input-row mui-password">
				<input id="city" name="city" type="text" placeholder="填写完整的收货地址"
					class="mui-input-clear mui-input">
			</div>
			<h5>
				<span style="color:red;">*</span> 申请等级：
			</h5>
			<div class="mui-input-row mui-password">
				<select name="group_id" id="group_id">
					<option value="">&nbsp;&nbsp;&nbsp;请选择</option>
					<option value="40">经销商</option>
					<option value="30">一级代理</option>
					<option value="20">区域代理</option>
					<option value="10">全国总代</option>
				</select>
			</div>
			<h5>邀请码：</h5>
			<div class="mui-input-row mui-password">
				<input id="agentid" name="agentid" type="text" placeholder="上级代理邀请码,没有可不填写"
					class="mui-input-clear mui-input">
			</div>
		</form>
		<div class="mui-content-padded">
			<button id='submit' class="mui-btn mui-btn-green"
				style="width: 100%;">注册</button>
		</div>
		<div class="mui-content-padded">
			<p>注册信息需要审核，请正确填写个人资料。</p>
		</div>
	</div>

	<script type="text/javascript">
		(function(mui, window, document, undefined) {
			mui.init();
			var get = function(id) {
				return document.getElementById(id);
			};
			var ui = {
				name : document.getElementById('name'),
				wechat : get('wechat'),
				mobilephone : get('mobile_phone'),
				cardid : get('cardid'),
				city : get('city'),
				submit : get('submit'),
				groupid : get('group_id'),
				agentid : get('agentid')
			};
	
			ui.submit.addEventListener('click', function(event) {
				if (ui.name.value.trim() == '') {
					return mui.toast('请填写姓名');
				}
				if (ui.wechat.value.trim() == '') {
					return mui.toast('请填写微信');
				}
				if (ui.mobilephone.value.trim() == '') {
					return mui.toast('请填写手机');
				}
				if (ui.cardid.value.trim() == '') {
					return mui.toast('请填写身份证号');
				}
				if (ui.city.value.trim() == '') {
					return mui.toast('请输入完整的收货地址 ');
				}
	
				if (ui.groupid.value.trim() == '') {
					return mui.toast('请选择申请级别 ');
				}
				var agentIdV = ui.agentid.value.trim();
				if (agentIdV == '') {
					agentIdV=10000;
				}
				mui.ajax({
					type : "post",
					url : "reg",
					async : true,
					data : {
						name : ui.name.value.trim(),
						wechat : ui.wechat.value.trim(),
						mobilePhone : ui.mobilephone.value.trim(),
						cardId : ui.cardid.value.trim(),
						city : ui.city.value.trim(),
						groupId : ui.groupid.value.trim(),
						agentId : agentIdV
					},
					dataType : "json",
					timeout : 3000,
					success : function(data) {
						if (data.status==0) {
							alert("提交成功，请等待审核");
							mui.openWindow('/index');
						} else {
							mui.toast(data.msg);
						}
					},
					error : function(xhr, type, errorThrown) {
						mui.toast("提交失败");
					}
				});
	
			}, false);
		})(mui, window, document, undefined);
	</script>
</body>

</html>
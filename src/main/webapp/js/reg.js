(function(mui, window, document, undefined) {
	mui.init();
	var get = function(id) {
		return document.getElementById(id);
	};
	var qsa = function(sel) {
		return [].slice.call(document.querySelectorAll(sel));
	};
	var ui = {
		name: get('name'),
		wechat: get('wechat'),
		mobile_phone: get('mobile_phone'),
		cardid: get('cardid'),
		city: get('city'),
		submit: get('submit'),
		group_id:get('group_id'),
		agentid:get('agentid')
	};
	ui.clearForm = function() {
		ui.name.value = '';
		ui.wechat.value = '';
		ui.mobile_phone.value = '';
		ui.newPlaceholder();
	};

	ui.submit.addEventListener('tap', function(event) {
		if (ui.name.value.trim() == '') {
			return mui.toast('请填写姓名');
		} 
        	if (ui.wechat.value.trim() == '') {
			return mui.toast('请填写微信');
		} 
        	if (ui.mobile_phone.value.trim() == '') {
			return mui.toast('请填写手机');
		} 
        	if (ui.cardid.value.trim() == '') {
			return mui.toast('请填写身份证号');
		} 
        	if (ui.city.value.trim() == '') {
			return mui.toast('请输入完整的收货地址 ');
		} 
        
    	if (ui.group_id.value.trim() == '') {
			return mui.toast('请选择申请级别 ');
		}
    	if (ui.agentid.value.trim() == '') {
			return mui.toast('上级代理ID不能为空 ');
		}
         mui.post('index.php?c=index&a=yaoqing',{
            name:ui.name.value.trim(),
            wechat:ui.wechat.value.trim(),
            mobile_phone:ui.mobile_phone.value.trim(),
            cardid:ui.cardid.value.trim(),
            city:ui.city.value.trim(),
            group_id:ui.group_id.value.trim(),
            agentid:ui.agentid.value.trim()
            },function(data){
							 if(data.status==1){
								 	mui.alert(data.info, '系统提示', function() {
								 history.go(0);
				});
							 }else if(data.status==2){
								 mui.toast(data.info);
							 }else{
								 mui.toast(data.info);
							 }
						 },"json");
	}, false);
})(mui, window, document, undefined);
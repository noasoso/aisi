package com.aisi.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aisi.pojo.User;
import com.aisi.service.IUserService;
import com.aisi.utils.MD5Tools;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;

	
	@RequestMapping(value="/main",method={RequestMethod.GET})
	public String toIndex(HttpServletRequest request, Model model) {
		
		if(request.getSession().getAttribute("user") == null){
			return "redirect:/user/login";
		}else{
			return "user/main";
		}
		
		
		
	}
	
	
	@RequestMapping(value="/login",method={RequestMethod.GET})
	public String toLogin(HttpServletRequest request, Model model) {
		
		
		return "user/login";
		
	}
	
	
	@RequestMapping(value="/login",method={RequestMethod.POST})
	@ResponseBody
	public String doLogin(HttpServletRequest request, Model model) {
		
		JSONObject result = new JSONObject();
		result.put("status", -1);
		result.put("msg","登录失败");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		
		System.out.println(MD5Tools.MD5(pass));
		User user = userService.getUserByName(name);
		
		
		if(user == null){
			return result.toJSONString();
		}
		
		String password = user.getPassword();
		
		
		
		if(StringUtils.isEmpty(password)){
			password = MD5Tools.MD5(user.getCardId().substring(user.getCardId().length()-6));
		}
		
		System.out.println(password);
		
		if(!MD5Tools.MD5(pass).equals(password)){
			return result.toJSONString();
		}
		
		request.getSession().setAttribute("user", user);
		result.put("status", 0);
		result.put("msg","登录成功");
		
		return result.toJSONString();
		
		
	}
	
	
	
	@RequestMapping(value="/reg",method={RequestMethod.GET})
	public String toReg(HttpServletRequest request, Model model) {
		
		
		return "user/reg";
		
	}
	
	
	
	@RequestMapping(value="/reg",method={RequestMethod.POST})
	@ResponseBody
	public String doReg(HttpServletRequest request, User user) {
		
		JSONObject result = new JSONObject();
		
		User u = userService.getUserByName(user.getWechat());
		
		
		if(u != null){
			result.put("status", -1);
			result.put("msg","该微信号已被注册");
			return result.toJSONString();
		}	
		
		
		if(!StringUtils.isEmpty(user.getAgentId())){
			u = userService.getUserById(user.getAgentId());
			
			if(u == null){
				result.put("status", -1);
				result.put("msg","无效的邀请码");
				return result.toJSONString();
			}
		}
		
		user.setStatus(1);
		
		userService.save(user);
		
		result.put("status", 0);
		result.put("msg","注册成功");
		
		return result.toJSONString();
	}
	
	
}
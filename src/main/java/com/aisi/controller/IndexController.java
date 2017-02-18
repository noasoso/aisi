package com.aisi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *  index
 * @author Administrator
 *
 */
@Controller
public class IndexController {


	
	@RequestMapping(value="/index",method={RequestMethod.GET})
	public String toIndex(HttpServletRequest request, Model model) {
		
		return "index";
		
	}
	
	
	
	
}
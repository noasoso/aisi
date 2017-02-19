package com.aisi.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aisi.pojo.Product;
import com.aisi.service.IProductService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Resource
	private IProductService productService;

	
	@RequestMapping(value="/list",method={RequestMethod.GET})
	public String list(HttpServletRequest request, Model model) {
		
		List<Product> list = productService.getAll();
		
		model.addAttribute(list);
		
		return "list";
		
	}
	
	
	@RequestMapping(value="/add",method={RequestMethod.GET})
	public String toAdd(HttpServletRequest request, Model model) {
		
		
		return "product/add";
		
	}
	
	
	@RequestMapping(value="/add",method={RequestMethod.POST})
	public String doAdd(HttpServletRequest request, Product product) {
		
		
		
		productService.save(product);
		
		return "redirect:product/add";
		
	}
	
	
	
	@RequestMapping(value="/update",method={RequestMethod.GET})
	public String toReg(HttpServletRequest request, Model model) {
		
		String pid = request.getParameter("pid");
		
		
		
		Product product = productService.getProcuctById(Integer.parseInt(pid));
		
		model.addAttribute(product);
		
		return "product/add";
		
	}
	
	
	
	@RequestMapping(value="/update",method={RequestMethod.POST})
	public String doUpdate(HttpServletRequest request, Product product) {
		
		productService.updateByPrimaryKeySelective(product);
		
		return "redirect:product/list";
		
	}
	
	
}
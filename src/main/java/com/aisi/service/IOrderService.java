package com.aisi.service;

import java.util.List;

import com.aisi.pojo.Order;

public interface IOrderService {

	public Order getOrderById(int id);
	
	public Order getOrderByOrderCode(String code);
	
	void save(Order product);
	
	public List<Order> getAll();
	
	public void updateByPrimaryKeySelective(Order orde);
	
	void delete (int id);
	
}
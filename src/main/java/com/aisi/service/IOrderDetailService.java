package com.aisi.service;

import java.util.List;

import com.aisi.pojo.OrderDetail;

public interface IOrderDetailService {

	public OrderDetail getOrderDetailById(int id);
	
	
	void save(OrderDetail orderDetail);
	
	public List<OrderDetail> getAll(String orderCode);
	
	public void updateByPrimaryKeySelective(OrderDetail orde);
	
	void delete (int id);
	
}
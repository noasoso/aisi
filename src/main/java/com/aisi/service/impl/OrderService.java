package com.aisi.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aisi.dao.OrderMapper;
import com.aisi.pojo.Order;
import com.aisi.service.IOrderService;

@Service("OrderService")
public class OrderService implements IOrderService {

	
	@Resource
	private OrderMapper orderDao;
	
	@Override
	public Order getOrderById(int id) {
		// TODO Auto-generated method stub
		return orderDao.selectByPrimaryKey(id);
	}

	@Override
	public Order getOrderByOrderCode(String code) {
		// TODO Auto-generated method stub
		return orderDao.selectByOrderCode(code);
	}

	@Override
	public void save(Order order) {
		orderDao.insert(order);
		
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderDao.list();
	}

	@Override
	public void updateByPrimaryKeySelective(Order order) {
		// TODO Auto-generated method stub
		orderDao.updateByPrimaryKeySelective(order);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		orderDao.deleteByPrimaryKey(id);
		
	}
	

}
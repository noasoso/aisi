package com.aisi.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aisi.dao.OrderDetailMapper;
import com.aisi.pojo.OrderDetail;
import com.aisi.service.IOrderDetailService;

@Service("OrderDetailService")
public class OrderDetailService implements IOrderDetailService {

	
	@Resource
	private OrderDetailMapper orderDetailDao;

	@Override
	public OrderDetail getOrderDetailById(int id) {
		// TODO Auto-generated method stub
		return orderDetailDao.selectByPrimaryKey(id);
	}

	@Override
	public void save(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		orderDetailDao.insert(orderDetail);
	}

	@Override
	public List<OrderDetail> getAll(String orderCode) {
		// TODO Auto-generated method stub
		return orderDetailDao.list(orderCode);
	}

	@Override
	public void updateByPrimaryKeySelective(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		orderDetailDao.updateByPrimaryKeySelective(orderDetail);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		orderDetailDao.deleteByPrimaryKey(id);
	}
	
	

}
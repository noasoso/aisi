package com.aisi.dao;

import java.util.List;

import com.aisi.pojo.Order;

public interface OrderMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table order
	 *
	 * @mbggenerated Sun Feb 19 19:43:54 CST 2017
	 */
	int deleteByPrimaryKey(int id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table order
	 *
	 * @mbggenerated Sun Feb 19 19:43:54 CST 2017
	 */
	int insert(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table order
	 *
	 * @mbggenerated Sun Feb 19 19:43:54 CST 2017
	 */
	int insertSelective(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table order
	 *
	 * @mbggenerated Sun Feb 19 19:43:54 CST 2017
	 */
	Order selectByPrimaryKey(int id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table order
	 *
	 * @mbggenerated Sun Feb 19 19:43:54 CST 2017
	 */
	int updateByPrimaryKeySelective(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table order
	 *
	 * @mbggenerated Sun Feb 19 19:43:54 CST 2017
	 */
	int updateByPrimaryKey(Order record);

	List<Order> list();

	Order selectByOrderCode(String name);

}
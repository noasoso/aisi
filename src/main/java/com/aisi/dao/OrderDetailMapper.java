package com.aisi.dao;

import java.util.List;

import com.aisi.pojo.Order;
import com.aisi.pojo.OrderDetail;

public interface OrderDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Sun Feb 19 19:44:13 CST 2017
     */
    int deleteByPrimaryKey(int id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Sun Feb 19 19:44:13 CST 2017
     */
    int insert(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Sun Feb 19 19:44:13 CST 2017
     */
    int insertSelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Sun Feb 19 19:44:13 CST 2017
     */
    OrderDetail selectByPrimaryKey(int id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Sun Feb 19 19:44:13 CST 2017
     */
    int updateByPrimaryKeySelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Sun Feb 19 19:44:13 CST 2017
     */
    int updateByPrimaryKey(OrderDetail record);
    

	List<OrderDetail> list(String orderCode);

	Order selectByOrderDetailId(int id);
	
}
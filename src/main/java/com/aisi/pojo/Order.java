package com.aisi.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    private int id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_id
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    private String orderCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_amount
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    private BigDecimal orderAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_time
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    private Date orderTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.status
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    private Short status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.user_id
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.user_name
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    private String userName;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public Order(int id, String orderCode, BigDecimal orderAmount, Date orderTime, Short status, String userId, String userName) {
        this.id = id;
        this.orderCode = orderCode;
        this.orderAmount = orderAmount;
        this.orderTime = orderTime;
        this.status = status;
        this.userId = userId;
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public Order() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.id
     *
     * @return the value of order.id
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public int getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.id
     *
     * @param id the value for order.id
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public void setId(int id) {
        this.id = id ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_id
     *
     * @return the value of order.order_id
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_id
     *
     * @param orderCode the value for order.order_id
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_amount
     *
     * @return the value of order.order_amount
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_amount
     *
     * @param orderAmount the value for order.order_amount
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_time
     *
     * @return the value of order.order_time
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_time
     *
     * @param orderTime the value for order.order_time
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.status
     *
     * @return the value of order.status
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.status
     *
     * @param status the value for order.status
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.user_id
     *
     * @return the value of order.user_id
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.user_id
     *
     * @param userId the value for order.user_id
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.user_name
     *
     * @return the value of order.user_name
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.user_name
     *
     * @param userName the value for order.user_name
     *
     * @mbggenerated Sun Feb 19 19:43:54 CST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}
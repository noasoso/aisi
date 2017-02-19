package com.aisi.pojo;

import java.math.BigDecimal;

public class Group {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.id
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.name
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.agent_amount
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    private BigDecimal agentAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.agent_discount
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    private BigDecimal agentDiscount;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    public Group(Integer id, String name, BigDecimal agentAmount, BigDecimal agentDiscount) {
        this.id = id;
        this.name = name;
        this.agentAmount = agentAmount;
        this.agentDiscount = agentDiscount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    public Group() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.id
     *
     * @return the value of group.id
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.id
     *
     * @param id the value for group.id
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.name
     *
     * @return the value of group.name
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.name
     *
     * @param name the value for group.name
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.agent_amount
     *
     * @return the value of group.agent_amount
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    public BigDecimal getAgentAmount() {
        return agentAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.agent_amount
     *
     * @param agentAmount the value for group.agent_amount
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    public void setAgentAmount(BigDecimal agentAmount) {
        this.agentAmount = agentAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.agent_discount
     *
     * @return the value of group.agent_discount
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    public BigDecimal getAgentDiscount() {
        return agentDiscount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.agent_discount
     *
     * @param agentDiscount the value for group.agent_discount
     *
     * @mbggenerated Sun Feb 19 19:44:34 CST 2017
     */
    public void setAgentDiscount(BigDecimal agentDiscount) {
        this.agentDiscount = agentDiscount;
    }
}
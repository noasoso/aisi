package com.aisi.dao;

import com.aisi.pojo.ProductPrice;

public interface ProductPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_price
     *
     * @mbggenerated Sun Feb 19 20:22:23 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_price
     *
     * @mbggenerated Sun Feb 19 20:22:23 CST 2017
     */
    int insert(ProductPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_price
     *
     * @mbggenerated Sun Feb 19 20:22:23 CST 2017
     */
    int insertSelective(ProductPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_price
     *
     * @mbggenerated Sun Feb 19 20:22:23 CST 2017
     */
    ProductPrice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_price
     *
     * @mbggenerated Sun Feb 19 20:22:23 CST 2017
     */
    int updateByPrimaryKeySelective(ProductPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_price
     *
     * @mbggenerated Sun Feb 19 20:22:23 CST 2017
     */
    int updateByPrimaryKey(ProductPrice record);
    
    
    public ProductPrice getProductPriceById(int id);

	public ProductPrice getProductPriceByProductId(int pid);

	void deleteByProductId(int pid);

	void deleteByGroupId(int gid);
	
	
}
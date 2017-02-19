package com.aisi.service;

import com.aisi.pojo.ProductPrice;

public interface IProductPriceService {

	public ProductPrice getProductPriceById(int id);

	public ProductPrice getProductPriceByPidAndGid(int pid, int gid);

	void deleteByProductId(int pid);

	void deleteByGroupId(int gid);

	void save(ProductPrice productPrice);

	void delete(int id);

}
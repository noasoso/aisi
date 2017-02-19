package com.aisi.service;

import java.util.List;

import com.aisi.pojo.Product;

public interface IProductService {

	public Product getProcuctById(int productId);
	
	public Product getProcuctByName(String name);
	
	void save(Product product);
	
	public List<Product> getAll();
	
	public void updateByPrimaryKeySelective(Product product);
	
	void delete(int id);
}
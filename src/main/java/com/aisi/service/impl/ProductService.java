package com.aisi.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aisi.dao.ProductMapper;
import com.aisi.pojo.Product;
import com.aisi.service.IProductService;

@Service("productService")
public class ProductService implements IProductService {

    @Resource
    private ProductMapper productDao;


	@Override
	public Product getProcuctById(int userId) {
		// TODO Auto-generated method stub
		return productDao.selectByPrimaryKey(userId);
	}

	

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		productDao.insert(product);
	}
	
	@Override
	public List<Product> getAll(){
		return productDao.list();
	}

	@Override
	public void updateByPrimaryKeySelective(Product product){
		productDao.updateByPrimaryKeySelective(product);
	}

	@Override
	public Product getProcuctByName(String name) {
		// TODO Auto-generated method stub
		return productDao.selectByName(name);
	}



	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		productDao.deleteByPrimaryKey(id);
	}

}
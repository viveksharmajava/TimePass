package com.timePass.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.timePass.controller.Product;

@Component
public class ProductDAOImpl implements IProductDAO {

	@Override
	public List<Product> getAllProducts() {
		return null;
	}

	@Override
	public List<Product> findByProductName(Product product) {
		return null;
	}

	@Override
	public boolean addProduct(Product product) {
		return false;
	}

	@Override
	public List<Product> searchProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}

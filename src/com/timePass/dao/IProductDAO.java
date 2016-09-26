package com.timePass.dao;

import java.util.List;
import com.timePass.controller.Product;

public interface IProductDAO {

	public List<Product> getAllProducts();
	public List<Product> findByProductName(Product product);
	public boolean addProduct(Product product);
	public List<Product> searchProduct(Product product);
}

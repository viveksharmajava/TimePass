package com.timePass.dao;

import java.util.List;

import com.timePass.controller.ProductType;

public interface ProductTypeDAO {

	public List<ProductType> getAllProductType();
	public boolean addProductType(ProductType productType);
}

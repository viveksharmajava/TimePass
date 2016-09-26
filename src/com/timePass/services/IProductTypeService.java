package com.timePass.services;

import java.util.List;

import com.timePass.controller.ProductType;

public interface IProductTypeService {

	public boolean addProductType(ProductType productType);
	public List<ProductType> searchProductType(ProductType searchCriteria);
	public ProductType findById(ProductType productType);
}

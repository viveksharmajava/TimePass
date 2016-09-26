package com.timePass.dao;

import java.util.List;

import com.timePass.controller.ProductFeatureMapping;

public interface IProductFeatureMappingDAO {

	public List<ProductFeatureMapping> getAllProductFeatureMappings();
	public ProductFeatureMapping getProductFeatureMappingById(ProductFeatureMapping category);
	public List<ProductFeatureMapping> searchCateogry(ProductFeatureMapping searchCriteria);
	public boolean addProductFeatureMapping(ProductFeatureMapping category);
}

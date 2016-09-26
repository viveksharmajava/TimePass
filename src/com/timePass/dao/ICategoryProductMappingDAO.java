package com.timePass.dao;

import java.util.List;

import com.timePass.controller.CategoryProductMapping;

public interface ICategoryProductMappingDAO {
	public List<CategoryProductMapping> getAllCategories();
	public CategoryProductMapping getCatalogCategoryMappingById(CategoryProductMapping category);
	public List<CategoryProductMapping> searchCateogry(CategoryProductMapping searchCriteria);
	public boolean addCategoryProductMapping(CategoryProductMapping category);
}

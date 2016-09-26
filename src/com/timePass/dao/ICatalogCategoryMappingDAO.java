package com.timePass.dao;

import java.util.List;

import com.timePass.controller.CatalogCategoryMapping;

public interface ICatalogCategoryMappingDAO {
	public List<CatalogCategoryMapping> getAllCategories();
	public CatalogCategoryMapping getCatalogCategoryMappingById(CatalogCategoryMapping category);
	public List<CatalogCategoryMapping> searchCateogry(CatalogCategoryMapping searchCriteria);
	public boolean addCatalogCategoryMapping(CatalogCategoryMapping category);
}

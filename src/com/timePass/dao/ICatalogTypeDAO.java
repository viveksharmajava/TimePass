package com.timePass.dao;

import java.util.List;

import com.timePass.controller.CatalogType;

public interface ICatalogTypeDAO {

	public List<CatalogType> getAllCatalogTypes();
	public CatalogType getCatalogTypeById(CatalogType CatalogType);
	public List<CatalogType> searchCateogry(CatalogType searchCriteria);
	public boolean addCatalogType(CatalogType CatalogType);
}

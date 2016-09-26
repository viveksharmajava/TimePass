package com.timePass.dao;

import java.util.List;

import com.timePass.controller.Catalog;

public interface ICatalogDAO {

	public List<Catalog> getAllCatalogs();
	public Catalog getCatalogById(Catalog Catalog);
	public List<Catalog> searchCateogry(Catalog searchCriteria);
	public boolean addCatalog(Catalog Catalog);
}

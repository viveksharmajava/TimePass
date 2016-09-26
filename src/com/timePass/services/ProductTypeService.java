package com.timePass.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timePass.dao.ProductTypeDAO;
import com.timePass.controller.ProductType;

@Service
public class ProductTypeService implements IProductTypeService {
  
   @Autowired
   ProductTypeDAO prodcutTypeDAO;
   
	public boolean addProductType(ProductType productType) {
		return prodcutTypeDAO.addProductType(productType);
	}

	@Override
	public List<ProductType> searchProductType(ProductType searchCriteria) {
		// TODO Auto-generated method stub
		return prodcutTypeDAO.getAllProductType();
		
	}

	@Override
	public ProductType findById(ProductType productType) {
		// TODO Auto-generated method stub
		
		return null;
	}

}

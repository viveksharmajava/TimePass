package com.timePass.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.timePass.controller.ProductType;

@Repository
@Transactional
public class ProductTypeDAOImp implements ProductTypeDAO {

	@PersistenceContext
	private EntityManager manager;
	@Override
	public List<ProductType> getAllProductType() {
		// TODO Auto-generated method stub
	Query query=	manager.createQuery("Select p from ProductType p",ProductType.class);
	List<ProductType> productTypes= query.getResultList();
	return productTypes;
	}

	@Override
	public boolean addProductType(ProductType productType) {
		// TODO Auto-generated method stub
		manager.persist(productType);
		return true;
	}

}

package com.timePass.controller;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CatalogCategoryPK  implements Serializable{
   
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="CATALOG_ID")
	private Catalog catalog;
	@ManyToOne
	@JoinColumn(name="Category_ID")
	private Category category;
	
}

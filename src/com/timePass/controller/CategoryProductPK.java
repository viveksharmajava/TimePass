package com.timePass.controller;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CategoryProductPK  implements Serializable{
 
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="Category_ID")
	private Category category;
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;
	
}

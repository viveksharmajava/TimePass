package com.timePass.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="PRODUCT_TYPE")
public class ProductType implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int productTypeId;
	
	@NotEmpty
	private String prodcutType;
	private String description;
	
	public ProductType(String prodcutType, String description) {
		super();
		this.prodcutType = prodcutType;
		this.description = description;
	}
	
	public ProductType(){
		
	}

	public long getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(int productTypeId) {
		this.productTypeId = productTypeId;
	}

	public String getProdcutType() {
		return prodcutType;
	}

	public void setProdcutType(String prodcutType) {
		this.prodcutType = prodcutType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductType [productTypeId=" + productTypeId + ", prodcutType="
				+ prodcutType + ", description=" + description + "]";
	}

}

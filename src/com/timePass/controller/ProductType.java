package com.timePass.controller;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.timePass.entity.CommonColumns;

@Entity
@Table(name="PRODUCT_TYPE")
public class ProductType  extends CommonColumns implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="PRODUCT_TYPE_ID",length=256)
	private String productTypeId;
	
	@NotEmpty
	@Column(name="PRODUCT_TYPE",length=256)
	private String prodcutType;
	@Column(name="DESCRIPTION",length=512)
	private String description;
	
	public ProductType(String prodcutType, String description) {
		super(); 
		this.prodcutType = prodcutType;
		this.description = description;
	}
	
	public ProductType(){
		
	}

	public String getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(String productTypeId) {
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

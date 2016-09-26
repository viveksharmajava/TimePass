package com.timePass.controller;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.timePass.entity.CommonColumns;

@Entity
@Table(name="CATALOG_TYPE")
public class CatalogType  extends CommonColumns implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CATALOG_TYPE_ID",length=256)
	private String catalogTypeId;
	
	@NotEmpty
	@Column(name="CATALOG_TYPE",length=256)
	private String catalogType;
	@Column(name="DESCRIPTION",length=512)
	private String description;
	
	public CatalogType(String catalogType, String description) {
		super(); 
		this.catalogType = catalogType;
		this.description = description;
	}
	
	public CatalogType(){
		
	}

	public String getCatalogTypeId() {
		return catalogTypeId;
	}

	public void setCatalogTypeId(String catalogTypeId) {
		this.catalogTypeId = catalogTypeId;
	}

	public String getProdcutType() {
		return catalogType;
	}

	public void setProdcutType(String catalogType) {
		this.catalogType = catalogType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CatalogType [productTypeId=" + catalogTypeId + ", catalogType="
				+ catalogType + ", description=" + description + "]";
	}

}

package com.timePass.controller;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
import com.timePass.entity.CommonColumns;

@Entity
@Table(name="CATEGORY_TYPE")
public class CategoryType  extends CommonColumns implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CATEGORY_TYPE_ID",length=256)
	private String categoryTypeId;
	
	@NotEmpty
	@Column(name="CATEGORY_TYPE",length=256)
	private String categoryType;
	@Column(name="DESCRIPTION",length=512)
	private String description;
	
	public CategoryType(String categoryType, String description) {
		super(); 
		this.categoryType = categoryType;
		this.description = description;
	}
	
	public CategoryType(){
		
	}

	public String getCategoryTypeId() {
		return categoryTypeId;
	}

	public void setCategoryTypeId(String categoryTypeId) {
		this.categoryTypeId = categoryTypeId;
	}

	public String getProdcutType() {
		return categoryType;
	}

	public void setProdcutType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CategoryType [productTypeId=" + categoryTypeId + ", categoryType="
				+ categoryType + ", description=" + description + "]";
	}

}

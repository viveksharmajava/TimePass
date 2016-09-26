package com.timePass.controller;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.timePass.entity.CommonColumns;

@Entity
@Table(name="Category")
public class Category  extends CommonColumns implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="CATEGORY_ID")
	private String CategoryId;
	
	@NotNull
	@Column(name="Category_NAME")
	private String CategoryName;
	
	
	@Column(name="DESCRITPTION",length=512)
	private String description;
	
	@ManyToOne
	@JoinColumn(name="Category_TYPE_ID")
	private CategoryType CategoryType;
	
	/*@Column(name="SMALL_IMAGE_URL",length=512)
	private String smallImageUrl ;
	
	@Column(name="MEDIUM_IMAGE_URL",length=512)
	private String mediumImageUrl;
	
	@Column(name="LARGE_IMAGE_URL",length=512)
	private String largeImageUrl;
	
	@Column(name="DETAIL_IMAGE_URL",length=512)
	private String detailImageUrl;*/

	public String getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(String CategoryId) {
		this.CategoryId = CategoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String CategoryName) {
		this.CategoryName = CategoryName;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CategoryType getCategoryType() {
		return CategoryType;
	}

	public void setCategoryType(CategoryType CategoryType) {
		this.CategoryType = CategoryType;
	}

	/*public String getSmallImageUrl() {
		return smallImageUrl;
	}

	public void setSmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}

	public String getMediumImageUrl() {
		return mediumImageUrl;
	}

	public void setMediumImageUrl(String mediumImageUrl) {
		this.mediumImageUrl = mediumImageUrl;
	}

	public String getLargeImageUrl() {
		return largeImageUrl;
	}

	public void setLargeImageUrl(String largeImageUrl) {
		this.largeImageUrl = largeImageUrl;
	}

	public String getDetailImageUrl() {
		return detailImageUrl;
	}

	public void setDetailImageUrl(String detailImageUrl) {
		this.detailImageUrl = detailImageUrl;
	}
	*/
	
}

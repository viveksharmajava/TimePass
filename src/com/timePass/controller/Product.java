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
@Table(name="PRODUCT")
public class Product  extends CommonColumns implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="PRODUCT_ID")
	private String productId;
	
	@NotNull
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="DISPLAY_NAME")
	private String displayName;
	
	@Column(name="DESCRITPTION",length=512)
	private String description;
	
	@ManyToOne
	@JoinColumn(name="PRODUCT_TYPE_ID")
	private ProductType productType;
	
	@Column(name="SMALL_IMAGE_URL",length=512)
	private String smallImageUrl ;
	
	@Column(name="MEDIUM_IMAGE_URL",length=512)
	private String mediumImageUrl;
	
	@Column(name="LARGE_IMAGE_URL",length=512)
	private String largeImageUrl;
	
	@Column(name="DETAIL_IMAGE_URL",length=512)
	private String detailImageUrl;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public String getSmallImageUrl() {
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
	
	
}

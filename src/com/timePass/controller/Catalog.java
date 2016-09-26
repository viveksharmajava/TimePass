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
@Table(name="CATALOG")
public class Catalog  extends CommonColumns implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="CATALOG_ID")
	private String catalogId;
	
	@NotNull
	@Column(name="CATALOG_NAME")
	private String catalogName;
	
	
	@Column(name="DESCRITPTION",length=512)
	private String description;
	
	@ManyToOne
	@JoinColumn(name="CATALOG_TYPE_ID")
	private CatalogType catalogType;
	
	/*@Column(name="SMALL_IMAGE_URL",length=512)
	private String smallImageUrl ;
	
	@Column(name="MEDIUM_IMAGE_URL",length=512)
	private String mediumImageUrl;
	
	@Column(name="LARGE_IMAGE_URL",length=512)
	private String largeImageUrl;
	
	@Column(name="DETAIL_IMAGE_URL",length=512)
	private String detailImageUrl;*/

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CatalogType getCatalogType() {
		return catalogType;
	}

	public void setCatalogType(CatalogType catalogType) {
		this.catalogType = catalogType;
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

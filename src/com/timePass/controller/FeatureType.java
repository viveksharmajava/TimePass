package com.timePass.controller;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
import com.timePass.entity.CommonColumns;

@Entity
@Table(name="FEATURE_TYPE")
public class FeatureType  extends CommonColumns implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="FEATURE_TYPE_ID",length=256)
	private String FeatureTypeId;
	
	@NotEmpty
	@Column(name="PRODUCT_TYPE",length=256)
	private String featureType;
	@Column(name="DESCRIPTION",length=512)
	private String description;
	
	public FeatureType(String featureType, String description) {
		super(); 
		this.featureType = featureType;
		this.description = description;
	}
	
	public FeatureType(){
		
	}

	public String getFeatureTypeId() {
		return FeatureTypeId;
	}

	public void setFeatureTypeId(String FeatureTypeId) {
		this.FeatureTypeId = FeatureTypeId;
	}

	public String getfeatureType() {
		return featureType;
	}

	public void setfeatureType(String featureType) {
		this.featureType = featureType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "FeatureType [FeatureTypeId=" + FeatureTypeId + ", featureType="
				+ featureType + ", description=" + description + "]";
	}

}

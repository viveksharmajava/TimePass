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
@Table(name="FEATURE")
public class Feature  extends CommonColumns implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="FEATURE_ID")
	private String FeatureId;
	
	@NotNull
	@Column(name="FEATURE_NAME")
	private String FeatureName;
	
	@Column(name="DESCRITPTION",length=512)
	private String description;
	
	@ManyToOne
	@JoinColumn(name="FEATURE_TYPE_ID")
	private FeatureType featureType;
	
	

	public String getFeatureId() {
		return FeatureId;
	}

	public void setFeatureId(String FeatureId) {
		this.FeatureId = FeatureId;
	}

	public String getFeatureName() {
		return FeatureName;
	}

	public void setFeatureName(String FeatureName) {
		this.FeatureName = FeatureName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public FeatureType getFeatureType() {
		return featureType;
	}

	public void setFeatureType(FeatureType featureType) {
		this.featureType = featureType;
	}

	@Override
	public String toString() {
		return "Feature [FeatureId=" + FeatureId + ", FeatureName="
				+ FeatureName + ", description=" + description
				+ ", featureType=" + featureType + "]";
	}

	

	
}

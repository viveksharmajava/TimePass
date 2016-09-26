package com.timePass.controller;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.timePass.entity.CommonColumns;

@Entity
@Table(name="PRODUCT_FEATURE_MAPPING")
public class ProductFeatureMapping extends CommonColumns implements Serializable {

	 private static final long serialVersionUID = 1L;
	 
	 @EmbeddedId ProductFeaturePK prodFeatureId;
}

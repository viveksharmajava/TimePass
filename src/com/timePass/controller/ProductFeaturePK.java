package com.timePass.controller;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ProductFeaturePK  implements Serializable{
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;
	@ManyToOne
	@JoinColumn(name="FEATURE_ID")
	private Feature feature;
}

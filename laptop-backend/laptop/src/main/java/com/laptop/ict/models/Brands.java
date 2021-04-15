package com.laptop.ict.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Brands")
public class Brands {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer brandId;
	
	@Column(name = "BrandName")
	private String brandName;
	

	public Brands() {
		super();
	}

	public Brands(Integer brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
	
}

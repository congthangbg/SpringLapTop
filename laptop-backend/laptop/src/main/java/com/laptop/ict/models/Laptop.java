package com.laptop.ict.models;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.sun.istack.NotNull;

@Entity
@Table(name = "laptops")

public class Laptop implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 100)
	@NotNull
	private String lapTopName;

	@Column
	@NotNull
	private float price;

	@Column
	@NotNull
	private String image;


	@ManyToOne
	@JoinColumn(name = "brand_id")//, nullable = false) // thông qua khóa ngoại address_id
	 private Brand brand;

	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "type_id", nullable = false) // thông qua khóa ngoại address_id
	 private Type type;

	@OneToOne()
	@JoinColumn(name = "laptopDetail_id")
	private LaptopDetail laptopDetail;

	public LaptopDetail getLaptopDetail() {
		return laptopDetail;
	}

	public void setLaptopDetail(LaptopDetail laptopDetail) {
		this.laptopDetail = laptopDetail;
	}

	public Laptop() {
		super();
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLapTopName() {
		return lapTopName;
	}

	public void setLapTopName(String lapTopName) {
		this.lapTopName = lapTopName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
package com.laptop.ict.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;

@Entity
@Table(name = "brands")
public class Brand implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 50)
	@NotNull
	private String brandName;

	@OneToMany(mappedBy = "brand",fetch = FetchType.LAZY)
	@JsonIgnore
	//@JoinColumn(name = "brand_id")
	private List<Laptop> laptops = new ArrayList<Laptop>();

	public Brand() {
		super();
	}

//	public List<Laptop> getLaptops() {
//		return laptops;
//	}
//
//	public void setLaptops(List<Laptop> laptops) {
//		this.laptops = laptops;
//	}

	public Brand(Integer id, String brandName) {
		super();
		this.id = id;
		this.brandName = brandName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}

package com.laptop.ict.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "screentypes")
public class ScreenType implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50)
	@NotNull
	private String size;
	
	@Column(length = 50)
	@NotNull
	private String resolution;
	
	@Column(length = 50)
	@NotNull
	private String technology;
	
	@Column(length = 50)
	@NotNull
	private String induction;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "screentype_laptopdetail",
		joinColumns = { @JoinColumn(name = "product_id") },
		inverseJoinColumns = { @JoinColumn(name = "laptopdetail_id") })
	
	    private Set<LaptopDetail> laptopdetail = new HashSet<>();
	
	

	public ScreenType() {
		super();
	}

	public ScreenType(Integer id, String size, String resolution, String technology, String induction,
			Set<LaptopDetail> laptopdetail) {
		super();
		this.id = id;
		this.size = size;
		this.resolution = resolution;
		this.technology = technology;
		this.induction = induction;
		this.laptopdetail = laptopdetail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getInduction() {
		return induction;
	}

	public void setInduction(String induction) {
		this.induction = induction;
	}

	public Set<LaptopDetail> getLaptopdetail() {
		return laptopdetail;
	}

	public void setLaptopdetail(Set<LaptopDetail> laptopdetail) {
		this.laptopdetail = laptopdetail;
	}

	
	
	
}

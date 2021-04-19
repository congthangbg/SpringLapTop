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
@Table(name = "ramtypes")
public class RAMType implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	@NotNull
	private Integer gb;
	
	@Column(length = 50)
	@NotNull
	private String ramType;
	
	@Column(length = 50)
	@NotNull
	private String speed;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "ramtype_laptopdetail",
		joinColumns = { @JoinColumn(name = "ramtype_id") },
		inverseJoinColumns = { @JoinColumn(name = "laptopdetail_id") })
	
		private Set<LaptopDetail> laptopdetail = new HashSet<>();
	
	

	public RAMType() {
		super();
	}

	public RAMType(Integer id, Integer gb, String ramType, String speed, Set<LaptopDetail> laptopdetail) {
		super();
		this.id = id;
		this.gb = gb;
		this.ramType = ramType;
		this.speed = speed;
		this.laptopdetail = laptopdetail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGb() {
		return gb;
	}

	public void setGb(Integer gb) {
		this.gb = gb;
	}

	public String getRamType() {
		return ramType;
	}

	public void setRamType(String ramType) {
		this.ramType = ramType;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public Set<LaptopDetail> getLaptopdetail() {
		return laptopdetail;
	}

	public void setLaptopdetail(Set<LaptopDetail> laptopdetail) {
		this.laptopdetail = laptopdetail;
	}

	
	
	
}


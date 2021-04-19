package com.laptop.ict.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "screentypes")
public class ScreenType implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50)
	private String size;
	
	@Column(length = 50)
	private String resolution;
	
	@Column(length = 50)
	private String technology;
	
	@Column(length = 50)
	private String induction;
	
	

	public ScreenType() {
		super();
	}

	public ScreenType(Integer id, String size, String resolution, String technology, String induction) {
		super();
		this.id = id;
		this.size = size;
		this.resolution = resolution;
		this.technology = technology;
		this.induction = induction;
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
	
	
	
}

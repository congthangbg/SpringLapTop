package com.laptop.ict.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Suppliers")
public class Suppliers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer supplierId;
	
	@Column(name = "SupplierName")
	private String supplierName;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Phone")
	private String phone;
	
	

	public Suppliers() {
		super();
	}

	public Suppliers(Integer supplierId, String supplierName, String address, String phone) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.address = address;
		this.phone = phone;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}

package com.laptop.ict.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bills")
public class Bills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer billId;
	
	@Column(name = "SupplierID")
	private Integer supplierId;
	
	@Column(name = "StaffID")
	private Integer staffId;
	
	@Column(name = "Date")
	private Integer date;
	
	

	public Bills() {
		super();
	}

	public Bills(Integer billId, Integer supplierId, Integer staffId, Integer date) {
		super();
		this.billId = billId;
		this.supplierId = supplierId;
		this.staffId = staffId;
		this.date = date;
	}

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}
	
	

}

package com.laptop.ict.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BillDetails")
public class BillDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer detailId;
	
	@Column(name ="BillID")
	private Integer billId;
	
	@Column(name = "PID")
	private Integer pId;
	
	@Column(name = "Price")
	private String price;
	
	@Column(name = "Amount")
	private Integer amount;
	
	

	public BillDetails() {
		super();
	}

	public BillDetails(Integer detailId, Integer billId, Integer pId, String price, Integer amount) {
		super();
		this.detailId = detailId;
		this.billId = billId;
		this.pId = pId;
		this.price = price;
		this.amount = amount;
	}

	public Integer getDetailId() {
		return detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
		
	
}

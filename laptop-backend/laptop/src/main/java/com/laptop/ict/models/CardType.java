package com.laptop.ict.models;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name = "cardtypes")
public class CardType implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50)
	@NotNull
	private String cardDesign;
	
	@Column(length = 50)
	@NotNull
	private String cardType;
	
//	@ManyToOne
//	@JoinColumn(name = "brand_id")
//	private ComponentBrand brand;
	
	
//	@ManyToMany(mappedBy = "cardTypes")
//	private Collection<ComponentSupplier> componentSuppliers;
	

	public CardType(Integer id, String cardDesign, String cardType) {
		super();
		this.id = id;
		this.cardDesign = cardDesign;
		this.cardType = cardType;
	}
	
	public CardType() {
		
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCardDesign() {
		return cardDesign;
	}

	public void setCardDesign(String cardDesign) {
		this.cardDesign = cardDesign;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

//	public ComponentBrand getBrand() {
//		return brand;
//	}
//
//	public void setBrand(ComponentBrand brand) {
//		this.brand = brand;
//	}

	
	
	
	
	
}

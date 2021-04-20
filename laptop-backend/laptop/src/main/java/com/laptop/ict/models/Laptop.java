package com.laptop.ict.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
		
		
		
		public Laptop() {
			super();
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
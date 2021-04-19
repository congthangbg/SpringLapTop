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
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "laptopdetails")
public class LaptopDetail implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50)
	@NotNull
	private String cpu;
	
	@Column(length = 50)
	@NotNull
	private String rom;
	
	@Column(length = 50)
	@NotNull
	private String keyBoard;
	
	@Column(length = 50)
	@NotNull
	private String system;
	
	@Column(length = 50)
	@NotNull
	private String color;
	
	@Column(length = 50)
	@NotNull
	private String connector;
	
	@Column(length = 50)
	@NotNull
	private String camera;
	
	@Column(length = 50)
	@NotNull
	private String audio;
	
	@Column(length = 50)
	@NotNull
	private String pin;
	
	@Column(length = 50)
	@NotNull
	private String size;
	
	@Column(length = 50)
	@NotNull
	private String weight;
	
	@Column(length = 50)
	@NotNull
	private String component;
	
	@Column(length = 50)
	@NotNull
	private String year;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "screentype_laptopdetail",
		joinColumns = { @JoinColumn(name = "laptopdetail_id") },
		inverseJoinColumns = { @JoinColumn(name = "screentype_id") })
		
		private Set<ScreenType> screen = new HashSet<>();
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "ramtype_laptopdetail",
		joinColumns = { @JoinColumn(name = "laptopdetail_id") },
		inverseJoinColumns = { @JoinColumn(name = "ramtype_id") })
	
		private Set<RAMType> ram = new HashSet<>();

	
	

	public LaptopDetail() {
		super();
	}


	public LaptopDetail(Integer id, String cpu, String rom, String keyBoard, String system, String color,
			String connector, String camera, String audio, String pin, String size, String weight, String component,
			String year, Set<ScreenType> screen, Set<RAMType> ram) {
		super();
		this.id = id;
		this.cpu = cpu;
		this.rom = rom;
		this.keyBoard = keyBoard;
		this.system = system;
		this.color = color;
		this.connector = connector;
		this.camera = camera;
		this.audio = audio;
		this.pin = pin;
		this.size = size;
		this.weight = weight;
		this.component = component;
		this.year = year;
		this.screen = screen;
		this.ram = ram;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public String getRom() {
		return rom;
	}


	public void setRom(String rom) {
		this.rom = rom;
	}


	public String getKeyBoard() {
		return keyBoard;
	}


	public void setKeyBoard(String keyBoard) {
		this.keyBoard = keyBoard;
	}


	public String getSystem() {
		return system;
	}


	public void setSystem(String system) {
		this.system = system;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getConnector() {
		return connector;
	}


	public void setConnector(String connector) {
		this.connector = connector;
	}


	public String getCamera() {
		return camera;
	}


	public void setCamera(String camera) {
		this.camera = camera;
	}


	public String getAudio() {
		return audio;
	}


	public void setAudio(String audio) {
		this.audio = audio;
	}


	public String getPin() {
		return pin;
	}


	public void setPin(String pin) {
		this.pin = pin;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getComponent() {
		return component;
	}


	public void setComponent(String component) {
		this.component = component;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public Set<ScreenType> getScreen() {
		return screen;
	}


	public void setScreen(Set<ScreenType> screen) {
		this.screen = screen;
	}


	public Set<RAMType> getRam() {
		return ram;
	}


	public void setRam(Set<RAMType> ram) {
		this.ram = ram;
	}

		
		
	
	
}

package com.infosys.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="products")
public class Products {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pid;
	
	@Column(name= "pname")
	private String pname;
	
	@Column(name= "pcategory")
	private String pcategory;
	
	@Column(name= "price")
	private Integer price;
	
	@Column(name= "available")
	private Boolean available;

	public Long getPid() {
		return pid;
	}

	
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}
	

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(Long pid, String pname, String pcategory, Integer price, Boolean available) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcategory = pcategory;
		this.price = price;
		this.available = available;
	}
}

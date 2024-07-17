package com.infosys.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jpa_product")
public class Product {

	@Id
	private int prod_id;
	private String prod_name;
	
	
	@ManyToMany(mappedBy="products",fetch=FetchType.EAGER)
	private List<Category> categories = new ArrayList<>();

	public int getProd_id() {
		return prod_id;
	}


	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}


	public String getProd_name() {
		return prod_name;
	}


	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}


	public List<Category> getCategories() {
		return categories;
	}


	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}


	public Product(int prod_id, String prod_name, List<Category> categories) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.categories = categories;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

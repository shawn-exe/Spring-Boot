package com.infosys.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jpa_category")
public class Category {

	@Id
	private int cat_id;
	private String title;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Product> products = new ArrayList<>();
	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int cat_id, String title, List<Product> products) {
		super();
		this.cat_id = cat_id;
		this.title = title;
		this.products = products;
	}
	
}

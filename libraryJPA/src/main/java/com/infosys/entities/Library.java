package com.infosys.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "library")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookid;
	private String bname;
	private String category;
	private String aname;
	private String publication;
	private int price;
	private boolean available;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(int bookid, String bname, String category, String aname, String publication, int price,
			boolean available) {
		super();
		this.bookid = bookid;
		this.bname = bname;
		this.category = category;
		this.aname = aname;
		this.publication = publication;
		this.price = price;
		this.available = available;
	}

}

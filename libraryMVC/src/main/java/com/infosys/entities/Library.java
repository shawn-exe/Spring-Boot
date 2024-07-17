package com.infosys.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "library")
@Data
public class Library {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int bookid;
	
	@Column(name= "bname", nullable = false)
	private String bname;
	
	@Column(name= "bauthor", nullable = false)
	private String bauthor;
	
	@Column(name= "avail", nullable = false)
	private String avail;

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

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public String getAvail() {
		return avail;
	}

	public void setAvail(String avail) {
		this.avail = avail;
	}

	public Library(int bookid, String bname, String bauthor, String avail) {
		super();
		this.bookid = bookid;
		this.bname = bname;
		this.bauthor = bauthor;
		this.avail = avail;
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

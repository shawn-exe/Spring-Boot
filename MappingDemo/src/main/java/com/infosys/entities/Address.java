package com.infosys.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="jpa_address")
public class Address {

	@Id
	private int address_id;
	private String street;
	private String city;
	private String country;
	
	@ManyToOne
	@JoinColumn(name="st_id")
	private Student student;	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int address_id, String street, String city, String country, Student student) {
		super();
		this.address_id = address_id;
		this.street = street;
		this.city = city;
		this.country = country;
		this.student = student;
	}

	
}

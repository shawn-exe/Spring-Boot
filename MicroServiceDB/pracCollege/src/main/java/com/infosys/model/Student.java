package com.infosys.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(name = "usn")
	private String usn;

//	@ManyToOne
//	private College college;
//
//	public College getCollege() {
//		return college;
//	}
//
//	public void setCollege(College college) {
//		this.college = college;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public Student(Long id, String name, String usn) {
		super();
		this.id = id;
		this.name = name;
		this.usn = usn;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}

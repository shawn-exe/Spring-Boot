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
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "usn")
	private String usn;
	
	@Column(name= "email")
	private String email;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", usn=" + usn + ", email=" + email + "]";
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(Long id, String name, String usn, String email) {
		super();
		this.id = id;
		this.name = name;
		this.usn = usn;
		this.email = email;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

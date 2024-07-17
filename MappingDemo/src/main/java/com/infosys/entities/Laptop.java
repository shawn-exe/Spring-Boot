package com.infosys.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jpa_laptop")
public class Laptop {

	@Id
	private int laptop_Id;
	private String laptop_Name;
	private String laptop_Config;
	
	@OneToOne
	@JoinColumn(name="st_id")
	private Student student;

	public Laptop(int laptop_Id, String laptop_Name, String laptop_Config, Student student) {
		super();
		this.laptop_Id = laptop_Id;
		this.laptop_Name = laptop_Name;
		this.laptop_Config = laptop_Config;
		this.student = student;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLaptop_Id() {
		return laptop_Id;
	}

	public void setLaptop_Id(int laptop_Id) {
		this.laptop_Id = laptop_Id;
	}

	public String getLaptop_Name() {
		return laptop_Name;
	}

	public void setLaptop_Name(String laptop_Name) {
		this.laptop_Name = laptop_Name;
	}

	public String getLaptop_Config() {
		return laptop_Config;
	}

	public void setLaptop_Config(String laptop_Config) {
		this.laptop_Config = laptop_Config;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}

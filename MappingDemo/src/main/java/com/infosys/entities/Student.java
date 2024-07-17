package com.infosys.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jpa_student")
public class Student {

	@Id
	private int stId;
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	private String stName;
	private String stBranch;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "laptop_id")
	private Laptop laptop;
	
	@OneToMany(mappedBy = "student" ,cascade = CascadeType.ALL)
	private List<Address> address = new ArrayList<>();
	
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStBranch() {
		return stBranch;
	}
	public void setStBranch(String stBranch) {
		this.stBranch = stBranch;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Student(int stId, String stName, String stBranch, Laptop laptop) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.stBranch = stBranch;
		this.laptop = laptop;
	}
	public Student() {
		super();
	}
}

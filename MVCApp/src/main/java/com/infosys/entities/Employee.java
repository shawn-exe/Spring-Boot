package com.infosys.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employees")
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	
	@Column(name= "emp_name", nullable = false)
	private String empName;
	
	@Column(name= "emp_dept")
	private String empDept;
	
	@Column(name= "emp_email")
	private String empEmail;

	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public Employee(Long empId ,String empName, String empDept, String empEmail) {
		super();
		this.empId=empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empEmail = empEmail;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

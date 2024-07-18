package com.infosys.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Employee {
	private int eid;
	private String ename;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

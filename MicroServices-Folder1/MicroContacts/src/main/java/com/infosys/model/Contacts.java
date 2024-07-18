package com.infosys.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Contacts {
	
	private int phno;
	private String cname;
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Contacts(int phno, String cname) {
		super();
		this.phno = phno;
		this.cname = cname;
	}
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}

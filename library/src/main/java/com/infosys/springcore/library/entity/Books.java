package com.infosys.springcore.library.entity;

public class Books {
	private int bid;
	private String bname;
	private String aname;
	private String yr;
	
	
public Books() {
		
	}



	public Books(int bid, String bname, String aname, String yr) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.aname = aname;
	this.yr = yr;
}


	public int getBid() {
		return bid;
	}
	
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	public String getAname() {
		return aname;
	}
	
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public String getYr() {
		return yr;
	}
	
	public void setYr(String yr) {
		this.yr = yr;
	}



	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", aname=" + aname + ", yr=" + yr + "]";
	}
	
}

package com.infosys.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notifications {

	private int nId;
	private String description;
	public int getnId() {
		return nId;
	}
	public void setnId(int nId) {
		this.nId = nId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Notifications() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notifications(int nId, String description) {
		super();
		this.nId = nId;
		this.description = description;
	}
	
}

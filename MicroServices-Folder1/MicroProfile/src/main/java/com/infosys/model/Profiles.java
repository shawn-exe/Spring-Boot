package com.infosys.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Profiles {

	private int profileId;
	private String profileDescription;
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getProfileDescription() {
		return profileDescription;
	}
	public void setProfileDescription(String profileDescription) {
		this.profileDescription = profileDescription;
	}
	public Profiles(int profileId, String profileDescription) {
		super();
		this.profileId = profileId;
		this.profileDescription = profileDescription;
	}
	public Profiles() {
		super();
		// TODO Auto-generated constructor stub
	}
}

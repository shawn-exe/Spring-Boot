package com.infosys.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Users {

	private int userId;
	private String name;
	private long phno;
	
	private Posts posts;
	private Notifications notifications;
	private Profiles profiles;
	private Contacts contacts;
	
	public Contacts getContacts() {
		return contacts;
	}
	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}
	public Profiles getProfiles() {
		return profiles;
	}
	public void setProfiles(Profiles profiles) {
		this.profiles = profiles;
	}
	public Posts getPosts() {
		return posts;
	}
	public void setPosts(Posts posts) {
		this.posts = posts;
	}
	public Notifications getNotifications() {
		return notifications;
	}
	public void setNotifications(Notifications notifications) {
		this.notifications = notifications;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int userId, String name, long phno) {
		super();
		this.userId = userId;
		this.name = name;
		this.phno = phno;
		
	}
	
	
}

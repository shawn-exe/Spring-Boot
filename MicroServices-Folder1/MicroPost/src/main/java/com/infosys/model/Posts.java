package com.infosys.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Posts {
	
	private int postId;
	private String description;
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Posts(int postId, String description) {
		super();
		this.postId = postId;
		this.description = description;
	}
	public Posts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

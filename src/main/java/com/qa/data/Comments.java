package com.qa.data;


//pojo - plain old java object
public class Comments {

	String postId;
	String id;
	String name;
	String email;
	String body;
	
	

	public Comments(String name,String postId) {
		this.name=name;
		this.postId=postId;

	}



	public String getPostId() {
		return postId;
	}



	public void setPostId(String postId) {
		this.postId = postId;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getBody() {
		return body;
	}



	public void setBody(String body) {
		this.body = body;
	}

	
	
	

}

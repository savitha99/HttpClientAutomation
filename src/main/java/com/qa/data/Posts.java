package com.qa.data;


//pojo - plain old java object
public class Posts {

	String userId;
	String id;
	String title;
	String body;
	
	

	public Posts(String id,String title) {
		this.id=id;
		this.title=title;

	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getBody() {
		return body;
	}



	public void setBody(String body) {
		this.body = body;
	}

	
	
	
	
	
	
	
	
	

}

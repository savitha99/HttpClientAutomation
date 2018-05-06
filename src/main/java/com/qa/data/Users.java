package com.qa.data;


//pojo - plain old java object
public class Users {

	String id;
	String name;
	String userName;
	String email;
	

public Users(String name,String userName){
	this.name=name;
	this.userName=userName;
	
}

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//getters and setters methods:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	
	
	
	
	
	
	

}

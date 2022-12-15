package com.model;

public class Register {

	private String name;
	private String email;
	private String uname;
	private String password;
	
	public Register() {
		super();
	}
	
	public Register(String name, String email, String uname, String password) {
		super();
		this.name = name;
		this.email = email;
		this.uname = uname; 
		this.password = password;
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
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
/*
   create table Register
   (
    name varchar2(30),
    email varchar2(30),
    username varchar2(20),
    password varchar2(15)
    );
  */
 
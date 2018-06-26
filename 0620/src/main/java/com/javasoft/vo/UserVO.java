package com.javasoft.vo;

public class UserVO {
	private String username;
	private String password;
	public UserVO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public UserVO() {}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

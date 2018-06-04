package com.javasoft.vo;

public class UserVO {
	private String username;
	private int age;
	public UserVO(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public int getAge() {
		return age;
	}
	
	
}

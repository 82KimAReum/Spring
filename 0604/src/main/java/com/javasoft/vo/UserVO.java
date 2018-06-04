package com.javasoft.vo;

public class UserVO {
	private String name;
	private int age;
	private String userid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + ", userid=" + userid + "]";
	}
	
}

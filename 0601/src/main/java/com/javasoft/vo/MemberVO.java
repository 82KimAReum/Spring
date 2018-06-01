package com.javasoft.vo;

public class MemberVO {
	private String name, userid, gender, city;
	public MemberVO() {}
	public MemberVO(String name, String userid, String gender, String city) {
		this.name = name;
		this.userid = userid;
		this.gender = gender;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", userid=" + userid + ", gender=" + gender + ", city=" + city + "]";
	}
}

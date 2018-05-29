package com.javasoft.vo;

public class UserVO {
	private String userid;
	private String irum;
	private String gender;
	private String city;
	
	public UserVO() {}
	public UserVO(String userid, String irum, String gender, String city) {
		super();
		this.userid = userid;
		this.irum = irum;
		this.gender = gender;
		this.city = city;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
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
		return String.format("MembershipVO [userid=%s, irum=%s, gender=%s, city=%s]", userid, irum, gender, city);
	}
	
	
}

package com.javasoft.dao;

import org.springframework.stereotype.Repository;

import com.javasoft.vo.UserVO;

@Repository("userDao")
public class UserDao {
	private String username;
	private String password;

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

	public UserVO getUsersByID(String username) {
		return new UserVO(this.username, this.password);
	}
}

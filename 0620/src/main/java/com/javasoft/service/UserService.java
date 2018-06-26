package com.javasoft.service;

import org.springframework.stereotype.Service;

import com.javasoft.dao.UserDao;
import com.javasoft.vo.UserVO;

@Service("userService")
public class UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserVO getUsersByID(String username) {
		return this.userDao.getUsersByID(username);
	}
}

package com.javasoft.service;

import java.util.List;

import com.javasoft.vo.UserVO;

public interface UserService {
	void insertUser(UserVO user);
	List<UserVO> selectUserAll();
	UserVO selectUser(String userid);
	void deleteUser(String userid);
	void updateUSer(UserVO user);
}

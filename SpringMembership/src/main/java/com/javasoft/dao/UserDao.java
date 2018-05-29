package com.javasoft.dao;

import java.util.List;

import com.javasoft.vo.UserVO;

public interface UserDao {
	void insert(UserVO user);
	List<UserVO> selectAll();
	UserVO selectOne(String userid);
	void delete(String userid);
	void update(UserVO user);
}

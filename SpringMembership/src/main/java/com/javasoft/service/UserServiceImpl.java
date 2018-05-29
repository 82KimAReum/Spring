package com.javasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasoft.dao.UserDao;
import com.javasoft.vo.UserVO;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao3;//UserDaoImpl의 dao이름과 같아야 함
	
	@Override
	public void insertUser(UserVO user) {
		//this.userDao2.insert(user);
	}

	@Override
	public List<UserVO> selectUserAll() {
		//return userDao2.selectAll();
		return null;
	}

	@Override
	public UserVO selectUser(String userid) {
		return this.userDao3.selectOne(userid);
	}

	@Override
	public void deleteUser(String userid) {
		//this.userDao2.delete(userid);

	}

	@Override
	public void updateUSer(UserVO user) {
		//this.userDao2.update(user);

	}

}

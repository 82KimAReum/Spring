package com.javasoft.dao;

import java.io.Reader;
import java.util.List;

import org.springframework.stereotype.Repository;

//import com.ibatis.common.resources.Resources;
//import com.ibatis.sqlmap.client.SqlMapClient;
//import com.ibatis.sqlmap.client.SqlMapClientBuilder;
//import com.ibatis.sqlmap.engine.impl.SqlMapClientImpl;
import com.javasoft.vo.UserVO;


@Repository("userDao1")
public class UserDaoIbatisImpl implements UserDao {

	
	
	@Override
	public void insert(UserVO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO selectOne(String userid) {
//		Reader reader= null;
//		SqlMapClient smc= null;
//		UserVO user= null;
//		try {
//			reader= Resources.getResourceAsReader("SqlMapConfig.xml");
//			smc=SqlMapClientBuilder.buildSqlMapClient(reader);
//			user= (UserVO)smc.queryForObject("Users.selectOne",userid);
//			
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		return null;
	}

	@Override
	public void delete(String userid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserVO user) {
		// TODO Auto-generated method stub

	}

}

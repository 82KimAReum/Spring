package com.javasoft.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.javasoft.vo.UserVO;


@Repository("userDao2")
public class UserDaoMybatisImpl implements UserDao {

	@Override
	public void insert(UserVO user) {
		/*Reader reader= null;
		SqlSession sqlSession= null;
		
		try {
			reader= Resources.getResourceAsReader("mybatis-config.xml");
			sqlSession= new SqlSessionFactoryBuilder().build(reader).openSession();
			sqlSession.insert("insertSP",user);
		}catch(Exception e) {
			System.out.println(e);
		}*/

	}

	@Override
	public List<UserVO> selectAll() {
		/*HashMap<String,Object> hashMap = new HashMap<String, Object>();
		Reader reader= null;
		SqlSession sqlSession= null;
		List<UserVO> list=null;
		try {
			reader= Resources.getResourceAsReader("mybatis-config.xml");
			sqlSession= new SqlSessionFactoryBuilder().build(reader).openSession();
			sqlSession.selectList("selectAllSP",hashMap);
			list= (List<UserVO>)hashMap.get("results");
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;*/
		return null;
	}

	@Override
	public UserVO selectOne(String userid) {
		/*Reader reader= null;
		SqlSession sqlSession= null;
		UserVO user=null;
		try {
			reader= Resources.getResourceAsReader("mybatis-config.xml");
			sqlSession= new SqlSessionFactoryBuilder().build(reader).openSession();
			user=(UserVO)sqlSession.selectOne("selectOne",userid);
		}catch(Exception e) {
			System.out.println(e);
		}
		return user;*/
		return null;
	}

	@Override
	public void delete(String userid) {
		/*Reader reader= null;
		SqlSession sqlSession= null;
		UserVO user=null;
		try {
			reader= Resources.getResourceAsReader("mybatis-config.xml");
			sqlSession= new SqlSessionFactoryBuilder().build(reader).openSession();
			sqlSession.delete("deleteSP",userid);
		}catch(Exception e) {
			System.out.println(e);
		}*/

	}

	@Override
	public void update(UserVO user) {
		/*Reader reader= null;
		SqlSession sqlSession= null;
		
		try {
			reader= Resources.getResourceAsReader("mybatis-config.xml");
			sqlSession= new SqlSessionFactoryBuilder().build(reader).openSession();
			sqlSession.update("updateSP",user);
		}catch(Exception e) {
			System.out.println(e);
		}*/

	}

}

package com.javasoft.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javasoft.vo.StudentVO;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SqlSession sqlSession;
	

	@Override
	public void create(StudentVO s) {
		this.sqlSession.insert("Student.insertSP",s);
	}
	
	
	@Override
	public List<StudentVO> readAll() {
		Map<String, Object>map = new HashMap<String, Object>();
		this.sqlSession.selectList("Student.selectAllSP",map);
		List<StudentVO> list= (List<StudentVO>)map.get("results");
		return list;
	}

	@Override
	public StudentVO read(String hakbun) {
		
		Map<String ,Object>map =new HashMap<String, Object>();
		map.put("hakbun", hakbun);
		this.sqlSession.selectOne("Student.selectOneSP",map);
		List<StudentVO>list =(List<StudentVO>)map.get("result");
		return list.get(0);
	}

	@Override
	public void update(StudentVO s) {
		this.sqlSession.update("Student.updateSP",s);
	}

	@Override
	public void delete(String hakbun) {
		this.sqlSession.delete("Student.deleteSP",hakbun);
	}

}

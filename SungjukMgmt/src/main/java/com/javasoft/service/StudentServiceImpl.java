package com.javasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasoft.dao.StudentDao;
import com.javasoft.vo.StudentVO;


@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public int insertStudent(StudentVO student) {
		// TODO Auto-generated method stub
		return this.studentDao.create(student);
	}

	@Override
	public List<StudentVO> selectAll() {
		return this.studentDao.readAll();
	}

	@Override
	public StudentVO selectStudent(String hakbun) {
		return this.studentDao.read(hakbun);
	}

	@Override
	public int updateStudent(StudentVO student) {
		return this.studentDao.update(student);
	}

	@Override
	public int deleteStudent(String hakbun) {
		return this.studentDao.delete(hakbun);
	}

}

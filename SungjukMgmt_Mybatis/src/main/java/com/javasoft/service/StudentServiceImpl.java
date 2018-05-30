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
	public void insertStudent(StudentVO student) {
		
		 this.studentDao.create(student);
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
	public void updateStudent(StudentVO student) {
		 this.studentDao.update(student);
	}

	@Override
	public void deleteStudent(String hakbun) {
		 this.studentDao.delete(hakbun);
	}

}

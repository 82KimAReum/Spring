package com.javasoft.service;

import java.util.List;

import com.javasoft.vo.StudentVO;

public interface StudentService {
	void insertStudent(StudentVO student);
	List<StudentVO> selectAll();
	StudentVO selectStudent(String hakbun);
	void updateStudent(StudentVO student);
	void deleteStudent(String hakbun);
}

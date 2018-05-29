package com.javasoft.service;

import java.util.List;

import com.javasoft.vo.StudentVO;

public interface StudentService {
	int insertStudent(StudentVO student);
	List<StudentVO> selectAll();
	StudentVO selectStudent(String hakbun);
	int updateStudent(StudentVO student);
	int deleteStudent(String hakbun);
}

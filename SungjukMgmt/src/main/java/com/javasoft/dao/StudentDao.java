package com.javasoft.dao;

import java.util.List;

import com.javasoft.vo.StudentVO;

public interface StudentDao {
	int create(StudentVO student);
	List<StudentVO> readAll();
	StudentVO read(String hakbun);
	int update(StudentVO student);
	int delete(String hakbun);
}

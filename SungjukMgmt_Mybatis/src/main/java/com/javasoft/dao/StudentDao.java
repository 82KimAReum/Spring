package com.javasoft.dao;

import java.util.List;

import com.javasoft.vo.StudentVO;

public interface StudentDao {
	void create(StudentVO student);
	List<StudentVO> readAll();
	StudentVO read(String hakbun);
	void update(StudentVO student);
	void delete(String hakbun);
}

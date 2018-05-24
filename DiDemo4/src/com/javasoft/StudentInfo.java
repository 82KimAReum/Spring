package com.javasoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentInfo {
	
	@Bean
	public Student student1(){
		Student student = new Student("������",24,3,5);
		return student;
	}
	@Bean
	public Student student2(){
		Student student = new Student();
		student.setName("������");
		student.setAge(64);
		student.setGrade(6);
		student.setClassNum(4);
		return student;
	}

}

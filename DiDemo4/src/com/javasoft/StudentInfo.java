package com.javasoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentInfo {
	
	@Bean
	public Student student1(){
		Student student = new Student("한지민",24,3,5);
		return student;
	}
	@Bean
	public Student student2(){
		Student student = new Student();
		student.setName("조용필");
		student.setAge(64);
		student.setGrade(6);
		student.setClassNum(4);
		return student;
	}

}

package com.javasoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;



@Configuration
@ImportResource("classpath:beans.xml")
public class ApplicationConfig {
	
	//xml에서 bean불러오기
	@Bean
	public Student student2() {
		Student student= new Student("손호준",34);
		student.setGrade(2);
		student.setClassNum(7);
		return student;
	}
}

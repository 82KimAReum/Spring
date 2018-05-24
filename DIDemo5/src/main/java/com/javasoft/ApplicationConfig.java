package com.javasoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Student student1(){
		Student student = new Student("한지민",24,3,5);
		return student;
	}
	
}

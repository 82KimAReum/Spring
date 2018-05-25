package com.javasoft;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;

public class Student implements DisposableBean{
	private String name;
	private int age;
	private int grade;
	private int classNum;
	private List<String>hobbies;
	private Set<String>subjects;
	public Student(String name, int age, int grade, int classNum) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNum = classNum;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Set<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassNum() {
		return classNum;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("student instance Destroy");
		
	}
	
	
}

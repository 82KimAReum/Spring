package com.javasoft;

public class Student {
	private String name;
	private int age;
	private int grade;
	private int classNum;
	public Student() {}
	public Student(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	@Override
	public String toString() {
		return String.format("Student [name=%s, age=%s, grade=%s, classNum=%s]", name, age, grade, classNum);
	}
	
}

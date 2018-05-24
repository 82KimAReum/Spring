package com.javasoft;

public class StudentInfo {
	private Student student;
	public StudentInfo() {}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentInfo(Student student) {
		super();
		this.student = student;
	}
	
}

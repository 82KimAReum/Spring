package com.javasoft;

public class StudentInfo {
	private Student student;

	public StudentInfo(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public void print() {
		if(this.student!= null) {
			System.out.println("name: "+this.student.getName());
			System.out.println("age: "+this.student.getAge());
			System.out.println("grade: "+this.student.getGrade());
			System.out.println("classNum: "+this.student.getClassNum());
			System.out.println("---------------------------");
		}
	}
}

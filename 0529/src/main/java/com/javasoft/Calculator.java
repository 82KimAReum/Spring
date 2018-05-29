package com.javasoft;

public class Calculator {
	private Student student;
	
	
	public void setStudent(Student student) {
		this.student = student;
	}

	public void calcBmi() {
		double height=this.student.getHeight();
		double weight=this.student.getWeight();
		double bmi = weight/Math.pow(height, 2)*10000;
		System.out.println(this.student.getName()+"'s bmi ="+bmi);
	}
}

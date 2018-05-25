package com.javasoft;

import java.util.List;

public class Student {
	private String name;
	private int age;
	private double height,weight;
	private  List<String> hobbies;
	
	
	
	public Student(String name, int age, List<String> hobbies) {
		//super();
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, age=%s, height=%s, weight=%s, hobbies=%s]", name, age, height, weight,
				hobbies);
	}
	
	
}

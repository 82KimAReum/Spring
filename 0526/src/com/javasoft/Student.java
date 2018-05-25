package com.javasoft;

import java.util.List;

public class Student {
	private String name;
	private int age;
	private List<String> hobbies;
	private double height,weight;
	
	public Student() {}
	public Student(String name, int age, List<String> hobbies, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
		this.height = height;
		this.weight = weight;
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
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
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
	@Override
	public String toString() {
		return String.format("Student [name=%s, age=%s, hobbies=%s, height=%s, weight=%s]", name, age, hobbies, height,
				weight);
	}
	
}

package com.javasoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("student1")
public class Student {
	@Value("한지민")
	private String name;
	@Value("24")
	private int age;
	@Value("162.2")
	private double height;
	@Value("51.9")
	private double weight;
	
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
		return String.format("Student [name=%s, age=%s, height=%s, weight=%s]", name, age, height,
				weight);
	}
	
	
}

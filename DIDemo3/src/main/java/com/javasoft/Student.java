package com.javasoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Student {
	private String name;
	private int age;
	private List<String> hobbies;
	private Set<String> editors;
	private Map<String, String> addresses;
	private double height, weight;
	public Student(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void setEditors(Set<String> editors) {
		this.editors = editors;
	}
	public void setAddresses(Map<String, String> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", hobbies=" + hobbies + ", editors=" + editors
				+ ", addresses=" + addresses + ", height=" + height + ", weight=" + weight + "]";
	}
}

package com.javasoft;

import java.util.List;

public class MyInfo {
	private String name;
	private int age;
	private double height;
	private double weight;
	private List<String> hobbies;
	private BMICalculator bmiCalculator;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	
	public void print() {
		String myhobby= "";
		for(String hobby: this.hobbies) {
			myhobby+= hobby+",";
		}
		myhobby=myhobby.substring(0,myhobby.length()-1);
		String info=String.format("MyInfo [name=%s, age=%d, height=%.1f, weight=%.1f, hobbies=%s]", name, age,
				height, weight, myhobby);
		System.out.println(info);
		this.bmiCalculator.bmiCalculator(height, weight);
	}
	
	
}

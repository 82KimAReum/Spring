package com.javasoft;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student /*implements InitializingBean,DisposableBean*/{
	private String name;
	private int age;
	public Student(String name, int age) {
	//	super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("Student [name=%s, age=%s]", name, age);
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
	
	/*@Override
	public void afterPropertiesSet() throws Exception {
		//Bean이 초기화되는 과정에서 호출
		//또는@PostConstruct호출
		System.out.println("방금 bean생성");
	}
	
	@Override
	public void destroy() throws Exception {
		//Bean이 소멸할 때
		//또는 @PreDestroy를 호출
		System.out.println("방금 bean소멸");
	}*/
	
	
}

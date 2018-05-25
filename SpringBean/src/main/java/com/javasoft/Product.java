package com.javasoft;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Product {
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("Product [name=%s, price=%s]", name, price);
	}
	@PostConstruct
	public void init() {
		System.out.println("방금 소나타 생성");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("방금 소나타 소멸");
	}
}

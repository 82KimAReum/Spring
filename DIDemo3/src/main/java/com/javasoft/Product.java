package com.javasoft;

public class Product {
	private String name;
	private int price;
	private String maker;
	private String color;
	public Product() {
		
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return String.format("Product [name=%s, price=%s, maker=%s, color=%s]", name, price, maker, color);
	}
	
	
}

package com.javasoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//xml 없이 어노테이션만으로 set하기

@Component("car")
public class Product {
	@Value("${product.irum}")
	private String irum; 
	@Value("${product.price}")
	private int price;
	@Value("${product.maker}")
	private String maker;
	@Value("${product.color1},${product.color2},${product.color3}")
	private List<String> colors;
	
	@Override
	public String toString() {
		return String.format("Product [irum=%s, price=%s, maker=%s, colors=%s]", irum, price, maker, colors);
	}

	
}

package com.javasoft;

public class ProductInfo {
	private Product product;
	
	public ProductInfo() {
		
	}
	public ProductInfo(Product product) {
		super();
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}

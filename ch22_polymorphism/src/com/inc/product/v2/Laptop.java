package com.inc.product.v2;

public class Laptop extends Product{
	
	private String os;
	
	public Laptop(int price, String name, String os) {
		super(price, name);
		this.os = os;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.printf("운영체제 : %s\n", os);
	}
	
	
}

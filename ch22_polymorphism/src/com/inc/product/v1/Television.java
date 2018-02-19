package com.inc.product.v1;

public class Television extends Product{
	
	private int size;
	
	public Television(int price, String name, int size) {
		super(price, name); //부모 생성자
		this.size = size;
	}
	
	@Override
	public void getInfo() {
		super.getInfo(); //부모 getInfo 메서드
		System.out.printf("사이즈 : %d인치\n", size);
	}
	
	
}

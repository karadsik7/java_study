package com.inc.product.v1;

public class Barcoder {

	
	private Product[] products = new Product[5];
	
	public void scan(Television tv) { //다형성 때문에 부모클래스의 배열안에 자식클래스를 넣을 수 있다.
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				tv.getInfo();
				products[i] = tv;
				break;
			}
			System.out.println("---------");
		}
	}
	
	public void scan(Laptop lt) {
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				lt.getInfo();
				products[i] = lt;
				break;
			}
		}
	
		System.out.println("-------------");
	}
	
	
	public void total() {
		int totalPrice = 0;
		for(Product pro : products) {
			if(pro == null) {
				break;
			}
			
			totalPrice += pro.getPrice();
		}
		System.out.printf("총 합산 가격은 %d원입니다", totalPrice);
	}
	
	
	
	
	
}

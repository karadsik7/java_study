package com.inc.product.v2;

public class Barcoder {

	
	private Product[] products = new Product[5];
	
	public void scan(Product product) { //product가 부모클래스이므로  
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				//원래 인스턴스가 자식클래스면 부모 클래스로 형변환하더라도 '오버라이딩'한 자식클래스의 메서드가
				//실행이 된다. (다형성)
				product.getInfo(); //부모클래스의 겟인포가아니라 자식클래스의 겟인포가 실행됨
				products[i] = product;
				break;
			}
			
		}
		System.out.println("---------");
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

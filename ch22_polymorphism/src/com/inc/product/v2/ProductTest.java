package com.inc.product.v2;

public class ProductTest {

	public static void main(String[] args) {
		Television tel = new Television(1000, "TV1", 32);
		tel.getInfo();
		Laptop lt = new Laptop(500, "LT1", "Windows 10");
		lt.getInfo();
		Laptop lt2 = new Laptop(100, "LT2", "Mac OS");
		lt2.getInfo();
		Laptop lt3 = new Laptop(150, "LT3", "Linux");
		lt3.getInfo();
		
		Barcoder bc = new Barcoder();
		bc.scan(tel);
		bc.scan(lt);
		bc.scan(lt3);
		bc.scan(lt2);
		bc.total();
	}

}

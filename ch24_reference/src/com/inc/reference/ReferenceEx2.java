package com.inc.reference;

public class ReferenceEx2 {
	
	public static void main(String[] args) {
		
		String r = "Hello";
		
		String r2 = new String("Hello");
		
		String r3 = "Hello";
		
		System.out.println(r == r2); //false
		System.out.println(r.equals(r2)); //true 주소값비교가 아닌 값비교
		//원래 equals는 주소값비교지만 오버라이딩한 코드를 통해 값비교가 가능 // String만 적용
		System.out.println(r2 == r3); //false
		System.out.println(r == r3); //true // String만 같은 문자열이면 같은 주소값 공유
		
		
		
	}

}

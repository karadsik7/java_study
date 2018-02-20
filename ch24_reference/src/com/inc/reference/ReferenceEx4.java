package com.inc.reference;

public class ReferenceEx4 {
	
	public static void main(String[] args) {

		String str = "Hello";
		changer(str);
		System.out.println(str); //hello가 뜸
		//이유는 changer의 지역변수 str와 메인의 지역변수 str은 서로 다른 변수이기 때문
	
	}
	
	public static void changer(String str) {
		str = "hi";
	}

}

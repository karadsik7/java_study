package com.inc.reference;

public class ReferenceEx1 {
	
	public static void main(String[] args) {
		int i = 0; // 변수에 0이란 값이 담김. (기본자료형)
		String r = "hello"; // 변수 자체엔 주소값이 담김 (참조자료형)
		
		//값복사
		int iCopy = i;
		
		//주소복사
		String rCopy = r; // 인스턴스의 주소값을 복사함.
		
		System.out.println(i == iCopy); //true
		System.out.println(r == rCopy); //true
		
		iCopy = 3;
		System.out.println(i == iCopy); //false
		rCopy = "hi"; //r의 주소를 찾아가 데이터를 변경하는 것이 아님
		System.out.println(r == rCopy); //false
		
		
		
		
	}

}

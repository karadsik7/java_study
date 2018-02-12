package com.inc.example;

public class Hello {
	
	//생성자에 코드를 넣는 것은 객체 생성시 꼭 필요한 코드가 있다면 넣어주는 것
	// 특징 : 생성자 코드는 객체 생성할 때 1번만 실행된다.
	
	
	public Hello(){ //생성자
		System.out.println("Hello constructor?");
	}
	
	
	//************주의**********************
	
	/*public void Hello() { // 이렇게 할 경우 이름이 Hello인 인스턴스 메서드가 되므로 주의
		
	}*/
	
	
	
	void hello() { //인스턴스 메서드
		System.out.println("Hello method?");
	}

}

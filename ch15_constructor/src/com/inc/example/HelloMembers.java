package com.inc.example;

import java.util.Scanner;

public class HelloMembers {
	
	//생성자가 필요한 이유
	//1. 인스턴스가 생성될 때 필수적으로 실행되어야 하는 로직이 있고 이를 강제해야 하는 경우
	/*	(1) 초기화 과정이 복잡한 경우
		(2) 외부로부터 데이터를 받아서 초기화 해야하는 경우*/

	
	
	// (1) 초기화 과정이 복잡한 경우
	
	String[] members = new String[3]; // String배열 기본값 null
	
	static final Scanner scanner = new Scanner(System.in); // 모든 인스턴스가 공유하도록
	
	
	HelloMembers(){ // members라는 배열을 생성할 때 꼭 필요한 과정이므로 생성자로 넣어서 호출하는 개발자의 부담을 줄인다
		init();
		//그러나 생성자안에 코드가 복잡하면 그 역시 문제이므로 init();이라는 메서드만 투입해도 결과는 같으므로
		//객체로 분리하는 것이 좋다.
	}
	
	
	private void init() { //init이라는 메서드는 다른 클래스에서는 쓸 필요 자체가 없으므로 프라이빗을 걸어도 무방하다.
		for(int i = 0; i < members.length; i++) {
			System.out.println(i+1 + "번째 멤버를 입력해주세요");
			members[i] = scanner.nextLine();
			
		}
	}
	
	
	void hello() {
		for(String i : members) {
			System.out.println(i + "님 안녕하세요.");
		}
	}
	
	
	
	
	
	
	
	
	
}

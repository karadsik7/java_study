package com.inc.example;

public class ConstructorEx2 {
	
	public static void main(String[] args) {
		
		HelloMembers hm = new HelloMembers();
		//hm.init(); // 꼭 hm.init();을 써야 작동하기 때문에 불편
		//협업 상황에서는 이러한 필수적인 코드를 신경써서 선언해야하면 안좋은 결과가 일어남
		hm.hello();
		
		// hm.init(); 프라이빗이므로 호출 불가능
		
		
		
	}

}

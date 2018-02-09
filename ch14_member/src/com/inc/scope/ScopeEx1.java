package com.inc.scope;

public class ScopeEx1 {

	
	int i = 0; // 멤버, 인스턴스 변수 (필드영역)
	
	void foo() {
		int i = 1; //로컬, 인스턴스 변수 (로컬영역)
		System.out.println(i); //지역변수가 우선순위가 높으므로 1을 출력
		System.out.println(this.i); //인스턴스 변수 i를 호출할 수 있음
		System.out.println(this); //this는 나 자신의 객체(Scope1Ex1)를 의미
	}
	
	
	
	
	public static void main(String[] args) {
		
		ScopeEx1 scope1 = new ScopeEx1();
		System.out.println(scope1); //this 명령어 증명용
		scope1.foo();
		
		ScopeEx1 scope2 = new ScopeEx1();
		scope2.foo(); // 주소값이 다르므로 별개의 인스턴스임
		
		System.out.println(scope1 == scope2); //(주소값 비교) false
		
		System.out.println("장동혁");
		System.out.println(new String("장동혁"));
		System.out.println("장동혁" == new String("장동혁")); //(주소값 비교) false
		System.out.println("장동혁".equals(new String("장동혁"))); //(값 비교) true
		//왜냐? 값은 같을 수 있으나 별개의 인스턴스이기 때문에
		
		
	
	}

}

package com.inc.example;

public class ConstructorEx3 {
	
	public static void main(String[] args) {
		
		//저장해둔 변수의 사용
		//Person p1 = new Person(); // 생성자의 형태를 Person 클래스에서 규정했으므로 기본 생성자는 사용이 불가능하다. 
		/*p1.name = "장진수";
		p1.age = 27;*/
		
		//하지만 이런 작업은 따로 메서드로 만들어두는 것이 편리하다.
		
		// p1.init("장진수", 27); //하지만 이것도 p1의 호출에다가 init의 값을 지정하는것 자체가 부담임.
		//꼭 필요한 코드이기 때문에 굳이 호출하지 않아도 작동해야할 필요성이 있다. 이럴경우 생성자에 강제
		
		Person p2 = new Person("장진수", 27);
		System.out.println(p2.name + " : " + p2.age);
		
		Person p3 = new Person("장진수", 27, 175);
		System.out.printf("이름 : %s\n나이 : %d\n키 : %d", p3.name, p3.age, p3.height);
		
		
	}

}

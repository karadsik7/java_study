package com.inc.calculator;

public class CalculatorTest {
	
	public static void main(String[] args) {
		
		BasicCalculator bc = new BasicCalculator();
		bc.setMemory(10, 20);
		System.out.println(bc.sum());
		System.out.println(bc.sub());
		
		//만약 BasicCalculator에 곱하기(multiply) 기능을 추가하고싶다면?
		// 1. 그냥 BasicCalculator에 mul이라는 메서드를 추가한다. (비추천, 유지보수 관리 힘들어짐)
		// 2. MultiplyCalculator라는 새로운 클래스를 만든다. 
		// 정도가 떠오를텐데
		// 프로그래밍을 할 때 별의별 상황이 다있으니 장단점을 알아보자.
		
		// 상황
		
		// (1) 내가 혼자 모든 클래스를 만들고 코드도 공개안하고 내가 모든 프로그래밍을 진행
		// 이 때에는 어떤 방법으로 기능을 추가해도 문제 없음.
		
		// (2) BasicCal클래스가 내가 만든 클래스가 아닌 경우 (소스파일(.java)이 없고 바이트코드(.class)만 있는 경우)
		// (2)-1.의 방법으로 불가능 (.class파일이기 때문에 해석도 수정도 불가능)
		// (2)-2.의 방법도 불가능 (수정 자체가 불가능해서 클래스를 설령 새로 만든다해도 인스턴스 못만듬)
		
		// (3) BC를 내가 만들지 않았지만 소스파일이 공개된 경우
		/* (3)-1. BC가 업데이트 됐다면 BC의 코드를 가져와서 복붙하면 내가 만든 multiply를 다시 추가해야한다.
		          (유지보수가 힘들다)*/
		// (3)-2. 위의 이유와 같음.
		
		// (4) BC를 내가 만들었지만 다른 사람들이 BC를 사용해야할 경우
		// (4)-1. 다른 사람들은 곱하기 기능을 필요로 하지 않을 수도 있다. (필요없는 코드이기 때문에 존재하면 가독성 해침)
		// (4)-2. 다른 사람은 기존대로 BC를 쓰고 나는 MC를 쓰면 되겠지만 코드의 중복이 일어남.
		
		//*********************** 해결책 ***********************
		
		// 대부분의 상황에서 '상속'이 깔끔한 업그레이드가 가능하다.
		
		
		MultiplyCalculator mc = new MultiplyCalculator();
		mc.setMemory(20, 0.5);
		System.out.println(mc.mul());
		System.out.println(mc.sum());
		System.out.println(mc.sub());
		
		System.out.println("************************************");
		
		
		//실습1 : BC를 상속받는 DivideCalculator를 선언하고
		//div()라는 메서드를 추가하세요. (부모는 자식이 여럿일 수 있음)
		
		//실습2. DivideCalculator를 상속받는 SuperiorCalculator를 선언하고
		//mul(), lengthOfCircle(), areaOfCircle()을 추가하세요.
		
		SuperiorCalculator su = new SuperiorCalculator();
		su.setMemory(5, 5);
		System.out.println(su.areaOfCircle());
		System.out.println(su.lengthOfCircle());
		System.out.println(su.mul());
		System.out.println(su.div());
		System.out.println(su.sum());
		
		
		
		
	}

}

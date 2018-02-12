package com.inc.paramecium;

public class ParameciumMutation extends ParameciumParent{
	
	// @Override 오버라이드 애너테이션은 변수에는 못붙임, 메서드에만 사용가능
	String name = "mutation";
	
	// 오버라이딩
	// *******주의********
	//파라미터가 다르면 다른 메서드라고 인식하는 오버로딩이랑 다른 개념임
	// 오버로딩(OverLoading) - 하나의 클래스 안에서 같은 이름의 다른 메서드(파라미터형의 차이)를 중복선언
	// 오버라이딩(OverRiding) - 부모로부터 상속받은 메서드 및 변수를 재선언(덮어쓰기)
	
	@Override //부모의 메서드의 이름과 파라미터형까지 동일해야 애너테이션을 붙였을 때 에러가 안남(에러검증용, 가독성)
	void eat() {
		System.out.println("오물오물 퉤~!");
	}
	

}

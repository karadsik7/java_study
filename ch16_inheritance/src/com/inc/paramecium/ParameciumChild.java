package com.inc.paramecium;

public class ParameciumChild extends ParameciumParent// 부모의 클래스를 상속받아서 부모 클래스의 변수와 메서드를
//사용가능하게 됐음
			// 상속을 사용하는 경우
			// A B 클래스가 있을 때 B클래스를 A클래스를 포함해서 확장(업그레이드)하고 싶을 때
	{
	
	//상속이 없다면 Parent에서 다 복사해야함
	
	/*String name = "Paramecium";
	
	void eat() {
		System.out.println("오물오물 꿀꺽~!");
	}*/
	
	void move() {
		System.out.println("꾸물꾸물");
	}


}

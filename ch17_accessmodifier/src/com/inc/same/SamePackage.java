package com.inc.same;

public class SamePackage {

	public static void main(String[] args) {
		
			SameClass sameClass = new SameClass();
				
				
			System.out.println(sameClass.pub);
			System.out.println(sameClass.pro);
			System.out.println(sameClass.def);
			//System.out.println(sameClass.pri); //private는 같은 클래스에서만 작동
			//왜 같은클래스에서만 작동하게하는가? 코딩의 배려, 다른 클래스에서 쓸 필요가 없기 때문

			sameClass.pub();
			sameClass.pro();
			sameClass.def();
			//sameClass.pri();

	}

}

package com.inc.other;

//import com.inc.same.ClassModifier;
import com.inc.same.SameClass;

public class OtherPackage {

	public static void main(String[] args) {

		SameClass sameClass = new SameClass();

		System.out.println(sameClass.pub); // public으로 지정하는 이유 : 외부에서 사용해야하기 때문
		/*System.out.println(sameClass.pro);
		System.out.println(sameClass.def);
		System.out.println(sameClass.pri);*/

		sameClass.pub();
		/*sameClass.pro();
		sameClass.def();
		sameClass.pri();*/
		
		//ClassModifier modifier = new ClassModifier(); 디폴트 클래스는 다른 패키지에서 접근불가능
	}

}

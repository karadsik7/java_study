package com.inc.other;

import com.inc.same.SamePackageInheritance;

public class OtherPackageInheritance extends SamePackageInheritance{

	public static void main(String[] args) {
		OtherPackageInheritance otherIn = new OtherPackageInheritance();

		System.out.println(otherIn.pub);
		System.out.println(otherIn.pro); //protected는 다른패키지도 상속 가능
		//System.out.println(otherIn.def); //default는 다른패키지는 상속을 안해줌
		//System.out.println(otherIn.pri); //private는 상속자체를 불허

		otherIn.pub();
		otherIn.pro();
		//otherIn.def();
		//otherIn.pri();

	}

}

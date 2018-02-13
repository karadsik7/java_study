package com.inc.same;

public class SamePackageInheritance extends SameClass{
		//SameClass의 어디까지를 상속받을 수 있는가?
	
	public static void main(String[] args) {
		SamePackageInheritance sameIn = new SamePackageInheritance();
		
		System.out.println(sameIn.pub);
		System.out.println(sameIn.pro);
		System.out.println(sameIn.def);
		//System.out.println(SameIn.pri); private는 상속을 안해줌
		
		sameIn.pub();
		sameIn.pro();
		sameIn.def();
		// SameIn.pri();
	}
}

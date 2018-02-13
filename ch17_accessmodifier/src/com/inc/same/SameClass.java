package com.inc.same;

public class SameClass {
		//접근 제한자 : 다른 프로그래머에 대한 배려
	
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";
	private String pri = "private";
	
	public void pub() {
		System.out.println("public method");
	}
	
	protected void pro() {
		System.out.println("protected method");
	}
	
	void def() {
		System.out.println("default method");
	}
	
	private void pri() {
		System.out.println("private method");
	}
	
	void test() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pri);
		
		pub();
		pro();
		def();
		pri();
	}
	
	public static void main(String[] args) {
		//public int number;
		
		SameClass sameClass = new SameClass();
		
		
		System.out.println(sameClass.pub);
		System.out.println(sameClass.pro);
		System.out.println(sameClass.def);
		System.out.println(sameClass.pri);

		sameClass.pub();
		sameClass.pro();
		sameClass.def();
		sameClass.pri();
		
		
		ClassModifier modifier = new ClassModifier();
		
	}

}

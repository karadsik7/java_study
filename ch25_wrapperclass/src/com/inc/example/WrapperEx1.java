package com.inc.example;

public class WrapperEx1 {

	public static void main(String[] args) {
		
		//boxing
		int i = 0;
		Integer wrapi = new Integer(0);
		System.out.println(wrapi);
		
		Float wrapf = new Float(3.14); 
		System.out.println(wrapf);
		
		//autoboxing
		Character wrapc = 'A'; 
		
		//unboxing
		char cd = new Character('A').charValue();
		
		//autounboxing
		char c = new Character('A');
		String str = "hello"; //와 같은 원리
		System.out.println(wrapc == c); //자료형이 같으므로 비교 가능
		
		Character wrapc2 = 'A';
		System.out.println(wrapc == wrapc2);
		
		Character wrapc3 = new Character('A');
		System.out.println(wrapc == wrapc3);
		
		
	
		
		

	}

}

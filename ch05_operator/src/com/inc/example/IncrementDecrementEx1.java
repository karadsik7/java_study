package com.inc.example;

public class IncrementDecrementEx1 {

	public static void main(String[] args) {
		
		//증감연산자 결합방향은 오른쪽(->)
		//전위증가연산자 ++arg(변수) 
		//후위증가연산자 arg++
		//전위감소연산자 --arg
		//후위감소연산자 arg--
		//++1과 같은 상수는 불가능
		
		int a = 0;
		
		System.out.println(a);
		++a;
		System.out.println(a);
		a++;
		System.out.println(a);
		//a = a + 1
		
		System.out.println("---------------------");
		
		--a;
		System.out.println(a);
		a--;
		System.out.println(a);
		//a = a - 1
		
		
	

	}

}

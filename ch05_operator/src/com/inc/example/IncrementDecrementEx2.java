package com.inc.example;

public class IncrementDecrementEx2 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		a = 0;
		int c = a++;
		System.out.println(a);
		System.out.println(c);
		
		System.out.printf("a:%d, b:%d, c:%d\n", a, b, c);
		
		//증감연산자의 코드를 풀어써보면
		//int b = ++a;
		/*
		 a = a + 1;
		 int tmp = a;
		 int b = tmp;
		  */
		
		/*int c = a++;
		
		 int tmp = a;
		 a = a + 1;
		 int c = tmp;
		 */
		
		a = 0;
		a = a++;
		System.out.println(a);
		/*
		 int tmp = a;
		 a = a + 1;
		 a = tmp;
		 */
		
		//실습 : 출력 결과 예상
		int x = 10;
		System.out.println(x++); //10
		System.out.println(++x); //12
		System.out.println(x=x+1); //13
		System.out.println(x=x++); //13
		System.out.println(x=++x); //14
		System.out.println(x); //14
		
	
		int z = 10;
		z++;
		//int tmp = z;
		//z = z + 1;
		//tmp;
		System.out.println(z++);
		//int tmp = z;
		//z = z + 1;
		//System.out.println(tmp);
		
		int y = 10;
		System.out.println(y++);
		//int tmp = y;
		//y = y + 1;
		//System.out.println(tmp);
		
		
	

	}

}

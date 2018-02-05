package com.inc.example;

public class ArithmeticEx1 {

	public static void main(String[] args) {
		//산술 연산자 ->
		// + : num1 + num2(변수, 상수 전부 가능), str1 + str2(문자열이 이어짐)
		// str + num
		// - : num1 - num2
		// * : num1 * num2
		// / : num1 / num2
		// % : 나머지 연산
		
		//더하기 (add)
		System.out.println(1+1);
		
		int a = 10, b = 20;
		System.out.println(a+b);
		
		String str1 = "java is fun";
		String str2 = "web is exciting";
		System.out.println(str1+str2);
		System.out.println(str1+" "+str2);
		
		//문자와 숫자를 연산하면 숫자가 문자열로 형변환한다
		System.out.println(str1+a);
		System.out.println(b+"10");
		
		//결합방향 왼쪽부터 오른쪽으로
		System.out.println(10+20+"30"); //3030
		System.out.println(10+"20"+30); //102030
		System.out.println(10+"20"+30+40); //10203040
		//문자열과 만나면 문자열로 형변환해서 문자열이 됨
		
		//실습 : 출력 결과 예측
		int x = 10;
		System.out.println(x + ++x + "x" + x);

	}

}

package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx3 {
	public static void main(String[] args) {
		//과제
		//1.사용자로부터 100이하의 자연수를 입력받는다.
		//아래와 같은 사각형을 출력하는 메서드를 작성하고 호출하시오.
		//ex)
		//(입력)
		//   3
		//(출력)
		//   1 2 3
		//   2 4 6
		//   3 6 9
		//(입력)
		//   4
		//(출력)
		//   1 2 3 4
		//   2 4 6 8
		//   3 6 9 12
		//   4 8 12 16
		
		//hint1 : 파라미터는 int
		//hint2 : return은 void
		
		
		// 일단 입력받아보자
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 100까지의 숫자를 입력해주세요.");
		int cusNum = scanner.nextInt();
		
		//사용자가 입력하면 그것을 출력할때 어떻게 불러올거냐
		//메서드를 써보자
		square(cusNum);
		
		
		
	}
	public static void square(int num) {
		//사각형의 형태를 만들어야 한다
		//첫째줄에는 1부터 사용자가 입력한 값까지 열을 출력하고 그다음열엔 n+1이 된 형태로 구구단을 뽑는다.
		//반복되는 형태니 for을 써본다
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
			System.out.printf("%d ", i*j);
			}
			System.out.println();
		}
	}
	
}

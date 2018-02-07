package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx5 {
	public static void main(String[] args) {
		//과제
		//1.사용자로부터 세개의 과목에 해당하는 점수(정수)를 차례로 입력받는다.
		//2.정수 세개를 파라미터로 받아 총점을 리턴하는 함수를 정의한다.
		//3.정수 세개를 파라미터로 받아 평균을 리턴하는 함수를 정의한다.
		//4.방금 만든 메소드들을 사용하여 총점과 평균을 얻어낸 뒤 출력한다.
		//ex) 
		//(입력)
		//    100 80 90
		//(출력)
		//    총점 : 270
		//    평균 : 90
		
		//hint
		//총점을 구하는 함수
		//파라미터 : int[ ]
		//리턴 : int
		//평균을 구하는 함수
		//파라미터 : int[ ]
		//리턴 : double
		
		//사용자값 3개 받고 저장하기
		int[] number = new int[3];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3; i ++) {
		System.out.println("정수를 입력하세요.");
		number[i] = scanner.nextInt();
		}
		
		System.out.printf("합은 %d점 입니다.\n", sum(number));
		System.out.printf("평균은 %f점 입니다.\n", av(number));
		
	}
	
	//합을 구하는 메서드
	public static int sum(int[] number) {
		
		int s = 0;
		for(int i : number) {
			 s += i;
		}
		return s;
	}
	
	//평균을 구하는 메서드
	/*public static double av(int[] number) {
		int a = 0;
		for(int i : number) {
			a = (i+i)/2;
		}
		return a;
	} 또는*/
	
	public static double av(int[] number) {
		return sum(number) / 3;
	}
	
	
}

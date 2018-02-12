package com.inc.assignment;

import java.util.Scanner;

public class GradeCalculator {
	//임무1 - GradeCalculator라는 클래스에 생성자를 선언하시오
		//생성자의 기능 : 사용자로부터 국어, 수학, 영어, 사회, 과학
		//다섯개의 점수를 입력받아서 grades라는 인트배열에 저장한다.
	
	int[] grades;
	Scanner scanner;
	
	//임무1 - type your code
	
	GradeCalculator() {
		grades = new int[5];
		scanner = new Scanner(System.in);
		init();
	}
	
	void init(){
		for(int i = 0; i < this.grades.length; i++) {
			switch(i) {
			case 0 : System.out.println("국어 점수를 입력하세요."); break;
			case 1 : System.out.println("수학 점수를 입력하세요."); break;
			case 2 : System.out.println("영어 점수를 입력하세요."); break;
			case 3 : System.out.println("사회 점수를 입력하세요."); break;
			case 4 : System.out.println("과학 점수를 입력하세요."); break;
			}
			grades[i] = scanner.nextInt();
		}
	}
	
	void run() {
		int sum = gradeSum(this.grades);
		gradeAvr(sum);
	}
	
	//임무2 - grades에 저장된 점수의 합과 평균을 출력하는 메서드를 선언하시오.
	
	//임무2 - type your code
	
	static int gradeSum(int[] score){
		int sum = 0;
		for(int i : score) {
			sum = i + sum;
		}
		System.out.println("점수의 총합은 " + sum + "점 입니다.");
		return sum;
	}
	
	double gradeAvr(int sum) {
		System.out.println("점수의 평균은 " + (double)sum / this.grades.length + "점 입니다.");
		return sum / this.grades.length;
	}
	
	
}

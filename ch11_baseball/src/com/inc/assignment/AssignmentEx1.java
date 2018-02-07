package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx1 {

	public static void main(String[] args) {
		
		//야구게임의 경우 compareArrays메서드(기능3)는 
				//다음과 같이 두가지의 역할로 분리할 수 있다.
				//1.두개의 배열 비교
				//2.비교결과 출력
				
				
				//2에 해당하는 부분을 별도의 메서드로 만들어보세요.
		
		//기능1
		int[] answers = getRandomNumbers();
		
		//테스트를 위한 코드
		for(int answer : answers) {
			System.out.print(answer);
		}
		System.out.println();
		
		
		
		while(true) {
			//기능2
			//getPredicts
			int[] predicts = getPredicts();
			int[] gg = compareArrays(answers, predicts);
			boolean isEnd = print(gg[0], gg[1]);
			if(isEnd) {
				break;
			}
		}

	}
	
	private static int[] getPredicts() {
		Scanner scanner = new Scanner(System.in);
		int[] predicts = new int[3];
		for(int i = 0; i < predicts.length; i++) {
			System.out.println("숫자를 입력해 주세요.");
			predicts[i] = scanner.nextInt();
			for(int j = 0; j < i; j++) {
				if(predicts[i] == predicts[j]) {
					i--;
				}
			}
		}
		return predicts;
	}

	public static int[] getRandomNumbers() {
		int[] answers = new int[3];
		for(int i = 0; i < answers.length; i++) {
			answers[i] = (int)(Math.random()*10);
			for(int j = 0; j < i; j++) {
				if(answers[i] == answers[j]) {
					i--;
				}
			}
		}
		
		return answers;
	}
	
	
	public static int[] compareArrays(int[] answers, 
									    int[] predicts) {
		//비교
		int ball = 0;
		int strike = 0;
		for(int i = 0; i < answers.length; i++) {
			for(int j = 0; j < predicts.length; j++ ) {
				if(answers[i] == predicts[j]) {
					if(i == j) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		int[] sb = {strike, ball};
		return sb;
		
		
		
	}
	
	//결과 출력 메서드
	public static boolean print(int a, int b) {
		
		//스트라이크와 볼의 변수값을 가져와야함
		if(a == 0 && b == 0) {
			System.out.println("3out");
		}else {
			System.out.printf("%ds, %db\n", a, b);
		}
		
		if(a == 3) {
			System.out.println("축하합니다.");
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	

}

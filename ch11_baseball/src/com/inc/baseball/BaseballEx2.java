package com.inc.baseball;

import java.util.Scanner;

public class BaseballEx2 {

	public static void main(String[] args) {
		//Ex1 기능1 리팩토링
		
		//기능 1
		
		int[] answers = getRandomNumbers();
		
	
		for(int i : answers) {
			System.out.println(i);
		} // 디버깅용 컴퓨터 답안 출력
		
		
		
		
		//기능2
		
		Scanner scanner = new Scanner(System.in);
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		while(strike != 3) {
			
			int[] predicts = new int[3];
			for(int i = 0; i < predicts.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요", i+1);
			predicts[i] = scanner.nextInt();
				for(int j = 0; j < i; j++) {
					if(predicts[i] == predicts[j]) {
					System.out.println("중복된 값입니다. 다시  입력하세요.");
					i--;
					}
				}
			}
		
			for(int i = 0; i < answers.length; i++) {
			
				if(answers[i] == predicts[i]) {
				++strike;}//자릿수와 숫자가 모두 일치하는 경우
				else{ //자릿수와 숫자가 일치하는건 거르고 넘어온다.
			for(int j = 0; j < answers.length; j++) {
				
				if(answers[i] == predicts[j]) {
			       ++ball;//자릿수는 다르나 숫자가 같은 경우
					}// 3. 정답과 예측이 자리와 숫자가 일치하는지 판단해서
				// 자리수와 숫자가 일치하면 strike, 숫자만 일치하고 자리수가 다르면 ball을 증가시킨다.
				
				}
			}
			
		}
		
		out = answers.length - (strike + ball);
		if(strike == 0 && ball == 0) {
			System.out.println("3out 입니다");
		}
		//3-1. 아웃의 경우엔 스트라이크도 아닌경우 볼도 아닌경우 자릿수만큼 아웃이므로 식을  자릿수 - (스트라이크 + 볼)로 지정하면
		// 남은 가짓수가 out으로 카운트된다.
		print(predicts);
		System.out.printf("%d strike %d ball %d out 입니다.\n", strike, ball, out);
		if(strike == 3) {
			System.out.println("축하합니다!");
						}
		else {
			strike = 0;
			ball = 0;
			out = 0;
		}
		}
		
		
		
		
		// 4. 증가한 숫자를 합산해서 사용자에게 출력하고 정답이 나올때까지 반복한다.
		// => 변수를 합산해서 프린트아웃했고 정답이 아닐경우 반복문을 다시 돌려야 하므로
		//와일로 덮었다.
	
		
		
		
		// 5. 정답이면 "3strike out 정답입니다!"를 출력하고 종료한다. 
		// => 포문을 탈출할때 스트라이크의 값을 비교하여 3일경우 축하합니다를 출력하고 스트라이크가 3이므로 와일문을
		// 자동으로 빠져나와서 프로그램이 종료된다.

	}
	
	public static int[] getRandomNumbers() {

		int[] answers = new int[3];
		
		for(int i = 0; i < answers.length; i++) {
		answers[i] = (int)(Math.random() * 10);
			for(int j = 0; j < i; j++) {
				if(answers[i] == answers[j]) {
					i--;
				}
			}
		}
		
		return answers;
	}
	
	
	
	
	public static void print(int[] n){
		for(int i : n) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	

}

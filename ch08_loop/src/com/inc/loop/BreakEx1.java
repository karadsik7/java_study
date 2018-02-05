package com.inc.loop;

public class BreakEx1 {

	public static void main(String[] args) {
		
		//주사위 게임
		
		for(int i = 0; i <= 9; i++) {
			int number = (int)(Math.random() * 6) + 1;//0부터 5까지의 랜덤한 정수 반환 math.random은 0.000~0.999까지
			System.out.println(number);
			if(number == 6) {
				break; // 그 즉시 반복문을 빠져나가는 명령어
			}
			System.out.println("꽝입니다");
		}
		
		

	}

}

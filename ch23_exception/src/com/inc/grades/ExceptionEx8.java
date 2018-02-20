package com.inc.grades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx8 {

	public static void main(String[] args) {
		int[] scores = {80, 90, 100};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("과목 코드를 입력해주세요.");
			System.out.println("1.국어\n2.수학\n3.영어");
			
			int choice = 0;
			try {
				choice = scanner.nextInt();
				System.out.printf("선택하신 과목의 점수는 %d점 입니다.\n", scores[choice-1]);
			}
			catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				scanner = new Scanner(System.in);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("1~3까지의 과목 번호만 입력하세요."); 
			}
			catch(Exception e) {
				System.out.println("에러입니다. 관리자에게 문의하세요.");
				return; 
				//예상 불가능한 예외는 Exception으로 처리하고 프로그램 종료 
				//위에서 걸러지면 elseif문처럼 아래쪽은 실행이 안되므로 예상 가능한 예외처리는 위쪽에서
				//예상 불가능한 예외는 exception을 맨아래로 배치한다.
				//이유 : Exception이 가장 최상위 예외그룹이므로 모든 예외는 전부다걸림
				//예로 Arrayindex...대신 상위 예외인 IndexOut...으로 처리해도 Array가 걸리는 것과 같은 이치
				//이렇게되면 역으로 Exception으로만 예외처리해도 상관없음.
			}
			
			
			
		}
		

	}

}

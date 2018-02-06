package com.inc.example;

public class MethodEx8 {

	public static void main(String[] args) {
		
		
		// 메서드가 데이터를 다시 메인으로 돌려주는 것 = 리턴
		
		int result = sum(10);
		System.out.println(result);
		
		String msg = sum(20, 30);
		System.out.println(msg);
		
	}

	public static int sum(int n) {
		
		int total = 0;
		for(int i = 1; i <= n; i++) {
			total += i;
			}
	//System.out.println(total);
		return total;		
				
	}

	//실습 : 스트링 리턴 : "결과는 "+total+"입니다."으로 변경
	
	public static String sum(int start, int end) {
		
		int total = 0;
		for(int i = start; i <= end; i++) {
			total += i;
		}
	//	System.out.println(total);
		
		return "결과는 " + total + "입니다.";
	}
	
	
		
	
		
		
		
		
}

package com.inc.reference;

public class ReferenceEx7 {
	
	public static void main(String[] args) {
		
		int[] odds = {1, 3, 5, 7, 9};
		
		int[] oddsCopy = odds; //주소값 복사
		
		odds = new int[odds.length + 1]; //1,3,5,7,9 주소가아닌 새로운 배열의 주소를 참조
		
		for(int i = 0; i < oddsCopy.length; i++) {
			odds[i] = oddsCopy[i];
		} // 값을 복사
		
		odds[odds.length - 1] = 11; // 마지막 주소에 11을 투입
		
		for(int i : odds) {
			System.out.println(i); 
		}
		
		
		
		
		
	}
	

}

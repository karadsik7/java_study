package com.inc.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ChallengeEx1 {
	
	public static void main(String[] args) {
		int[] numbers = {4,9,3,1,5,0,2,8,6,7};
		
		//위의 배열에 들어있는 숫자들을
		//오름차순으로 정렬하시오.
		//bubble정렬
		
		
		
		ArrayList<Integer> numberList = new ArrayList<>();
		
		for(int i : numbers) {
			numberList.add(i);
		}
		
		
		
		TreeSet<Integer> numberSet = new TreeSet<>(numberList); //똑같은 컬렉션 인터페이스를 공유하므로
		//자료구조끼리 데이터 복사가 가능함.
		System.out.println(numberSet);
		for(int i : numberSet) {
			System.out.println(i);
		}
		
		//또는
		Integer[] numbers2 = {4,9,3,1,5,0,2,8,6,7};
		TreeSet<Integer> numberSet2 = new TreeSet<>(Arrays.asList(numbers2));
		System.out.println(numberSet2);
		
		//인티저배열로 받아서 트리셋 인스턴스 파라미터에 Arrays.asList(인티저배열)로 복사가 가능
		
		
	}
}

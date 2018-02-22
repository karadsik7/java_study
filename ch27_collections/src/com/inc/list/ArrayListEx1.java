package com.inc.list;

import java.util.ArrayList;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		
		
		//add는 삭제하지않고 뒤로 밀어냄
		//set은 덮어쓰기함
		
		ArrayList<String> seats = new ArrayList<>();
		seats.add("박태환");
		seats.add("김연아");
		seats.add("손연재");
		seats.add("윤성빈");
		
		seats.add(0, "심석희");
		System.out.println(seats.get(0));
		
		System.out.println(seats.get(1)); //박태환은 삭제되지 않고 뒤로 밀려남
		
		System.out.println("--------------");
		
		for(int i = 0; i < seats.size(); i++) {
			System.out.println(seats.get(i));
		}
		
		System.out.println("-------------------");
		seats.set(0, "최민정"); //심석희는 삭제되고 대체됨.
		System.out.println(seats.get(0));
		System.out.println(seats.get(1));
		System.out.println("-------------");
		seats.remove(0);
		System.out.println(seats.get(0));
		seats.set(0, null);
		System.out.println(seats.get(0));
		System.out.println("-----------------------");
		
		//실습 : seats의 모든 요소들의 값을 null로 변경하세요.
		
		for(int i = 0; i < seats.size(); i++) {
			seats.set(i, null);
		}
		
		for(int i = 0; i < seats.size(); i++) {
			System.out.printf("%s\t", seats.get(i));
			if(seats.size() - 1 == i) {
				System.out.println();
			}
		}
		
		for(String i : seats) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		//실습
		//가수들(String)을 저장할 수 있는 ArrayList를 만드시오.
		//1. 좋아하는 가수 4명을 추가하시오.
		//2. 두번째 가수를 다른 가수로 변경하시오.
		//3. 세번째 가수를 삭제하시오
		//4. 모든 가수를 출력하시오 (foreach)
		
		 ArrayList<String> singers = new ArrayList<>();
		 //1.
		 singers.add("윤하");
		 singers.add("에일리");
		 singers.add("이승철");
		 singers.add("twice");
		 
		 //2.
		 singers.set(1, "민경훈");
		 
		 //3.
		 singers.remove(2);
		 
		 //4.
		 
		 for(String i : singers) {
			 System.out.println(i);
		 }
		 
		
		
		
		
	}

}

package com.inc.list;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		
		//실습 : 0. Person을 저장하는 ArrayList를 작성하세요
		
		//1. ArrayList에 나, 옆사람, 앞(뒤)사람을 저장하세요.
		
		//2. 모든 사람의 나이를 0으로 변경하세요.
		
		//3. 모든사람의 이름과 나이를 출력하세요
		//ex 이름 : 철수, 나이 : 0
		//0.
		ArrayList<Person> human = new ArrayList<>();
		//1.
		Person ps = new Person();
		ps.setName("장진수");
		ps.setAge(27);
		
		Person ps2 = new Person();
		ps2.setName("홍길동");
		ps2.setAge(30);
		
		Person ps3 = new Person();
		ps3.setName("세종대왕");
		ps3.setAge(58);
		
		
		human.add(ps);
		human.add(ps2);
		human.add(ps3);
		
		for(Person i : human) {
			System.out.printf("이름 : %s, 나이 : %d\n", i.getName(), i.getAge());
		}
		System.out.println();
		
		//2.
		/*for(int i = 0; i < human.size(); i++) {
			human.get(i).setAge(0);
		} 이것도 가능 */
		
		for(Person i : human) {
			i.setAge(0);
		}
		
		for(Person i : human) {
			System.out.printf("이름 : %s, 나이 : %d\n", i.getName(), i.getAge());
		}
		System.out.println();
		
		
		
		
		
		
	}

}

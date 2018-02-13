package com.inc.person;

public class Person {
	private String name;
	private int age;
	
	//방법1. 
	/*public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	*/
	
	//방법2. Setter
	
	//장점1. 한번 거쳐가기 때문에 if문과 같이 필터링이 가능
	//장점2. 프라이빗이기 때문에 멤버 변수를 가져갈 수 없음. (대신 셋으로 가져가는 것)
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//방법3. Getter : 프라이빗 변수값을 참조하고 싶을 때
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	public void getInfo() { //외부에서 사용할것이기 때문에 퍼블릭이 좋겠다.
		System.out.printf("이름 : %s, 나이 : %d", name, age);
	}
	
	
	

}

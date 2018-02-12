package com.inc.assignment;

public class AssignmentEx2 {
	//과제2 - 임무1 ~ 4를 해결하시오.
	
	//임무1 - com.inc.assignment패키지에 Person이라는 클래스를 생성하시오.
    //인스턴스변수 : name, age, job
	
	//임무2 - 생성자들을 선언하시오.
	//1. name을 파라미터로 받아서 인스턴스 변수인 name을 초기화
	//2. name과 age를 파라미터로 받아서 인스턴스 변수인 name과 age를 초기화
	//(com.inc.example.Person클래스의 생성자와 동일)
	//3. name과 age와 job을 파라미터로 받아서 인스턴스 변수인 name, age, job을 초기화
	
	//임무3 - getInfo라는 메서드를 선언하시오(파라미터X, 리턴X)
	//ex) "성명 : 홍길동, 나이 : 26세, 직업 : 의적"
	
	//임무4 - 위에서 선언한 Person클래스로부터 인스턴스들을 생성하고 테스트하시오.
	//단, 생성자 4개를 한번씩은 사용해서 인스턴스 생성
	public static void main(String[] args) {	
		//임무4 - type your code here
		
		Person ps = new Person("장진수");
		ps.getInfo();
		Person ps2 = new Person("장진수", 27);
		ps2.getInfo();
		Person ps3 = new Person("장진수", 27, "학생");
		ps3.getInfo();
	}

}

package com.inc.reference;

public class ReferenceEx6 {
	
	public static void main(String[] args) {
		
		Person me = new Person();
		me.setName("장진수");
		me.setAge(27);
		changer(me);
		System.out.println(me.getName());
		System.out.println(me.getAge());
		
		//중요함 : String은 주소값을 지닌 참조자료형이지만 
		//자동적으로 변수를 복사하면 new String()하는 기능이 있다고 생각하고
		//다른 곳에서 복사한 변수를 어떻게 하든 객체가 새로 생성된 것이기 때문에 
		//원본의 변수값에 변화가 일어나지 않지만
		//다른 참조자료인 객체나 배열 등을 참조하고 그 값을 변환할 시에는 원본 값에도 변화가 일어나므로 주의
	}
	
	public static void changer(Person p) {
		p.setName("rrb");
	}

}

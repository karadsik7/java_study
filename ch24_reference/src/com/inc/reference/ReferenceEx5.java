package com.inc.reference;

public class ReferenceEx5 {
	
	public static void main(String[] args) {

		int[] odd = {1, 3, 5, 7, 9};
		changer(odd);
		System.out.println(odd[0]); //0
		//배열은 주소값을 복사해서 그대로 참조하기 때문에 값변화가 일어남
	}
	
	public static void changer(int[] arr) {
		arr[0] = 0;
	}

}

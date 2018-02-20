package com.inc.assignment;

public class StringBoxTest {

	public static void main(String[] args) {
		StringBox sb = new StringBox(5);
		sb.add("ㅎㅇㅎㅇ");
		sb.add("ㅎㅇㅎㅇ");
		sb.add("ㅎㅇㅎㅇ");
		sb.add("ㅎㅇㅎㅇ");
		sb.add("ㅎㅇㅎㅇ");
		sb.add("gdgd");
		sb.print();
		System.out.println("******");
		sb.get(5);
		sb.remove(0);
		System.out.println("*****");
		sb.print();
		System.out.println("--------");
		sb.removeAll();
		sb.add("1");
		sb.print();
		sb.remove(1000000);
		sb.get(-1394);
		sb.add("123");
		sb.add("468936893476");
		sb.print();
		sb.add("1385713895");
		sb.add("fiojasfoiwe");
		sb.add("안녕");
		sb.add("므으으ㅏㄹ아아악");
		sb.remove(-1);
		sb.print();
		sb.removeAll();
		sb.print();
		
		StringBox box = new StringBox();
		box.print();
		
		
	}

}

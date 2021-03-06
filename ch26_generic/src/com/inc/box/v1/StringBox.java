package com.inc.box.v1;

public class StringBox {
	
	private String[] strings;
	
	public StringBox(int size) {
		try {
			strings = new String[size];
		}catch(NegativeArraySizeException e) {
			System.out.println("잘못된 사이즈 입니다.");
			strings = new String[10];
		}
	}
	
	public String get(int i) {
		try {
			return strings[i];
		}catch(ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public void add(String str) {
		for(int i = 0; i < strings.length; i++) {
			if(strings[i] == null) {
				strings[i] = str;
				break;
			}
		}
	}

}

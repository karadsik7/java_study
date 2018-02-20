package com.inc.assignment;

public class StringBox {

	// 배열의 한계 : 배열값을 늘리고 싶을 때 값을 가져오기가 쉽지 않음.
	// 따라서 스트링박스를 만들어서 자유롭게 배열의 크기를 조절하고자 함.

	private String[] strings;

	public StringBox() {
		strings = new String[10];
	}

	public StringBox(int size) {
		strings = new String[size];
	}

	// strings에 str을 추가하는 메서드
	// 배열에 null이있다면 그곳에 추가하고 값이 있다면 넘어간다.

	public void add(String str) {
		if (strings[strings.length - 1] != null) {
			String[] stringsCopy = new String[strings.length + 1];
			for (int i = 0; i < strings.length; i++) {
				stringsCopy[i] = strings[i];
			}
			stringsCopy[stringsCopy.length - 1] = str;
			strings = stringsCopy;
			return;
		}
		for (int i = 0; i < strings.length; i++) {
			if (strings[i] == null) {
				strings[i] = str;
				break;
			}
		}

	}

	// 해당 인덱스에 들어있는 값을 리턴하는 메서드
	// 단, 잘못된 인덱스에 접근하면 예외발생을 처리해야함.
	public String get(int index) {
		String[] getSb = this.strings;
		try {
			return getSb[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱스 번호입니다.(get)");
			return null;
		}
		
	}

	// 해당 인덱스의 값을 null로 만드는 메서드
	// 단, 잘못된 인덱스에 접근하면 예외발생을 처리해야함.
	public void remove(int index) {
		try {
			this.strings[index] = null;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱스 번호입니다.(remove)");
		}

	}

	// strings의 모든 요소의 값을 null로 만듬
	public void removeAll() {
		for (int i = 0; i < strings.length; i++) {
			strings[i] = null;
		}
	}

	public void print() {
		for (int i = 0; i < strings.length; i++) {
			if (i == strings.length - 1) {
				System.out.printf("%s\t", strings[i]);
				System.out.println();
			} else {
				System.out.printf("%s\t", strings[i]);
			}
		}
	}

}

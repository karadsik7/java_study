package com.inc.person.v4;

public class Box<E> {
	
	private Object[] objs;
	
	public Box(int size) {
		objs = new Object[size];
	}
	
	
	
	public void add(E obj) {
		
		if(objs[objs.length - 1] != null) {
			Object[] objsCopy = new Object[objs.length + 1];
			for(int i = 0; i < objs.length; i++) {
				objsCopy[i] = objs[i];
			}
			objs = objsCopy;
			objs[objs.length - 1] = obj;
			}
		for(int i = 0; i < objs.length; i++) {
			if(objs[i] == null) {
				objs[i] = obj;
				break;
			}
		}
		
	}
	
	public E get(int i) {
		try {
		return (E)objs[i];
		}catch(ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public void print() {
		for(int i = 0; i < objs.length; i++) {
			System.out.println((E)objs[i]);
		}
	}
	
	public int size() {
		return objs.length;
	}
	
}

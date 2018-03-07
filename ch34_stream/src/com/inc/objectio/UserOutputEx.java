package com.inc.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserOutputEx {
	
	public static void main(String[] args) {
		
		User user = new User();
		user.setName("장진수");
		user.setId("abc123");
		user.setPwd("123");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("user.kar");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(user);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}

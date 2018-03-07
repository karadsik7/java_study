package com.inc.objectio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserInputEx {
	
	public static void main(String[] args) {
	
		User user = null;
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("user.kar"));
			user = (User)ois.readObject();
			System.out.println(user.getName());
			System.out.println(user.getPwd());
			System.out.println(user.getId());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		
		
		}	
	}
	
	
	

package com.inc.login;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.inc.objectio.User;

public class SignUp {
	
	public static void main(String[] args) {
		
		ArrayList<User> userList = new ArrayList<>();
		User u1 = new User();
		u1.setId("brb");
		u1.setPwd("1111");
		u1.setName("홍길동");
		
		User u2 = new User();
		u2.setId("add");
		u2.setPwd("2222");
		u2.setName("김철수");
		
		userList.add(u1);
		userList.add(u2);
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("users.inc"));
			oos.writeObject(userList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}

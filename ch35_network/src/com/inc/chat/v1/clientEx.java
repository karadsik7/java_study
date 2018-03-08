package com.inc.chat.v1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class clientEx {

	public static void main(String[] args) {
		
		//클라이언트 프로그램
		
		Socket socket = new Socket();
		
		try {
			socket.connect(new InetSocketAddress("192.168.0.44", 5001));
			System.out.println("Link with Server");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}

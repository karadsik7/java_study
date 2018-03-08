package com.inc.chat.v2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class clientEx {

	public static void main(String[] args) {
		
		//클라이언트 프로그램
		//DataOutputStream
		
		Socket socket = new Socket();
		DataOutputStream dos = null;
		
		try {
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("Link with Server");
			//서버로 데이터 전송하는 역할
			dos = new DataOutputStream(socket.getOutputStream());
			
			dos.writeUTF("ㅇㅇ"); // 전송할 내용
			
			dos.flush(); //전송을 push하는 역할
			
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

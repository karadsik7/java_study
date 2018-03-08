package com.inc.chat.v3;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class clientEx {

	public static void main(String[] args) {
		
		//클라이언트 프로그램
		//DataOutputStream
		
		Socket socket = new Socket();
		DataOutputStream dos = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket.connect(new InetSocketAddress("192.168.0.44", 5001));
			System.out.println("Link with Server");
			//서버로 데이터 전송하는 역할
			dos = new DataOutputStream(socket.getOutputStream());
			
			while(true) {
				System.out.println("메세지를 입력해 주세요.");
				String msg = scanner.nextLine();
				
				dos.writeUTF(msg); 
				dos.flush(); 
			}
			
						
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

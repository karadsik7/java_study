package com.inc.chat.v5;

import java.io.DataInputStream;
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
		
		//서버와 연결
		try {
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("Link with Server");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//서버로부터 메세지를 받는 스레드
		new Thread(()->{
			try {
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				while(true) {
					System.out.println(dis.readUTF());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}).start();
		
		//서버로 데이터 전송하는 역할
		try {
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

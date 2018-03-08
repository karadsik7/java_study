package com.inc.chat.v3;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	
	public static void main(String[] args) {
		
		//서버프로그램
		
		//서버 소켓 생성
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			//127.0.0.1, localhost => 무조건 자기 ip주소로 환원
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			System.out.println("Server Start at localhost:5001");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//서버 수신 소켓 생성
		Socket socket = null;
		DataInputStream dis;
		try {
	
			socket = serverSocket.accept();
			dis = new DataInputStream(socket.getInputStream());
			//그러나 이렇게하면 메인스레드가 와일에서 못벗어나서 위의 소켓어셉트를 못받음
			while(true) {
				System.out.println(dis.readUTF());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}

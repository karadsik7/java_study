package com.inc.chat.v1;

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
		try {
			socket = serverSocket.accept();
			System.out.println("Link with client :" + socket.getRemoteSocketAddress());
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}

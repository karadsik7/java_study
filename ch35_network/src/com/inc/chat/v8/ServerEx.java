package com.inc.chat.v8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerEx {
	
	public static void main(String[] args) {
		
		//서버프로그램
		
		//서버 소켓 생성
		ServerSocket serverSocket = null;
		ArrayList<Socket> socketList = new ArrayList<>();
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.0.64", 5001));
			System.out.println("Server Start at localhost:5001");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//서버 수신 소켓 생성
		
		while(true) {
			
			try {
				Socket socket = serverSocket.accept();
				socketList.add(socket);
				Waiter waiter = new Waiter(socketList, socket);
				waiter.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}

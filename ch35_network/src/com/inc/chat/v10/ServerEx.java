package com.inc.chat.v10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerEx {
	
	ArrayList<Waiter> waiterList;
	
	private void run() {
		waiterList = new ArrayList<>();
		//서버프로그램
		
		//서버 소켓 생성
		ServerSocket serverSocket = null;
		
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
				Waiter waiter = new Waiter(waiterList, socket);
				waiter.start();
				waiterList.add(waiter);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		new ServerEx().run();
	}

}

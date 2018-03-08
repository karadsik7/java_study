package com.inc.chat.v6;

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
				
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						DataInputStream dis;
						try {
							dis = new DataInputStream(socket.getInputStream());
							
							//서버에 온 모든 사용자의 메세지를 어레이리스트로 저장해서 동시에 채팅하는 모든 사용자에게 아웃풋한다
							while(true) {
								String msg = dis.readUTF();
								for(Socket i : socketList) {
									DataOutputStream dos = new DataOutputStream(i.getOutputStream());
									dos.writeUTF(msg);
									dos.flush();
								}
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}).start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}

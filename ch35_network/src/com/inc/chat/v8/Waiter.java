package com.inc.chat.v8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class Waiter extends Thread{
	
	ArrayList<Socket> socketList = new ArrayList<>();
	Socket socket = new Socket();
	DataInputStream dis;
	DataOutputStream dos;
	
	public Waiter(ArrayList<Socket> socketList, Socket socket) {
		try {
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.socketList = socketList;
		this.socket = socket;
	}
	
	
	
	@Override
	public void run() {
		
	while(true) {
		try {
				String msg = dis.readUTF();
				if(msg.equals("exit")) {
					exit();
					return;
				}
				
				send(msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	  }
	
	}
	
	private void send(String msg) throws IOException {
		
		for(Socket i : socketList) {
			DataOutputStream dos = new DataOutputStream(i.getOutputStream());
			//i.getOutputStream();
			dos.writeUTF(msg);
			dos.flush();
		}
		
	}
	
	private void exit() throws IOException {
		socketList.remove(socket);
		send(socket.getRemoteSocketAddress() + "님이 퇴장하셨습니다.");
		new DataOutputStream(socket.getOutputStream()).writeUTF("exit");
		dis.close();
		socket.close();
	}
	
	

}

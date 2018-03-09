package com.inc.chat.v9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Waiter extends Thread{
	
	ArrayList<Socket> socketList = new ArrayList<>();
	Socket socket = new Socket();
	ObjectInputStream is;
	ObjectOutputStream os;
	
	public Waiter(ArrayList<Socket> socketList, Socket socket) {
		try {
			this.is = new ObjectInputStream(socket.getInputStream());
			this.os = new ObjectOutputStream(socket.getOutputStream());
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
				MessageType message = (MessageType)is.readObject();
				switch(message.getType()) {
					case MessageType.START : break;
					case MessageType.SEND : send(message); break;
					case MessageType.EXIT : exit(message); break;
				}
				
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	  }
	
	}
	
	private void send(MessageType msg) throws IOException {
		
		for(Socket i : socketList) {
			ObjectOutputStream oos = new ObjectOutputStream(i.getOutputStream());
			oos.writeObject(msg);
			oos.flush();
		}
		
	}
	
	private void exit(MessageType msg) throws IOException {
		socketList.remove(socket);
		send(new MessageType(null, msg.getNickname() + "님이 퇴장하셨습니다.", MessageType.SEND));
		os.writeObject(msg);
		is.close();
		socket.close();
	}
	
	

}

package com.inc.chat.v10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Waiter extends Thread{
	
	ArrayList<Waiter> waiterList;
	Socket socket = new Socket();
	ObjectInputStream is;
	ObjectOutputStream os;
	
	public Waiter(ArrayList<Waiter> waiterList, Socket socket) {
		this.waiterList = waiterList;
		this.socket = socket;
		
		try {
			this.os = new ObjectOutputStream(socket.getOutputStream());
			this.is = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	@Override
	public void run() {
		
	while(true) {
		try {
				MessageType message = (MessageType)is.readObject();
				switch(message.getType()) {
					case MessageType.START : break;
					case MessageType.SEND : send(message); break;
					case MessageType.EXIT : 
						exit(message); return;
				}
				
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	  }
	
	}
	
	private void send(MessageType msg) throws IOException {
		for(Waiter i : waiterList) {
			i.os.writeObject(msg);
		}
		
	}
	
	private void exit(MessageType msg) throws IOException {
		waiterList.remove(this);
		send(new MessageType("", msg.getNickname() + "님이 퇴장하셨습니다.", MessageType.SEND));
		os.writeObject(msg);
		is.close();
		socket.close();
	}
	
	

}

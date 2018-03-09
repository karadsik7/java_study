package com.inc.chat.v9;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JTextArea;

public class ChatClient {
	
	private String nickname;
	private Socket socket;
	private JTextArea textArea;
	
	private ObjectInputStream is;
	private ObjectOutputStream os;
	
	private Thread recieveThread;
	
	public ChatClient(String nickname, Socket socket, JTextArea textArea) {
		this.nickname = nickname;
		this.socket = socket;
		this.textArea = textArea;
		
		try {
			is = new ObjectInputStream(socket.getInputStream());
			os = new ObjectOutputStream(socket.getOutputStream());
			
			recieveThread = new Thread(()-> {
				while(true) {
					boolean isEnd = recieve();
					if(isEnd == true) {
						break;
					}
				}
				
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		recieveThread.start();
		
	}
	
	private boolean recieve() {
		try {
			MessageType message = (MessageType)is.readObject();
			
			switch(message.getType()) {
				case MessageType.START : break;
				case MessageType.SEND : 
					if(message.getNickname().equals(this.nickname)) {
						textArea.append(String.format("\t\t\t%s : %s\n", message.getNickname(), message.getMsg()));
					}else {
						textArea.append(String.format("%s : %s\n", message.getNickname(), message.getMsg()));
					}
					
					break;
				case MessageType.EXIT : 
					socket.close();
					is.close();
					return true;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void send(String msg) {
		MessageType message = new MessageType(nickname, msg, MessageType.SEND); 
		
		try {
			os.writeObject(message);//(nickname + " : " + msg + "\n");
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void exit() {
		recieveThread.interrupt();
		
		try {
			os.writeObject(new MessageType(nickname, "", MessageType.EXIT));
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	

}

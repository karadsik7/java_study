package com.inc.chat.v7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JTextArea;

public class ChatClient {
	
	private String nickname;
	private Socket socket;
	private JTextArea textArea;
	
	private DataInputStream dis;
	private DataOutputStream dos;
	
	private Thread recieveThread;
	
	public ChatClient(String nickname, Socket socket, JTextArea textArea) {
		this.nickname = nickname;
		this.socket = socket;
		this.textArea = textArea;
		
		try {
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
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
			String msg = dis.readUTF();
			if(msg.equals("exit")) {
				socket.close();
				dis.close();
				return true;
			}
			textArea.append(msg + "\n");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void send(String msg) {
		try {
			dos.writeUTF(nickname + " : " + msg + "\n");
			dos.flush();
			textArea.append(nickname + " : " + msg + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void exit() {
		recieveThread.interrupt();
		
		try {
			dos.writeUTF("exit");
			dos.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	

}

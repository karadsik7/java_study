package com.inc.chat.v10;

import java.io.Serializable;

public class MessageType implements Serializable{

	public MessageType(String nickname, String msg, int type) {
		this.nickname = nickname;
		this.msg = msg;
		this.type = type;
	}
	
	private String nickname;
	private String msg;
	
	private int type;
	
	public static final int START = 0;
	public static final int SEND = 1;
	public static final int EXIT = 2;
	
	
	
	public String getNickname() {
		return nickname;
	}
	public String getMsg() {
		return msg;
	}
	public int getType() {
		return type;
	}
	
	
	
}

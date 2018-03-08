package com.inc.chat.v6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientFrame extends JFrame{
	
	JPanel southPanel;
	
	JTextArea textArea;
	
	JButton enterBtn, sendBtn;
	
	JTextField msgField;
	
	ChatClient client;
	
	Socket socket;
	
	String nickname;
	
	

	
	public ClientFrame() {
		setTitle("ing 채팅");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);

		init();
		
		setVisible(true);

	}

	public void init() {
		socket = new Socket();
		initComponent();
		initPanel();
		initEvent();
	}

	private void initEvent() {
		enterBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(enterBtn.getText().equals("입장하기")) {
					nickname = JOptionPane.showInputDialog("닉네임");
					System.out.println(nickname);
					connect();
					
				}else {
					System.exit(0);
				}
			}
		});
		
		sendBtn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				client.send(msgField.getText());
				msgField.setText(null);
			}
		});
		
	}
	
	private void connect() {
		
		enterBtn.setText("종료하기");
		sendBtn.setEnabled(true);
		msgField.setEnabled(true);
		try {
			socket.connect(new InetSocketAddress("192.168.0.64", 5001));
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(null, "서버와의 연결에 실패했습니다.\n 다시 시도하세요.");
			System.exit(0);
		}
		
		textArea.append("서버에 접속했습니다.\n");
		client = new ChatClient(nickname, socket, textArea);
		
	}

	private void initPanel() {
		southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		southPanel.add(msgField);
		southPanel.add(sendBtn);
		
		add(southPanel, BorderLayout.SOUTH);
	}

	public void initComponent() {
		enterBtn = new JButton("입장하기");
		
		sendBtn = new JButton("입력");
		
		msgField = new JTextField(20);

		textArea = new JTextArea();
		
		
		sendBtn.setEnabled(false);
		msgField.setEnabled(false);
		textArea.setEditable(false);
		
		add(enterBtn, BorderLayout.NORTH);
		add(new JScrollPane(textArea));
		
		
	}

	public static void main(String[] args) {
		new ClientFrame();
	}
	
}

package com.inc.login;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.inc.objectio.User;

public class LoginFrame extends JFrame{

	//패널
	JPanel botPannel, idPannel, pwPannel, loginBtnPannel;
	
	//레이블
	JLabel idLabel, pwLabel;
	
	//버튼
	JButton loginBtn;
	
	//텍스트필드
	JTextField idField;
	
	//패스워드 필드
	JPasswordField pwField;
	
	
	
	
	
	public LoginFrame() {
		setTitle("Login");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 400);
		setResizable(false);

		init();

		setVisible(true);

	}

	private void init() {
		
		initComponent();
		initPanel();
		initEvent();
	}
	
		
	
	
	private void initPanel() {
		
		botPannel = new JPanel(new GridLayout(3, 1));
		idPannel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pwPannel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		loginBtnPannel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		
		idPannel.add(idLabel);
		idPannel.add(idField);
		pwPannel.add(pwLabel);
		pwPannel.add(pwField);
		loginBtnPannel.add(loginBtn);
		
		
		botPannel.add(idPannel);
		botPannel.add(pwPannel);
		botPannel.add(loginBtnPannel);
		
		add(botPannel, BorderLayout.SOUTH);
		
	}
	

	public void initComponent() {
		
		idLabel = new JLabel("ID");
		pwLabel = new JLabel("Password");
		loginBtn = new JButton("LOGIN!");
		loginBtn.setPreferredSize(new Dimension(150, 30));
		
		idField = new JTextField(10);
		pwField = new JPasswordField(10);
		
		
		
	}
	
	private void initEvent() {
		idField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER && !idField.getText().equals("")) {
					pwField.requestFocus();
				}
			}
		});
		pwField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER && !idField.getText().equals("")) {
					loginBtn.requestFocus();
				}
			}
		});
		
		loginBtn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				ArrayList<User> usersList = new ArrayList<>();
				ObjectInputStream ois = null;
				
				try {
					ois = new ObjectInputStream(new FileInputStream("users.inc"));
					try {
						usersList = (ArrayList<User>)ois.readObject();
						//System.out.println(users.get(1).getId()); 디버깅용
						String id = idField.getText();
						String pwd = new String(pwField.getPassword());
						
						for(User i : usersList) {
							if(i.getId().equals(id) && i.getPwd().equals(pwd)) {
								JOptionPane.showMessageDialog(null, "로그인하셨습니다.");
								return;
							}
						}
						JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인해주세요.");
						
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}finally {
					try {
						ois.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				
			}
			
		});
		
	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}

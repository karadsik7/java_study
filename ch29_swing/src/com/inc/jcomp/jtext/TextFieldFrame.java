package com.inc.jcomp.jtext;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {
	
	JTextField textField1;
	JTextField textField2;
	JPasswordField textField3;
	
	
	JTextField idField;
	JPasswordField pwField;
	
	JLabel idLabel;
	JLabel pwLabel;
	
	public TextFieldFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(true);
		setLayout(new FlowLayout());

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
	}

	public void initComponent() {
		//파라미터의 숫자만큼 텍스트필드 길이 증가
		textField1 = new JTextField(7); 
		add(textField1);
		//글자를 미리 텍스트필드에 출력할 수 있음.
		textField2 = new JTextField("입력하세요", 10);
		textField2.setForeground(Color.GRAY);
		add(textField2);
		
		//클릭해서 커서가 필드에 갔을 때 미리 설정해둔 글자를 지우게하기
		//기준은 커서가 들어갔을 때이므로 Focus를 씀
		textField2.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent arg0) {
				if(textField2.getText().equals("입력하세요")) {
					textField2.setText("");
					textField2.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				if(textField2.getText().equals("")) {
					textField2.setForeground(Color.GRAY);
					textField2.setText("입력하세요");
				}
				
			}
			
		});
		
		//패스워드는 ***로 표시해야함.
		
		textField3 = new JPasswordField(7);
		add(textField3);
		
		//실습 : 레이블을 이용해서 아이디 패스워드란 추가하기
		
		idField = new JTextField(7);
		pwField = new JPasswordField(7);
		
		idLabel = new JLabel("ID");
		pwLabel = new JLabel("Password");
		
		add(idLabel);
		add(idField);
		add(pwLabel);
		add(pwField);
		
		

	}

	public static void main(String[] args) {
		new TextFieldFrame();
	}
	
}

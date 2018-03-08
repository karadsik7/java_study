package com.inc.login;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.inc.objectio.User;

public class SignUpAssignment extends JFrame{
	
	//과제 : 회원가입창 제작
	//조건1 : ID PWD, PWD check, Name 4개의 항목과 회원가입, 다시입력 버튼이 있어야함
	//조건2 : 프레임은 그리드레이아웃 5x2로 제작
	//조건3 : 비밀번호와 체크와 일치할 경우 회원가입 가능 아닐경우 경고창 띄우고 패스워드 관련 필드 비우기
	//힌트 : 저장방법 : users.inc를 불러와서 사용자가 입력한 내용으로 user인스턴스 생성후 배열에 추가하고 다시 파일에 저장
	
	JLabel idLabel , pwdLabel, pwdCheckLabel, nameLabel;
	
	JTextField idField, nameField;
	
	JPasswordField pwdField, pwdCheckField;
	
	JButton signBtn, retryBtn;
	
	ArrayList<User> userList;

	public SignUpAssignment() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		setLayout(new GridLayout(5, 2));

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
		initEvent();
		
	}

	private void initEvent() {
		
		//패스워드란과 재입력란이 불일치할 경우
		signBtn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				String pwd = new String(pwdField.getPassword());
				String pwdCheck = new String(pwdCheckField.getPassword());
				if(!pwd.equals(pwdCheck)) {
					JOptionPane.showMessageDialog(null, "패스워드가 일치하지 않습니다.");
					pwdField.setText(null);
					pwdCheckField.setText(null);
				}else {
					//모든 정보가 이상없이 입력됐으므로 저장하는 코드란이다.
					//정보를 변수로 받아서 유저 객체에 저장해서 그 객체를 배열에 추가하고 파일로 덮어씌운다.
					inputUser();
					addUser();
					outputUser();
					JOptionPane.showMessageDialog(null, "회원가입이 성공했습니다!");
					System.exit(0);
				}
			}
		});
		
		//다시입력 버튼 눌렀을 시
		
		retryBtn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				idField.setText(null);
				pwdField.setText(null);
				pwdCheckField.setText(null);
				nameField.setText(null);
			}
		});
		
		
		
	}
	
	private void inputUser() {
		
		userList = null;
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("users.inc"));
			try {
				userList = (ArrayList<User>)ois.readObject();
				//System.out.println(userList.get(1).getId()); 디버깅용
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
	
	private void addUser() {
		User newUser = new User();
		newUser.setId(idField.getText());
		newUser.setPwd(new String(pwdField.getPassword()));
		newUser.setName(nameField.getText());
		
		userList.add(newUser);
	}

	private void outputUser() {
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("users.inc"));
			oos.writeObject(userList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			/*for(User i : userList) {
				System.out.println(i.getId());
				System.out.println(i.getPwd());
				System.out.println(i.getName());
			} 디버깅용*/
		
		
		
	}

	public void initComponent() {
		
		//레이블 초기화
		idLabel = new JLabel("ID");
		pwdLabel = new JLabel("PWD");
		pwdCheckLabel = new JLabel("PWD Check");
		nameLabel = new JLabel("Name");
		
		//필드 초기화
		idField = new JTextField(8);
		nameField = new JTextField(8);
		
		//패스워드필드 초기화
		
		pwdField = new JPasswordField(8);
		pwdCheckField = new JPasswordField(8);
		
		//버튼 초기화
		signBtn = new JButton("회원가입");
		retryBtn = new JButton("다시입력");
		
		add(idLabel);
		add(idField);
		add(pwdLabel);
		add(pwdField);
		add(pwdCheckLabel);
		add(pwdCheckField);
		add(nameLabel);
		add(nameField);
		add(retryBtn);
		add(signBtn);

	}

	public static void main(String[] args) {
		new SignUpAssignment();
	}
	
}

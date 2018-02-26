package com.inc.jcomp.jbutton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonFrame extends JFrame{
	
	ButtonFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		setLayout(new FlowLayout());
		
		JButton btn1 = new JButton();
		btn1.setText("open");
		//파라미터 안에 'MouseListener'라는 인터페이스를 구현하는 새로운 클래스를 생성한 것 (내부 클래스)
		//이렇게 하는 이유는 어차피 1회용이기 때문에 새로운 btn1Listener와 같은 클래스를 만들고 구현해가면서
		//까지 구질구질하게 만들 필요가 없기 때문
		btn1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				//눌렀을 때 이벤트 발생
				if("open".equals(btn1.getText())) {
					btn1.setText("close");
				}else {
					btn1.setText("open");
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		add(btn1);
		
		add(new JButton("start")); //위에껀 인스턴스 생성을 통한 설정
		//윗줄은 add의 파라미터에 바로 생성하고 파라미터에 setText를 해서 만든 것
		
		//실습 : 버튼 두개를 생성하되 하나는 생성 후 setText();
		//						하나는 생성자에서 setText();
		// 두개의 버튼을 프레임에 추가하세요.
		
		JButton btn2 = new JButton();
		btn2.setText("장진수");
		add(btn2);
		
		JButton btn3 = new JButton("홍길동");
		add(btn3);
		
		//버튼의 사이즈 변경
		btn2.setPreferredSize(new Dimension(100, 50));
		
		//버튼의 글씨 색상 변경
		btn2.setForeground(Color.GREEN);
		//버튼의 배경 색상 변경
		btn2.setBackground(Color.RED);
		
		
		//실습 : 50x100 사이즈의 버튼을 만드세요. 버튼의 이름은 INCREPAS
		//버튼의 글씨색은 PINK 버튼의 배경색은 GRAY
		
		JButton btn4 = new JButton("INCREPAS");
		btn4.setPreferredSize(new Dimension(100, 100));
		btn4.setForeground(Color.PINK);
		btn4.setBackground(Color.GRAY);
		add(btn4);
		
		
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new ButtonFrame();
	}
	
	
}

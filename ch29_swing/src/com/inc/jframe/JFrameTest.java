package com.inc.jframe;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest {
	public static void main(String[] args) {
		//스윙으로 로직 작성하는 법
		// 1. JFrame을 상속한 뒤 생성자에서 로직 작성
		
		//new MyFrame();
		//new MyFrame2();
		
		// 2. JFrame 인스턴스 생성 후 메서드에서 로직 작성
		
		JFrame frame = new JFrame();
		frame.setTitle("JFrame 객체 생성");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //기본값 HIDE
		frame.setResizable(false); //사용자가 크기변경 못하게함, 기본값 true
		
		//컴포넌트 추가 (add로)
		
		JLabel label = new JLabel("Hello");
		//frame.add(comp) 파라미터가 컴포넌트임에도 레이블을 집어넣을 수 있는 이유는
		//레이블이 컴포넌트클래스를 상속하고 있기 때문에 다형성을 통해서 레이블이 들어갈 수 있는것
		frame.add(label);
		frame.setSize(150, 300);
		frame.setVisible(true); //기본값 false 그리고 비져블은 항상 생성자의 맨 마지막에 쓸것 (버그 발생우려)
		
		
		
		
		
	}
}

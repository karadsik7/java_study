package com.inc.jframe;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//JFrame을 상속받고 생성자에서 정의하는것이 가장 편함
	public MyFrame() {
		//제목 지정
		setTitle("JFrame 상속");
		
		//X버튼 동작 지정
		//1. 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//2. 무시
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//3. 화면에서 사라지게 하기
		//setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		//4. 현재창만 종료
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//사이즈 조정
		//setSize(500, 1000); //무조건 왼쪽 위에서 실행
		setBounds(300, 200, 300, 200); //실행시 좌표까지 지정할 수 있어서 이걸 씀
		//앞쪽 두개 xy좌표 뒤쪽 두개 가로세로
		
		//화면에 보여주기
		setVisible(true);
		
		
	
	}
	
	
	
	
	
}

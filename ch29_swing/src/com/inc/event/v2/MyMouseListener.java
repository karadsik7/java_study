package com.inc.event.v2;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener{
	
	ClickEventFrame f;
	
	public MyMouseListener(ClickEventFrame f) {
		this.f = f;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("클릭");
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("마우스 들어옴");
	}
	

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("마우스 나감");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		//마우스를 누르자마자
		System.out.println("마우스 누름");
		f.getContentPane().setBackground(Color.red);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		//마우스를 뗄 때
		System.out.println("마우스 뗌");
		f.getContentPane().setBackground(Color.blue);
	}
}


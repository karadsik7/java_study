package com.inc.girls;

import javax.swing.ImageIcon;

public class Member {
	
	private String name;
	
	private ImageIcon img;
	
	public Member(String name, String filename) {
		this.name = name;
		this.img = new ImageIcon(filename);
	}

	public String getName() {
		return name;
	}

	public ImageIcon getImg() {
		return img;
	}


	
	

}

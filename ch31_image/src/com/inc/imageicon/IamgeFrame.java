package com.inc.imageicon;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IamgeFrame extends JFrame {
	
	private JButton searchBtn;
	private JLabel centerLabel;
	private ImageIcon btnImg, bigImg;
	private int swit = 0;
	
	
	
	public IamgeFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		setLayout(new FlowLayout());

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
		initEvent();
	}
	
	private void initEvent() {
		
		searchBtn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				if(swit == 0) {
					centerLabel.setIcon(bigImg);
					swit = 1;
				}else {
					centerLabel.setIcon(null);
					swit = 0;
				}
				
			}
			
		});
		
		
	}

	private void initComponent() {
		btnImg = new ImageIcon("src/com/inc/images/search.png");
		bigImg = new ImageIcon("src/com/inc/images/sea.png");
		
		searchBtn = new JButton(btnImg);
		searchBtn.setPreferredSize(new Dimension(btnImg.getIconWidth(), btnImg.getIconHeight()));
		
		
		centerLabel = new JLabel();
		centerLabel.setPreferredSize(new Dimension(400, 300));
		
		add(searchBtn);
		add(centerLabel);
		
	}

	public static void main(String[] args) {
		new IamgeFrame();
	}

}

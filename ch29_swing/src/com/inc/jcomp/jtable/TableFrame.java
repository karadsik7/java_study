package com.inc.jcomp.jtable;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class TableFrame extends JFrame {
	//기능면이나 활용도로 볼때 사용빈도가 낮아 중요하지 않음
	
	JTable table;
	public TableFrame() {
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
	}

	public void initComponent() {
		String[] columns = {"성명", "국어", "수학", "영어"};
		Object[][] data = {
				columns,
				{"철수", 100, 90, 80},
				{"민수", 50, 50, 30},
				{"영희", 70, 80, 90}
		};
		
		table = new JTable(data, columns);
		table.setEnabled(false);
		table.setValueAt(0, 2, 1);
		System.out.println(table.getValueAt(3, 3));
		System.out.println(table.getColumnCount());
		System.out.println(table.getRowCount());
		System.out.println(table.getColumnName(1));
		add(table);
	}

	public static void main(String[] args) {
		new TableFrame();
	}
}

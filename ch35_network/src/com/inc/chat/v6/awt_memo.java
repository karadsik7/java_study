package com.inc.chat.v6;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;

public class awt_memo extends Frame implements ActionListener {

	Label lbTitle;
	Panel pnLeft, pnRight;
	
	TextField tf;
	List list;
	TextArea ta;
	Button btAdd, btDel;
	//HashMap에 Data 저장
	HashMap map;
	
	public awt_memo() {
		map = new HashMap();		
		init();
		//프로그램 종료 처리
		WindowListener win = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}						
		};	
		addWindowListener(win);
	}
	
	public void init() {
		lbTitle = new Label("Memo", Label.CENTER);
		
		//Panel은  Flow 형식으로 Layout이 옆으로 위치한다.
		//그래서 가장 간단한 방법은 Panel을 Frame 방식의 Layout으로
		//변경해서 처리하는 것으로 아래와 같이 BorderLayout 객체를 널어
		//처리하면 된다.
		pnLeft = new Panel(new BorderLayout());
		pnRight = new Panel(new BorderLayout());
		
		tf = new TextField();
		list = new List();
		ta = new TextArea();
		btAdd = new Button("Add");
		btDel = new Button("Del");
		
		tf.addActionListener(this); //이벤트 연결
		list.addActionListener(this);
		btAdd.addActionListener(this);
		btDel.addActionListener(this);
		
		//Layout의 Center는 Frame의 크기에 유동적으로
		//변경이 된다.
		pnLeft.add(tf, BorderLayout.NORTH);
		pnLeft.add(list,BorderLayout.CENTER);
		pnLeft.add(btAdd, BorderLayout.SOUTH);
		
		pnRight.add(ta, BorderLayout.CENTER);
		pnRight.add(btDel, BorderLayout.SOUTH);
		
		this.add(lbTitle, BorderLayout.NORTH);
		this.add(pnLeft, BorderLayout.WEST);
		this.add(pnRight, BorderLayout.CENTER);
		
		this.setSize(400, 400); //크기 지정
		this.setLocation(400,200); //위치 지정
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		awt_memo am = new awt_memo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == tf) {
			String text =tf.getText();
			if (!text.equals("")) {
				list.add(text);
				tf.setText("");
			}
		}
		else if (obj == list) {
			//list를 클릭하면 map에서 value를 읽어 TextArea에 표시
			ta.setText((String) map.get(list.getSelectedItem()));
		}
		else if (obj == btAdd) {
			//list : key, textarea : value => map에 추가
			map.put(list.getSelectedItem(), ta.getText());
		}
		else if (obj == btDel) {
			if (list.getSelectedIndex() < 0) return;
			//else if (map.size() < 0) return;//확인을 할 필요가 없다.
			String item = list.getSelectedItem(); 
			map.remove(item);
			list.remove(item);
			ta.setText("");
		}
	}
}
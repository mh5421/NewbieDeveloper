package e_event;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class TestB extends JFrame{
	JTextField tf;
	JButton b;
	
	TestB(){
		setLayout(new FlowLayout());
		tf = new JTextField(10);
		b = new JButton("확인");
		
		
		add(b);
		add(tf);
	}
	
	void disPlay() {
		setLocation(500,500);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public void eventProc() {
		//(2) 이벤트 핸들러 객체 생성
		MyEvent me = new MyEvent();
		
		//(3) 이벤트 연결
		
		b.addActionListener(me);
		tf.addActionListener(me);
	}
	
	//(1)이벤트 핸들러
	class MyEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
			Object evt = e.getSource();
			if(evt == b) {
				String msg = b.getText();
				JOptionPane.showMessageDialog(null,msg + "버튼이벤트발생");
			}
			else if(evt == tf) {
				String msg = tf.getText();
				JOptionPane.showMessageDialog(null, msg +"를 입력하셨습니다.");
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		TestB t = new TestB();
		
		t.disPlay();
		t.eventProc();
		
	}

	
}


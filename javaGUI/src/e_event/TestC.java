package e_event;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class TestC extends JFrame{
	JTextField tf;
	JButton b;

	TestC(){
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
		//(1)이벤트 핸들러
		//(2) 이벤트 핸들러 객체 생성
		//(3) 이벤트 연결

		b.addActionListener(new ActionListener(){//ActionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				JOptionPane.showMessageDialog(null,b.getText() + "버튼이벤트발생");
			}

		});
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				JOptionPane.showMessageDialog(null,tf.getText() + " 입력하였습니다.");
			}
		});

	}


	//	class MyEvent implements ActionListener{
	//		public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
	//				
	//				JOptionPane.showMessageDialog(null,b.getText() + "버튼이벤트발생");
	//		}
	//		
	//	} 
 
	public static void main(String[] args) {

		TestC t = new TestC();

		t.disPlay();
		t.eventProc();

	}


}


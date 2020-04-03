package e_event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//(1)이벤트 핸들러
public class TestA extends JFrame implements ActionListener{
	JTextField tf;
	JButton b;
	
	TestA(){
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

	void eventProc() {
		//(3) 이벤트 연결
		b.addActionListener(this);
		tf.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
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

	public static void main(String[] args) {
		//(2) 이벤트 핸들러 객체 생성
		TestA t = new TestA();
		
		t.disPlay();
		t.eventProc();
	
		
	}


	
}


package b_Sample;

import java.awt.*;
import javax.swing.*;

//------------------has-a 방식

public class Test {
	//멤버변수 선언
	JFrame f;
	JButton b;
	JLabel l;
	JTextField t;
	JTextArea ta;
	JCheckBox cb_m;
	JCheckBox cb_f;
	JList<String> list;
	public Test() {
		//객체 생성
		
		f = new JFrame("나의 창");
		b = new JButton("확인");
		l = new JLabel("제목");
		t = new JTextField("여기에 작성하세요",40);
		ta = new JTextArea();
		cb_m = new JCheckBox("남자",false);
		cb_f = new JCheckBox("여자",false);
		list = new JList<String>();
		String data[] = {"오야코돈","뚠뚠돈가스","카레우동","텐동"};
		
		list = new JList<String>(data);
		
		// 붙이기
		//Layout : 붙이는 방식
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(4,2));
		f.setLayout(new BorderLayout());
		//f.add(b);
		
		f.add(b,BorderLayout.WEST);
		f.add(l,BorderLayout.EAST);
		
		JPanel p2 = new JPanel(new GridLayout(1,2));
		p2.add(t);
		p2.add(list);
		
	//	f.add(t,BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		f.add(p2,BorderLayout.NORTH);
		JPanel p = new JPanel();
		//p.setLayout(new GridLayout(2,1));
		
		p.add(cb_f);
		p.add(cb_m);
		//f.add(cb_m,BorderLayout.SOUTH);
		//f.add(cb_f, BorderLayout.SOUTH);
		f.add(p,BorderLayout.SOUTH);
	
		
		 
		//화면 출력
		f.setSize(500,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

	public static void main(String[] args) {
		Test t = new Test();
		
	

	}

}

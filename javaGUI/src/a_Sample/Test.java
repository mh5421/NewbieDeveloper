package a_Sample;

import java.awt.*;

//------------------has-a 방식

public class Test {
	//멤버변수 선언
	Frame f;
	Button b;
	Label l;
	TextField t;
	TextArea ta;
	Checkbox cb_m;
	Checkbox cb_f;
	List list;
	public Test() { 
		//객체 생성
		
		f = new Frame("나의 창");
		b = new Button("확인");
		l = new Label("제목");
		t = new TextField("여기에 작성하세요",40);
		ta = new TextArea();
		cb_m = new Checkbox("남자",false);
		cb_f = new Checkbox("여자",false);
		list = new List(4,false);
		
		
		list.add("오야코돈");
		list.add("뚠뚠돈가스");
		list.add("카레우동");
		list.add("텐동");
		// 붙이기
		//Layout : 붙이는 방식
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(4,2));
		f.setLayout(new BorderLayout());
		//f.add(b);
		f.add(b,BorderLayout.WEST);
		f.add(l,BorderLayout.EAST);
		f.add(t,BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		Panel p = new Panel();
		//p.setLayout(new GridLayout(2,1));
		
		p.add(cb_f);
		p.add(cb_m);
		//f.add(cb_m,BorderLayout.SOUTH);
		//f.add(cb_f, BorderLayout.SOUTH);
		f.add(p,BorderLayout.SOUTH);
//		f.add(list);
		
		 
		//화면 출력
		f.setSize(500,400);
		l.setBounds(100, 200, 100, 100);
	
		b.setSize(100, 100);
		

		f.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		Test t = new Test();
		
	

	}

}

package a_Sample;

import java.awt.*;
import javax.swing.*;


// is-a 방식


public class Test2 extends JFrame {
	//멤버변수 선언 
	//"남자" 라디오버튼 / "여자" 라디오버튼
	//"성인"라디오버튼 / "미성년" 라디오버튼
	JRadioButton rbM = new JRadioButton("남자",true);
	JRadioButton rbF = new JRadioButton("여자");
	JRadioButton rbAdult = new JRadioButton("성인");
	JRadioButton rbMino = new JRadioButton("미성년",true);
	
	public Test2() {
		super("나의 창2");//부모의 기본 생성자 함수를 먼저 불러온다. 기본 생성자 함수를 바꾸어 출력
		//객체 생성
	
		
		ButtonGroup bg1 = new ButtonGroup();
		ButtonGroup bg2 = new ButtonGroup();
		
		
		bg1.add(rbM);
		bg1.add(rbF);
		bg2.add(rbAdult);
		bg2.add(rbMino);
		
		//붙이기
		setLayout(new FlowLayout());
		add(rbM);
		add(rbF);
		add(rbAdult);
		add(rbMino);
		
		//화면 출력
		
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		Test2 t = new Test2();
		
	

	}

}

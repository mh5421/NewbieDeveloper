package h_inherit2;

import java.awt.*;

public class Test {

	public static void main(String[] args) {
	
		new MyFrame1();
		
		
	}

}
/* has-a : MyFrame1 has a Frame */
class MyFrame1 {
	Frame f; 
	
	MyFrame1(){//Frame 객체에서 메서드 호출하여 사용
		f = new Frame("나의 첫 화면"); //필요한 Frame 객체 생성
		f.setSize(500, 300); //화면 사이즈 결정
		f.setVisible(true); // 화면 출력
	}
}


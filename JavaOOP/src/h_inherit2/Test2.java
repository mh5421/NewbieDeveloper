package h_inherit2;

import java.awt.*;

public class Test2 {

	public static void main(String[] args) {
	
		new MyFrame2();
	}

}

/* is-a : MyFrame2 is a Frame */
class MyFrame2 extends Frame{
	
	MyFrame2(){
		//super(); ->생성자 함수 앞에 자동으로 호출되는 함수, 자동으로 잡아줌
		super("나의 두번째 화면");
		setSize(500,300);
		setVisible(true);
	}
	
}

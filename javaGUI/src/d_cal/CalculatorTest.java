package d_cal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorTest extends JFrame implements ActionListener {
	//멤버 변수 선언
	JTextField tf;
	int prev; //이전값 저장할 변수
	String op; //연산자를 저장할 변수
	int result =0;


	JButton bSum;
	JButton bSub;
	JButton bMul;
	JButton bDiv;
	JButton bResult;
	JButton bClear;
	JButton b[] = new JButton[10];


	//객체 생성
	public CalculatorTest() {
		super("유치원계산기");
		//North
		tf = new JTextField("0",10);

		tf.setHorizontalAlignment(tf.RIGHT);


		add(tf,BorderLayout.NORTH);

		JPanel bp = new JPanel(new GridLayout(5,3));

		for(int i=0;i<10;i++) {
			b[i]=new JButton(String.valueOf(i));
		}

		bSum = new JButton("+");
		bResult = new JButton("=");
		bSub = new JButton("-");
		bMul = new JButton("*");
		bDiv = new JButton("/");
		bClear=  new JButton("C");

		for(int i=1;i<10;i++) {
			bp.add(b[i]);
		}

		bp.add(bSum);
		bp.add(b[0]);
		bp.add(bResult);
		bp.add(bSub);
		bp.add(bMul);
		bp.add(bDiv);
		add(bClear,BorderLayout.SOUTH);
		add(bp,BorderLayout.CENTER);


	}


	//화면 구성 및 출력하기
	public void disPlay() {

		setLocation(200,200);
		setSize(400,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	void eventProc() {
		for(int i=0; i<b.length;i++) {
			b[i].addActionListener(this);//ActionListener를 구현한 이름없는 클래스를 new로 만듬

			//	tf.setText(String.valueOf(i));

		}
		bSum.addActionListener(this);
		bResult.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bClear.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton evt = (JButton)e.getSource();

		

			//숫자가 눌렸을때
			for(int i=0;i<10;i++) {
				if(evt==b[i]) {
					if(result!=0) {
						tf.setText(null);
						result=0;
						}
					if(tf.getText().equals("0"))
						tf.setText(null);
					String su = tf.getText();
					su+=b[i].getText();

					tf.setText(su);

				}
			}


			//연산자가 눌렸을 때
			if(evt==bSum) {
				prev = Integer.parseInt(tf.getText());
				op = "+";
				tf.setText(null);
			}else if(evt==bSub) {
				prev = Integer.parseInt(tf.getText());
				op = "-";
				tf.setText(null);
			}else if(evt==bMul) {
				prev = Integer.parseInt(tf.getText());
				op = "*";
				tf.setText(null);
			}else if(evt==bDiv) {
				prev = Integer.parseInt(tf.getText());
				op = "/";
				tf.setText(null);
			}else if(evt==bClear) {
				tf.setText("0");
				result=0;
			}
			//'='버튼이 눌렸을때
			if(evt==bResult) {
				switch(op) {
				case "+":
					int second = Integer.parseInt(tf.getText());
					result = prev + second;
					tf.setText(String.valueOf(result));
				
					break;
				case "-":
					second = Integer.parseInt(tf.getText());
					result = prev - second;
					tf.setText(String.valueOf(result));
					
					break;
				case "*":
					second = Integer.parseInt(tf.getText());
					result = prev * second;
					tf.setText(String.valueOf(result));
					
					break;
				case "/":
					try{
					second = Integer.parseInt(tf.getText());
					result = prev / second;
					tf.setText(String.valueOf(result));
					
					}
					catch(Exception ec) {
						tf.setText("분모가 0이면 안됩니다");
					}
					break;
				}



			}
	
	}




	public static void main(String[] args) {



		CalculatorTest calTest = new CalculatorTest();

		calTest.disPlay();
		calTest.eventProc();
	}

}

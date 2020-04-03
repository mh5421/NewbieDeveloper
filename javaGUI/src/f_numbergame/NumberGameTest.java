package f_numbergame;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NumberGameTest {

	public static void main(String[] args) {
		NumberGame ng = new NumberGame();
		ng.initChar();

		ng.showAnswer();
	
	}
}

class NumberGame extends JFrame implements ActionListener{
	//1. 멤버변수 선언
	int getsu=4;
	JButton b[][]=new JButton[getsu][getsu];

	//2. 버튼위에 지정할 문자 변수
	char answers[][]=new char[getsu][getsu];//char 기본 저장값 :'\u0000'

	
	//5. 첫번째 버튼에 대한 저장
	JButton firstClick;
	int firstRow,firstCol;
	
	NumberGame(){
		//2. 객체생성
		setLayout(new GridLayout(4,4));
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]= new JButton(i + ":" + j);
				add(b[i][j]);
				//문자 배열을 0으로 초기화
				answers[i][j]='0';
				
				//이벤트연결
				
				b[i][j].addActionListener(this);
			}
		}

		//3. 화면 구성


		//화면에 출력
		setLocation(500,500);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);


	}
	//이벤트처리

	public void actionPerformed(ActionEvent arg0) {
		JButton evt = (JButton)arg0.getSource();
		for(int i=0;i<getsu;i++) {
			for(int j=0;j<getsu;j++) {
				if(b[i][j]==evt) {
					
					//첫번째 선택 확인
					if(firstClick==null) {
						evt.setBackground(Color.cyan);
						firstClick = evt;
						firstRow = i;
						firstCol = j;
						evt.removeActionListener(this);
					}else {
						//첫번째 선택과 비교
						
						if(answers[firstRow][firstCol]==answers[i][j]) {
							evt.setBackground(Color.black);
							b[firstRow][firstCol].setBackground(Color.black);
							evt.removeActionListener(this);
							
						}
						else {
							firstClick.setBackground(null);
							firstClick.addActionListener(this);
						}
						
						firstClick=null;
						
					}
				}
			}
		}
	}




//임의의 알파벳을 임의의 위치에 지정
void initChar(){
	char alpha = '0';
	RETURN:
		for(int i=0;i<getsu*getsu;) {
			//임의의 알파벳 만들기

			if(i%2==0) {
				alpha =(char) ('A'+ (int)(Math.random()*26));
				//기존에 이미 이 알파벳이 있는지 확인
				for(int j=0;j<getsu;j++) {
					for(int k=0;k<getsu;k++) {
						if(answers[j][k]==alpha) {
							continue RETURN;
						}
					}
				}

			}
			//임의의 위치 선정하기
			boolean ok = false;
			do {
				int row = (int)(Math.random()*getsu);
				int col = (int)(Math.random()*getsu);

				if(answers[row][col]=='0') {
					answers[row][col]=alpha;
					i++;
					ok=true;
				}

			}while(!ok);
		}
}
void showAnswer() {
	//답을 보여주기
	for(int i=0;i<answers.length;i++) {
		for(int j=0;j<answers[i].length;j++) {
			b[i][j].setText(String.valueOf(answers[i][j]));

		}
	}
 

	//1분후에 답 가리기
	//		try {
	//			Thread.sleep(1000);
	//		} catch (InterruptedException e) {
	//
	//		}
	//		
	//		for(int i=0;i<b.length;i++) {
	//			for(int j=0;j<b[i].length;j++) {
	//				b[i][j].setText("");
	//			}
	//		}

}




}

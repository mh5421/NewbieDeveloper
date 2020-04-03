package y_kyochon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class ShoppingBasket extends JFrame{
	JTextField tf; //텍스트 필드 변수 선언

	Main main; //메인클래스 변수 선언
	JButton deleteb; //삭제버튼 변수 선언
	JButton jumun; //주문 버튼 변수선언
	JList list ; //상품 리스트 출력할 리스트 생성
	int total=0; //현재 상품 총합을 저장한 변수 선언
	JPanel p = new JPanel(new GridLayout(1,2)); //버튼 세로로 나열하기 위한 패널 생성
	
	
	public void update() { //현재 선택된 상품 갱신을 위한 update 함수
	
		list.setListData(main.ckName);//리스트에 치킨상품 이름 업데이트
		total=0;
		for(int i=0;i<main.ckName.size();i++) { //main함수의 치킨상품 이름이 저장된 ArrayList의 사이즈만큼 반복
			total+= main.ckPrice.get(i); //상품 총합 가격 업데이트
			tf.setText(String.valueOf(total)); //텍스트필드에 총합가격 출력
		}
	}

		

	ShoppingBasket(){ //장바구니 생성자
		
		list = new JList(main.ckName);
		deleteb = new JButton("삭제"); //삭제버튼 생성
		jumun = new JButton("주문");  //주문 버튼 생성
		tf = new JTextField(10);  //상품 총합 가격 보여줄 텍스트필드 생성
		setLayout(new FlowLayout()); //FlowLayout 형식으로 설정
		list.setFixedCellWidth(200);//리스트 가로크기 고정
		JScrollPane sp= new JScrollPane(list); //아무 데이터가 없을때도 리스트를 출력하기 위한 JScrollPane 컨테이너를 선언하고 리스트를 넣어준다.
		update(); //업데이트 함수 호출
		

		
		add(sp,BorderLayout.CENTER);
		
		p.add(jumun); //버튼 나열할 패널에 버튼 추가
		p.add(deleteb);

		add(p); //장바구니 프레임에 패널 추가
		add(tf,BorderLayout.SOUTH); //장바구니 프레임에 텍스트필드 추가하고 남쪽으로 배치
		
		//장바구니에서 삭제버튼 누를시 처리되는 이벤트
		deleteb.addActionListener(new ActionListener(){//Act ionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함

				int temp =list.getSelectedIndex(); //int형 임시변수 temp에 현재 선택된 리스트의 번호를 저장
				
			
				//장바구니에 아무 목록도 없을때 삭제버튼을 누르는 경우를 위한 예외처리
				try {//예외가 없이 정상 작동할때
					main.ckName.remove(temp); //선택된 리스트의 번호와 같은 번호에 저장된 치킨상품의 이름 삭제
				}
				catch(Exception ex){//장바구니에 아무 목록도 없는 예외가 발생했을때 Error창 출력
					JOptionPane.showMessageDialog(null, "삭제할 상품이 없습니다");
				}
				
				
				
				total-=main.ckPrice.get(temp); //총합가격에서 삭제된 상품가격만큼 감소
				tf.setText(String.valueOf(total)); //감소한 가격 출력
				main.ckPrice.remove(temp); //선택된 리스트의 번호와 같은 번호에 저장된 치킨상품의 가격 삭제
				list.setListData(main.ckName); //값을 삭제한 데이터를 리스트에 업데이트
			}

		}); 

		setLocation(350,500);
		setSize(300,300);



	}





}

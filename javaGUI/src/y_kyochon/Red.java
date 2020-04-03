package y_kyochon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//레드시리즈 클래스
public class Red extends JPanel{

	Red(Main main){ //레드시리즈 생성자 


		JButton red1 = new JButton(new ImageIcon("src/y_kyochon/imgs/레드1.PNG")); //레드스틱 이미지 넣고 버튼생성
		JButton red2 = new JButton(new ImageIcon("src/y_kyochon/imgs/레드2.PNG")); //레드콤보 이미지 넣고 버튼 생성
		JButton red3 = new JButton(new ImageIcon("src/y_kyochon/imgs/레드3.PNG")); //레드오리지날 이미지 넣고 버튼 생성

		int result =0; //장바구니에 담을지 물어봤을때 대답을 담을 변수 선언
		red1.setBackground(Color.white); //버튼을 깔끔하게 만들기 위해 하얀색으로 배경설정
		red2.setBackground(Color.white);
		red3.setBackground(Color.white);

		//레드 스틱콤보 버튼을 눌렀을때 처리되는 이벤트
		red1.addActionListener(new ActionListener(){//Act ionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				if(main.result(result)==JOptionPane.YES_OPTION) {//메인클래스의 result 함수 호출, 장바구니에 담을지 물어본후 yes옵션을 선택했을때
					
					main.ckName.add("교촌 레드스틱");//상품 이름을 저장하는 main클래스의 ckName ArrayList에 저장
					main.ckPrice.add(18000);//상품 가격을 저장하는 main 클래스의 ckPrice ArrayList에 저장
					main.shoppingbasket.update();
					JOptionPane.showMessageDialog(null,"교촌 레드스틱을 장바구니에 추가했습니다");//어떤 상품 장바구니에 담았는데 출력
				}
			}

		});
		red2.addActionListener(new ActionListener(){//Act ionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함

				if(main.result(result)==JOptionPane.YES_OPTION) {
					
					main.ckName.add("교촌 레드콤보");
					main.ckPrice.add(18000);
					main.shoppingbasket.update();
					JOptionPane.showMessageDialog(null,"교촌 레드콤보를 장바구니에 추가했습니다");
				}
			}

		});
		red3.addActionListener(new ActionListener(){//Act ionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				if(main.result(result)==JOptionPane.YES_OPTION) {
					
					main.ckName.add("교촌레드오리지날");
					main.ckPrice.add(16000);
					main.shoppingbasket.update();
					JOptionPane.showMessageDialog(null,"교촌 레드오리지날을 장바구니에 추가했습니다");
				}
			}

		});
		

		setLayout(new GridLayout(1,3)); //이미지를 깔끔하게 출력하기 위해 Layout을 GridLayout으로 설정
		add(red1); //버튼들 추가
		add(red2);
		add(red3);



	} 

}

package view;

import java.awt.*;


import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JPanel {

	JButton pbBtn;		//상품관리버튼
	JButton staffBtn;	//직원관리버튼
	JButton cBtn;		//회원관리버튼
	JButton SellBtn;	//판매버튼
	JButton SalesBtn;	//매출관리버튼

	public MainView() {

		addLayout();
	}

	public void addLayout() {//화면출력함수
		pbBtn= new JButton("상품관리");	
		staffBtn= new JButton("직원관리");	
		cBtn= new JButton("회원관리");		
		SellBtn= new JButton("판 매");	
		SalesBtn = new JButton("매출관리");

		JLabel jl= new JLabel("메인 화면");



		setLayout(null); //배치관리자 null로 설정



		jl.setHorizontalAlignment(JLabel.CENTER); //jl라벨 가운데 정렬

		//글자크기 변경
		jl.setFont(jl.getFont().deriveFont(50.0f)); 
		pbBtn.setFont(pbBtn.getFont().deriveFont(30.0f));
		cBtn.setFont(cBtn.getFont().deriveFont(30.0f));
		SellBtn.setFont(SellBtn.getFont().deriveFont(30.0f));
		SalesBtn.setFont(SalesBtn.getFont().deriveFont(30.0f));
		staffBtn.setFont(staffBtn.getFont().deriveFont(30.0f));

		//절대좌표 지정
		jl.setBounds(350, 20, 300, 160);
		cBtn.setBounds(180, 370, 200, 160);
		pbBtn.setBounds(400,190,200, 160);		
		SellBtn.setBounds(640, 190, 200, 340);
		SalesBtn.setBounds(400,370,200, 160);
		staffBtn.setBounds(180, 190, 200, 160);


		//패널에 컴포넌트 붙임
		add(jl);
		add(pbBtn);
		add(cBtn);
		add(SellBtn);
		add(SalesBtn);
		add(staffBtn);



	}
}

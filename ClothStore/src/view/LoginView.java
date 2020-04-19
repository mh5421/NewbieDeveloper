package view;

import javax.swing.*;
import javax.swing.border.Border;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.ClothStore;


public class LoginView extends JPanel {

	JTextField tfId;
	JTextField tfPw;

	JButton btnPw;




	public LoginView(){

		addLayout();
		eventproc();

	}
	public void eventproc() {
		ButtonEventHandler btnHandler = new ButtonEventHandler();

		btnPw.addActionListener(btnHandler);
	}


	// 이벤트 등록

	class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object o = ev.getSource();

			if(o==btnPw){  
				JOptionPane.showConfirmDialog(null, "로그인 성공");
			}

		}
	}









	public void addLayout() {
		tfId = new JTextField(10);
		tfPw = new JTextField(10);

		btnPw = new JButton("LOGIN");


		JLabel logLb = new JLabel("로그인");
		JLabel idLb = new JLabel("ID");
		JLabel pwLb = new JLabel("PW");

		setLayout(null);

		logLb.setHorizontalAlignment(JLabel.CENTER); //logLb라벨 글자 가운데 정렬

		//글자크기 변경
		logLb.setFont(logLb.getFont().deriveFont(50.0f)); 
		idLb.setFont(idLb.getFont().deriveFont(30.0f));
		pwLb.setFont(pwLb.getFont().deriveFont(30.0f));


		logLb.setBounds(350, 50, 300, 160);
		idLb.setBounds(300, 150, 300, 160);
		tfId.setBounds(300, 250, 400, 50);
		pwLb.setBounds(300, 300, 300, 160);
		tfPw.setBounds(300, 400, 400, 50);

		btnPw.setBounds(400, 500, 200, 50);



		add(logLb);


		add(idLb);
		add(tfId);
		add(pwLb);
		add(tfPw);
		add(btnPw);





	}

}

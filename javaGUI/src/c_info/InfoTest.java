package c_info;

import javax.swing.*;
import java.awt.*;


public class InfoTest extends JFrame{
	//1. 멤버변수 선언
	JTextArea ta;
	JButton bAdd,bShow,bSearch,bDelete,bCancel,bExit;
	JTextField tfName,tfID,tfTel,tfSex,tfAge,tfHome;
	






	InfoTest(){
		//2. 객체 생성
		super("DBTest");
	
		ta = new JTextArea();
		bAdd = new JButton("Add",new ImageIcon("src/c_info/imgs/동숲.JPG"));
		bAdd.setVerticalTextPosition(JButton.BOTTOM);
		bAdd.setHorizontalTextPosition(JButton.CENTER);
	
		bAdd.setPressedIcon(new ImageIcon("src/c_info/imgs/동숲8.JPG"));
		bAdd.setRolloverIcon(new ImageIcon("src/c_info/imgs/동숲9.JPG"));
		bAdd.setToolTipText("집에 가고 싶다");
		bAdd.setMnemonic('i');
		bShow = new JButton("Show",new ImageIcon("src/c_info/imgs/동숲2.JPG"));
		bSearch = new JButton("Search",new ImageIcon("src/c_info/imgs/동숲3.JPG"));
		bDelete = new JButton("Delete",new ImageIcon("src/c_info/imgs/동숲4.JPG"));
		bCancel = new JButton("Cancel",new ImageIcon("src/c_info/imgs/동숲5.JPG"));
		bExit = new JButton("Exit",new ImageIcon("src/c_info/imgs/동숲6.JPG"));
		

		tfName = new JTextField(10);
		tfID = new JTextField(10);
		tfTel = new JTextField(10);
		tfSex = new JTextField(10);
		tfAge = new JTextField(10);
		tfHome =new JTextField(10);

		JPanel p = new JPanel(new GridLayout(6,2));


		//WEST 영역
		p.add(new JLabel("이름",new ImageIcon("src/c_info/imgs/동숲7.JPG") ,JLabel.CENTER));
		
		p.add(tfName);
		p.add(new JLabel("ID",JLabel.CENTER));
		p.add(tfID);
		p.add(new JLabel("전화번호",JLabel.CENTER));
		
		p.add(tfTel);
		p.add(new JLabel("성별",JLabel.CENTER));
		p.add(tfSex);
		p.add(new JLabel("나이",JLabel.CENTER));
		p.add(tfAge);
		p.add(new JLabel("주소",JLabel.CENTER));
		p.add(tfHome);

		//CENTER
		
		add(ta,BorderLayout.CENTER);
	
		
		

		add(p,BorderLayout.WEST);
		
		//SOUTH 영역
		
		JPanel p2 = new JPanel(new GridLayout(1,6));

		
		p2.add(bAdd);
		p2.add(bShow);
		p2.add(bSearch);
		p2.add(bDelete);
		p2.add(bCancel);
		p2.add(bExit);


		add(p2,BorderLayout.SOUTH);

	


	}



	void display() {
		//3. 화면 구성 및 출력
		//setLayout(new BorderLayout());
		setLocation(500,350);
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	}
	public static void main(String[] args) {
		InfoTest t = new InfoTest();
		t.display();

	}

}

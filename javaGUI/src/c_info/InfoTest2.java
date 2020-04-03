package c_info;

import java.awt.BorderLayout;


import java.awt.GridLayout;
import java.awt.event.*;

import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class InfoTest2 extends JFrame{
	//1. 멤버변수 선언
	JTextArea ta;
	JButton bAdd,bShow,bSearch,bDelete,bCancel,bExit;
	JTextField tfName,tfID,tfTel,tfSex,tfAge,tfHome;







	InfoTest2(){
		//2. 객체 생성
		super("DBTest");

		ta = new JTextArea();
		bAdd = new JButton("Add",new ImageIcon("src/c_info/imgs/동숲.JPG"));
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
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	}


	public void eventProc() {
		// (2) 이벤트 핸들러 객체 생성
		MyEvent me = new MyEvent();

		bAdd.addActionListener(me);
		bShow.addActionListener(me);
		bSearch.addActionListener(me);
		bDelete.addActionListener(me);
		bCancel.addActionListener(me);
		bExit.addActionListener(me);


		//아이디 텍스트필드에서 엔터쳤을때 이벤트처리
		tfName.addActionListener(new ActionListener(){//ActionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				//JOptionPane.showMessageDialog(null,tfName.getText() + " 입력하였습니다.");

			}

		});
		tfID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				//JOptionPane.showMessageDialog(null,tfID.getText() + " 입력하였습니다.");
				String id = tfID.getText();
				//(1)주민번호에서 성별을 구하는 코딩
				
			

				if(id.charAt(7)=='1'||id.charAt(7)=='3'||id.charAt(7)=='9') {
					tfSex.setText("남성");
				}
				else if(id.charAt(7)=='2'||id.charAt(7)=='4'||id.charAt(7)=='0') {
					tfSex.setText("여성");
				}				
				tfID.setText("");

				//(2)주민번호에서 출신지를 구해서 출신지 텍스트필드에 출력
				switch(id.charAt(8)) {
				case 0:
					tfHome.setText("서울");
					break;
				case 1:
					tfHome.setText("인천");
					break;
				case 2:
					tfHome.setText("경기도");
					break;
				case 9:
					tfHome.setText("부산");
					break;
				default:
					tfHome.setText("한국인");
				}
				//(3)주민번호에서 나이를 구해서 나이 텍스트필드에 출력
				String age = id.substring(0,2); //주민번호에서 생년을 추출해온다.
				int nai = Integer.parseInt(age); //추출해온 생년을 int형으로 변환해서 nai변수에 저장
				
				Calendar cal =	Calendar.getInstance(); //캘린더 인스턴스를 받아온다.
				int year = cal.get(Calendar.YEAR); // year 변수에 현재년도를 저장
				
				
				if(id.charAt(7)=='1'||id.charAt(7)=='2') {//1900년생일 경우
					tfAge.setText(Integer.toString(year-(1900+nai)+1));
				}else if(id.charAt(7)=='3'||id.charAt(7)=='4'){//2000년생일 경우
					tfAge.setText(Integer.toString(year-(2000+nai)+1));
				}else if(id.charAt(7)=='9'||id.charAt(7)=='0') {//1800년생일 경우
					tfAge.setText(Integer.toString(year-(1800+nai)+1));
				}
			}
		});
		tfTel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, tfTel.getText()+" 입력하였습니다.");
			}
		});
		tfSex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, tfSex.getText()+" 입력하였습니다.");

			}
		});
		tfAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, tfAge.getText()+" 입력하였습니다.");
			}
		});
		tfHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, tfHome.getText()+" 입력하였습니다.");
			}
		});

		//윈도우에 x 버튼 눌렀을 때의 이벤트처리

		addWindowListener(new WindowAdapter() {//adapter는 나의 실수를 못잡아줘서 이벤트가 발생하지 않는다.
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "진짜 나가시겠습니까?");
				if(result==JOptionPane.OK_OPTION)
					System.exit(0);
			}	
		});
	}






	//(1)이벤트 핸들러 생성
	class MyEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton evt = (JButton)e.getSource();

			if(evt == bAdd) {
				JOptionPane.showMessageDialog(null, bAdd.getText() +" 합니다.");
			}
			else if(evt == bShow) {
				JOptionPane.showMessageDialog(null,  bShow.getText() +"합니다.");
			}
			else if(evt == bSearch) {
				JOptionPane.showMessageDialog(null,  bSearch.getText() +"합니다.");
			}
			else if(evt==bDelete) {
				JOptionPane.showMessageDialog(null,  bDelete.getText() +"합니다.");
			}
			else if(evt==bCancel) {
				JOptionPane.showMessageDialog(null, bCancel.getText() +"합니다.");
			}
			else if(evt==bExit) {
				JOptionPane.showMessageDialog(null,bExit.getText() +"합니다.");
				System.exit(0);
			}
		}		
	}
	public static void main(String[] args) {
		InfoTest2 t = new InfoTest2();
		t.display();
		t.eventProc();


	}

}

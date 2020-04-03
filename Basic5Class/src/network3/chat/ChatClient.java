package network3.chat;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

class ChatClient implements ActionListener ,Runnable{
	JFrame f;

	JTextField connTF, sendTF;
	JButton connB, sendB;
	JTextArea ta;

	Socket s;
	BufferedReader in;
	OutputStream out;

	// 추가0 : 대화명을 바꾸기
	JTextField changeNameTF;
	JButton    changeNameB;

	// 추가2 : 방인원의 대명 보여주기
	// 변수 선언
	JList  memberList;
	Vector list;

	public ChatClient() {
		f = new JFrame("Chat Client");


		connTF = new JTextField();
		sendTF = new JTextField();
		connB = new JButton("접 속");
		sendB = new JButton("확 인");
		ta = new JTextArea(15,40);

		// 추가0: 대화명 바꾸기
		changeNameTF	= new JTextField("guest", 10);
		changeNameB		= new JButton("바꾸기");
		JPanel p_changeName = new JPanel();
		p_changeName.add( new JLabel("대화명 : "),"West" );
		p_changeName.add(changeNameTF, "Center");
		p_changeName.add(changeNameB, "East");

		JPanel p_serverName = new JPanel();
		p_serverName.setLayout( new BorderLayout() );
		p_serverName.add( new JLabel("서버입력 : "),"West" );
		p_serverName.add(connTF, "Center");
		p_serverName.add(connB, "East");

		JPanel p_north = new JPanel();
		p_north.setLayout( new GridLayout(1, 2));
		p_north.add( p_changeName );
		p_north.add( p_serverName );

		JPanel p2 = new JPanel();
		p2.setLayout( new BorderLayout() );
		p2.add( new JLabel("메세지입력 : "),"West" );
		p2.add(sendTF,"Center");
		p2.add(sendB, "East");

		// 추가2 : 방인원의 대명 보여주기
		memberList = new JList();
		list		= new Vector();
		JPanel  p_east = new JPanel();
		p_east.setLayout( new BorderLayout());
		p_east.add("North", new JLabel("   우 리 방 멤 버   "));
		p_east.add("Center", memberList );



		f.getContentPane().add("North", p_north);
		f.getContentPane().add("Center", new JScrollPane(ta));
		f.getContentPane().add("South", p2);
		f.getContentPane().add("East", p_east);

		//f.setSize(500, 300);
		f.pack();
		f.setVisible(true);

		connTF.addActionListener(this);
		connB.addActionListener(this);
		sendTF.addActionListener(this);
		sendB.addActionListener(this);

		//  추가0: 대화명 바꾸기
		changeNameTF.addActionListener(this);
		changeNameB.addActionListener(this);
	}// 생성자 종료

	public void actionPerformed( ActionEvent e ) {
		Object o = e.getSource();

		if( o == connTF || o == connB ) {
			connProc();
		}

		else if( o == sendTF || o == sendB ) {
			sendProc();
		}

		else if( o == changeNameTF || o == changeNameB ) {
			changeNameProc();
		}
	} // actionPerformed ends


	void changeNameProc(){
		String nickname = "/name	"+changeNameTF.getText() + "\n";

		try {
			out.write(nickname.getBytes());
		} catch (IOException e) {
			ta.append("이름변경 실패"+e.toString());
		}
		JOptionPane.showMessageDialog(null, "대화명을 바꿉니다");
	}

	void connProc() {
		//JOptionPane.showMessageDialog(null, "서버에 접속합니다");
		String ip = connTF.getText(); //사용자가 입력한 서버ip 저장
		try {
			s = new Socket(ip,1234);//소켓 생성
			out = s.getOutputStream();
			in = new BufferedReader(new InputStreamReader(s.getInputStream())); //InputStreamReader- byte형으로 들어오는 data를 string형으로 바꿔줌

			new Thread(this).start();
		} catch (Exception e) {
			ta.setText("접속실패"+e.toString());
		} 

	} // connProc ends

	public void run(){
		while(s.isConnected()) { //서버가 보내주는 통료를 읽으려고 반복문
			String msg="";
			try {
				msg = in.readLine();
			} catch (IOException e) {
				ta.append("읽기 실패"+e.toString());
			}
			ta.append(msg+"\n");

		}
	}

	void sendProc() {
		//JOptionPane.showMessageDialog(null, "메세지를 전송합니다");
		String msg = sendTF.getText()+"\n";//사용자가 입력한 값을 받아온다. +"\n"까지가 한문장이라는 의미, 거기서 끊어라!
		try {
			out.write(msg.getBytes());
		} catch (IOException e) {
			ta.append("쓰기 실패"+e.toString());
		} //
		sendTF.setText(null); //사용자가 입력하는 부분을 초기화해준다.

	}// sendProc ends



	public static void main(String [] args ) {
		new ChatClient();
	}

}// ChatClient ends






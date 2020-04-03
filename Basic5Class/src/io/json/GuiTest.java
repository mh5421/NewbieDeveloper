package io.json;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class MyFrame extends JFrame
{
	// 변수선언
	JTextField tfName, tfTel, tfJumin, tfGender, tfAge, tfHome;
	JButton bSave, bOpen;
	
	// 객체 생성
	public MyFrame(){		
		super("나의 첫 화면");
		tfName = new JTextField(15);
		tfTel = new JTextField(15);
		tfJumin = new JTextField(15);
		tfGender = new JTextField(15);
		tfAge = new JTextField(15);
		tfHome = new JTextField(15);
		
		bSave = new JButton("저장하기");
		bOpen = new JButton("읽어오기");
		
	}
	
	// 화면구성 및 보여주기
	public void addLayout(){
		
		JPanel p_center = new JPanel();
		p_center.setLayout( new GridLayout( 6, 2 ));
		p_center.add( new JLabel("이름"));
		p_center.add( tfName );
		p_center.add( new JLabel("전화"));
		p_center.add( tfTel );
		p_center.add( new JLabel("주민"));
		p_center.add( tfJumin );
		p_center.add( new JLabel("성별"));
		p_center.add( tfGender );
		p_center.add( new JLabel("나이"));
		p_center.add( tfAge );
		p_center.add( new JLabel("출신지"));
		p_center.add( tfHome );
		
		JPanel p_south = new JPanel();
		p_south.add( bSave );
		p_south.add( bOpen );
		
		add( p_center, BorderLayout.CENTER);
		add( p_south, BorderLayout.SOUTH);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		
	}
	
	// 이벤트 연결
	public void eventProc()
	{
		/* 이벤트 핸들러 객체 생성*/
		BtnHandler bHandler = new BtnHandler();
		
		/* 컴포넌트와 이벤트핸들러 연결 */
		bSave.addActionListener(bHandler);
		bOpen.addActionListener(bHandler);
		
	
	}
	
	/* 이벤트 핸들러 선언 */
	class BtnHandler implements ActionListener
	{
		public void actionPerformed( ActionEvent ev)
		{
			Object btn = ev.getSource();
			//JButton btn = (JButton)ev.getSource();
			if( btn == bSave ) {
				//JOptionPane.showMessageDialog(null, "저장합니다.");
				saveData();
			}else if ( btn ==  bOpen) {
				//JOptionPane.showMessageDialog(null, "입력합니다.");
				readData();
			}
		}
	} // end of class BtnHandler
	
	/**
			http://code.google.com/p/json-simple/
			왼쪽 메뉴 > Download >  json_simple-1.1.jar를 직접 다운
			Add External Jar 추가
	 */
	void saveData() {		
	
		try {
			JSONObject obj = new JSONObject();
			obj.put("name",tfName.getText());
			
			obj.put("전화",tfTel.getText());
			obj.put("주민",tfJumin.getText());
			
			
			obj.put("성별",tfGender.getText());
			obj.put("나이",tfAge.getText());
			obj.put("출신지",tfHome.getText());
			
			FileWriter fw = new FileWriter("src/io/json/test.json");
			fw.write(obj.toJSONString());
			fw.close();
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	void readData() {		
		 
		try {
			FileReader fr= new FileReader("src/io/json/test.json");
			
			JSONParser parser = new JSONParser();
			
			JSONObject obj = (JSONObject)parser.parse(fr);
			
			tfName.setText((String)obj.get("name"));
			tfTel.setText((String)obj.get("전화"));
			tfJumin.setText((String)obj.get("주민"));
			tfGender.setText((String)obj.get("성별"));
			tfAge.setText((String)obj.get("나이"));
			tfHome.setText((String)obj.get("출신지"));
			
		
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
} // end of class MyFrame

public class GuiTest {
	public static void main(String[] args) {
		MyFrame my = new MyFrame();
		my.addLayout();
		my.eventProc();
	}
}

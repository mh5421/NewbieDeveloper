package z_Sample;
import java.awt.*;
import javax.swing.*;


public class Login extends JFrame{
	JTextField tf;
	JTextField tf2;
	
	JButton b;
	
	
	Login(){
		super("받아코딩");
		tf = new JTextField();
		tf2 = new JTextField();
		b = new JButton("로그인");
		
		
		
		
		
		
		
		
	
	}
	
	void disPlay() {
		JLabel lId = new JLabel("아이디",JLabel.CENTER);
		JLabel lpass = new JLabel("비밀번호",JLabel.CENTER);
		
		JPanel p = new JPanel(new GridLayout(2,2));
		
		p.add(lId);
		p.add(tf);
		p.add(lpass);
		p.add(tf2);
		
		add(p,BorderLayout.CENTER);

		add(b,BorderLayout.EAST);
		
		setLocation(500,500);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	

	public static void main(String[] args) {

		Login login = new Login();
		
		
		
		login.disPlay();
		
		
	}

}

package d_cal;
import java.awt.*;
import javax.swing.*;

public class AZKeyBoard extends JFrame{
	//멤버변수 선언

	JButton b[]=new JButton[26];




	AZKeyBoard(){
		//객체 선언

		char ch = 'A';

		Panel p = new Panel(new GridLayout(2,13));
		for(int i=0;i<26;i++) {
			b[i]=new JButton(String.valueOf(ch++));
			p.add(b[i]);
		}
		
		add(p);

		







	}


	void disPlay() {
		setLocation(500,500);
		setSize(600,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		AZKeyBoard azk = new AZKeyBoard();

		azk.disPlay();

	}

}

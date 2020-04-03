package y_kyochon;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Original extends JPanel {



	Original(Main main){

		JButton original1 = new JButton(new ImageIcon("src/y_kyochon/imgs/오리지날1.PNG"));
		JButton original2 = new JButton(new ImageIcon("src/y_kyochon/imgs/오리지날2.PNG"));
		JButton original3 = new JButton(new ImageIcon("src/y_kyochon/imgs/오리지날3.PNG"));

		int result=0;


		original1.setBackground(Color.white);
		original2.setBackground(Color.white);
		original3.setBackground(Color.white);

		original1.addActionListener(new ActionListener(){//Act ionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함

				if(main.result(result)==JOptionPane.YES_OPTION) {
					main.ckName.add("교촌 오리지날");
					main.ckPrice.add(15000);
					main.shoppingbasket.update();
					JOptionPane.showMessageDialog(null,"교촌오리지날을 장바구니에 추가했습니다");
				}
			}	 
		});
		original2.addActionListener(new ActionListener(){//Act ionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				if(main.result(result)==JOptionPane.YES_OPTION) {
					
					main.ckName.add("교촌콤보");
					main.ckPrice.add(17000);
					main.shoppingbasket.update();
					JOptionPane.showMessageDialog(null,"교촌콤보를 장바구니에 추가했습니다");
				}
			}

		});
		original3.addActionListener(new ActionListener(){//Act ionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				if(main.result(result)==JOptionPane.YES_OPTION) {
					
					main.ckName.add("교촌 스틱");
					main.ckPrice.add(17000);
					main.shoppingbasket.update();
					JOptionPane.showMessageDialog(null,"교촌스틱을 장바구니에 추가했습니다");
				}
			}


		});

		setLayout(new GridLayout(1,3));
		add(original1);
		add(original2);
		add(original3);
	}
}

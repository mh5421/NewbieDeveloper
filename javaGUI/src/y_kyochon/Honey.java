package y_kyochon;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Honey extends JPanel {
	
	
	Honey(Main main){

		JButton honey1 = new JButton(new ImageIcon("src/y_kyochon/imgs/허니1.JPG"));
		JButton honey2 = new JButton(new ImageIcon("src/y_kyochon/imgs/허니2.JPG"));
		JButton honey3 = new JButton(new ImageIcon("src/y_kyochon/imgs/허니3.JPG"));
		
		honey1.setBackground(Color.white);
		honey2.setBackground(Color.white);
		honey3.setBackground(Color.white);

		int result=0;

	

		honey1.addActionListener(new ActionListener(){//Act ionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				if(main.result(result)==JOptionPane.YES_OPTION) {
					
					main.ckName.add("교촌 허니스틱");
					main.ckPrice.add(18000);
					main.shoppingbasket.update();
					
					JOptionPane.showMessageDialog(null,"교촌 허니스틱을 장바구니에 추가했습니다");
				}
			}

		});

		honey2.addActionListener(new ActionListener(){//Act ionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				if(main.result(result)==JOptionPane.YES_OPTION) {
					
					main.ckName.add("교촌 허니순살");
					main.ckPrice.add(20000);
					main.shoppingbasket.update();
					JOptionPane.showMessageDialog(null,"교촌 허니순살을 장바구니에 추가했습니다");
				}
			}

		});

		honey3.addActionListener(new ActionListener(){//Act ionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				if(main.result(result)==JOptionPane.YES_OPTION) {
					
					main.ckName.add("교촌 허니콤보");
					main.ckPrice.add(18000);
					main.shoppingbasket.update();
					JOptionPane.showMessageDialog(null,"교촌 허니콤보을 장바구니에 추가했습니다");

				}
			}

		}); 
		
		setLayout(new GridLayout(1,3));
		add(honey1);
		add(honey2);
		add(honey3); 
	}

}

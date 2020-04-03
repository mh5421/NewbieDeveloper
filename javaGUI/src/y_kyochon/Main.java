package y_kyochon;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

public class Main extends JFrame {

	Honey honey;
	Original original;
	Red red; 
	ShoppingBasket shoppingbasket;
	JButton Shopb;
	static Vector<String> ckName= new Vector<String>();  //치킨이름 저장할 Vector선언
	static Vector<Integer> ckPrice= new Vector<Integer>(); //치킨 가격 저장할 Vector 선언

	//오리지널,레드,허니 시리즈에서 쓸 함수 생성 , 메뉴를 선택하였을때 장바구니에 담을것인지 물어보는 다이얼로그 생성
	public static int result(int result) {
		result = JOptionPane.showConfirmDialog(null, "장바구니에 추가하시겠습니까?", "구매결정", JOptionPane.YES_NO_OPTION,0,new ImageIcon("src/y_kyochon/imgs/kyochonlogo.JPG"));
		return result;
	}
	
	Main(){ 
		super("교촌치킨"); 
		honey= new Honey(this); //허니 시리즈 객체 생성
		original = new Original(this); //오리지널 시리즈 객체 생성
		red = new Red(this); //레드 시리즈 객체 생성
		
		shoppingbasket = new ShoppingBasket(); //장바구니 객체 생성
		Shopb= new JButton("장바구니"); //장바구니 버튼 생성
		JTabbedPane tp = new JTabbedPane(); //치킨 시리즈  담을 탭 생성
		
		tp.add("교촌시리즈",original); //탭 이름 설정하고 오리지널 객체 추가
		tp.add("교촌허니시리즈",honey); //탭 이름 설정하고 허니시리즈 객체 추가
		tp.add("교촌레드시리즈",red); // 탭 이름 설정하고 레드시리즈 객체 추가
		add(tp); //메인프레임에 탭 추가
		//setLayout(new FlowLayout());
		add(Shopb,BorderLayout.SOUTH); //메인프레임 남쪽에 쇼핑버튼 추가

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
		setSize(1000,500); //사이즈 지정
		setVisible(true); // 화면 출력
		
		//장바구니 새창생성
		Shopb.addActionListener(new ActionListener(){//Act ionListener를 구현한 이름없는 클래스를 new로 만듬
			public void actionPerformed(ActionEvent e) {//actionPerformed는 이벤트 발생시에 jvm이 호출함
				shoppingbasket.setVisible(true);
				/*
				if(shoppingbasket.isVisible()==false) //장바구니창이 화면에 비출력인 상태일때 / 장바구니에 저장된 데이터를 초기화하고 업데이트하여 저장한다.
				{
					shoppingbasket.list.removeAll(); // 장바구니에 추가된 상품목록 초기화
					shoppingbasket.total=0;			//물건 가격의 총 합을 초기화
					shoppingbasket.update();		//장바구니에 현재 저장된 상품목록과 가격을 업데이트
					shoppingbasket.setVisible(true); // 장바구니 화면출력
				}
				*/
			}

		});
		

		addWindowListener(new WindowAdapter() {//adapter는 나의 실수를 못잡아줘서 이벤트가 발생하지 않는다.
			public void windowClosing(WindowEvent e) {//종료메시지 창 출력후 OK 선택했을시 프로그램 종료
				int result = JOptionPane.showConfirmDialog(null, "진짜 나가시겠습니까?","종료",JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION);
				if(result==JOptionPane.OK_OPTION)//OK옵션 선택시
					System.exit(0);//프로그램 종료
			}	
		});
		
	}

	public static void main(String[] args) {

		new Main();




	}

}

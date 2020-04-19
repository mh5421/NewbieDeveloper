package view.tab;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import view.tab.daySales.SalesTableModel;

public class daySales extends JPanel {
	JButton graph;
	JTextField tfDate;
	JTextField tfpNum;
	JTextField tfstaffid;
	JTable tablesales;
	
	SalesTableModel TbModelSales;
	
	public daySales() {
		addLayout();
		
		
	}
	public void addLayout() {
		//멤버변수 객체 생성
		JLabel datelb= new JLabel("거래날짜");
		JLabel pnumlb= new JLabel("상품번호");
		JLabel snumlb= new JLabel("직원id");
		
		graph = new JButton("그래프");
		tfDate = new JTextField();
		tfpNum = new JTextField();
		tfstaffid = new JTextField();
		
		
		tablesales = new JTable(TbModelSales);
		JLabel titlelb= new JLabel("매출관리");
		
		JPanel m_s = new JPanel();
		//왼쪽영역
		JPanel s_left = new JPanel();
		
		//오른쪽영역
		JPanel s_right = new JPanel();
		//s_right.setLayout(null);
		
		titlelb.setFont(titlelb.getFont().deriveFont(30.0f)); 
		datelb.setFont(datelb.getFont().deriveFont(15.0f)); 
		pnumlb.setFont(pnumlb.getFont().deriveFont(15.0f)); 
		snumlb.setFont(snumlb.getFont().deriveFont(15.0f)); 
		
		s_left.setBorder(new TitledBorder("매출내역"));
		
		
		datelb.setBounds(150, 50, 60, 30);
		pnumlb.setBounds(150, 100, 60, 30);
		snumlb.setBounds(150, 150, 60, 30);
		
		tfDate.setBounds(250, 50, 180, 30);
		tfpNum.setBounds(250, 100, 180, 30);
		tfstaffid.setBounds(250, 150, 180, 30);
		graph.setBounds(250,200,250,30);
		
		s_right.add(datelb);
		s_right.add(pnumlb);
		s_right.add(snumlb);
		
		s_right.add(tfDate);
		s_right.add(tfpNum);
		s_right.add(tfstaffid);
		s_right.add(graph);
		
		
		s_left.add(new JScrollPane(tablesales),BorderLayout.CENTER);
		
		//m_s.add(s_left);
		//m_s.add(s_right);
		add(s_left,BorderLayout.WEST);
		add(s_right);
		//m_s.setLayout(new GridLayout(1,2));
		//add(titlelb,BorderLayout.NORTH);
		//add(m_s,BorderLayout.CENTER);
		
	}
	//화면에 테이블 붙이는 메소드 
		class SalesTableModel extends AbstractTableModel { 
			  
			ArrayList data = new ArrayList();
			String [] columnNames = {"거래날짜","거래번호","상품번호","상품명","가격","직원id"};

			//=============================================================
			// 1. 기본적인 TabelModel  만들기
			// 아래 세 함수는 TabelModel 인터페이스의 추상함수인데
			// AbstractTabelModel에서 구현되지 않았기에...
			// 반드시 사용자 구현 필수!!!!

			    public int getColumnCount() { 
			        return columnNames.length; 
			    } 
			     
			    public int getRowCount() { 
			        return data.size(); 
			    } 

			    public Object getValueAt(int row, int col) { 
					ArrayList temp = (ArrayList)data.get( row );
			        return temp.get( col ); 
			    }
			    
			    public String getColumnName(int col){
			    	return columnNames[col];
			    }
		}
	
}


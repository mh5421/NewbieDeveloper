package view;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import java.awt.*;
import java.util.ArrayList;

import view.tab.daySales;
import view.tab.MonthSales;
import view.tab.YearSales;
import view.tab.ProductSales;

public class SalesView extends JPanel {
	daySales dS;
	MonthSales mS;
	YearSales yS;
	ProductSales pS;



	public SalesView() {
		dS = new daySales();
		mS = new MonthSales();
		JTabbedPane  pane = new JTabbedPane();
		pane.addTab("일매출" ,dS);
		pane.addTab("연매출",mS);
		pane.addTab("월매출",yS);
		pane.addTab("상품별매출",pS );

		pane.setSelectedIndex(1);

		add("Center", pane );
		setSize(1000,800);
	}


}



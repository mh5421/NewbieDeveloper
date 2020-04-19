package main;

import javax.swing.*;
import java.awt.*;

import view.LoginView;
import view.MainView;
import view.SalesView;


public class ClothStore extends JFrame{
	MainView mainview;
	LoginView login;
	SalesView sales;
	CardLayout card;//카드레이아웃 선언
	
	public ClothStore() {
		
		login = new LoginView();
		mainview = new MainView();
		sales = new SalesView();
		
		
		add(mainview);
		add(login);
		add(sales);
		//화면크기지정
		setSize(1000,800);
		
		
		
	
		//setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/*
	public void change() {
		card.show(mainview, "메인화면");
		
	}*/
	
	public static void main(String[] args) {
		new ClothStore();
		
		
	}

}

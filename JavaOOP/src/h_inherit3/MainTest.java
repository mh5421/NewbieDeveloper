package h_inherit3;


import java.util.*;

import h_inherit5.Book;
import h_inherit5.Cd;
import h_inherit5.Dvd;
import h_inherit5.Item;

public class MainTest {

	public static void main(String[] args) {
		
		 Item i = null;
		  
		  Scanner input = new Scanner(System.in);
		  System.out.println("상품선택(1. Book  2.Dvd   3.Cd");
		  int sel = input.nextInt();
		  switch(sel) {
		  //(1)부모변수에 자식객체 생성 가능해야되고 그러려면 상속관계여야 한다.
		  case 1: i = new Book("0001","자바","홍길동","코스모"); break;
		  case 2: i = new Dvd("002","킹덤","주지훈","김은희"); break;
		  case 3: i = new Cd("00001","아는노래","지코"); break;
		  }
		  // 출력*****
		  //(2)overriding
		  i.output();//다형성
		  
		  //다형성의 조건은 (1)과 (2)를 모두 만족해야 한다.
		  
		  

	}

}

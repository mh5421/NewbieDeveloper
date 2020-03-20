package b_useful_class;


import java.util.*;
public class StringStringBuffer {

	public static void main(String[] args) {
		
		//0.기본형
		int a =10;
		a+=5;
		
		//1.String : 참조형
		
		//String s = new String("안녕");//참조형의 기본 문법. 참조형은 new를 무조건 사용하여야한다.
		String s = "안녕";// String 만큼은 참조형이지만 매우 자주 쓰이므로 특권을 주어 new를 생략할 수 있다.
		s += "하세요";
		System.out.println(s);
		
		//2. StringBuffer
		StringBuffer sb = new StringBuffer("행복한");
		sb.append("목요일");
		System.out.println(sb);
		
	}

}

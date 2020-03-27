package e_method;

import java.util.*;

public class Ex02_연습 {
/**
 (문제 1) 영문자를 입력하여 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오.
  함수명 : checkLower
  인자 : char
  리턴(반환) : boolean
 
 */
	static boolean checkLower(char ch) {
		if(ch>='a'&&ch<='z') {
			//bool = true;
			return true;
		}
		else {
			//bool = false;
			return false;
			}
				
	}
	public static void main(String[] args) {
		//문자 입력
		System.out.print("영문자를 입력하세요:");
		Scanner Input = new Scanner(System.in);
		boolean bool = true;
		char ch=Input.next().charAt(0);
		//checkLower 함수 
		
		bool =  checkLower(ch);
		System.out.println(bool);
		


	}

}

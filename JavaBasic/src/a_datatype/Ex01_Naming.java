package a_datatype;

import java.util.Random;

//주석의 종류
/* 주석 : 컴파일하지 않는 문장 */
// 주석
/** 주석 */


public class Ex01_Naming {
	/**
	 *		자료형 
	 *		1- 기본형
	 *				논리형 : boolean
	 *				문자형 : char(2B)
	 *				정수형 : int(4B) / long(8B)
	 *				실수형 : double(8B)
	 * 		2- 참조형
	 * 				배열 / 클래스
	 */
	public static void main(String[] args) {

		// 1. 변수선언 : 메모리에 영역 확보하기
				// (1) 문자형 변수  ch 선언하기
		char ch='a';
		
		long abcdefg;
		
				// (2) 정수형 변수 abcdefz 선언하기
		int abcdefz;
				// (3) 실수형 변수 Ch 선언하기
		double Ch;
		// 2. 변수에 값 대입하기
		ch = '꽝';
		abcdefz = 1000000000;
		abcdefg = 10000000000L;
		Ch = 12.1;
		
		
		System.out.println(ch);
		System.out.println(abcdefz);
		System.out.println(Ch);
		System.out.println(abcdefg);
		
		
		// 3. 논리형 변수 b 선언하고 true 값 대입하기(지정하기)
		
		boolean b;
		
		b = true;
		
	
	
		
	}

}

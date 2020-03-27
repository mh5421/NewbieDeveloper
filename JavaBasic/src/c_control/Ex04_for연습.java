package c_control;

import java.util.*;
public class Ex04_for연습 {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		//(1) 1~N까지의 숫자를 다음처럼 출력하라
		
		/*
		 * int N =0;
		
		System.out.println("N을 입력하세요:");
		N=Input.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.print(i+" ");
			if(i%5==0)
				System.out.println();
		}*/
		
		//(2) 문자열 처리하기
		
//		문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고
//		N이 대문자이면 문자 N부터  Z까지 출력하라
//		그 밖의 문자가 입력되면 Error 를 출력하라
		/*
		char ch;
		
		System.out.print("문자를 입력하세요:");
		ch = Input.next().charAt(0);
		
		if(ch<='z'&&ch>='a'){
			for(char i='a';i<=ch;i++){
				System.out.print(i+" ");
			}
			
		}
		else if(ch<='Z'&&ch>='A') {
			for(char i='Z';ch<=i;ch++){
				System.out.print(ch+" ");
			}
		
		}else
			System.out.println("error");
		*/
		
		//(3)입력받은 문자열을 뒤집어서 출력
//		 [예]  입력     출력
//		  
//	     안녕 친구   구친 녕안
//	     CarpeDiem   meiDepraC
//	     
//	   [힌트] 문자열의 길이 구할 때   length() 이용
		/*
		String str = "";
		char ch;
		
		System.out.print("문자를 입력하세요:");
		str = Input.nextLine();
		
		int str_length=0;
		str_length = str.length();	

		for(int i=0;i<str_length;str_length--) {
			System.out.print(str.charAt(str_length-1));
		}
		
		for(int i = str_length-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		*/
		
		
		//(4)도전문제 자연수 n을 입력받아 n x n크기에 공백으로 출력하는 프로그램작성, 10미만의 홀수만 출력
		
		
		int n=0;
		int holsu=1;
		System.out.println("자연수를 입력하세요:");
		n= Input.nextInt();
		
		for(int i=1;i<=(n*n);i++) {
				System.out.print(holsu+" ");
				holsu+=2;
				if(holsu>10) {
					holsu =1;
				}
				if(i%n==0) {
					System.out.println();
				
			}
				
		}
		holsu =1;
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(holsu+" ");
				holsu+=2;
				if(holsu>10) {
					holsu =1;
				}
				if(j%n==0) {
					System.out.println();
				
			}
				
				
			}
			
			
		}

	}

}

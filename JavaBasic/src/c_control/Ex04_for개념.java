package c_control;


import java.util.*;
public class Ex04_for개념 {

	public static void main(String[] args) {
		/*
			for(초기치;조건식;증가치){
			}
		 */

		//0. 인사말 5번 출력

		//		for(int i=0;i<5;i++) {
		//		
		//			System.out.println("Hello! World");
		//			
		//		}

		//1. 1~10까지의 합 구하기
//		int sum = 0;
//		for(int i=1;i<101;i++) {
//			sum += i;
//			
//		}
		
		//2. 1~100까지 홀수의 합과 짝수의 합 구하기
/*		
		int holsum = 0;
		int jjaksum = 0;
		for(int i=1;i<101;i++) {
			if(i%2==0)
				holsum += i;
			else if(i%2==1)
				jjaksum += i;
			
		}
		System.out.println("짝수의 합:"+jjaksum);
		System.out.println("홀수의 합:"+holsum);
	
*/
		
		//3. A~Z 출력
		
		for(char ch ='A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
		System.out.println();
		//4. A~Z 출력(2개씩 건너뛰기)
		for(char ch ='a'; ch<='z'; ch+=2) {
			System.out.print(ch+" ");
		}
		System.out.println();
		//5. Z~A 출력
		
		for(char ch='Z'; ch>='A';ch--) {
			System.out.print(ch+" ");
			
		}

	}
}



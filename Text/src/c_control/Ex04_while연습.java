package c_control;

import java.util.*;
public class Ex04_while연습 {

	public static void main(String[] args) {
		// 3 6 9 연습
		//1~9까지 숫자출력

		//Scanner Input = new Scanner(System.in);

		/*
		for(int i=1;i<=50;i++){
			int su = i; //369 판별에 쓰일 변수에 숫자 저장
			boolean su369 =false; //숫자가 369가 아닐때 false
			while(su!=0) { //su가 0이 아닐때까지
				int na =su%10; //나머지를 na에 저장
				if(na%3==0||na%6==0||na%9==0) {//숫자가 3,6,9 일때
					System.out.print("짝 ");	
					su369=true;//숫자가 369 이므로 true저장
				}
				su/=10;//다음 자리의 숫자를 저장
			}

			if(su369) {
				System.out.println();
			}
			else {
				System.out.print(i+" ");
			}

		}*/
		int total = 0;
		for(int i=1;i<=10000;i++) {//숫자 10000 까지 반복

			int su = i; // 8이 있는가 판별할 변수su에 현재 수를 저장
			
			while(su!=0) { //현재판별중이 값이 0이 아닐때까지
				int na = su%10; // 현재수를 10으로 나눠 남는 값을 na에 저장

				if(na==8) { //나머지값이 8일 경우
					total++;//8의 개수를 증가
					
				}
				su/=10; //현재값을 10으로 나눠 자리수 뒷자리 수만 분리 ex)898->89/8

			}
		}
		System.out.println("결과:"+total); //결과 출력

		

	}

}

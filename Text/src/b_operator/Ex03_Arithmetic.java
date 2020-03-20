package b_operator;

import java.util.Scanner;

/**
 *  두 정수를 입력받아 사칙연산과 나머지 연산을 수행한 결과를 출력한다
 */

// 나머지 연산자 활용 - 홀/짝수 구하기

public class Ex03_Arithmetic {

	public static void main(String[] args) { 
		/*
		Scanner scan = new Scanner(System.in);
		int Num1, Num2;
		
		
		System.out.print("첫번째 숫자를 입력하세요 :");
		Num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요 :");
		Num2 = scan.nextInt();
		

		System.out.println("더하기 : "+(Num1+Num2));
		System.out.println("빼기 : "+(Num1-Num2));
		System.out.println("곱하기 :"+Num1*Num2);
		System.out.println("나누기 :"+(double)Num1/Num2);
		System.out.println("나머지 :"+Num1%Num2);
		*/
		
		//(1) 정수형 변수 su 선언
		//(2) Scanner 선언
		//(3) 화면에 "정수를 입력하세요" 출력
		//(4) 입력받은 정수를 su 변수에 저장
		
		//(5) 입력받은 수가 홀/짝수 구하기
		
		//(6) 입력받은 수가 3의 배수인지 아닌지 확인
		
		
		
		
		int su=0;
		Scanner input = new Scanner(System.in);
		
		while(true) {
		System.out.print("정수를 입력하세요 :");
		su = input.nextInt();
		
		if(su%2==1)
			System.out.println("홀수 입니다.");
		else
			System.out.println("짝수 입니다.");
		
		if(su%3==0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		
		}

	}

}

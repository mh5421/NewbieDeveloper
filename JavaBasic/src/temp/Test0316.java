package temp;

import java.util.Scanner;

public class Test0316 {
	public static void main(String args[]) {
		//100점 만점의 학생 점수를 입력받아 80~90 사이라면 '평균'이라고 출력
		/*
		Scanner input = new Scanner(System.in); //Scanner 선언
		int Score = 0; // 점수 변수 선언
	
		System.out.print("점수를 입력해주세요:"); // 점수를 입력해주세요 출력
		Score = input.nextInt(); // 점수를 입력받아 점수변수에 저장
		
		if(Score>80 && Score < 90) //조건문 80점초과 90점미만일 경우
			System.out.println("평균"); //평균 출력
		*/
//		int z= 10-7^3+1*2&4;
//			
//		System.out.println(z);
		
//		
//		int i=0;
//		Scanner Input = new Scanner(System.in);
//		
//		
//		System.out.print("문자를 입력하세요:");
//		char ch = Input.next().charAt(0);
//		if(ch>='a'&&ch<='z')
//		{
//			for(i=(int)'a';i<=(int)ch;i++)
//				System.out.print((char)i+" ");
//		}
//		else if(ch>='A'&&ch<='Z')
//		{
//			for(i=(int)ch;i<=(int)'Z';i++)
//				System.out.print((char)i+" ");
//			
//		}
//		else
//			System.out.println("error");
		/*
		
		Scanner Input = new Scanner(System.in);
		
		int Num1 = 0;
		int Num2 = 0;
		
		System.out.print("첫번째 숫자를 입력하세요(양수):");
		Num1 = Input.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요(양수):");
		Num2 = Input.nextInt();
		int i=0;
		int j=0;
		
		for(i=1;i<=Num1;i++)
		{
			for(j=1;j<=Num2;j++)
			{
				System.out.print(i*j+" ");
			}
			System.out.println("\n");
		}*/
		char c1 = 'f';
		char c2 = 'g';
		
		
		if(c1>c2)
			System.out.println("c1 > c2");
		else if(c1==c2)
			System.out.println("c1 = c2");
		else
			System.out.println("c1<c2");
		
	}
}

package c_control;

import java.util.*;

public class Ex03_두번째정수 {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);

		int A,B,C=0;
		while(true) {

		System.out.print("첫번째 정수를 입력하세요:");
		A=Input.nextInt();
		System.out.print("두번째 정수를 입력하세요:");
		B=Input.nextInt();
		System.out.print("세번째 정수를 입력하세요:");
		C=Input.nextInt();


		if((A>=1)&&(A<=100)&&(B>=1)&&(B<=100)&&(C>=1)&&(C<=100)) {
/*
			if(A>=B&&A<=C||A>=C&&A<=B)
				System.out.println(A);
			else if(B>=A&&B<=C||B>=C&&B<=A)
				System.out.println(B);
			else if(C>=A&&C<=B||C>=B&&C<=A)
				System.out.println(C);
			else
				System.out.println("error");
*/

			int a =(A>=B)?A:B; //A>=B, B>=A 판별하여 a에 저장 *차이점 : 비교하여 큰수를 저장
			int b = (A<=B)?A:B; //A<=B, B>=A 판별하여 b에 저장 *비교하여 작은수를 저장


			if(a<=C) {//저장한 a와 C와 비교하여 C보다 작을 경우 a출력
				System.out.println(a);

			}
			else if(b>=C){//저장한 b와 C를 비교하여 C보다 클경우 두번째 숫자이므로 b 출력
				System.out.println(b);

			}
			else//위의 경우를 제외할 경우 C이므로 C 출력
				System.out.println(C);
			
			
			

			




		}

		else
			System.out.println("error");


		}

	}

}

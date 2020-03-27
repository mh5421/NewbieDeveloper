package c_control;


import java.util.*;
public class Ex04_for문 {
	public static void main(String[] args) {

		//(1)
		/*
		Scanner Input = new Scanner(System.in);

		System.out.print("자연수 n을 입력하세요:");
		int n=0;

		n=Input.nextInt();



		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");

			}

			for(int k=1;k<=i;k++) {

				System.out.print(k);
			}
			System.out.println();
		}

		 */
		/*
		Scanner Input = new Scanner(System.in);

		System.out.print("자연수 n을 입력하세요:");
		int n=Input.nextInt();//자연수 n을 입력받아 저장한다.



		int num=1;//숫자를 출력하기 위한 변수를 1로 초기화
		for(int i=0; i<n;i++) { //입력받은 자연수 n만큼 줄수를 만드는 반복문
			for(int j=0;j<i;j++) { //공백을 출력하는 반복문
				System.out.print("\t");//공백 출력
			}
			for(int k=0;k<n-i;k++) { //숫자를 출력하는 반복문, 공백을 출력하는 반복문의 횟수와 숫자를 출력하는 반복문의 횟수가 자연수 n이 나와야한다.

				System.out.print(num++ +"\t"); //숫자를 출력하고 값을 1증가
			}
			System.out.println();


			}
		 */

		Scanner Input = new Scanner(System.in);

		System.out.print("높이 n을 입력하시오:");
		int n = Input.nextInt();
		System.out.print("높이 m을 입력하시오:");
		int m = Input.nextInt();

		int Num=1;
		if(n>0&&n+m<=200&&m>0) {
			for(int i=0; i<n;i++) {
				for(int j=0; j<m;j++){
					System.out.print(Num+++" ");
				}
				System.out.println();
			}
		}
	}

}

package e_method;

import java.util.*;

public class Ex05_연습2 {
	static char[][] ch;
	public static void main(String[] args) {
		
		 input();//1
		output();//7
		
		

	}//10
	
	/*
	 * 두 정수와 알파벳 문자 하나를 입력받기
	 * 예) 3 4 F
	 * 
	 */

	static void input() {//2
		Scanner input = new Scanner(System.in);
		System.out.print("두 정수와 알파벳 문자 하나를 입력->");
		int first = input.nextInt();
		int second = input.nextInt();
		char alpha = input.next().charAt(0);
		
		
		
		 makeSquare(first,second,alpha);//3
		

		
	}//6
	static void output() {//8
		//출력
		for(int i = 0;i<ch.length;i++) {
			for(int j = 0; j<ch[i].length;j++)
				System.out.print(ch[i][j]+" ");
			System.out.println();
		}
		
	
	}//9
	
	/*
	 * 입력받은 첫번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어
	 * 입력받은 문자로 시작하는 알파벳을 저장하세요
	 * F G H I
	 * J K L M
	 * N O P Q
	 */
	static void makeSquare(int first, int second, char alpha) {//4
		ch=new char[first][second];
	
		for(int i=0; i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				ch[i][j]=alpha++;
			}
		}
		

	}//5

}

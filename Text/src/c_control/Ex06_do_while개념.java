package c_control;

import java.util.*;
public class Ex06_do_while개념 {
	public static void main(String[] args) {
		String answer="";
		do {
		Scanner Input = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요:");
		int su = Input.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d \n",su,i,su*i);
		}
		System.out.println("다시 입력하시겠습니까?");
		 answer = Input.next();
		//if(answer.equals("N")||answer.equals("n"))
		//	break;
		
		}while(answer.equals("Y")||answer.equals("y"));
	}
}

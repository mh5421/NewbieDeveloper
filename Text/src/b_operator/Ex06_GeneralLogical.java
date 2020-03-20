package b_operator;

import java.util.Scanner;

/*
 *  논리연산자의 상태를 먼저 확인
 *  
 *  
 *  일바논리 : &&(and) ||(or)
 */
public class Ex06_GeneralLogical {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int 성적 = 75;
		char 태도 = 'A';


		//우등생 : 성적이 80점 이상이거나 태도가 'A' 조건
/*
		if(성적>=80 || 태도=='A')
			System.out.println("우등생");
		else
			System.out.println("노력하십쇼");


		//성적향상반 : 성적이 80점 이상이고 태도가 'A' 조건
		
		if(성적>=80 && 태도=='A')
			System.out.println("성정향상반입니다.");
		else
			System.out.println("성적향상반이 아닙니다.");

*/








		/*
		 *  [ 문제 1 ]
 			문자를 하나 입력받아서 그 문자가 대문자인지 소문자 인지 출력하기
		 */

		
		char ch;
		int temp=0;
		System.out.print("문자를 입력하세요:");
		ch=scan.next().charAt(0);
		
		temp= (int)ch;
		
		if(temp>=65&&temp<91)
			System.out.println("대문자");
		else if(temp>=97&&temp<123)
			System.out.println("소문자");
		



	}

}

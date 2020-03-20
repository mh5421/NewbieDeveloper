package b_operator;

import java.util.Scanner;

public class Ex09_Samhang2 {

	public static void main(String[] args) {
		// 학생 점수를 입력받으세요 80점 이상이면 "합격"출력 80점 미만이면 "불합격" 출력
		// -> 삼항연산자이용
		Scanner Input = new Scanner(System.in);	
		int Num = 0 ;
		String result;
		
		
		System.out.print("점수를 입력하세요:");
		Num = Input.nextInt();
			
		
		result=(Num>=80)? "합격":"불합격";
		System.out.println(result);
		
		
		
		
		
		

	}

}

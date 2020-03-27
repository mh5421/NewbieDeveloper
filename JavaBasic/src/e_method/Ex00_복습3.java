package e_method;

import java.util.*;

public class Ex00_복습3 {

	public static void main(String[] args) {
		int score[]=new int[3];
		score=input();
		calScore(score);

	}
	
	//입력받은 국영수 점수로 총점, 평균을 구하기 + 출력
	
	static void calScore(int score[]) {
		int total=0;
		for(int i=0;i<3;i++) {
			total+=score[i];
		}
		System.out.println("총점:"+total);
		System.out.println("평균:"+(double)total/3);
		
		
		
	}
	static int[] input() {
		//int kor=0,eng=0,math=0;
		int score[]= new int[3];
		Scanner Input = new Scanner(System.in);
		System.out.print("국영수 점수를 입력하세요:");
		for(int i=0;i<score.length;i++) {
			score[i]=Input.nextInt();
		}
		
		return score;
	
		
		
	}

}

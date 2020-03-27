package c_control;


import java.util.*;
public class Ex03_if_성적 {

	public static void main(String[] args) {
		//0. 국,영,수 점수입력받아서 총점,평균 출력
		//1. 평균을 보고 평균에 따른 학점(A~F) 출력 90점이상A, 90~81=B, 80~71=C, 70~61=D, 나머지 F
		//*** if문 이용
		
		Scanner Input = new Scanner(System.in);
		
		int kor, eng, math , total= 0;
		double avg=0;
		System.out.print("국어 점수를 입력하세요 : ");
		kor=Input.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng=Input.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math=Input.nextInt();
		
		total = kor+eng+math;
		avg = (double)(kor+eng+math)/3;
		char hakjum;
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		if(avg>=90)
			hakjum = 'A';
		else if(avg>80)
			hakjum = 'B';
		else if(avg>70)
			hakjum = 'C';
		else if(avg>60)
			hakjum = 'D';
		else
			hakjum = 'F';
		
		System.out.println("학점 : "+hakjum);
		
		
		
		
	}

}

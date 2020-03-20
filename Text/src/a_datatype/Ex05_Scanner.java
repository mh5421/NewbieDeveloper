package a_datatype;

import java.util.Scanner; //내가 사용하고 있는 패키지 불러오는 단축키 컨트롤+쉬프트+o

public class Ex05_Scanner {

	public static void main(String[] args) {
		
		// 1 .국, 영, 수 점수를 저장할 변수를 선언하고 값을 지정
		int kor, eng, math;
		//입력받기
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어점수 입력: ");
		kor = input.nextInt();
		System.out.print("영어점수 입력: ");
		eng = input.nextInt();
		System.out.print("수학점수 입력: ");
		math = input.nextInt();
	
		
		// 2. 총점 구하기
		
		int result = kor+eng+math;
		
		
		
		// 3. 평균 구하기
		
		double avg =(double)result/3;
		
		//출력
		System.out.println("국어 : "+kor+"\n"+"영어 : "+eng+"\n"+"수학 : "+math);
		System.out.println("총점 : "+result);
		System.out.println("평균 : "+avg);
		
	}

}

/*
# next() 와 nextLine() 차이점

	next()는 \n \t 같은 문자를 만나면 그 전까지 읽는다
	nextLine()은 \n 개행문자까지 읽어서 한 줄임을 인식한다.
	
	[ 예 ] 오늘도 우리는 행복이 의무다
	
	next()는 4개의 토큰으로 인식하지만
	nextLine()은 한 줄로 인식한다.
*/
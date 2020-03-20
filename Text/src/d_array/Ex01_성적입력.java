package d_array;

import java.util.*;

/*
 * 학생 점수를 입력받아 평균과 총점을 출력
 * 
 * 
 * 입력 형식 : 80/88/77
 * 출력방식 : 
 *			총점 : xxxx
 *			평균 : xxxx
 */


public class Ex01_성적입력 {

	public static void main(String[] args) {


		Scanner Input = new Scanner(System.in);


		int jumsu[] = new int[3];
		int total = 0;
		double avg=0;
		String su = "";

		System.out.print("점수를 입력하세요(ex:80/88/77):");
		su = Input.nextLine();
		StringTokenizer st = new StringTokenizer(su,"/");
		
		for(int i=0;i<jumsu.length;i++) {
			jumsu[i]=Integer.parseInt(st.nextToken());
			total += jumsu[i];
		}
		
		System.out.println("총점: "+total);
		avg = (double)total/jumsu.length;
		System.out.println("평균: "+avg);









	}

}

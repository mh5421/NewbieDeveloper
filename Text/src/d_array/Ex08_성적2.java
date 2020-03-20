package d_array;

import java.util.*;

public class Ex08_성적2 {

	public static void main(String[] args) {
		// 학생수를 입력받기
		Scanner Input = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요:");
		int n=Input.nextInt();
		
		//정수를 저장할 변수(score)를 학생수만큼 선언
		
		int score[][]=new int[n][3];
		
		//입력

		Input.nextLine();
		for(int i=0;i<score.length;i++) {
			System.out.print((i+1)+"번째 학생의 성적을 입력하세요(ex:88/77/65):");
			String jumsu = Input.nextLine();
			StringTokenizer st = new StringTokenizer(jumsu,"/");
			
			
			for(int j=0;st.hasMoreTokens();j++) {
				score[i][j]=Integer.parseInt(st.nextToken());
				
			}
			
		}
		
		//출력
		int num=0;
		String gwamok = "";
		int total2[] = new int[score[0].length];
		for(int i=0;i<score.length;i++) {
			/*
			System.out.print((i+1)+"번째 학생의 점수:");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+" ");
			}*/
			System.out.print((i+1)+"번째 학생의 총점은 ");
			int total[]= new int[score.length];
			
			for(int j=0;j<score[i].length;j++) {
				total[i]+=score[i][j];	
				total2[j]+=score[i][j];
				
			}
			
			System.out.print(total[i]+"이고 평균은 "+(double)(total[i])/score[i].length+"입니다.");
			
			System.out.println();
			
			
		}
		System.out.println("국어과목 총점은 "+total2[num]+"이고 평균은 "+(double)(total2[num])/score.length);
		System.out.println("수학과목 총점은 "+total2[++num]+"이고 평균은 "+(double)(total2[num])/score.length);
		System.out.println("영어과목 총점은 "+total2[++num]+"이고 평균은 "+(double)(total2[num])/score.length);

	}

}

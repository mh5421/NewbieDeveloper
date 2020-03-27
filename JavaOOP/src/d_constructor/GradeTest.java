package d_constructor;

import java.util.*;

public class GradeTest {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print("처리하려는 점수의 갯수:");
		int n=Input.nextInt();
		Input.nextLine();
		
		int jumsu[]= new int[n];
		
		System.out.print("점수를 입력하세요(ex-> 20,30,40,50):");
		String jum = Input.nextLine();
		StringTokenizer st = new StringTokenizer(jum,",");
		for(int i=0;i<jumsu.length;i++) {
			jumsu[i] = Integer.parseInt(st.nextToken());
		}
		GradeExpr ge = new GradeExpr(jumsu);
		
		System.out.print("점수들 : ");
		for(int i=0;i<ge.jumsu.length;i++) {
			System.out.print(ge.jumsu[i]);
			if(i!=ge.jumsu.length-1)
				System.out.print(", ");
		}
		System.out.println();
		System.out.println("총점: "+ge.getTotal());
		System.out.println("평균: "+String.format("%.2f", ge.getAverage()));
		System.out.println("최고 점수: "+ge.getGoodScore());
		System.out.println("최저 점수: "+ge.getBadScore());
		
	}

}

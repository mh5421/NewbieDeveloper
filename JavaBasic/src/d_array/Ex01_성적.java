package d_array;


import java.util.*;

public class Ex01_성적 {
	public static void main(String[] args) {
		
		int num[] = new int[6];
		
		Scanner Input = new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
		System.out.print(num.length+"명의 점수를 입력해주세요("+(i+1)+"):");
			num[i]=Input.nextInt();
			
		}
//		num[0]=90;
//		num[1]=88;
//		num[2]=89;
//		num[3]=70;
//		num[4]=77;
//		num[5]=99;
				
				
		//배열 초기화
				//int kor[] = new int[] {90,88,89,70,99};
		int total=0;
		double avg =0;
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
			total += num[i];
		}
		System.out.println("총점:"+total);
				
		avg = (double)total/num.length;
		System.out.println("평균:"+avg);
		

	}

}

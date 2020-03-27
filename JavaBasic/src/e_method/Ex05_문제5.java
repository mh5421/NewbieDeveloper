package e_method;

import java.util.*;

public class Ex05_문제5 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("후보자 수를 입력하세요(후보의 범위 1~10):");
		int N = Input.nextInt();
		if(N<1||N>10) {
			System.out.println("error");
			return;
		}

		Input.nextLine();
		System.out.println("투표 결과를 입력하세요(투표 횟수 1~100):");
		String result = Input.nextLine();
		StringTokenizer st = new StringTokenizer(result ,",");
		
		if(st.countTokens()>100) {
			System.out.println("error");
			return;
		}


		int votes[] = new int[st.countTokens()];
		for(int i=0;st.hasMoreTokens();i++) {
			votes[i]=Integer.parseInt(st.nextToken());
		}
		//System.out.println(votes.length);
		int[] result2 = solution(N,votes);


		
		if(result2[1]!=0)
		{
			for(int i=0;i<result2.length;i++) {
				System.out.print(result2[i]);
				if((i+1)==result2.length)
					break;

				System.out.print("번과 ");
			}
			System.out.print("번 후보가 공동으로 가장 많은 표를 받았습니다.");
		}
		else {
			System.out.println(result2[0]+"번 후보가 가장 많은 표를 받았습니다.");
		}








	}
	static int[] solution(int N, int[] votes){
		int num[]=new int[N];//방번호+1번방 후보의 투표받은 횟수를 저장하는 배열
		int max=0;//최다득표 비교를 위한 방번호 변수
		//int same[] = new int[num.length]; //최다득표가 중복일 경우 오름차순 정렬하기 위한 배열
		int sameNum = 0;
		for(int i=0;i<votes.length;i++) {//투표받은 횟수를 각 번호방에 저장한다.
			if(votes[i]==i+1) {
				num[i]++;
			}
			else
				num[votes[i]-1]++;
		}

		for(int i=0;i<num.length;i++) {//최다득표를 찾는다.
			
			if(num[i]>max) {
				max = i;
			}
		}
		for(int i=0;i<num.length;i++) {//최다득표가 중복일 경우를 찾는다.
			if(num[i]==num[max]) {
				//same[sameNum++]=i+1;		
				sameNum++; //공동우승 인덱스 증가
			}
		}

		int same[] = new int[sameNum];
		for(int i=0, count=0;i<num.length;i++) {
			if(num[i]==num[max])
			{
				same[count++]=i+1;
			}
		}
		return same;

/*
		if(sameNum>1) {
			for(int i=0;i<sameNum;i++) {//최다득표가 공동일 경우 후보를 오름차순으로 정렬
				for(int j=0;j<i;j++) {
					if(same[i]<same[j]) {
						int temp = same[i];
						same[i]=same[j];
						same[j]=temp;
					}
				}
			}
			return same;
		}*/


	


	}

}

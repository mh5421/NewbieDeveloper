package d_array;


import java.util.*;
public class Ex02_최대값찾기 {

	public static void main(String[] args) {
		
		String su = "";
		
		System.out.print("비교할 숫자를 입력하세요(ex:80/61/92/35/56):");
		Scanner Input = new Scanner(System.in);
		
		su = Input.nextLine();
		
		StringTokenizer st = new StringTokenizer(su,"/");
		
		int score[] = new int[st.countTokens()];

		int max = 0;//max 변수 선언
		System.out.println(st.nextToken());
		for(int i=0; st.hasMoreTokens();i++) {//배열이 끝날때까지 반복
			score[i]= Integer.parseInt(st.nextToken());
			System.out.println(score[i]);
			if(score[i]>max) {//score의 i번째 방 값과 max값 비교해서 i번째 방 값이 더 크면
				max=score[i]; //max값에다가 i번째방값을 넣는다.
			}
		}
		System.out.print("가장 큰 값은:"+max); 
		
	}

}

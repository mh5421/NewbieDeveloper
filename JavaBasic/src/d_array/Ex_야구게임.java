package d_array;


import java.util.*;
public class Ex_야구게임 {
	public static void main(String[] args) {
		int baseball[]=new int[3];
		int answer[] = new int[3];

		Scanner Input = new Scanner(System.in);

		int strike = 0 ,ball=0;

		//1. 임의의 수를 3개 baseball에 저장
		// - 중복수 배제(###)
		for(int i=0;i<baseball.length;i++) {

			baseball[i]=(int)(Math.random()*10);

//				for(int j=0;j<i;j++) {
//					if(baseball[i]==baseball[j]) {
//						baseball[i]=(int)(Math.random()*10);
//						j--;
//					}
//				}

			for(int j=0; j<i;j++) {
				if(baseball[i]==baseball[j]) {
					i--;
				}
			}
			
			System.out.print(baseball[i]+" ");
		}
		END:
			for(int k=0;k<5;k++) {
				//2. 사용자 입력값 받기

				System.out.print("숫자를 입력하세요(ex:1/4/5):");
				String temp = Input.nextLine();

				StringTokenizer st = new StringTokenizer(temp,"/");
				for(int i=0;st.hasMoreTokens();i++) {
					answer[i]=Integer.parseInt(st.nextToken());
					


				}


				//3.값비교

				for(int i=0; i<3;i++) {
					for(int j=0;j<3;j++) {
						if(baseball[i]==answer[j]) {
							if(i==j) {
								strike++;

							}else
								ball++;
						}

					}
				}

				//4. strike와 ball 출력
				System.out.println("스트라이크: "+strike+"/볼: "+ball);
				if(strike==3) {
					System.out.println("3스트라이크 아웃!!!");
					break END;
				}

			}
	}


}

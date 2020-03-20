package temp;

import java.util.*;
public class Test0318 {

	public static void main(String[] args) {
		//1부터 3까지 출력

		//		for(int i=1;i<4;i++) {
		//			System.out.print(i+" ");
		//		}

		// 3행 2열 행렬을 가상하고 번호붙이기
		/*
		for(int i = 0;i<3;i++) {
			for(int j =0; j<2; j++) {
				System.out.printf("%d, %d ",i,j );
			}
			System.out.println();

		}
		 */



		//주사위의 합
		/*
		Scanner Input = new Scanner(System.in);


		System.out.print("합을 입력하세요:");
		int total = Input.nextInt();

		if(total>=2&&total<=12) {


			for(int i=1;i<7;i++) {				
				for(int j=1;j<7;j++) {
					if(total==i+j) {
						System.out.print(i+" "+j);
						System.out.println();
					}

				}

			}

		}*/
		/*
		int i ,j =0;
		for(i=0;i<5;i++) {
			for(j=0;j<4;j++) {
				if(i==2&&j==1)break;
				if(i==3&&j==2)continue;

				//System.out.println("i = "+i+",j="+j);
			}
		}

		System.out.println("i = "+i+",j="+j);
		 */
		/*
		int i,j = 0,k=0;
		OUTER : for(i=0;i<10;i++)
			MIDDLE : for(j=0;j<3;j++)
				INNER : for(k=0;k<4;k++)
					if(i==4&&j==2)break OUTER;

			System.out.println(i);
			System.out.println(j);
			System.out.println(k);

		 */
		/*
		Scanner Input = new Scanner(System.in);

		System.out.println("n을 입력하세요:");
		int n=Input.nextInt();
		if(n>0&&n<=100) {
			for(int i=1; i<=n;i++)
			{
				int garo=0+i;

				System.out.println();
				for(int j=1;j<=n;j++) {
					System.out.print(garo+"\t");
					garo+=n;
				}
			}
		}
		 */


		Scanner Input = new Scanner(System.in);

		System.out.print("높이 n을 입력하세요:");
		int n=Input.nextInt();
		System.out.print("높이 m을 입력하세요:");
		int m=Input.nextInt();
		int num=0;

		int su=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {		

				for(int k=1;k<=m;k++) {
					System.out.print(num+"\t");
					num-=1;
				}
				System.out.println();
				num=num+m;
			}
			else {

				for(int j=1;j<=m;j++) {

					num++;
					System.out.print(num+"\t");
					if(num%m==0) {
						System.out.println();
						num=num+m;

					}			
				}
			}


		}
	}
}







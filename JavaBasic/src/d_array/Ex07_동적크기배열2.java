package d_array;

public class Ex07_동적크기배열2 {

	public static void main(String[] args) {

		int a[][]=new int[][]{{3,-5, 12, 3, -21}, {-2, 11, 2, -7, -11}, {21, -21, -35, -93, -11}, {9, 14, 39, -98, -1}};


		int sum[]=new int[a.length];
		int sum2[] =new int[a[0].length];


		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum[i]+=a[i][j];//행의 더하기
				sum2[j]+=a[i][j];//열의 더하기
			}
		}




		//최대값 비교
		int max=0;//가장 큰행
		for(int i=0;i<sum.length;i++) {//
			if(sum[i]>sum[max]) {
				max=i;
			}
		}
		int max2=0;//가장 큰 열
		for(int i=0;i<sum2.length;i++) {
			if(sum2[i]>sum2[max2]) {
				max2=i;
			}
		}
		System.out.print("가장 큰 행:"+max);
		System.out.println();
		System.out.print("가장 큰 열:"+max2);


	}
}

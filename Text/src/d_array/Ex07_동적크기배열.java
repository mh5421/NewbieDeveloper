package d_array;

public class Ex07_동적크기배열 {

	public static void main(String[] args) {
		int a[][]=new int[][]{{3,5},{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};


		//더하기

		int sum[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int total=0;
			for(int j=0;j<a[i].length;j++) {

				total+=a[i][j];
				System.out.println("토털 : "+total);
				sum[i]=total;				
			}
			System.out.println();

		}


		//비교
		int max=0;//가장 큰행
		for(int i=0;i<sum.length;i++) {
			if(sum[i]>sum[max]) {
				max=i;
				
			}


		}

		//출력

		System.out.print("가장 큰 값은:"+max);

	}

}

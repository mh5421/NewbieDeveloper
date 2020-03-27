

public class Test {

	public static void main(String[] args) {
		int a[][]=new int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};

		int sum1[]=new int[a.length];

		int max=0;
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				sum1[i]+=a[i][j];
			}
			//System.out.print(sum1[i]+" ");
		}

		for(int h=0;h<sum1.length;h++)
		{
			if(sum1[h]>max)
			{
				max=sum1[h];
			}
		}

		System.out.print(max+" ");

	}

}

package temp;

import java.util.Scanner;

public class years {
	public static void main(String agrs[])
	{
		int year = 0;
		while(true) {

			System.out.print("년도를 입력하세요:");
			Scanner scan = new Scanner(System.in);
			year = scan.nextInt();
			
			if(year%4==0&&year%100!=0||year%400==0)
				System.out.println("윤달입니다.");

			else
				System.out.println("윤달이 아닙니다.");

		}




	}
}





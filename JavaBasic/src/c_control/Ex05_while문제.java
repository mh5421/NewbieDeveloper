package c_control;
import java.util.*;

public class Ex05_while문제 {
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		String N = Input.nextLine();
		int jjaksu=0;
		int holsu=0;
		
		StringTokenizer str = new StringTokenizer(N);
		
		while(str.hasMoreTokens()) {
			String temp = str.nextToken();
			int Num = Integer.parseInt(temp);
			
			if(Num%2==0)
			{
				jjaksu++;
				
			}
			else{
				holsu++;
			}
			
			
		}
		System.out.println("짝수 : "+jjaksu);
		System.out.println("홀수 : "+holsu);
		
		
		
		
		
		
	}
	
	
	
}

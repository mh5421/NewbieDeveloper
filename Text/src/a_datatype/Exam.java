package a_datatype;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		//나이와 키를 입력받아서 출력
		
		Scanner scan = new Scanner(System.in);
		
		int age;
		double height;
	
		
		String name;
		
	
		
		System.out.print("나이를 입력하세요 :");
		age = scan.nextInt();
		
		System.out.print("키를 입력하세요 :");
		
		height = scan.nextDouble();
		
		System.out.print("이름을 입력하세요 :");
		scan.nextLine();//초기화
		name = scan.nextLine();
		
		System.out.println("이름 :"+name+"\n"+"나이 :"+age+"\n"+"키 :"+height);

	}

}

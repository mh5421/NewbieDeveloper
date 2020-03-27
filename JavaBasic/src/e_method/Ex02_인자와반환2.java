package e_method;

public class Ex02_인자와반환2 {

	public static void main(String[] args) {
		
		int sum =add();
		//출력
		System.out.println("출력:"+sum);
		

	}

	static int add() { 
		//데이터 입력
		int a =10, b=20;
		//계산
		int sum = a+b;
		
		return sum;
		//return -> 프로그램 흐름을 반환시킴
		//			단 하나의 변수를 반환할 수 있다
		
		//void -> return 하는 값의 자료형이 아무것도 없다는 뜻
		

	}

}

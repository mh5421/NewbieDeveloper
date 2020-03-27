package e_method;

public class Ex02_인자와반환 {

	public static void main(String[] args) {
		//데이타 입력
		int a = 10, b=20;
		add(a,b);

	}

	static void add(int a, int b) {
		//입력받은 데이터의 합을 구해서 출력
		
		int sum = a+b;
		
		System.out.println(sum);
		
	}

}

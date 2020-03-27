package e_method;

public class Ex04_변수의범위 {
	//멤버변수 - 메소드 밖의 클래스안에 있는 변수
	static int a,b;
	static int sum=0;
	//지역변수 - 메소드 안에 있는 변수들
	
	//멤버변수와 지역변수가 겹칠경우 우선순위는 지역변수가 더 높다.
	
	public static void main(String[] args) {
		//데이타 입력
		int a=10;
		b=20;
		
		add();
		System.out.println(sum);
	}

	static void add() {
		//입력받은 데이터의 합을 구해서 출력
		
		sum = a+b;
		
		
	}
}

package e_method;

// [추가] 스택에 대한 개념 설명

public class Ex00_복습 {
	public static void main(String[] args) {
			System.out.println("A");
			test();
			System.out.println("B");
	}
	static void test() {
			System.out.println("C");
			sample();
			imsi();
			System.out.println("D");			
	}	
	static void sample() {
		System.out.println("E");	
	}
	static void imsi() {
		System.out.println("F");
	}
}


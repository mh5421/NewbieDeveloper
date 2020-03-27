package e_method;

public class Ex03_1CallByValue {

	/**
	 *  메소드의 인자가 기본형인 경우
	 *  		-> 값만 복사됨
	 *  		call by value
	 */
	public static void main(String[] args) {
		 int a = 10, b = 20;
		 add(a, b);
		 System.out.println("A=" + a + ", B=" + b );
	}
	
	static void add( int a, int b) {
		a+= b;
		System.out.println("A=" + a + ", B=" + b );
	}

}

package f_exception;

public class Ex_연습 {
	
	public static void main(String[] args) {
		try {
			method();
		}
		catch(Exception ex) {
			System.out.println("예외처리");
		}
	
	}
	static void method() throws Exception {
		throw new Exception();
	}

}

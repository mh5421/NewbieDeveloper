package a_basic;

public class Main {

	public static void main(String[] args) {
		//변수 선언
		//객체 생성(메모리에 확보)
		Student s = new Student();
		
		int a = 10;
		int b = 10;

		
		s.kor = 70;
		s.eng = 88;
		s.math = 99;

		
		System.out.println(s.calTotal());
		
		
		System.out.println(s.calAvg());
		
		
	
		
	}


}

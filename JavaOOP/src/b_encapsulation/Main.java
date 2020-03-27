package b_encapsulation;



public class Main {

	public static void main(String[] args) {

		Student s = new Student();
		
		int a = 10;
		int b = 10;

		
		s.setKor(70);
		s.setEng(88);
		s.setMath(99);
		s.setName("홍길동");

		System.out.println(s.getName());
		System.out.println(s.getKor()+"/"+s.getEng()+"/"+s.getMath());
		System.out.println(s.calTotal());
		System.out.println(s.calAverage());
		
	}
	/*
	 * [ 결론내기 ] 캡슐화란??? 
	 */
}

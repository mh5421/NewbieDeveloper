
public class Main {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 24;
		double height = 190.99;
		
		
		
		method(name,age,height);

	}
	static void method(String name,int age, double height) {
		//출력
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("키:"+height);
		
	}

}

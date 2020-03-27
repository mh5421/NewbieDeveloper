package e_method;

public class Ex03_3CallByString {
	public static void main(String[] args) {
		//String은 참조형임에도 불구하고 특성상 new가 붙으면 heap에 새로운 주소를 만든다. call by reference이지만 별도의 예외
		String a = new String("안녕");
		String b = new String("하이");
		add(a,b);
		System.out.println("A="+a+",B="+b);
	}
	static void add(String a, String b) {
		a+=b;
		System.out.println("A="+a+",B="+b);
}
}

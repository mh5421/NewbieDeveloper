package h_inherit;


//Umma : 부모클래스
//Ddal : 자식클래스

public class Ddal  extends Umma{
	
	public Ddal() {
		System.out.println("자식의 기본생성자");
	}
	
	public void gene() {
		System.out.println("자식은 자식이다.");
	}
	public void study() {
		System.out.println("딸은 학생");
	}
}

package h_inherit;

/*
	overloading : 동일한 함수명으로 인자의 자료형과 개수 다른 함수들
	overriding : 상속관계에서 부모 자시간에 완전히 동일한 함수(인자와 반환값까지)
	

*/
public class Test {

	public static void main(String[] args) {

		//1. 각각의 클래스 생성
		
//		Umma u = new Umma();
//		u.gene();
//		u.job();
//		
//		Ddal d = new Ddal();
//		d.gene();
//		d.study();
//		
//		//*
//		d.job();
		
		//2. 부모 변수에 자식 객체 생성
//		
//		Umma dal = new Ddal(); //변수 자체가 엄마만 참조한다.
//		//dal.study();
//		dal.job();
//		//*
//		dal.gene();//변수명이 같다면 
//		
		
		
		//3. 객체임을 확인
//		Ddal d = new Ddal();
//		
//		if(d instanceof Ddal) {//instanceof : 어떤 클래스와 객체간의 관계를 물어보고 싶을때 사용
//			System.out.println("딸 객체");
//		}
//		if(d instanceof Umma) {
//			System.out.println("부모 객체");
//		}
//		
//		

		//4. 형변환
		// (casting) : 기본형 / 기본형과 상속관계인 클래스
		
		Umma a = new Umma();
		
		//Ddal b = (Ddal)a;
		
		Ddal c = new Ddal();
		Umma d = (Umma)c; // up-casting
		Ddal e = (Ddal)d; // down-casting
		
		
	}

}

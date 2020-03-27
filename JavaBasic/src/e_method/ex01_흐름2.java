package e_method;

public class ex01_흐름2 { //함수에 static을 붙이지 않고 사용하는 방법

	public static void main(String[] args) {
		System.out.println("main 시작");
		
		ex01_흐름2 ex = new ex01_흐름2();//클래스를 메모리에 올림
		ex.method();//클래스를 메모리에 올린 경우 메소드를 불러올수 있다.
		
		System.out.println("main 끝");
	}
	
	void method() {
		System.out.println("method 실행");
		
	}

}





/*
	명명 규칙
		1. 문자 + 숫자 + _ + $ 조합
		2. 길이 제한 없음
		3. 첫글자에 숫자만 아니면 됨
		4. 대소문자 구별
		5. 예약어(keyword) 불가
	권장 사항
		- 클래스명의 첫글자는 대문자시작
		- 변수와 메소드명은 소문자로 시작
		- 라벨명은 전부 대문자
		- 패키지명은 전부 소문자
		
*/
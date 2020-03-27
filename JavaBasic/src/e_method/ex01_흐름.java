package e_method;

public class ex01_흐름 {

	public static void main(String[] args) {
		System.out.println("main 시작");
		
		method();
		
		System.out.println("main 끝");
	}
	
	static void method() {
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
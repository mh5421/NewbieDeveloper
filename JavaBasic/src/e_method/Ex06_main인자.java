package e_method;

public class Ex06_main인자 {

	public static void main(String[] args) {
		
		//server connect
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		System.out.println("server connect");
	}
}
/*
	직접 운영체제에서 자바 실행할때
	(1) 자바 컴파일(Hello.java -> Hello.class)
		javac Hello.java
	(2) 자바 실행
		java Hello //java라는 명령어로 확장자를 뺀 파일명을 기술
	
	
	문자열을 입력하며 실행(main함수 호출후 안에 있는 다른 데이터를 입력하며 실행)
		ex)java Ex06_main인자 서버ip 서버계정 서버비밀번호
*/
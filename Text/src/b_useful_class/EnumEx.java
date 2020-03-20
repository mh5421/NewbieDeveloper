package b_useful_class;

import java.util.Scanner;

enum Size{//개발자가 소스를 읽기 편하게 만들어주는
	SMALL,	
	MEDIUM, 
	LARGE, 
	EXTRA_LARGE
}

public class EnumEx {
	public static void main(String[] args) {
		
		// Small : 1,  Medium : 2, Large : 3 이라고 지정하고  switch 구동
		// 다른 개발부에서는 1이 무엇인지 확인 해야 함.
				
		Size size = Size.LARGE;	
		switch( size ) {
		case SMALL 		: System.out.println("작은거"); break;
		case MEDIUM 	: System.out.println("중간거"); break;
		case LARGE 		: System.out.println("큰거"); break;
		case EXTRA_LARGE : System.out.println("완전큰거"); break;
		}
		
		// 화면을 클릭한다고 가상해야 이해
		
	}
}

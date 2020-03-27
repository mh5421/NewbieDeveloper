package e_method;


/*
 * 	오버로딩(overloading)
 * 		- 인자의 자료형과 갯수가 다른 동일한 함수들
 * 		- 리턴형만 다른 함수는 overloading이 아닙니다. 반드시 인자의 자료형과 갯수가 달라야 합니다.
 */



public class Ex07_overloading {

	public static void main(String[] args) {
		//각각의 자료형 변수의 값에 "화이팅!!" 더하여 출력
		String str = new String("홍길동");
		StringBuffer sb = new StringBuffer("홍길서");
		char ch[] = new char[]{'홍','길','남'};
		
		fighting(str);
		fighting(sb);
		fighting(ch);

	}
	static void fighting(String str) {
		System.out.println(str+"화이팅!!");
	}
	static void fighting(StringBuffer sb) {
		System.out.println(sb.append("화이팅!!"));
	}
	static void fighting(char[] ch) {
		StringBuffer st = new StringBuffer();
		for(int i=0;i<ch.length;i++)
			st.append(ch[i]);

		System.out.println("화이팅!!");
	}

}

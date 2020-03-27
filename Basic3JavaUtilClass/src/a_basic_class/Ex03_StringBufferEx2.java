package a_basic_class;

public class Ex03_StringBufferEx2 
{
	public static void main(String[] args)
	{		
		StringBuffer   sp = new StringBuffer( "ABCDEFGHIJK");
		
		sp.reverse();								// 문자열을 역순으로 나열
		System.out.println( sp );
		
		sp.replace ( 0, 5, "Hello");	// 0번째 부터 5번째 전의 문자열을 "Hello"로 변경
		System.out.println( sp );
		
		sp.setCharAt(  5 , '~');				// 5번째 문자를 '~'로 변경
		System.out.println( sp );
		
		sp.insert ( 6, "Java");				// 6번째에 "Java" 문자열을 삽입
		System.out.println( sp );
		
		sp.delete(10,15);						// 10번째부터 15번째 전의 문자열을 제거
		System.out.println( sp );
		
		sp.append("ssem!!");				// 문자열 뒤에 "ssem!!" 추가
		System.out.println( sp );
	}
}

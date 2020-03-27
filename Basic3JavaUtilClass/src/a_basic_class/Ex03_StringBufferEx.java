package a_basic_class;

public class Ex03_StringBufferEx
{
	public static void main(String[] args) 
	{
		StringBuffer   a = new StringBuffer( "Hello");
		StringBuffer   b = new StringBuffer( "Hello");
		
		if(  a == b ) System.out.println("a와 b는 같은 객체입니다.");
		else System.out.println("a와 b는 다른 객체입니다.");

		if(  a.equals( b ) ) System.out.println("a와 b는 같은 값을 가집니다.");
		else System.out.println("a와 b는 다른 값을 가집니다.");
		
	}
}

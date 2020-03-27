package a_basic_class;

public class Ex02_StringPlusEx 
{
	public static void main(String[] args)
	{
		String  a = "하이";
		
		String  b = "자바님, " + a ;
		System.out.println( b );
		
		a += "헬로우";		
		System.out.println( a );
		
		String c = a + 1004;
		System.out.println( c );
	}
}

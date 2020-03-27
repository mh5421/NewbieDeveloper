package e_method;

public class Ex_연습 {

	static void method( String i, String j) {

	     i += j;

	     System.out.println("i = " + i + " , j = " + j );

	}

	public static void main ( String  [] args ) {

	     String i = "안녕", j = "자바";

	     method( i, j );

	     System.out.println("i = " + i + " , j = " + j );

	}
}


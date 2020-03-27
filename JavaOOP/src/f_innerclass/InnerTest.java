package f_innerclass;

class Outer
{
	class Inner
	{
		 void naJabara(){
			System.out.println("잡아보슈~~");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		
		in.naJabara();
		
		//Outer.Inner.naJabara();
		
	}
}



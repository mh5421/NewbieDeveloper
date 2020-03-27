package j_final;

 class Parent{
	 final String field = "부모님꺼";
	 final public void jib (){
	  System.out.println("부모님이 만드신거");
	 }
	} 
class Child extends Parent{
	public Child() {
		//field = "내꺼";
	}
//	public void jib (){
//		  System.out.println("물려받아서 탕진");
//	}
}

public class Test {
	 public static void main(String[] args) {
		 Child p = new Child();
		  System.out.println(p.field);
		  p.jib(); 
		  Parent p2 = new Child();
		  
	 }
	}

package b_operator;

/**
 *  증가(++)/감소(--) 연산자
 */
public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		// [1]
		/*
		System.out.println("a="+a+",b="+b);
		System.out.println("a="+a+1 +",b="+ b+1); // 문자열로 인식하여 51,71로 출력
		System.out.println("a="+(a+1)+",b="+(b+1));//괄호로 먼저 계산하고 출력
		
		// [2]
		
		a++;//a = a+1; 
		b--;//b = b-1;
		
		System.out.println("a="+a+",b="+b);
		
		
		System.out.println("a="+(++a)+",b="+--b);
		System.out.println("a="+a+",b="+b);
		*/
		
		//[3] 증감 연산자의 위치로 인해 결과가 많이 달라진다. 중요요소
		/*
		int result = ++a;
		System.out.println(result);//6
		
		int result2 = b--;
		System.out.println(result2);//7
		System.out.println(b);
		*/
		//[4]
		
		System.out.println("a="+ ++a +",b=" + --b); //6,6
		System.out.println("a="+ a++ +",b=" + b--); //6,6
		System.out.println("a="+a+",b="+b);//7,5


	}

}

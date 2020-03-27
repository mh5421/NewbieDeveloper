package b_encapsulation;
import java.util.*;


public class CalculatorTest {

	public static void main(String[] args) {
		
		CalculatorExpr calEx = new CalculatorExpr();
		Scanner Input = new Scanner(System.in);
		
		while(true) {
		
		System.out.print("숫자를 두개 입력하세요:");
		
		
		calEx.setNum1(Input.nextInt());
		calEx.setNum2(Input.nextInt());
		
		System.out.println("추출된 숫자:"+calEx.getNum1()+","+calEx.getNum2());
		System.out.println("덧셈 : "+calEx.getAddition());
		System.out.println("뺄셈 : "+calEx.getSubtraction());
		System.out.println("곱셈 : "+calEx.getMultiplication());
		System.out.println("나눗셈 : "+calEx.getDivision());
		System.out.println("나머지: "+calEx.getRemainder());
		Input.nextLine();
		char ch=' ';
		RETURN:
		while(true) {
		
		System.out.println("계속 하시겠습니까?(Y or N)");
		ch = Input.nextLine().charAt(0);
		
		if(ch=='N') {
			System.out.println("프로그램이 종료 되었습니다.");
			System.exit(0);
		}
		else if(ch=='Y'){
			
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
			break RETURN;
			}
		}
		
		
		}
		
	}

}

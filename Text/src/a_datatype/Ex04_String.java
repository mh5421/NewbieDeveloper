package a_datatype;

/* [주의] 클래스명을 절대로 String 이라고 하면 안된다 */
/* 
 * String은 기본 데이타 타입이 아닌 참조형 데이타 타입이다.
 * 참조형은 new를 이용하여 객체를 생성해야 한다.
 */
public class Ex04_String {

	public static void main(String[] args) {
		

		//String a = new String("홍길동");
		//String b = new String("홍길동");
		String a = "홍길동";
		String b = "홍길동"; //같은 주소값을 참조하는  축약형
		
		
		if(a==b) {//메모리의 구조상 참조형은 스택과 다르게 비교하여야 한다.
			System.out.println("동일");
		}
		else {
			System.out.println("다르다");	//
		}
		
		if(a.equals(b)) {//참조형 문자형을 비교할때는 equals()를 써야한다.
			System.out.println("동일2");
		}
		else {
			System.out.println("다르다2");	//
		}
		
		
		
		
		
	}

}

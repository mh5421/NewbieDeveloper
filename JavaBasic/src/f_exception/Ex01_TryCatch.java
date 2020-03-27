package f_exception;

public class Ex01_TryCatch {

	public static void main(String[] args) {
		String msg[]= new String[] {"행복하자","끝내자","맛난거먹자"};
		try {
			for(int i=0; i<=msg.length;i++) {
				System.out.println(msg[i]);
			}
			return;
		}
	
		catch(Exception ec) {
			System.out.println("예외처리:"+ec.toString());
		}finally{
			System.out.println("무조건 실행 구문");
		}

		System.out.println("프로그램 정상 종료");
	}

}

/*
 * 	오류
 * 		- 에러 : 심각한 오류(ex: 컴파일오류)
 * 		- 예외 : 심각하지 않은 오류
 * 				-> 예외처리 : 프로그램 정상 종료를 위해
 * 			(1) try - catch (예외를 잡으세요)
 * 				try {
 * 					예외가 발생할 구문
 * 				} catch(Exception ex){
 * 					예외가 발생한 후의 구문
 * 				} finally{
 * 					예외관계없이 무조건 실행 구문
 * 				}
 * 
 * 			(2) 메소드 뒤에 throws (예외를 던지세요)
 * 				
 */	

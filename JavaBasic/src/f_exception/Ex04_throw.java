package f_exception;

public class Ex04_throw {

	public static void main(String[] args) {

		try {
			readArray();
		} catch (MyException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상종료");

	}
		
	//-----------------------------------------------------
	
	
	static void readArray() throws MyException {
		String msg[]= new String[] {"행복하자","끝내자","맛난거먹자"};
		try {
			for(int i=0; i<=msg.length;i++) {
				System.out.println(msg[i]);
			}
		}
		catch(Exception e){
			//System.out.println("예외발생:"+e.getMessage());
			throw new MyException();
			
		}
			
	}

}

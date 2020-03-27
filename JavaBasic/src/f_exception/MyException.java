package f_exception;

public class MyException extends Exception{//영역별로 보기위해 만드는 예외
	public String getMessage() {
		return "맨날 실수하는 예외: 배열범위 잘 봐라";
	}
}

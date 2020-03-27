package c_control;


import java.util.*;

public class Ex01_if_주민번호 {
	public static void main(String args[]) {
		
		String id = "";
		
		char gender;
		
		Scanner Input = new Scanner(System.in);
		
		//(1)
		//gender 변수에 값이 1이면 '남성'출력
		//그렇지 않고 gender 변수에 값이 2이면 '여성'출력
		
		//(2)
		//1이거나 3이거나 9이면 남자
		//2이거나 4기어나 0이면 여자
		
		
		/*
		if(gender == '1')
			System.out.println("남성");
		else if(gender=='2')
			System.out.println("여성");
		else
			System.out.println("잘못 입력하셨습니다.");
		*/
		System.out.print("주민번호를 입력해주세요:");
		id = Input.next();
		gender = id.charAt(7);
		
	
		
		
		if(gender=='1'||gender=='3'||gender=='9')
			System.out.println("남성");
		else if(gender=='2'||gender =='4'||gender=='0')
			System.out.println("여성");
		else
			System.out.println("잘못 입력하셨습니다.");
		
		//-----------------------------------------
		String age = id.substring(0, 2); //문자열을 받아오는 명렁어, (start번째부터 , end번째 앞까지)
		//문자열을 정수로 변환
		int nai = Integer.parseInt(age); //문자열을 숫자로 변환하는 함수
		
		//올해 연도구하기
		Calendar calendar = Calendar.getInstance(); //
		int year=calendar.get(Calendar.YEAR); //올해 연도를 받아온다.
		
		int age2=0;
		
		if(gender=='3'||gender=='4') {
			age2 = year -(2000+nai)+1;			
		}
		else if(gender=='1'||gender=='2') {
			age2 = year-(1900+nai)+1;
		}
		else if(gender=='9'||gender=='0')
			age2 = year -(1800+nai)+1;
		
	
		
		
		
		System.out.println("당신의 나이는"+age2+"입니다.");
		
		
		
	
		
		}
		
		
			
		
	}



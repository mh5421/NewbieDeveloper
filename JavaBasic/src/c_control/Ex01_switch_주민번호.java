package c_control;

import java.util.*;


public class Ex01_switch_주민번호 {

	public static void main(String[] args) {
		
		String id = "200316-4114124";
		
		Scanner Input = new Scanner(System.in);
		char chul = id.charAt(8);
		String home = "";
		switch(chul) {
		
		case '0':
			home="서울";
			break;
			
		case '1':
			home="인천/부산";
			break;
		case '2':
			home="경기도";
			break;
		case '9':
			home="제주도";
			break;
		default:
			home = "한국인";
			break;
	
			
			
			
		}
	
		System.out.println("출신지 : "+home);

	}

}

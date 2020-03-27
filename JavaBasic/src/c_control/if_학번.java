package c_control;


import java.util.*;

public class if_학번 {
	public static void main(String args[]) {
		
		
		String hakbun="2017111001";
		Scanner Input = new Scanner(System.in);
		
		while(true) {
		
		System.out.print("학번을 입력하세요(10자리):");
		hakbun = Input.next();
		
		Calendar calendar = Calendar.getInstance();
		String year = hakbun.substring(0, 4);
		char dangwa = hakbun.charAt(4);
		String hakgwa = hakbun.substring(5, 7);
		String colleage ="";
		String gwa="";
		boolean bool = true;
		
		
		if(Integer.parseInt(year)>calendar.get(Calendar.YEAR))
		{
			System.out.println("error");
			break;
		}
		if(dangwa =='1') {
			colleage="공대";
			
			if(hakgwa.equals("11"))
			{
				gwa="컴퓨터공학과";
				//System.out.println(hakbun+"는 "+year+"년도에 입학한 "+colleage+" 컴퓨터공학과 학생입니다.");
			}
			else if(hakgwa.equals("12"))
			{
				gwa="소프트웨어학과";
				//System.out.println(hakbun+"는 "+year+"년도에 입학한 "+colleage+" 소프트웨어학과 학생입니다.");
			}
			else if(hakgwa.equals("13"))
			{
				gwa = "모바일학과";
				//System.out.println(hakbun+"는 "+year+"년도에 입학한 "+colleage+" 모바일학과 학생입니다.");
			}
			else if(hakgwa.equals("22"))
			{
				gwa ="자바학과";
				//System.out.println(hakbun+"는 "+year+"년도에 입학한 "+colleage+" 자바학과 학생입니다.");
			}
			else if(hakgwa.equals("33"))
			{
				gwa = "서버학과";
				//System.out.println(hakbun+"는 "+year+"년도에 입학한 "+colleage+" 서버학과 학생입니다.");
			}
			else
			{
				System.out.println("error");
				bool = false;
				
			}
			
		}
		else if(dangwa =='2') {
			colleage="사회대";
			if(hakgwa.equals("11")) 
			{
				gwa = "사회학과";
				//System.out.println(hakbun+"는 "+year+"년도에 입학한 "+colleage+" 사회학과 학생입니다.");
			}
			else if(hakgwa.equals("22"))
			{
				gwa = "경영학과";
				//System.out.println(hakbun+"는 "+year+"년도에 입학한 "+colleage+" 경영학과 학생입니다.");
			}
			else if(hakgwa.equals("13")) {
				gwa = "경제학과";
				//System.out.println(hakbun+"는 "+year+"년도에 입학한 "+colleage+" 경제학과 학생입니다.");
			}
			else {
				System.out.println("error");
				bool = false;
			}
			
		}
		else {
			System.out.println("error");
			bool = false;
		}
		if(bool!=false)
			System.out.println(hakbun+"는 "+year+"년도에 입학한 "+colleage+" "+gwa+" 학생입니다.");
		
		
		}
		
	}

}

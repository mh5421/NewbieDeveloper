package c_control;


import java.util.*;

public class switch_학번 {
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
				System.out.println("학번입력을 다시 해주세요.");
				break;
			}
			if(dangwa =='1') {
				colleage="공대";
				switch(hakgwa) {
				case "11":
					gwa="컴퓨터공학과";
					break;
				case "12":
					gwa="소프트웨어학과";
					break;
				case "13":
					gwa="모바일학과";
					break;
				case "22":
					gwa="자바학과";
					break;
				case "33":
					gwa="서버학과";
					break;
				default:
					System.out.println("error");
					System.out.println("학번입력을 다시 해주세요.");
					bool=false;
					break;

				}

			}
			else if(dangwa =='2') {
				colleage="사회대";

				switch(hakgwa) {
				case "11":
					gwa = "사회학과";
					break;
				case "22":
					gwa = "경영학과";
					break;
				case "33":
					gwa = "경제학과";
					break;
				default :
					bool = false;
					System.out.println("error");
					System.out.println("학번입력을 다시 해주세요.");
					break;

				}
			}



			else {
				System.out.println("error");
				System.out.println("학번입력을 다시 해주세요.");
				bool = false;
			}
			if(bool!=false)
				System.out.println(hakbun+"는 "+year+"년도에 입학한 "+colleage+" "+gwa+" 학생입니다.");


		}

	}

}

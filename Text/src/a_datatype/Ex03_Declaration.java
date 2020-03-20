package a_datatype;

public class Ex03_Declaration {

	public static void main(String[] args) {
		
		// 국어점수를 저장할 변수 선언 - 값 대입

//		int kor;
//		 
//		kor = 90;
//		
//		
//		// 초기화 : 변수 선언시 값 대입
//		int eng = 99;

				
		//  kor와 eng 두개 이상의 변수를 한 번에 선언
		//println 에서의 ln 은 "\n"과 의미가 같다.
		int kor=90,eng =99;
		//System.out.println("국어 : "+kor+", 영어 : "+eng);
		System.out.print("국어 : "+kor+", 영어 : "+eng+"\n");
		System.out.printf("국어 : %d, 영어 : %d \n", kor, eng);
	

		
		//---------------------------------------------------
		// 점수바꾸기 - swap
		
		int temp;
		
		temp = kor; //1
		kor = eng; //2
		eng = temp; //3
		
		System.out.println("국어 : "+kor+", 영어 : "+eng);
		
		if(kor == eng) {
			System.out.println("점수가 같습니다");
		}
		else {
			System.out.println("점수가 다릅니다");	
			
			}
		
		
		
		
		
		
		}
	

		
	}



package c_array;

import java.util.Scanner;

public class Main {

	/**
	 * 			배열을 이용해서 3명의 국영수 점수를 입력받아 총점과 평균을 구한다
	 */
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.println("입력할 학생수는?");
		
		Student [] s = new Student[Input.nextInt()];// 학생 수 3은 배열의 갯수를 의미한다. //이 초기화는 배열을 위한 초기화이므로 객체를 초기화하지 않았다.
		for(int i=0;i<s.length;i++) { //배열의 갯수만큼
			s[i] = new Student(); // 객체를 초기화 해준다.
		}
		
		
		//각 학생의 이름과 국영수 점수를 입력
		for(int i=0;i<s.length;i++) {
			//System.out.print("이름을 입력하세요:");
			System.out.println((i+1)+"번째 학생의 정보 입력?");
					
			s[i].setName(Input.next());
		//System.out.print("국영수 점수를 입력하세요(ex->10 20 30):");
			s[i].setKor(Input.nextInt());
			s[i].setEng(Input.nextInt());
			s[i].setMath(Input.nextInt());		
		}
		
		//총점이 높은순으로 학생정렬
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<i;j++) {
				if(s[i].calTotal()>s[j].calTotal()) {
					Student temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			
			}
			
		}
		//이름,총점,평균 출력
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].getName()+" 총점 : "+s[i].calTotal()+"  평균 : "+s[i].calAverage());
		}
		
	
		
		
		
	}

}

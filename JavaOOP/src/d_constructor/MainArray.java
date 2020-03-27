package d_constructor;

import java.util.Scanner;

public class MainArray {
	
	/**
	 * 	3명의 학생 정보를 입력받아 각 학생별 총점 평균을 구한다면
	 */
	
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		Student stu[] = new Student[3]; // 배열초기화

	
		for(int i=0;i<stu.length;i++) { //배열길이 만큼의 학생 정보를 입력받음
		System.out.print("이름, 국어,영어,수학점수를 입력하세요(ex: 홍길동 70 70 70)");
		String name = Input.next();
		int kor = Input.nextInt();
		int eng = Input.nextInt();
		int math = Input.nextInt();
		
		stu[i] = new Student(name,kor,eng,math); //배열갯수만큼 객체 생성
		}
				
		
		
		// 추가적으로 각 과목별 총점을 구한다면?
		int kTotal = 0;
		int mTotal =0;
		int eTotal =0;
		for(int i=0;i<stu.length;i++) {
			kTotal +=stu[i].getKor();
			eTotal +=stu[i].getEng();
			mTotal +=stu[i].getMath();
		}
		//학생별 총점,평균 출력
				for(int i=0;i<stu.length;i++) {
				System.out.println("이름 : "+stu[i].getName()+" 총점 : "+stu[i].calTotal()+"  평균 : "+stu[i].calAverage());
				
				}
				System.out.println("학생들의 국어 총점:"+kTotal+" 영어총점:"+eTotal+" 수학총점:"+mTotal);
		
				
	}

}

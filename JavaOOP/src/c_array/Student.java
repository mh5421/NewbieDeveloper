package c_array;

/******* 캡슐화  
 
B.	private / public 	-> private 멤버 변수 만든 후 main 에서 에러 확인
							-> public 멤버 메소드를 만들지 않아도 에러는 발생하진 않지만 명확하게 public 지정
C.	setter / getter
D.	 this 
		

 */
public class Student {
	// 1. 멤버변수는 private / 멤버 메소드는 public
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	public int calTotal()		{  
		total = kor + eng + math;  
		return total;
	}
	public double calAverage() 	{  
		avg = (double)total / 3;   
		return avg;
	}

	// setter와 getter
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	
	
}

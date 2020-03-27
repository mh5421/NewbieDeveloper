package a_basic;

public class Student {
	
	//멤버변수 (member field)
	String name;
	int kor,eng,math;
	private int total;
	private double avg;
	
	//멤버함수(member method)	
	int calTotal() {
		total = kor+eng+math;
		return total;
	}
	double calAvg() {
		avg = (double)total/3;
		return avg;
	}
	
	

	
	
}

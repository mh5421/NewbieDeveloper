package d_constructor;

public class GradeExpr {
	int jumsu[]= {};
	

	public GradeExpr(int jumsu[]){
		this.jumsu = jumsu;
		
	}
	//System.out.println(Math.round(((double)over*100)/text[i].length*1000)/1000.0+"%");
	public double getAverage() {
		int total = getTotal();
		double avg = (double)total/jumsu.length;
		return avg;		
	}
	public int getTotal() {
		int total=0;
		for(int i=0;i<jumsu.length;i++) {
			total += jumsu[i];
		}
		return total;
	}
	public int getGoodScore() {
		int max=0;
		
		for(int i=0;i<jumsu.length;i++) {
			if(max<jumsu[i]) {
				max = jumsu[i];
			}
		}
		return max;
	}
	public int getBadScore() {
		int min = jumsu[0];
		for(int i=0;i<jumsu.length;i++) {
			if(min>jumsu[i]) {
				min=jumsu[i];
			}
		}
		return min;
	}
}

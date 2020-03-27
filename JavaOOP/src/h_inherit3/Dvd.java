package h_inherit3;

public class Dvd extends Item{
	
	String actor;//배우
	String director; //감독
	
	public Dvd() {
		System.out.println("Dvd 기본생성자");
		
	}
	public Dvd(String num, String title,String actor, String director) {
		super.num = num;
		super.title = title;
		this.actor =actor;
		this.director = director;
		
	}
	
	public void output() {
		
		System.out.println("번호:"+num);
		System.out.println("제목 :"+title);
		System.out.println("배우:"+actor);
		System.out.println("감독:"+director);
		
		System.out.println("Dvd 인자생성자");
		
	}

}

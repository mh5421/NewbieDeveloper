package h_inherit3;

public class Cd extends Item{
	
	String singer; //가수
	
	
	public Cd() {
		System.out.println("Cd 기본생성자");
		
	}
	public Cd(String num,String title,String singer) {
		super.num = num;
		super.title=title;
		this.singer = singer;
		
		
	}
	
	public void output() {
		System.out.println("번호:"+num);
		System.out.println("제목 :"+title);
		System.out.println("가수:"+singer);
		
		System.out.println("Cd 인자생성자");
		
	}

}

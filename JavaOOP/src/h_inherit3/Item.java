package h_inherit3;

public class Item {
	
	protected String num,title;//번호,제목

	
	public Item(){
		System.out.println("item 기본생성자");
	}
	public Item(String num,String title) {
		this.num = num;
		this.title = title;
		
	}
	
	public void output() {
		System.out.println("번호:"+num);
		System.out.println("제목 :"+title);
		
		System.out.println("item 인자생성자");
	}
	

}

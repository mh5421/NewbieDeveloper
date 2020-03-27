package h_inherit5;

public abstract class Item {
	
	protected String num,title;//번호,제목

	
	public Item(){
		System.out.println("item 기본생성자");
	}
	public Item(String num,String title) {
		this.num = num;
		this.title = title;
		System.out.println("item 인자생성자");
		
	}
	
	public abstract void output();//추상메소드는 반드시 오버라이딩으로 완성시켜야한다.
	

}

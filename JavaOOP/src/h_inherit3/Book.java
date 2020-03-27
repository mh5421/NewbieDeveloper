package h_inherit3;

public class Book extends Item{
	
	String writer;
	String publisher;

	public Book() {
		System.out.println("Book 기본생성자");
	}
	public Book(String num,String title,String writer, String publisher) {
		
		super.num = num;
		super.title = title;	
		this.writer = writer;
		this.publisher = publisher;
		
		System.out.println("Book 인자생성자");
		
		
	}
	
	public void output() {
		System.out.println("번호:"+num);
		System.out.println("제목 :"+title);
		System.out.println("저자:"+writer);
		System.out.println("출판사:"+publisher);
	}
}


public class Main2 {

	public static void main(String[] args) {


		Person ps = method();
		System.out.println("이름:"+ps.getName());
		System.out.println("나이:"+ps.getAge());
		System.out.println("키:"+ps.getHeight());

	}
	static Person method() {
		String name= "홍길동";
		int age = 24;
		double height = 190.99;
		
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		p.setHeight(height);
		
		return p;
	}
}

class Person{
	private String name;
	private int age;
	private double height;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	

}



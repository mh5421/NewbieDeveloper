package e_static_sample;

public class ViewA {
	
	DBConnect db;
	
	public ViewA() {
		db = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("디비 작업중");
	}
}

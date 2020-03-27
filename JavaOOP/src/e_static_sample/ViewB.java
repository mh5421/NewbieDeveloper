package e_static_sample;

public class ViewB {

	DBConnect db;
	
	public ViewB() {
		db = DBConnect.getInstance();
	}
	public void use() {
		System.out.println("디비 작업중");
	}
}

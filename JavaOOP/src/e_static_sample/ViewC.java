package e_static_sample;

public class ViewC {
	
	DBConnect db;
	
	public ViewC() {
		db = DBConnect.getInstance();
	}
	public void use() {
		System.out.println("디비 작업중");
	}

}

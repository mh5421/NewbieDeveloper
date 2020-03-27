package e_static_sample;

public class DBConnect {
	
	static DBConnect con;
	
	
	private DBConnect() {
		System.out.println("실제로 디비 연결");
		
	
	}
	
	public static DBConnect getInstance() {
		if(con==null)
			con = new DBConnect(); //메모리에 객체 단 하나만 올린다.
		return con;
	}

}

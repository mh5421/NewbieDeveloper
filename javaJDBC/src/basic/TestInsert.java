package basic;
import java.sql.*;

public class TestInsert {

	public static void main(String[] args) {
	
		
		
		try {
			

			//1. 드라이브를 메모리에 로딩
			//new oracle.jdbc.OracleDriver();
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			
			//2. Connection 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.79:1521:orcl","scott","tiger");
			System.out.println("성공");
			
			//3. SQL 문장
			String sql  = "INSERT INTO emp(empno,ename,sal) VALUES(9001,'맹순이',4000)";
			//4. 전송객체 얻어오기 (카트같은)
			Statement st = con.createStatement();//전송객체 얻어옴
			
			//5. 전송
			st.executeUpdate(sql);//내가 만든 sql문장 전송
			
			//6. 닫기
			st.close();
			con.close();
			
		
		} catch (Exception e) {

			System.out.println("실패:"+e.getMessage());
		}
		

	}

}

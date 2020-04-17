package basic;
import java.sql.*;

public class TestInsert2 {

	public static void main(String[] args) {
		//화면에서 입력값 받아서 저장한 변수라고 생각하기
		int empno=9003;
		String ename="김순이";
		int sal =5000;
		Connection con = null;
		
		try {
			

			//1. 드라이브를 메모리에 로
			//new oracle.jdbc.OracleDriver();
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			
			//2. Connection 얻어오기
			 con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.79:1521:orcl","scott","tiger");
			System.out.println("성공");
			
			//3. SQL 문장
			String sql  = " INSERT INTO emp(empno,ename,sal) "
					+ " VALUES(?,?,?) ";
			//4. 전송객체 얻어오기 (카트같은)
			//Statement st = con.createStatement();//전송객체 얻어옴
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, empno);
			st.setString(2, ename);
			st.setInt(3, sal);
			//5. 전송
			//st.executeUpdate(sql);//내가 만든 sql문장 전송
			st.executeUpdate();
			//6. 닫기
			st.close();
			
			
		
		} catch (Exception e) {

			System.out.println("실패:"+e.getMessage());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {

			}
		}
		

	}

}

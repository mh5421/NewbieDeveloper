package basic;
import java.sql.*;



public class TestSelect2 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			//1. 드라이버를 메모리에 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//2. Connection 얻어오기
			 con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.79:1521:orcl","scott","tiger");
			//3. SQL 문장(*)
			String sql = "SELECT count(*) FROM emp";
			//4. 전송객체 얻어오기
			Statement st = con.createStatement();
			//5. 전송
			ResultSet rs = st.executeQuery(sql);
			
			//6. 결과를 확인
			
				rs.next();
				int result = rs.getInt("COUNT(*)");
				System.out.print(result+"명입니다.");
				
			
			
			
			//7.닫기
			rs.close();
			st.close();
			
			
		}catch(Exception ex) {
			System.out.println("실패"+ex.getMessage());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {

			}
		}
	}

}

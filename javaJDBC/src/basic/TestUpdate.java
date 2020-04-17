package basic;
import java.sql.*;

public class TestUpdate {

	public static void main(String[] args) {
	
		
		
		try {
			

			//1. 드라이브를 메모리에 로딩
			//new oracle.jdbc.OracleDriver();
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			
			//2. Connection 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.79:1521:orcl","scott","tiger");
			System.out.println("성공");
			
			//3. SQL 문장
			//9001번 사원의 이름은 '홍길숙' 이고 급여는 4500로 변경하기
			//String sql  = "Update emp set ename = '홍길숙',sal=4500 WHERE empno=9001";
			//String sql = "Delete FROM emp_copy";
			String sql = "Update emp set sal= sal+500 Where deptno=20";
			
			
			//4. 전송객체 얻어오기 (카트같은)
			Statement st = con.createStatement();//전송객체 얻어옴
			
			//5. 전송
			//		-int executeUpdate() : INSERT/UPDATE/DELETE
			//		-ResultSet(결과집합) executeQuery() : SELECT
			int result = st.executeUpdate(sql);//내가 만든 sql문장 전송
			System.out.println(result + "행을 실행합니다");
			//6. 닫기
			st.close();
			con.close();
			
		
		} catch (Exception e) {

			System.out.println("실패:"+e.getMessage());
		}
		

	}

}

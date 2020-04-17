package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect3 {

	public static void main(String[] args) {
		//hr 계정에서 사원번호 , 사원 Full Name, 부서명
		//급여가 3000이상인 사원 목록을 출력
		try {
			//1. 드라이버를 메모리에 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//2. Connection 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.79:1521:orcl","hr","hr");
			//3. SQL 문장(*)
			String sql = "SELECT e.employee_id employee_id,e.first_name || e.last_name fullname, d.DEPARTMENT_NAME DEPARTMENT_NAME\r\n" + 
					"FROM EMPLOYEES e INNER JOIN DEPARTMENTS d\r\n" + 
					"ON e.department_id = d.department_id\r\n" + 
					"WHERE SALARY > 3000";
			//4. 전송객체 얻어오기
			Statement st = con.createStatement();
			//5. 전송
			ResultSet rs = st.executeQuery(sql);
			
			//6. 결과를 확인
			while(rs.next()) {
				System.out.print(rs.getInt("EMPLOYEE_ID")+"\t");
				System.out.print(rs.getString("FULLNAME")+"\t");
				System.out.println(rs.getString("DEPARTMENT_NAME"));
				
			}
			
			//7.닫기
			rs.close();
			st.close();
			con.close();
			
		}catch(Exception ex) {
			System.out.println("실패"+ex.getMessage());
		}

	}

}

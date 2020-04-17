package jdbc.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoModelImpl implements InfoModel {

	String url = "jdbc:oracle:thin:@192.168.0.79:1521:orcl";
	String user = "scott";
	String pass = "tiger";

	public InfoModelImpl() throws Exception {
		//1. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");

	}

	public void insert(InfoVO vo) throws SQLException {
		Connection con = null;
		try {
			//2. 연결객체 얻어오기
			con = DriverManager.getConnection(url,user,pass);
			//3. sql 문장
			String sql = "INSERT INTO info_tab(name, jumin, tel, gender, age, home) "
					+ " VALUES(?,?,?,?,?,?)";
			//4. 전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,vo.getName());
			st.setString(2,vo.getJumin());
			st.setString(3,vo.getTel());
			st.setString(4,vo.getGender());
			st.setInt(5,vo.getAge());
			st.setString(6, vo.getHome());
			//5. 전송
			st.executeUpdate();
			//6. 닫기
			st.close();
		}
		finally{con.close();
		}

	}
	public void modify(InfoVO vo) throws SQLException {
		Connection con = null;
		try {
			//2. 연결객체 얻어오기
			con = DriverManager.getConnection(url,user,pass);
			//3. sql 문장
			String sql = "UPDATE info_tab SET name=?,jumin= ?, gender= ?, "
					+ " age = ?, home=? WHERE tel=?";
			//4. 전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,vo.getName());
			st.setString(2,vo.getJumin());
			st.setString(3,vo.getGender());
			st.setInt(4,vo.getAge());
			st.setString(5, vo.getHome());
			st.setString(6,vo.getTel());
	


			//5. 전송
			st.executeUpdate();
			//6. 닫기
			st.close();
		}
		finally{con.close();
		}

	}


	public ArrayList<InfoVO> selectAll() throws SQLException {
		Connection con  = null;
		try {
			//2. Connection 얻어오기
			con = DriverManager.getConnection(url,user,pass);
			//3. sql 문장 만들기 
			String sql = "SELECT * FROM info_tab ";
			//4. w전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);

			//5.전송
			//ResultSet executeQuery() : SELECT
			//int executeUpdate() : INSERT , DELETE, UPDATE //오라클이 행의 값을 날려줌
			ResultSet rs = st.executeQuery();
			ArrayList<InfoVO> list = new ArrayList<InfoVO>();
			while(rs.next()) {
				InfoVO vo = new InfoVO();
				vo.setName(rs.getString("NAME"));
				vo.setJumin(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setGender(rs.getString("GENDER"));
				vo.setAge(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));
				list.add(vo);

			}


			//6. 닫기
			st.close();
			rs.close();
			return list;
		}
		finally {
			con.close();

		}


	}


	public void delete(String tel) throws SQLException {
		Connection con = null;
		try {
			
	
			//2. Connection 얻어오기
			 con = DriverManager.getConnection(url,user,pass);
			//3. SQL 만들기
			String sql = "DELETE FROM info_tab WHERE tel=?";
			//4. 전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,tel);
			//5. 전송
			st.executeUpdate();
			//6.결과처리

			
			//7. 닫기
			st.close();

		}finally {	
			con.close();
		}
	}


	public InfoVO selectByTel(String tel) throws SQLException {
		Connection con = null;
		try {
			InfoVO vo = new InfoVO();
	
			//2. Connection 얻어오기
			 con = DriverManager.getConnection(url,user,pass);
			//3. SQL 만들기
			String sql = "SELECT * FROM info_tab WHERE tel=?";
			//4. 전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,tel);
			//5. 전송
			ResultSet rs = st.executeQuery();
			//6.결과처리

			if(rs.next()) {//primary키를 검색할땐 하나만 존재하므로 while문을 할 필요가 없다
				vo.setName(rs.getString("NAME"));
				vo.setJumin(rs.getString("JUMIN"));
				vo.setGender(rs.getString("GENDER"));
				vo.setAge(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));
				
			}
			//7. 닫기
			st.close();
			return vo;
		}finally {	
			con.close();
		}
	}

}

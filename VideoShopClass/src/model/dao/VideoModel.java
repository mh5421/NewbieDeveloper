package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.VideoDao;
import model.vo.Video;

public class VideoModel implements VideoDao{
	String url = "jdbc:oracle:thin:@192.168.0.79:1521:orcl";
	String user = "ryu";
	String pass=  "1234";
	public VideoModel() throws Exception{
		

		// 1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
	}
	
	
	public void insertVideo(Video vo, int count) throws Exception{
		Connection con=  null;
		try {
		// 2. Connection 연결객체 얻어오기
		con = DriverManager.getConnection(url,user,pass);
		// 3. sql 문장 만들기
		
		String sql = "INSERT INTO VIDEO(NUM,TITLE,DETAIL,GENRE,DIRECTOR,ACTOR,STOCK) VALUES(V_SEQ.NEXTVAL,?,?,?,?,?,?)";
		
		// 4. sql 전송객체 (PreparedStatement)		
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getVideoName());
		ps.setString(2, vo.getExp());
		ps.setString(3, vo.getGenre());
		ps.setString(4, vo.getDirector());
		ps.setString(5, vo.getActor());
		ps.setString(6, String.valueOf(count));
		
		// 5. sql 전송
		for(int i=0;i<count;i++) {
		ps.executeUpdate();
		}
		
		// 6. 닫기
		
		ps.close();
		}finally {
		con.close();
		}
	}



	public ArrayList selectVideo(int index, String word) throws Exception {
		Connection con=  null;
		try {
		// 2. Connection 연결객체 얻어오기
		con = DriverManager.getConnection(url,user,pass);

		ArrayList data = new ArrayList();
		String colName[] = {"TITLE", "ACTOR"};
		// 3. sql 문장 만들기
		String sql = " SELECT NUM,TITLE, ACTOR " + 
				" FROM VIDEO " + 
				" WHERE "+colName[index]+" like '%"+word+"%'";
		
		
		Statement st = con.createStatement();
		
		
		ResultSet rs = st.executeQuery(sql);
		
		
		while(rs.next()) {
			
			ArrayList temp = new ArrayList();
			temp.add(rs.getInt("NUM"));
			temp.add(rs.getString("TITLE"));
			temp.add(rs.getString("ACTOR"));
			
			data.add(temp);
			
		}
	
		st.close();
		return data;
		}finally 
		{
			con.close();
		}
	}



	public Video selectByPK(int vnum) throws Exception {
		Video vo = new Video();
		Connection con=  null;
		try {
		// 2. Connection 연결객체 얻어오기
		con = DriverManager.getConnection(url,user,pass);
		
		String sql = "SELECT * FROM VIDEO WHERE num = ?";
		//해당 비디오번호의 비디오정보를 검색하여 Video 클래스에 각각 멤버변수로 지정
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,vnum);
		
		
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			vo.setVideoNo(rs.getInt("NUM"));
			vo.setActor(rs.getString("ACTOR"));
			vo.setVideoName(rs.getString("TITLE"));
			vo.setDirector(rs.getString("DIRECTOR"));
			vo.setExp(rs.getString("DETAIL"));
			vo.setGenre(rs.getString("GENRE"));
			
			
		}
	
		
		ps.close();
		rs.close();
		
		return vo;
		}finally {
		con.close();}
	}
	

}

package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import model.CustomerDao;
import model.vo.Customer;

public class CustomerModel implements CustomerDao{
	String url = "jdbc:oracle:thin:@192.168.0.79:1521:orcl";
	String user = "ryu";
	String pass=  "1234";
	
	public CustomerModel() throws Exception{
	 	// 1. 드라이버로딩
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	}
	
	public void insertCustomer(Customer vo) throws Exception{
		Connection con = null;
		try {
		// 2. Connection 연결객체 얻어오기
		
		con = DriverManager.getConnection(url,user,pass);
		// 3. sql 문장 만들기
		String sql = " INSERT INTO member VALUES(?,?,?,?,?) ";
		
		
		// 4. sql 전송객체 (PreparedStatement)		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getCustTel1());
		ps.setString(2, vo.getCustName());
		ps.setString(3, vo.getCustTel2());
		ps.setString(4, vo.getCustAddr());
		ps.setString(5, vo.getCustEmail());
		// 5. sql 전송
		
		ps.executeUpdate();
		
		
		
		// 6. 닫기 
		ps.close();
		}finally {
		con.close();
		}
	}
	
	public Customer selectByTel(String tel) throws Exception{
		Customer dao = new Customer();
		
		Connection con = null;
		try {
		// 2. Connection 연결객체 얻어오기
		
		con = DriverManager.getConnection(url,user,pass);
		// 3. sql 문장 만들기
		String sql = " SELECT * FROM member WHERE PHONE = ? ";
		
		
		
		// 4. sql 전송객체 		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,tel);
		
		ResultSet rs = ps.executeQuery();
		// 5. sql 전송
		
		
		
		
		while(rs.next()) {
			dao.setCustName(rs.getString("NAME"));
			dao.setCustTel1(rs.getString("PHONE"));
			dao.setCustTel2(rs.getString("SUBPHONE"));
			dao.setCustAddr(rs.getString("ADDRESS"));
			dao.setCustEmail(rs.getString("EMAIL"));

		}
		
		ps.close();
		rs.close();
		
		return dao;
		// 6. 닫기 
		}finally {
		con.close();
		}
		
	
		
	}
	
	public int updateCustomer(Customer vo) throws Exception{
		
		int result = 0;
		
		Connection con = null;
		try {
		// 2. Connection 연결객체 얻어오기
		
		con = DriverManager.getConnection(url,user,pass);
		// 3. sql 문장 만들기
		String sql = " UPDATE member SET NAME= ?, SUBPHONE= ?, ADDRESS = ?, EMAIL=? WHERE PHONE = ?";
		
		
		// 4. sql 전송객체 (PreparedStatement)		
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, vo.getCustName());
		ps.setString(2, vo.getCustTel2());
		ps.setString(3, vo.getCustAddr());
		ps.setString(4, vo.getCustEmail());
		ps.setString(5, vo.getCustTel1());
		// 5. sql 전송
		
		
		result = ps.executeUpdate();
		System.out.println(result);
		if(result==0) {
			
			con.rollback();
			return -1;
		}
		
		// 6. 닫기 
		ps.close();	
		}finally {
		con.close();
		}
		
		return result;
	}
}

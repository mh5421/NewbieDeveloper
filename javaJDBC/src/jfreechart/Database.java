package jfreechart;

import java.sql.*;
import java.util.*;

public class Database {

	String URL = "jdbc:oracle:thin:@192.168.0.79:1521:orcl";
	String USER ="scott";
	String PASS = "tiger";

	public ArrayList<ArrayList> getData() {

		ArrayList<ArrayList> data = new ArrayList<ArrayList>();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(URL, USER , PASS);	
			
			//***************************************************************
			/*
			String sql = " SELECT nvl(to_char(hiredate,'MM'),'입사대기') hire_month,count(*) count " + 
					" FROM emp " + 
					" GROUP BY to_char(hiredate,'MM') " + 
					" ORDER BY hire_month ";
					*/
			String sql = " SELECT nvl(job,'백수')업무,nvl(round(avg(sal)),0)평균월급 " + 
					" FROM emp " + 
					" group by job ";
			//***************************************************************
			
			PreparedStatement stmt = con.prepareStatement( sql );	

			ResultSet rset = stmt.executeQuery();

			
			while( rset.next() ){
				ArrayList temp = new ArrayList();
				temp.add( rset.getInt("평균월급"));				//****************
				temp.add( rset.getString("업무"));		//****************		
				data.add(temp);
			}
			rset.close();
			stmt.close();
			con.close();
		} catch(Exception ex){
			System.out.println("에러 : " + ex.getMessage() );
		}
		return data;
	}
}

package jdbc.gui;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InfoModel {//확장성을 생각해서 미리미리 만든ek
	
	void insert(InfoVO vo) throws SQLException;
	ArrayList<InfoVO> selectAll() throws SQLException;
	void delete(String tel) throws SQLException;
	InfoVO selectByTel(String tel)throws SQLException;
	
	void modify(InfoVO vo) throws SQLException;
	
}


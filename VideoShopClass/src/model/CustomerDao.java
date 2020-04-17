package model;

import model.vo.Customer;

/** 고객관리 JDBC 연결 */
public interface CustomerDao {
	public void insertCustomer(Customer vo) throws Exception;		// 회원가입
	public Customer selectByTel(String tel) throws Exception;			// 전화번호로 검색
	public int updateCustomer(Customer vo) throws Exception;		// 고객정보 수정
}

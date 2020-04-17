package jdbc.transection;

/*
	데이타베이스에서 지원하는 트랜잭션의 특성을 알아보는 프로그램


	- 기존에 아래와 같은 테이블 생성되어야 함

   <$> 테이블 만들기 : account
	ACCOUNT_NUM                 VARCHAR2(20)
	CUSTOMER                    VARCHAR2(20)
	AMOUNT                      NUMBER	

*/



import java.sql.*;
class TranTest 
{
	public static void main(String[] args) 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//--------------------------------------------------------------
		// 현재 JDBC 드라이버가 지원하는 isolation level을 알아보는 예제
		
			Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:orcl","scott","tiger");

			DatabaseMetaData meta = con.getMetaData();

			if( meta.supportsTransactionIsolationLevel( con.TRANSACTION_NONE ) )
				System.out.println("supports TRANSACTION_NONE");
			if( meta.supportsTransactionIsolationLevel( con.TRANSACTION_READ_UNCOMMITTED ) )
				System.out.println("supports TRANSACTION_READ_UNCOMMITTED");
			if( meta.supportsTransactionIsolationLevel( con.TRANSACTION_READ_COMMITTED ) )
				System.out.println("supports TRANSACTION_READ_COMMITTED");
			if( meta.supportsTransactionIsolationLevel( con.TRANSACTION_REPEATABLE_READ ) )
				System.out.println("supports TRANSACTION_REPEATABLE_READ");
			if( meta.supportsTransactionIsolationLevel( con.TRANSACTION_SERIALIZABLE ) )
				System.out.println("supports TRANSACTION_SERIALIZABLE");

			int level = con.getTransactionIsolation();
			System.out.println("current isolation level : " + level );
		


		//--------------------------------------------------------------
		// 트랜잭션 정책 중 dirty read의 지원 여부 검사
		//	 : 한 트랜잭션이 데이터 행을 갱신하고 있는데 아직 커밋하지 않은 상태에서 다른 트랜잭션이 
		//	그 데이터 행을 읽으려고 하는 경우 커밋되지 않더라도 갱신된 데이터를 읽는 것
		//  -> 결과는 변경전의 값이 출력된다 ( dirty read를 지원 안함 )
		/*Connection con1 = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:orcl","scott","tiger");
		Connection con2 = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:orcl","scott","tiger");
		con1.setAutoCommit( false );
		con2.setAutoCommit( false );
		Statement stmt1 = con1.createStatement();
		Statement stmt2 = con2.createStatement();
		stmt1.executeUpdate("UPDATE account SET customer='이뿌니' WHERE account_num='111-11-1111'");
		ResultSet rs2 = stmt2.executeQuery("SELECT customer FROM account WHERE account_num='111-11-1111'");
		if( rs2.next() ){
			System.out.println("변경: " + rs2.getString(1));
		}
		rs2.close();
		stmt1.close();
		stmt2.close();
		con1.close();
		con2.close();
		*/

		//--------------------------------------------------------------
		// 트랜잭션 정책 중 repeatable read의 지원 여부 검사
		//	: 하나의 트랜잭션이 어떤 조건으로 데이터 행을 가져와서 작업을 한 후 
		//	다른 트랜잭션이 그 조건에 맞는	행의 정보를 갱신하고 커밋까지 한 다음 
		//	이전의 트랜잭션이 다시 그 행을 읽었을 경우 갱신되지 않은 이전 데이타를 
		//	반복해서 읽는 경우
		//	-> 결과는 변경된 데이타를 읽음 ( repeatable read를 지원하지않음 )
		/*Connection con1 = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:orcl","scott","tiger");
		Connection con2 = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:orcl","scott","tiger");
		con1.setAutoCommit( false );
		con2.setAutoCommit( false );
		Statement stmt1 = con1.createStatement();
		Statement stmt2 = con2.createStatement();

		ResultSet rs1 = stmt1.executeQuery("SELECT customer FROM account WHERE account_num='111-11-1111'");
		if( rs1.next() ){
			System.out.println("변경전 : " + rs1.getString(1));
		}

		stmt2.executeUpdate("UPDATE account SET customer='깜찍이' WHERE account_num='111-11-1111'");
		//@
		con2.commit();

		ResultSet rs2 = stmt1.executeQuery("SELECT customer FROM account WHERE account_num='111-11-1111'");
		if( rs2.next() ){
			System.out.println("변경후: " + rs2.getString(1));
		}

		rs1.close();
		rs2.close();
		stmt1.close();
		stmt2.close();
		con1.close();
		con2.close();
		*/

		//--------------------------------------------------------------
		// 트랜잭션 정책 중 phantom read의 지원 여부 검사
		//	: 하나의 트랜잭션이 어떤 조건으로 데이터 행을 가져와서 작업을 한 후 
		//	다른 트랜잭션이 그 조건에 맞는 	또 다른 행을 하나 추가하고 커밋까지 한 다음 
		//	이전의 트랜잭션이 다시 그 조건으로 행을 가져올 경우 추가된 행까지 읽는 경우
		//	-> 결과는 추가된 행까지 출력 ( phantom read를 지원함 )
		/*Connection con1 = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:orcl","scott","tiger");
		Connection con2 = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:orcl","scott","tiger");
		con1.setAutoCommit( false );
		con2.setAutoCommit( false );
		Statement stmt1 = con1.createStatement();
		Statement stmt2 = con2.createStatement();
		stmt1.executeUpdate("INSERT INTO account VALUES('111-11-3333','김승민',20000)");
		// @
		con1.commit();
		ResultSet rs2 = stmt2.executeQuery("SELECT account_num FROM account WHERE customer='김승민'");
		while( rs2.next() ){
			System.out.println("변경: " + rs2.getString(1));
		}
		rs2.close();
		stmt1.close();
		stmt2.close();
		con1.close();
		con2.close();
		*/
		} catch(Exception ex){
			System.out.println("오류 : " + ex.getMessage() );
		}
	}
}

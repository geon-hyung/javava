package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	public static void printData(ResultSet rs) {
		try {
			while(rs.next()) {      
				String name = rs.getString("STU_NAME");
				int height = rs.getInt("STU_HEIGHT");
				System.out.println(name+"\t");
				System.out.println(height);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();  //오라클과 연결 
			//조회결과를 확인하기 위해서는 ResultSet 객체로 받아야한다
			ResultSet rs= stmt.executeQuery("SELECT * FROM STUDENT");      //오라클에서 실행후 결과를 되돌리는 값 
			printData(rs);                    //조건을 입력해서 가져올수 있다 where stu_name 옥한빛 ;
			
//			while(rs.next()) {      //반복문안에 rs.next를 넣어 커서를 순차적으로 이동시킨다 
//				String name = rs.getString("STU_NAME");
//				int height = rs.getInt("STU_HEIGHT");
//				System.out.println(name+"\t");
//				System.out.println(height);
//			}
//			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}

	}

}

package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBDeleteEx1 {
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
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();  //오라클과 연결 
			
			
			System.out.println("삭제할 학생의 이름 입력 :");
			String name = scan.next();
			//리턴 타입은 인트 /몇개를 삭제햇나 알 수 있다 삭제할 대상이 없다면 0 이 넘으로 리턴된다/  //학생 테이블에서 내가 입력한 학생의 이름을 삭제한다  
			int num = stmt.executeUpdate("DELETE STUDENT WHERE STU_NAME ='"+ name+"'");//네임에 작은 따음표를 붙힌다 
			
			if(num == 0) {
				System.out.println("삭제할 대상이 존재 하지 않습니다.");
			}else {
				System.out.println("삭제되었습니다");
			}
			
//			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}

	}

}

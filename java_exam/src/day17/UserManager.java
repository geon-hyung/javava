package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class UserManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			
			//ㅇ아이디 비밀ㄹ번호 이름  입력 받아서 TBL_USER 에 저장 
			String id = "";
			while(true) {
				System.out.println("아이디 :");
				 id =scan.next();
				String idchek = 
						"SELECT * FROM TBL_USER "
								+ "WHERE USERID = '"+ id + "'";
				ResultSet rs = stmt.executeQuery(idchek);
				if(rs.next()) {
					System.out.println("중복된 아이디입니다 .");
				}else {
					break;
				}
			}
			System.out.println("비밀번호 :");
			String pwd =scan.next();
			System.out.println("이름 :");
			String name =scan.next();
			
			String sql = 
					"INSERT INTO TBL_USER" +"(USERID,PASSWORD,USERNAME)"
					+ "VALUES("  
					+ "'" + id + "',"
					+"'" +pwd + "' ,"
					+"'" + name + "')";
			int result = stmt.executeUpdate(sql);
			if(result > 0 ) {
				System.out.println("가입되었습니다!");
			}
					
//							System.out.println(sql);
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
	
}

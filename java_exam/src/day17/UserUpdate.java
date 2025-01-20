package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class UserUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id를 입력받아서 없는 아이디면 
		//없는 아이디 입니다 다시 입력 해주세요 
		//있는 아이디 일경우 나이값을 입력 받아서 업데이트
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			while(true) {
			System.out.println("아이디: ");
			String id = scan.next();
			String sql = 
					"SELECT * FROM TBL_USER"
					+"WHERE USERID= '"+ id +"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.println("나이를 입력해주세요 : ");
				int age = scan.nextInt();
				stmt.executeUpdate("UPDATE TBL_USER SET"+ age + "WHERE AGE = "   );
			}else {
				System.out.println("아이디가 없습니다 다시 입력해주세요 : ");
			}break;
			
			
			
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}

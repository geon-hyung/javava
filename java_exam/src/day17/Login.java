package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아이디와 패스워드를 입력받아서
		//아이디/패스워드 둘다 만족하는 데이터가 있으면 
		//로그인 성공 . 아닐경우 로그인 실패 
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			
			System.out.println("아이디를 입력하세요 :");
			String id = scan.next();
			System.out.println("패스워드를 입력하세요");
			String pwd = scan.next();
			String sql = 
					"SELECT * FROM TBL_USER"
					+"WHERE USERID= '"+ id +"'"
					+"AND PASSWORD= '"+ pwd +"'";		
			String idcheck = "SELECT * FROM TBL USER" + "WHERE USER ID = '"+ id + "'";
			ResultSet rs =stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.println("로그인성공");
			}else {
				System.out.println("로그인 실패 ");
				}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}

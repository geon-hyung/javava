package day16;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
		System.out.println("===학생관리 시스템입니다.===");
		while(true) {
			System.out.println("[(1) 학생추가 (2) 성적입력 (3)조회 (4)성적수정 (5)종료]");
			if(menu == 1) {
				System.out.println("이름 :");
				String name = scan.next();
				
	}

}
}
}
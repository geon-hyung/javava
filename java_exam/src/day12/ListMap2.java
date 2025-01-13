package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {
	static Scanner scan = new Scanner(System.in);

	// 자바 (0~40) 오라클 (0~35) HTML(0~25)
	// 클래스에서 인트를 선언하고 파라미터로 값을 변경 해준다 .
	public static int setScore(String msg, int max) {
		while (true) {
			System.out.println(msg + "점수 : ");
			int score = scan.nextInt();
			if (score <= 100 && score >= 0) {
				return score;
			}
			System.out.println("0~부터" + max + "사이 값 입력");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			// 이름 name, 자바점수 java, 오라클(oracle),
			// html (html)점수 입력받아서 맵에 저장
			// 점수는 0~100 사이만 가능
			System.out.println("[1]추가 [2] 수정 [3] 확인 [3]종료");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.println("이름 : ");
				String name = scan.next();
				map.put("name", name);
				map.put("java", setScore("자바", 40));
				map.put("oracle", setScore("오라클", 35));
				map.put("html", setScore("HTML", 25));
				list.add(map);
				System.out.println(list);
			} else if (menu == 2) {
				System.out.println("이름을 입력하세요 :");
				String name = scan.next();
				// 이름 , 과목명, 점수를 입력받아서
				// 해당 학생의 과목 점수 수정
				// ex)
				// 이름: 홍길동 과목: 자바 :수정점수 30
				// 홍길동의 자바점수를 30으로 변경
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if (name.equals(user.get("name"))) {
						System.out.print("과목 : ");
						String subject = scan.next();
						user.put("java", setScore("자바", 40));

					}
				}
				System.out.println(list);
			} else if (menu == 3) {
				System.out.println(list);
			} else if (menu == 4) {
				break;
			}

		}

	}

}

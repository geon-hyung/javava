package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홍길동 1000,
		//사람의 이름과 포인트를 입력해서 추가 포인트를 누적되게 하고 
		//중복되는 이름이 안나오게 한다 
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		for (;;) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.println("[1]추가 [2]확인 [3]종료");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.println("이름 : ");
				String name = scan.next();
				System.out.println("포인트 : ");
				int point = scan.nextInt();
				boolean updateFlg = false;
//				map.put("name",scan.next());
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						// 다운그레이드를 통해 인트로 변경
						int newPoint = (int) list.get(i).get("point") + point;
						list.get(i).put("point", newPoint);
						updateFlg = true;
						break;
					}
				}
				if(!updateFlg) { 
					map.put("name", name);
					map.put("point", point);
					list.add(map);
					
				}

			} else if (menu == 2) {
				System.out.println(list);
//				System.out.println("이름 : ");
				// ooo님의 포인트는 ooo입니다.
				System.out.println("이름을 입력해주세요: ");
				String name = scan.next();
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						System.out.println(name + "님의 포인트는");
						System.out.println(list.get(i).get("point"));
						break;
					}
				}
			}
		}

	}

}

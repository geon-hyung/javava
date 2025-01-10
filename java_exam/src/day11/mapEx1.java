package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class mapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList <HashMap<String, Object>> list = new ArrayList<>();
		
		//hashmap 을 넣어 관리하는 리스트를 만들어준다 
//		HashMap<String, String> map = new HashMap<>();
		
		while(true) {
			System.out.println("[1]추가 [2] 확인 [3] 삭제 [4] 종료");
			int menu = scan.nextInt();
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>(); //오브젝트로 많이사용
				System.out.println("이름 : ");
				map.put("name", scan.next());
				System.out.println("나이 : ");
				map.put("age", scan.nextInt());
				System.out.println("주소 : ");
				map.put("addr", scan.next());
				//map .get name  이름만 출력가능 
				list.add(map);
			}else if (menu == 2) {
				for(int i = 0 ; i < list.size(); i++) {
					System.out.println((i+1) + ".");
					System.out.println("이름 : " + list.get(i).get("name") + ",");
					System.out.println("나이 : " + list.get(i).get("age") + ",");
					System.out.println("주소 : " + list.get(i).get("addr") + ",");
				}
			}else if (menu == 3) {
				System.out.println("삭제할 이름을 입력해주세요 :");
				System.out.println("list");
				for(int i = 0; i <list.size(); i++) {
//					list.get(i).get("name");
					HashMap<String,Object> map = list.get(i);
					map.get("name");
					if(name.equals)
					
				}
				}else {
					System.out.println("종료되었습니다. ");
					}break;
			}
				
			}

}

package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 소수점, 혹은 숫자,문자 사용할 수 있는 오브젝트 클래스를 사용한다
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		// 리스트 + map 형태로 관리 하고 싶다면 리스트를 먼저 만들고 해쉬맵을 넣어주고
		// 리스트 안에 맵을 넣어준다.

		// 스캐너로 이름, 나이 . 키를 입력받아서
		// 3명의 정보를 리스트에 저장
		for (int i = 0; i < 3; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.println("이름: ");
			String name = scan.next();
			System.out.println("나이: ");
			int age = scan.nextInt();
			System.out.println("키: ");
			double height = scan.nextDouble();
			map.put("이름", name);
			map.put("나이", age);
			map.put("키", height);
			list.add(map);

		}
	}

}

package day13;

import java.util.ArrayList;
import java.util.HashMap;

public class ListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리스트 안에 hashmap를 넣어 추가적으로 괄호를 하나더 만들어 관리한다 [{name }]
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		HashMap<String, Object> user1 = new HashMap<>();
		// [{ name = 홍길동 , age = 30}]
		user1.put("name", "홍길동");
		user1.put("age", 30);

		list.add(user1);

		HashMap<String, Object> user2 = new HashMap<>();
		// [{ name = 홍길동 , age = 30}]
		user2.put("name", "김찬식");
		user2.put("age", 29);

		list.add(user2);

		// list.get(0) ={name=홍길동, age=30}
		// list.get(1) ={name=김찬식, age=29}
//		for (int i = 0; i < list.size(); i++) {
//			if("김찬식".equals(list.get(i).get("name"))) {
//				list.get(i).put("add", "인천");
//			}
//		}
		// list.get(0) ={name=홍길동, age=30}
		// list.get(1) ={name=김찬식, age=29}
		for (int i = 0; i < list.size(); i++) {
			HashMap<String,Object> user = list.get(i);
			if ("김찬식".equals(user.get("name"))) {
				user.put("addr", "인천");
			}
		}
		System.out.println(list);
	}

}

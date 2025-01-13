package day12;

import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map //앞은 키 뒤는 밸류를 담는다 
				=new HashMap<>();
		map.put("name","홍길동");
		map.put("age", "30");
		//문자열로 선언된 것을 숫자를 추가하고 싶다면 30 => 31 아래 참고   
		//문자를 숫자로 바꾸는 메소드 Integer.parseInt 
		String ageStr = map.get("age");
		int age = Integer.parseInt(ageStr) +1 ;
		System.out.println(age);

	}

}

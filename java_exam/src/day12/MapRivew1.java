package day12;

import java.util.HashMap;
import java.util.Scanner;

public class MapRivew1 {
	public static void main(String[] args) {
		//정해진 리스트에 들어가 있는 인원에 과목 점수를 변경하는 코드 
		Scanner scan = new Scanner(System.in);
		HashMap<String, Object> map = new HashMap<>();
		map.put("naae", "이흥열");
		map.put("java", 50);
		map.put("oracle", 70);
		System.out.println("과목 : ");
		String subject = scan.next();
		if(map.containsKey(subject)) {
			System.out.println("새 점수");
			int score = scan.nextInt();
		map.put(subject, score);
		}else {
			System.out.println("없는 과목임");
		}	
			System.out.println(map);

			
		}
	}



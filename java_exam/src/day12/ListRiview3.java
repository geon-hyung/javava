package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListRiview3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		// 그만 이 입력되기 전까지 문자열을 입력받아서
		// list 에 저장하기
		// 저장 이후 글자수가 3글자 이상이면
		// 문자열을 두글자 +* (te**) 화면에출력 별표가 글자 개수만큼
		// 2글자 이하는 출력 x
		while (true) {
			System.out.println("문자를 입력하세요 :");
			String input = scan.next();
			if (!input.equals("그만")) {
				list.add(input);
			} else {
				break;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() >= 3) {
				System.out.print(list.get(i).substring(0, 2));
			
			for(int j =0; j <list.get(i).length()-2; j++) {
					System.out.print("*");
				}
			}
		System.out.println(" ");
		}
	}
}

	

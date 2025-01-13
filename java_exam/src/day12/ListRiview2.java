package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListRiview2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		//-1이 입력되기 전까지 문자열을 입력받아서 
		//list 에 저장하기 
		//저장 이후 글자수가 5글자 이상인 문자열을 화면에 출력 
		System.out.println("문자를 입력하세요 : ");
		while(true) {
				String input = scan.next();
				if(!input.equals("그만")) {
					list.add(input);
				}else {
					break;
				}
			}        //length 를 입력해서 5글자 이상인지 비교 하고 출력한다 
			for(int i = 0; i< list.size(); i++) {
				if(list.get(i).length() >= 5) {
					System.out.println(list.get(i) + " ");
				}
			}
		}
		
	}

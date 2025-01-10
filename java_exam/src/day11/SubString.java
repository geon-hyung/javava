package day11;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
		String a = scan.next();
		
		for(int i= 0; i < a.length(); i++) {
			String first = a.substring(0, 1); //첫번째 글자를 저장하고 
			String last = a.substring(1); // 마지막 글자를 저장한다 
			a = last + first;    //이후에 a 에 두 글자를 더해서 a를 출력해준다 
			System.out.println(a); 
//			배고프다
//			고프다배
//			프다배고
//			다배고프
//			배고프다

		}
	}

}

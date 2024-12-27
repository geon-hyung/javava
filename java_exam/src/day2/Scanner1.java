package day2;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		// import 단축키 ctrl + shift + 알파벳 o
		String name = s.next() ;// 문자열을 입력받을 수 있는 기능
		System.out.print("나이를 입력하세요 : ");
		int age = s.nextInt();// 숫자를 입력받을 수 있는 기능

		System.out.println(name + "의 나이는" + age + "입니다");

	}

}

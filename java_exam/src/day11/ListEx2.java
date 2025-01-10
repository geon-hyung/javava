package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Human> list  = new ArrayList<>();
		
		for(;;) {
			System.out.println("이름 :");
			String name = scan.next();
			System.out.println("나이 :");
			int age = scan.nextInt();
			System.out.println("주소 :");
			String addr = scan.next();
			Human h = new Human(name,age,addr);
			
			System.out.println("(1) 추가  (2) 확인 (3) 종료");
			int choice = scan.nextInt();
			if(choice == 1) {
				
			}else if(choice == 2) {
				
			}else {  System.out.println("종료되었습니다.");
				break;
			}
			list.add(h);
			System.out.println();
		}
	
		
	}

}

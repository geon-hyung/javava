package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("나뉘는 수 : ");
				int num1 = scan.nextInt();
				System.out.print("나눌 수 : ");
				int num2 = scan.nextInt();

				System.out.println(num1 / num2);
				break;
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("숫자 입력하세요 : ");
				scan.nextLine();
			}catch (Exception e) { //나오는 에러 예외 처리
				// TODO: handle exception
				System.out.println("예기치 못한 에러 발생");
				//에러를 예외로 처리해서 원인을 분명히 파악후 세분화로 처리한다 
				//그럼에도 개발자가 발견하지 못한 에러가 있을경우 Exception 을 사용한다.
			}
		}
	}
}
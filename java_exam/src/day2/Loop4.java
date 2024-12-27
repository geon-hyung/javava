package day2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스캐너로 숫자하나 입력받아서
		// 1부터 입력받은 숫자까지의 합 구하기 
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int value = s.nextInt();
		int sum = 0;
		for (int i = 1 ; i <=value; i++) {
			sum += i ;
		}
           System.out.println("1부터" + value + "까지의 합은" + sum + "입니다"  );
	}

}


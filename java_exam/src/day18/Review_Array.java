package day18;

import java.util.Arrays;
import java.util.Scanner;

public class Review_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 6개의 공간을 가지는 int형 배열을 생성하고 스캐너를 통해 아래 조건에 맞게
//		 숫자를 입력받아서 배열의 모든 공간에 넣으시오.
//		 조건1. 배열에 들어가는 숫자는 1부터 100사이의 숫자일 것
//		 조건2. 중복된 숫자는 들어가지 못하게 할 것
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.println("숫자:  ");
		int num ;
		boolean user = false;
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			int input = scan.nextInt();
			if(input > 1 && input < 100) {
				arr[i] = input;
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
				i--;
			}
			for(int j = 1; j<arr.length; j++) {
				if(arr[] == input) {
					i--;
				}
			}
			System.out.println(Arrays.toString(arr));
				
		}
	}
}

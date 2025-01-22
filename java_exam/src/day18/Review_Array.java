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
		int count = 0;
		while (count < 6) {
			int input = scan.nextInt();
			if (input >= 1 || input <= 100) {
				boolean Flg = false;
				for (int i = 0; i < count; i++) {
					if (arr[i] == input) {
						Flg = true;
						break;
					}
				}
				if (!Flg) {
					arr[count] = input;
					count++;
				} else {
					System.out.println("중복된 숫자입니다 ");
				}
			}
			for (int num : arr) {
				System.out.print("입력된 숫자");
				System.out.print(num + " ");
			}

		}
//		for(int i = 0; i< arr.length; i ++) {
//			System.out.print((i+1)+ "번째 숫자 입력 : ");
//			arr[i] = scan.nextInt();
//			if(arr[i] > 100 || arr[i] < 1) {
//				System.out.println("1~100사이 값을 입력해주세요");
//				i--;
//				continue;
//			}
//			for(int j= 0; j<i ;j++ ) {
//				if(arr[i] == arr[j]) {
//					System.out.println("중복된 값 입니다 다시 입력하세요: ");
//					i--;
//					break;
//				}
//			}
//			
//		}
//		System.out.println(Arrays.toString(arr));
	}
}

package day16;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6개의 공간을 가지는 int형 배열을 생성하고 
//		스캐너를 통해 아래 조건에 맞게 숫자를 입력받아서 배열의 모든 공간에 넣으시오.
//		 - 조건1. 배열에 들어가는 숫자는 1부터 100사이의 숫자일 것
//		 - 조건2. 5의 배수는 넣지 말 것.
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[6];
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			int input = scan.nextInt();
			if(arr[i] > 1 || arr[i] < 100) {
				arr[i] = input;
				
			} if(arr[i] % 5 ==0){
				
			}
			arr[i] = input;
			System.out.println(Arrays.toString(arr));
			
		

	}
	}
}

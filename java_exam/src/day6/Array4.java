package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][2];
		// 스캐너로 값을 입력 받아서 값을 채워라
		// {10,20}
		// {30,40}
		// {5,3}
		// {9,100}
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { //arr i 
				System.out.print(i +","+ j +"번째의 값");
				arr[i][j] = scan.nextInt();
			}
		}
//		System.out.println(Arrays.toString(arr[0])); // arr은 행을 출력 함으로 원할하게 출력하려면  
//		System.out.println(Arrays.toString(arr[1])); // arr은 행을 출력 함으로 원할하게 출력하려면  
//		System.out.println(Arrays.toString(arr[2])); // arr은 행을 출력 함으로 원할하게 출력하려면  
//		System.out.println(Arrays.toString(arr[3])); // arr은 행을 출력 함으로 원할하게 출력하려면 
		for (int i= 0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i])); // 반복문 사용 
		}
	}
}

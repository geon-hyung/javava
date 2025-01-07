package day5;

import java.util.Arrays;
import java.util.Random;

public class Arraay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {3,5,2,4,1}; //  버블정렬 숫자를 작은수부터 나열한다.
//		for(int i =arr.length-1; i < 0; i--) { // 최초 전체 비교횟수 =i //i값을 줄이는 이유는 픽스하기위해 
//			for(int j = 0 ; j<i; j++) {
//				if(arr[j] > arr[i+1]) {
//				int temp = arr[j+1]; // 최초 temp 에는 2가 들어간다. 
//				arr[j+1] = arr[j];      
//				arr[j] = temp ; //j 배열에 temp값을 넣으면 위치가 바뀌게 된다 .
//				}
//				
//			}
//		}
		
//		System.out.println(Arrays.toString(arr));
		// arr의 모든 요소에 1~20사이의 
				// 랜덤한 값을 넣기
				// 그다음에 모든 수의 평균 구하기
		int arr[][] = new int[3][3];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ran.nextInt(20)+1;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println((double) sum / (arr.length * arr[0].length));
		
		

	}

}

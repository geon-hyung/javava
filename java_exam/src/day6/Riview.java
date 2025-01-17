package day6;

import java.util.Arrays;

public class Riview {

	public static void main(String[] args) { //전체 회차는 크기에 -1 length
		//
		// TODO Auto-generated method stub
//		int arr[] = {3,2,1,5,4};
//		for(int i = 1; i < arr.length; i++) {
//			for(int j = 0; j < arr.length-i; j++) {
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}System.out.println(Arrays.toString(arr));
		
//		int arr[] = {7,6,5,4,3};
//		for(int i= 1; i < arr.length;i++) {
//			for(int j = 0; j<arr.length-1; j++) {
//			if(arr[j] > arr[j+1]) {
//				int temp = arr[j+1];
//				arr[j+1] = arr[j];
//				arr[j] = temp;
//			}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		 //배열의 작은 수부터 나란히 출력 
		int arr[] = {20,30,40,2,5};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1] ) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
	}

}










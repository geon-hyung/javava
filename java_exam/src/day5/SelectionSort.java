package day5;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,4,1}; // 높은숫자에서 부터 나열  
		for(int i =1 ;   i < arr.length; i++) {
			for(int j = 0; j <arr.length-i ; j++) { //arr.length -1 전체 5개 배열에서 -i를 함으로 효율적이다 
			if(arr[j] < arr[j+1]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp ;
				
			}
			}
		} System.out.println(Arrays.toString(arr));
	}

}

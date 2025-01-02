package day5;

import java.util.Arrays;

public class SelectionSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,1,4};
		//배열에서 가장 작은 수를 찾아서 인덱스 0 번째 값이랑 자리변경
		int min = 0;
		for(int i =1; i<arr.length; i++) {
					 if(arr[i] < arr[min]) {
						 min = i;
			int temp = arr[0];
			arr[0] = arr[min];
			arr[min] = temp;
			min = 1;
			for(int i=2; i <arr.length; i++) {
				if(arr[i] < arr[min]) 
					min= i;
				}
			}
		}	int temp = arr[1];
		arr[1] = arr[min];
		arr[min] = temp;
		min = 1; 
		System.out.println();

	}
}

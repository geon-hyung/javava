package day5;

import java.util.Arrays;

public class Arraay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,4,1}; //  버블정렬 숫자를 작은수부터 나열한다.
		for(int i =arr.length-1; i > 0; i--) { // 최초 전체 비교횟수 =i //i값을 줄이는 이유는 픽스하기위해 
			for(int j = 0 ; j<i; j++) {
				if(arr[j] > arr[i+1]) {
				int temp = arr[j+1]; // 최초 temp 에는 2가 들어간다. 
				arr[j+1] = arr[j];      
				arr[j] = temp ; //j 배열에 temp값을 넣으면 위치가 바뀌게 된다 .
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}

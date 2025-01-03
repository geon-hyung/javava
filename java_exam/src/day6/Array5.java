package day6;

import java.util.Arrays;
import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 모든 요소의 값을 1~20사이의 랜덤한 값으로 넣기
		//그다음에 모든 수의 평균 구하기
		int arr[] [] = new int [3][3];
		Random ran = new Random();
		for(int i =0; i < arr.length; i++) {
			for(int j =0 ;j < arr[i].length; j++) 
			arr[i][j] = ran.nextInt(20)+1;
		}
		System.out.println(Arrays.toString(arr[i]));
	
		int sum= 0;
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum/arr.length*arr[0].length);

	
	
	}

}

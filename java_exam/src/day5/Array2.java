package day5;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,4,1};
		//배열의 갯수 만큼 별이 찍히도록
//	  int sum = 0;
		for  (int i = 0; i<arr.length; i++) {
				for (int j = 0; j<arr[i] ; j++) {
				System.out.println("*");
			}
				System.out.println();
	}
	}
}

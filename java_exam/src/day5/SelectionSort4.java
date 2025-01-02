package day5;

import java.util.Arrays;

public class SelectionSort4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 2, 1, 4 };
		for (int x = 0; x < 4; x++) {
			int index = x;
			for (int i = x + 1; i < arr.length; i++) {
				if (arr[i] < arr[index]) {
					index = i;
					// 배열에서 가장 작은 수를 찾아서 인덱스 0 번째 값이랑 자리변경
				}      //마지막 인트 템프선언은 포문 밖에서 사용 하고 출력은 더 밖에서 사용
			}
			int temp = arr[x];
			arr[x] = arr[index];
			arr[index] = temp;
		}System.out.println(Arrays.toString(arr));
		
	}
}

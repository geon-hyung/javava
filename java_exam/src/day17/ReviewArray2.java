package day17;

import java.util.Arrays;

public class ReviewArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 1, 4, 2, 6, 3 };
		
//		Arrays.sort(arr); // 자동 정렬 기능 
		for(int i=0; i<arr.length -1; i++) {
			int min = i;            // i가 0 부터 시작해서 배열의 개수보다 -1 반복한다 오ㅐ냐하면 배열의 마지막은 가장 높은 숫자가 위치하기 때문에
			//최초 작은값의 위치는 0이 된다  
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;       //이때까지 가장작은값의 위치를 확인 
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
//		}
		System.out.println(Arrays.toString(arr));
	
		

	
	}
}
}
package day9;

public class ArrayClass {

	static int maxValue(int[] array) {
        // 배열에서 가장 큰 값을 구하는법    
		//배열의 0번째 부터 입력 해준다 
		int max = array[0]; // 배열의 개수만큼 실행한다
		for (int value : array) {
			if (max < value) {
				max = value;
			}
		}
		return max;
	}
	// 배열에서 가장 큰 값의 위치를 찾는 (리턴) 메소드
	static int maxIndex(int[] array) {
		int index = 0;
		
		return 0;
		
	 for(int i = 1 ; i < array.length; i++ )  {
		if (array[index] < array[i]) {
			index = i;
	 }	 
		return index;
	}	
}
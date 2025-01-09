package day9;

public class ArrayClass {

	// 배열에서 가장 큰 값을 찾는 메소드
	static int maxValue(int[] array) {
		int max = array[0];
		for (int value : array) {
			if (max < value) {
				max = value;
			}
		}
		return max;
	}

	// 배열에서 가장 큰 값의 위치를 찾는(리턴) 메소드
	static int maxIndex(int[] array) {
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[index] < array[i]) {
				index = i;
			}
		}
		return index;
	}

	// 가장 큰 값의 위치를 찾아서 첫번째 값하고 변경
	static void changeArr(int[] array) {
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[index] < array[i]) {
				index = i;
			}
		}
		int temp = array[index];
		array[index] = array[0];
		array[0] = temp;
	}

	// 배열에서 가장 작은 값을 찾아서 리턴해주는 메소드
	static int minValue(int[] array) {
			int minIndex = 0;
			for(int i = 1; i < array.length; i++) {
				if(array[i] < array[minIndex]  ) {
					minIndex = i;
				}
			}
			return array[minIndex];
//			return array[minIndex];
//			int min = array[0];
//					for(int value : array) {
//						min = value <min ? value : min;
					}
//	return min;
	// 배열에서 가장 큰 값과 작은 값의 위치를 바꿔주는 메소드
	static void maxMinChange(int array[]) {
		int max = 0;
		int min = 0;
		for(int i = 1; i< array.length; i++) {
			max = array[i] > array[max] ? i :max;
			min = array[i] < array[min] ? i :min;
		}
		int temp = array[max];
		array[max] = array[min];
		array[min] = temp;
	}
}


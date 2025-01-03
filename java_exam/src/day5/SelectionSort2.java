package day5;

public class SelectionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,1,4};
		int min = 0;     // 최초위치는 0 = 3 
		for(int i=0; i<4; i++) {
			for (int j =i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) { // i 값과 min 을 비교해서 min = i 를 넣는다 . 
					min= j;	                 // i값을 더하고 결국 민과 함께 증가하므로 i를 이용해서 숫자를 증가시킨다
				}
			}
			int temp = arr[min];    // 템프에 가장 작은수를 저장하
	 		arr[min] = arr[i];      // 가장 작은수를 0번째에 저장하고 
			arr[i] = temp;            // 0번째에 저장한 수를 템프에 옮긴다 
			System.out.println(temp); // 
		}
		
	}

}

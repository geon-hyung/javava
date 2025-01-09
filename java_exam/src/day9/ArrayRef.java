package day9;

public class ArrayRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,3,5,4,2};
//		int arr2[] = arr;         //첫번째 배열 복사  
//		arr2[3] = 100;
//		System.out.println(arr[3]);
		int max = ArrayClass.maxValue(arr);  //int로 입력햇으니까 int 로 출력 
		System.out.println(max);
		

	}

}

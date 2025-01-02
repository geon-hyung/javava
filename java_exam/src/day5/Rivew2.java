package day5;

public class Rivew2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, 10, 2, 4};
//		arr[2] = 1; //2번째에 다른값을 넣고 싶을때 사용
		int sum = 0; //모든 숫자를 더하고 싶을때 sum을 선언하고
		int max = arr[0];  // 0번째를 입력해서 0번째 수부터 큰수 비교
		int index = 0; //가장 큰 값의 위치를 찾기위해 선언
		for (int i =0; i<arr.length; i++) {
			System.out.println(arr[i]); // arr[i] 를이용하여 배열에 들어가있는 숫자를 출력한다
			sum = sum + arr[i]; // sum += arr[i]; 이런식으로 사용할 수 있음
			//가장 큰 값 찾는법
			if (arr[i] > max) {//i에 저장된 값을 맥스에 들어가있는 값과 비교하여 높은 수를 넣어준다
				max = arr[i]; 
			}
			//가장 큰 값의 위치 찾는법
			if (arr[i] > arr[index]) { //arr[i] arr 인덱스와 비교하여 i의 값을 인덱스에 넣는다 
				index = i;
			}
		}

	}

}

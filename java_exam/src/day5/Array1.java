package day5;

import java.util.Arrays;
import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int arr[] = new int[6];
		//중복된 숫자가 발견했을경우 체크해놓고 체크된 결과에 따라서 값을 넣을지 말지 결정 . 
		for (int i = 0; i<arr.length; i++) { 
			int ranNum = ran.nextInt(45)+1; // ~45까지의 숫자를 출력하기 위해 괄호안에 숫자입력.
			for (int j = 0; j<i; j++) {// j를 i와 비교하면서 불필요한 비교 횟수가 줄어들게 한다. 
 				if(ranNum == arr[j]) { // 조건을 걸어 랜덤한 숫자와 j열에 들어간 숫자가 같은 지 확인.
					System.out.println("중복된 숫자 있음");
				}
			}
			
			
			arr[i] = ranNum;
			
		}
	System.out.println(Arrays.toString(arr));

	}

}

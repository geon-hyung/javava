package day5;

import java.util.Arrays;

public class Rivew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 형 정수 3개를 보관할 수 있는 배열 선
		int arr1[] = new int[3];
		// 문자열 3개를 보관할 수 있는 배열 선언
		String arr2[] = new String[3];
//		arr2[0] = "1" ; // <문자열이 들어간 숫자는 사용이 가능하다
		// Object는 뭐든(숫자 , 문자 ) 다 담을 수 있는 클래스 
		Object arr3[] = new Object[3];
		arr3[0] = 10;
		arr3[1] = "자바";
		arr3[2] = true;
		System.out.println(Arrays.deepToString(arr3));

	}

}

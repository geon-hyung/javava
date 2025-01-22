package day18;

public class Review_if_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1부터 100까지 숫자 중 홀수이거나 8의 배수인 숫자를 출력하시오.
//		   단, 50~60까지의 숫자를 출력하지 마시오.
		for (int i = 1; i < 101; i++) {
			if (i % 2 != 0 || i % 8 == 0) {
				if (i >= 50 && i <= 60) {
					continue; 
				}
				System.out.println(i);
			}
		}
	}

}

package day18;

public class Review_if_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

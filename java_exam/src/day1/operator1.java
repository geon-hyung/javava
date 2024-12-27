package day1;

public class operator1 {

	public static void main(String[] args) {
//		int a = 1;
//		a = a+1;
//		
//		a++;
//		a--;
//		System.out.println(a);
//
//		
//		int b = a++;
//		b = --a;
//	
		int x = 5;  // x = 5 
		int y = ++x;  // x=6 y= 6
		y = x--; // x=5 y=5 
		int z = x+y;  // x= 5 y=5 z=10
		++x;  // x= 6 y= 5 z = 10 
		x = z++;   // x= 11 = y=5 z=11
		
	}

}

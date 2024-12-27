package day1;

public class Variable1 {

	public static void main(String[] args) {

		String name = "홍길동";
		int stduentNumber = 20241226;
		int age ; // integer(정수)
		age = 30;
		double height = 170.5; // 소수점 double
		boolean isSingle = true; // false
		// syso + ctrl + Space  
		// 주석 = 메모 (알리기 위한용도, 테스트 활용 ctrl + / , ctrl + shift / )
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		age = 31;
		System.out.println(age);
		
		final double PI = 3.141592;
//		PI = 3.14; // 상수라서 (final)수정 불가능 
		
		// 홍길동의 나이는 31 입니다. 
		System.out.println(name + "의 나이는 " + age + " 입니다." );
	
		
		
	}

}

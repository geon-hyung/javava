package day9;

public abstract class Calculator { // 추상클래스
	int sum (int x , int y ) {
		return x+y;
	}
	int sub (int x , int y) {
		return x-y;
	}
	abstract int mul (int x , int y); {    //추상 메소드는 구현이 되지않는 메소드를 의미한다 
		                                //직접되어 있지 않고 상속받아서 오버라이드를 이용해 구현한다 
	}
	abstract int div (int x , int y); {
	}

}
